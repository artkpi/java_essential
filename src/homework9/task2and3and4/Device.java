package homework9.task2and3and4;

import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Device d1 = new Device("Dell", 10000, "123");
        Monitor m1 = new Monitor("Samsung", 10000, "13564213", 1280, 1080);
        Device d2 = new Device("Dell", 10000, "123");
        Monitor m2 = new Monitor("Asus", 6767, "77764213", 1280, 1080);
        EthernetAdapter e1 = new EthernetAdapter(150, "111111213");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1.equals(d2));
        System.out.println(m1.equals(m2));
        System.out.println("HashCode: " + d1.hashCode());

    }

}

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    @Override
    public String toString() {
        return "Manufacturer: " + getManufacturer() + ", price: " + getPrice() + ", serial number: " + getSerialNumber();
    }
    @Override
    public boolean equals(Object obj) {
        Device otherDevice = (Device) obj;
        return this.manufacturer == otherDevice.manufacturer && price == otherDevice.price && serialNumber == otherDevice.serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }

    public Device() {
    }
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public float getPrice() {
        return price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


}

class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    @Override
    public String toString() {
        return "Manufacturer: " + getManufacturer() + ", price: " + getPrice() + ", serial number: " + getSerialNumber() + ", X: " + getResolutionX() + ", Y: " + getResolutionY();
    }
    @Override
    public boolean equals(Object obj) {
        Monitor otherMonitor = (Monitor) obj;
        return this.manufacturer == otherMonitor.manufacturer && price == otherMonitor.price && serialNumber == otherMonitor.serialNumber && resolutionX == otherMonitor.getResolutionX() && resolutionY == otherMonitor.getResolutionY();
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    public Monitor(){
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    public int getResolutionX() {
        return resolutionX;
    }
    public int getResolutionY() {
        return resolutionY;
    }


}


class EthernetAdapter extends Device {
    int speed;
    String mac;

    @Override
    public boolean equals(Object obj) {
        EthernetAdapter newEthernetAdapter = (EthernetAdapter) obj;
        return this.speed == newEthernetAdapter.speed && Objects.equals(mac, newEthernetAdapter.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }

    public EthernetAdapter() {
    }
    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }
    public int getSpeed() {
        return speed;
    }
    public String getMac() {
        return mac;
    }
}


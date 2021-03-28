package homework1.add_task;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setIndex(777);
        System.out.println(myAddress.getIndex());

        myAddress.setCountry("Ukraine");
        System.out.println(myAddress.getCountry());

        myAddress.setCity("Kyiv");
        System.out.println(myAddress.getCity());

        myAddress.setStreet("Metalistiv");
        System.out.println("Street " + myAddress.getStreet());

        myAddress.setHouse(3);
        System.out.println("House " + myAddress.getHouse());

        myAddress.setApartment(119);
        System.out.println("Apartment " + myAddress.getApartment());
    }
}

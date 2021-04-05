package homework4.task2;

import java.util.Scanner;

public class AbstractHandler {

    public static void main(String[] args) {

        AbstractHandler documentDOC = new DOCHandler();
        AbstractHandler documentTXT = new TXTHandler();
        AbstractHandler documentXML = new XMLHandler();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter format of the document: ");
        String s = in.nextLine();
        switch (s) {
            case ("doc"):
                documentDOC.open();
                documentDOC.create();
                documentDOC.change();
                documentDOC.save();
                break;
            case ("txt"):
                documentTXT.open();
                documentTXT.create();
                documentTXT.change();
                documentTXT.save();
                break;
            case ("xml"):
                documentXML.open();
                documentXML.create();
                documentXML.change();
                documentXML.save();
                break;
        }
    }

    void open(){

    }
    void create(){

    }
    void change(){

    }
    void save(){

    }
}

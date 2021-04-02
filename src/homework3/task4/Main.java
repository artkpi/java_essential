package homework3.task4;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int pro = 1; //ключ доступа к версии pro
        int exp = 0; //ключ доступа к версии exp

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ключ доступа: ");
        String s = in.nextLine();
        if (s == "pro") {
            DocumentWorker instance = new ProDocumentWorker();
            instance.openDocument(); // эти строчки почему-то не работают
            instance.editDocument();
            instance.saveDocument();
        }
        if (s == "exp") {
            DocumentWorker instance = new ExpertDocumentWorker();
            instance.openDocument(); // эти строчки почему-то не работают
            instance.editDocument();
            instance.saveDocument();
        }
        if (s.isEmpty()){
            DocumentWorker instance = new DocumentWorker();
            instance.openDocument(); // а эти строчки - работают
            instance.editDocument();
            instance.saveDocument();
        }
    }
}

package guifactory.demo;

import java.util.Scanner;

import guifactory.factory.*;

public class Demo {
    public static void main(String[] args) {
        DialogFactory factory = new DialogFactory();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter window or html");
            String type = scan.nextLine();
            Dialog dialog = factory.getInstance(type);
            dialog.windowRendered();
        }

    }
}

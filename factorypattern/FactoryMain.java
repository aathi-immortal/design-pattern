import java.util.Scanner;

import os.Os;

public class FactoryMain {
    public static void main(String[] args) {

        OsFactory osFactory = new OsFactory();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter the os Name :");
            Os os = osFactory.getInstance(scan.nextLine());
            os.spec();
        }
    }
}

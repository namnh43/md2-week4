package viewer;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        while (true){
            System.out.println("============== Display menu ==============");
            System.out.println("Please select number:");
            System.out.println("1. Insert a contact");
            System.out.println("2. Update a contact ");
            System.out.println("3. Search a contact");
            System.out.println("4. Display phonebook");
            System.out.println("5. Display phonebook by type");
            System.out.println("0: Exit!");
            Scanner scanner = new Scanner(System.in);
            Integer number = scanner.nextInt();
            switch (number){
                case 1:
                    break;
            }
        }
    }
}

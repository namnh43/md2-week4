package viewer;

import controller.PhoneBookManage;
import model.phone.Contact;
import model.phone.subclass.Type.Type;
import util.Utils;

import java.util.Random;
import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        boolean exited = false;
        PhoneBookManage manage = new PhoneBookManage();
        while (!exited){
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
                    //Insert some random contact
                    int num = (int) (Math.random()*10 + 1);//create number from 1 to 10
                    String phoneNum = Utils.generateRandomNumberAsString();
                    Contact contact = new Contact(Utils.generateRandomString(num),phoneNum, new Type(num,Type.types[(int)Math.random()*4+1]));
                    manage.insertPhone(contact);
                    break;
                case 2:
                    System.out.println("Input contact name:");
                    String name = scanner.nextLine();
                    System.out.println("Input phone number:");
                    String phoneNumber = scanner.next();
                    manage.updatePhone(name, phoneNumber);
                    break;
                case 3:
                    String phonename = scanner.nextLine();
                    Contact ct = manage.searchPhone(phonename);
                    break;
                case 4:
                    manage.display(null);
                    break;
                case 5:
                    System.out.println("Input type:");
                    String typeName = scanner.next();
                    Type searchType = new Type(typeName);
                    manage.display(searchType);
                    break;
                case 0:
                    exited = true;
                    System.out.println("Bye!");
                    break;
            }
        }
    }
}

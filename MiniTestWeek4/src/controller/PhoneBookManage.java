package controller;

import model.phone.Contact;
import model.phone.IPhone;
import model.phone.Phone;
import model.phone.subclass.Type.Type;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBookManage extends Phone implements IPhone {
    Map<String,Contact> list_phone = new HashMap<>();

    public PhoneBookManage() {
    }

    @Override
    public void display(Type type) {
        if (type == null) {
            list_phone.values().stream()
                    .toList()
                    .forEach(System.out::println);
        } else {
            list_phone.values().stream()
                    .filter(e -> e.getType() == type)
                    .toList()
                    .forEach(System.out::println);
        }
    }

    public void insertPhone(Contact contact) {
        list_phone.put(contact.getName(), contact);
    }

    @Override
    public void removePhone(String name) {
        list_phone.remove(name);
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        //get contact
        Contact contact = list_phone.get(name);
        if (contact != null) {
            contact.setPhoneNumber(newPhone);
        }else {
            System.out.println(name + " is not existed!");
        }
    }

    @Override
    public Contact searchPhone(String name) {
        return list_phone.get(name);
    }

    @Override
    public void sort() {

    }
}

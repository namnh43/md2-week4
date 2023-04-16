package model.phone;

import model.phone.subclass.Type.Type;

public abstract class Phone {
    abstract public void display(Type type);
    abstract public void insertPhone(Contact contact);
    abstract public void removePhone(String name);
    abstract public void updatePhone(String name, String newPhone);
}

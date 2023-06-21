package db;

import model.Contact;
import model.Phone;
import java.util.*;

public class DataBase {

    private List<Phone>phones;
    private List<Contact>contacts;

    public DataBase(List<Phone> phones, List<Contact> contacts) {
        this.phones = phones;
        this.contacts = contacts;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}

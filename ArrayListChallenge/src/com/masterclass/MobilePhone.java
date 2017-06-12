package com.masterclass;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    private int findContact(String contactName) {
        return contacts.indexOf(new Contact(contactName,
                null));
    }

    private boolean contactExists(String name) {
        return (findContact(name) >= 0);
    }

    public void printContactList() {
        final int[] index = {0};
        contacts.forEach(contact -> {
            System.out.println(index[0] + " element in the contact "
                    + "list: " + contact.getName() + " - " +
            contact.getPhoneNumber());
            index[0]++;
        });
    }

    public boolean insertContact(String name, String phoneNumber) {
        if (contactExists(name))
            return false;

        contacts.add(new Contact(name, phoneNumber));
        return true;
    }

    public boolean removeContact(String name) {
        int indexPos = findContact(name);
        if (indexPos >= 0) {
            contacts.remove(indexPos);
            return true;
        }
        return false;
    }

    public boolean updateContact(String oldName, String newName,
                              String phoneNumber) {
        int index = findContact(oldName);
        if (index < 0)
            return false;

        contacts.set(index, new Contact(newName, phoneNumber));
        return true;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position < 0)
            return null;
        return contacts.get(position);
    }
}

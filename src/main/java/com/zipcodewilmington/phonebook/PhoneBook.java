package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> newPhoneBook = new ArrayList<>(Arrays.asList(phoneNumber));
        phonebook.put(name, newPhoneBook);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> newPhoneBook = new ArrayList<>(Arrays.asList(phoneNumbers));
        phonebook.put(name, newPhoneBook);
    }

    public void remove(String name) {
        if(phonebook.containsValue(name)) {
            phonebook.remove(name);
        }
    }

    public Boolean hasEntry(String name) {
        boolean flag = phonebook.containsValue(name);
        return flag;
        }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {

        return null;
        }

        public Map<String, List<String>> getMap () {

            return phonebook;
        }
    }



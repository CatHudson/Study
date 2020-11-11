package ru.geekbrains.lesson08;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> book;

    public PhoneBook(Map<String, String> book) {
        this.book = book;
    }

    public void add(String phone, String surname) {
        String frequency = book.get(phone);
        if (frequency != null) {
            System.out.printf("В справочнике уже есть номер %s%n", phone);
        } else {
            book.put(phone, surname);
        }
    }

    public String get(String surname) {
        List<String> phones = new ArrayList<>();
        for (String item : book.keySet()) {
            if (book.get(item).toLowerCase().equals(surname.toLowerCase())) {
                phones.add(item);
            }
        }
        if (phones.isEmpty()) {
            System.out.printf("Человека с фамилией %s в справочнике нет%n", surname);
            return "";
        } else {
            return phones.toString();
        }
    }

    public void print() {
        System.out.println(book);
    }

    public static void main(String[] args) {
        Map<String, String> book = new HashMap<>();
        book.put("7555123456", "Smith");
        book.put("7555123456", "Smith");
        book.put("52364178965", "Grey");

        PhoneBook phonebook = new PhoneBook(book);
        phonebook.add("79650777281", "Smith");
        phonebook.add("79650889645", "Grey");
        phonebook.print();
        System.out.println(phonebook.get("Smith"));
        System.out.println(phonebook.get("Grey"));
        System.out.println(phonebook.get("Grey"));
        System.out.println(phonebook.get("Jackson"));
    }
}
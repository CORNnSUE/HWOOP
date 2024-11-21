package Lab10.ex23;

import java.util.*;
import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student newStudent) {
        int count = phoneBook.size();
        phoneBook.put("" + (count + 1), newStudent);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        Set<String> set = phoneBook.keySet();
        for (String key : set) {
            if (phoneBook.get(key).equals(number)) {
                phoneBook.remove(phoneBook.get(key));
            }
        }
    }
}

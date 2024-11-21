package ex23;

public interface PhoneBook {
    public Student searchByLastName(String lastName);
    public Student searchByNumber(String number);
    public void addPerson(Student newStudent);
    public Student searchByName(String name);
    public void deleteByNumber(String number);
}

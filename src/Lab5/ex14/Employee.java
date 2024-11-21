package ex14;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        float rate = (float)percent/ 100;
        this.salary += Math.round((float) this.salary * rate);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee [" + "id = " + getId() + ", firstName = " + getFirstName() + ", lastName = " + getLastName()
                + ", salary = " + getSalary() + "]";
    }

}

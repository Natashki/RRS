package HW8;


public class Employee {
    String name;
    double salary;
    int amountOfchildren;

    public Employee(String name, double salary, int amountOfchildren){
        this.name = name;
        this.amountOfchildren = amountOfchildren;
        this.salary = salary;

    }

    public int getAmountOfchildren() {
        return amountOfchildren;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}

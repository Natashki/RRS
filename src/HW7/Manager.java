package HW7;

public class Manager extends Employee {
    int subordinates;

    public Manager(String name, double baseSalary, int subordinates){
        super(name, baseSalary);
        this.subordinates = subordinates;
    }

    public double getSalary(){
        if(subordinates == 0){
            return baseSalary;
        }else {
            return baseSalary + baseSalary * (subordinates / 100.0 * 3);
        }
    }

    public int getNumberOfSubordinates(){
        return subordinates;
    }

    public void setNumberOfSubordinates(int subordinates){
        this.subordinates = subordinates;
    }
}

package HW7;

public class Director extends Employee {
    int subordinates;

    public Director(String name, double baseSalary, int subordinates){
        super(name, baseSalary);
        this.subordinates = subordinates;
    }


    public double getSalary(){
        if(subordinates == 0){
            return baseSalary;
        }else {
            return baseSalary + baseSalary * (subordinates / 100.0 * 9);
        }
    }

    public int getNumberOfSubordinates(){
        return subordinates;
    }

    public void setNumberOfSubordinates(int subordinates){
        this.subordinates = subordinates;
    }
}

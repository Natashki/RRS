package HW6;

public class EmplMain {
    public static void main(String[] args){
        Employee[] employees = new Employee[8];

        employees[0] = new Employee("John Doe", 10000.0);
        employees[1] = new Employee("Joan Doe", 1000);

        employees[2] =  new Manager("Alex Kringe", 1000.1, 22);
        employees[3] =  new Manager("Craig Smith", 1200.2, 10);
        employees[4] =  new Manager("Harrison Ford", 1000, 1);
        employees[5] =  new Manager("Harry Potter", 1000, 0);

        employees[6] = new Director("Doctor Who", 1001, 100);
        employees[7] = new Director("Master", 1000, 1000);



//        MethodsEmp.findEmployeeName(employees, "Joan Doe");
        MethodsEmp.findEmployeePartofName(employees,"Doctor");
//        MethodsEmp.countBudgectForSalaries(employees);
//        MethodsEmp.findMinSalary(employees);
//        MethodsEmp.findMaxSalary(employees);
//        MethodsEmp.findMinAmountOfSub(employees);
//        MethodsEmp.findMaxAmountOfSub(employees);
//        MethodsEmp.findMaxBonus(employees);
//        MethodsEmp.findMinBonus(employees);
//        MethodsEmp.findEmployeeName(employees, "Alex Kringe");

    }

}

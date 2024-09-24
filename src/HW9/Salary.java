package HW9;

public class Salary {
    //    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
    //    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
    public static double getSum(Employee[] employeeArray){
        double res = 0.0;
        for(Employee e : employeeArray){
            res += e.getSalary();
        }
        return res;
    }
}

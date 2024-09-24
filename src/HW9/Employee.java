package HW9;

public class Employee extends Person {

//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника
//    у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

    double salary;

    public Employee(String name, int age, char sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }


    public boolean isSameName(Employee employee){
        return this.name.equals(employee.name);

    }

    double getSalary(){
        return salary;
    }
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30, 'm');
        Person p2 = new Person("Alice", 25, 'f');

        Employee e1 = new Employee("Alex", 22, 'm', 1001.0);
        Employee e2 = new Employee("Alex", 22, 'm', 1000.0);
        Employee[] eArray = {e1, e2};

        System.out.println(p1.getName());  // Выведет: Mr. John
        System.out.println(p2.getName());  // Выведет: Mrs. Alice
        System.out.println(e1.isSameName(e2));
        System.out.println(Salary.getSum(eArray));
    }
}
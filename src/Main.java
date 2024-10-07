
public class Main {
    public static void main(String[] args) {
        HW9.Person p1 = new HW9.Person("John", 30, "m");
        HW9.Person p2 = new HW9.Person("Alice", 25, "f");

        HW9.Employee e1 = new HW9.Employee("Alex", 22, "m", 1001.0);
        HW9.Employee e2 = new HW9.Employee("Alex", 22, "m", 1000.0);
        HW9.Employee[] eArray = {e1, e2};

        System.out.println(p1.getName());  // Выведет: Mr. John
        System.out.println(p2.getName());  // Выведет: Mrs. Alice
        System.out.println(e1.isSameName(e2));
        System.out.println(HW9.Salary.getSum(eArray));
    }
}
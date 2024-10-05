package HW8;

public class TaxPayment {
    String name;
    double amountOfTax;

    public TaxPayment(String name, double salary, int amountOfChildren) {
        this.name = name;
        this.amountOfTax = countTax(salary, amountOfChildren);
    }

    double countTax(double salary, int amountOfChildren) {
        if (amountOfChildren > 0) {
            salary = salary - 1000 * amountOfChildren;
        }

        if (salary > 10000) {
            return salary * 23 / 100;
        } else if (salary <= 10000 && salary > 5000) {
            return salary * 18 / 100;
        } else {
            return salary * 13 / 100; // Здесь обрабатывается случай, когда зарплата меньше или равна 5000
        }
    }

    double getAmountOfTax(){
        return amountOfTax;
    }
}
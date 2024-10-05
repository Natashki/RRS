package HW8;

import java.util.Arrays;

public class TaxMain {

    public static void main(String[] args){

        Employee e1 = new Employee("John Wick", 10000.02, 1);
        TaxPayment t1 = new TaxPayment(e1.getName(), e1.getSalary(), e1.getAmountOfchildren());

        Employee e2 = new Employee("Anna", 4000, 4);
        TaxPayment t2 = new TaxPayment(e1.getName(), e1.getSalary(), e1.getAmountOfchildren());

        Employee e3 = new Employee("Ivan", 11000, 0);
        TaxPayment t3 = new TaxPayment(e1.getName(), e1.getSalary(), e1.getAmountOfchildren());

        Employee e4 = new Employee("Krevedka", 5000, 0);
        TaxPayment t4 = new TaxPayment(e1.getName(), e1.getSalary(), e1.getAmountOfchildren());

        Employee[] emp = {e1, e2,e3,e4};
        TaxPayment[] tax = {t1, t2, t3, t4};

        System.out.println(Arrays.toString(getAllTaxForAll(emp, tax)));

    }

    public static String[] getAllTaxForAll(Employee[] emp, TaxPayment[] tax){
        String[] res = new String[emp.length];
        for(int i = 0; i < emp.length; i++){
            res[i] = emp[i].getName() + " has tax = " + tax[0].getAmountOfTax();
        }
        return res;
    }

}

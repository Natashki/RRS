package HW3;

public class HW3_1class {
    //Задача №1
    public static void exercise1 (int a, int b){
        //Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        //a == b - если переменные равны
        if(a == b){
            System.out.println("a == b");

        }
        //a < b - если переменная a меньше b
        if (a < b){
            System.out.println("a < b");

        }
        //a > b - если переменная b меньше a
        if (a > b) {
            System.out.println("a > b");
        }

        System.out.println("____________________________________________");
    }

    public static void exercise1_an(int a, int b){
        if(a == b){
            System.out.println("a == b");
        } else {
            if(a < b){
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }
    }

    //Задача №2
    public static void exercise2(int a, int b) {
        //Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки
        //maybe a and b are even - если сумма переменных четная
        if((a + b) % 2 == 0){
            System.out.println("maybe a and b are even");
        } else {
            //some variable is odd - если сумма переменных нечетная
            System.out.println("some variable is odd");
        }

        System.out.println("____________________________________________");

    }
    //Задача №3
    public static void exercise3(int x) {
        //Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        //больше 10 - если переменная больше 10
        if(x > 10){
            System.out.println("bigger than 10");
        }
        //меньше 100 - если переменная меньше 100
        if(x < 100){
            System.out.println("least than 100");
        }
        //результат деления на 2 больше 20 - если это соответствует истине
        if(x / 2.0 > 20 ){
            double res = x / 2.0;
            System.out.println(res + " bigger than 20");
        }
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        if( x >= 5 && x <= 40){
            System.out.println("5 <= x <= 40");
        }else{
            System.out.println("x < 5 OR x > 40");
        }
    }

    public static void main(String[] args){
        exercise1(6, 5);
        exercise2(2,1);
        exercise3(41);

        exercise1_an(2, 2);
    }
}

package HW2;

public class HW2class {
    public static void main(String[] args) {

//        Задача №1
//
//        Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
//
        int a = 10;
        int b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


//        Задача №2
//
//        Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
//
//                Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//
//                Вывести на экран кому сколько пиастров полагается
//        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
//

//        int heistGold = 1000;
//        int amountPirates = 7;
//        float partForCaptain = heistGold / 2 + (heistGold / 2 ) / (amountPirates + 1);
//        float partForPirate =  heistGold / 2 / (amountPirates + 1);
//
//        System.out.println("Captain earns " + partForCaptain);
//        System.out.println("Each pirate earns " + partForPirate);


        calculateGold(1000,5);



//                      Дополнительное задание со звездочкой
//        Попробовать придумать как программа может проверить правильность дележа.

    }

    public static void calculateGold (int heistGold, int amountPirates ){
        float partForCaptain = heistGold / 2 + (heistGold / 2 ) / (amountPirates + 1);
        float partForPirate =  heistGold / 2 / (amountPirates + 1);

        System.out.println("Captain earns " + partForCaptain);
        System.out.println("Each pirate earns " + partForPirate);
    }
}

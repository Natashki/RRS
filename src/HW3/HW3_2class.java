package HW3;

public class HW3_2class {
    //Задача №1
    public static void exercise1() {
        //Необходимо вывести числа от 0 до 15.
        for(int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________________________");
    }
    //Задача №2
    public static void exercise2() {
        //Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        for(int i = 5; i < 10000; i = i * 5){
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________________________");
    }
    //Задача №3
    public static void exercise3() {
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        for(int i = 40; i <= 60; i++){
            if(i % 4 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n.....................................");
        //без использования конструкции if (шаг цикла на ваше усмотрение).
        for(int i = 40; i <= 60; i += 4){
            System.out.print(i + " ");
        }
        System.out.println("\n_____________________________________");
    }
    public static void main(String[] args){
        exercise1();
        exercise2();
        exercise3();
    }
}

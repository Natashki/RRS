package HW4;

import java.util.Arrays;

public class HW4class {
    //Задача №1
    //Дан массив:
    //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //необходимо вывести все нечетные числа из массива.
    public static void ex1(int[] array){
        for(int number : array){
            if(number % 2 != 0){
                System.out.print(number + " ");

            }
        }
        System.out.println("\n_________________________");
    }
    //Задача №2

    //Дан массив:
    //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //необходимо вывести все значения массива больше 5.
    public static void ex2(int[] array){
        for(int number : array){
            if(number > 5){
                System.out.print(number + " ");

            }
        }
        System.out.println("\n_________________________");
    }
    //Задача №3

    //Дан массив:
    //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //необходимо увеличить все значения массива на 15.
    public static void ex3(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] +=15;
        }
        System.out.print(Arrays.toString(array));
        System.out.println("\n_________________________");
    }


    //Задача со звездочкой
    //Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
    //Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
    public static void ex4(int[] array){
        int[] reverseA = new int[9];
        int endInd = array.length - 1;
        for(int i = 0; i < array.length; i++){
            reverseA[endInd] = array[i];
            endInd = endInd - 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(reverseA));
        System.out.println("\n_________________________");
    }


    public static void main(String[] args){
        int[] ar = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        ex1(ar);
        ex2(ar);
        ex3(ar);
        ex4(ar);

    }
}

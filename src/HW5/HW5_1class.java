package HW5;

public class HW5_1class {
    public static void ex1(int[] arr){
        //необходимо вывести сумму всех значений массива
        int sumA = 0;
        for(int number : arr){
            sumA += number;
        }
        System.out.println(sumA);
    }

    public static void ex2(int[] arr){
        //необходимо вывести максимальное значение массива.
        int maxA = Integer.MIN_VALUE;
        for(int number : arr){
            if(maxA < number){
                maxA = number;
            }
        }
        System.out.println(maxA);
    }

    public static void ex3(int[] arr){
        //необходимо вывести минимальное значение массива.
        int minA = Integer.MAX_VALUE;
        for(int number : arr){
            if(minA > number){
                minA = number;
            }
        }
        System.out.println(minA);
    }

    public static void ex4(int[] arr){
        //необходимо вывести среднее арифметическое всех значений массива.
        int sumA = 0;
        for(int number : arr){
            sumA += number;
        }
        System.out.println(sumA / arr.length);
    }

    public static void ex5(int[][] arr){
        //необходимо вывести сумму элементов массива.
        int sumA = 0;
        for(int[] ar : arr){
            for(int number : ar){
                sumA += number;
            }
        }
        System.out.println(sumA);
    }

    public static void ex6(int[][] arr){
        //необходимо вывести сумму элементов массива.
        int maxA = Integer.MIN_VALUE;
        for(int[] ar : arr){
            for(int number : ar){
                if(number > maxA) {
                    maxA = number;
                }
            }
        }
        System.out.println(maxA);
    }


    public static void main(String[] args){
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        ex1(arr);
        ex2(arr);
        ex3(arr);
        ex4(arr1);
        ex5(array);
        ex6(array);
    }
}

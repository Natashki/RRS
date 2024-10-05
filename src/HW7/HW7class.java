package HW7;

public class HW7class {
    public static void main(String[] args){
        System.out.println(plus(1, 2));
        System.out.println(minus(3, 2));
        System.out.println(multiply(3, 2));
        System.out.println(divide(4, 2));
    }

    public static int plus(int x, int y){
        return x + y;
    }

    public static int minus(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

}

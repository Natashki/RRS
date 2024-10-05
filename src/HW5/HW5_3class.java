package HW5;

public class HW5_3class {
    public static void ex1(){
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("_________________________________________");
    }

    public static void ex2(){
        for(int i = 9; i >= 0; i--){
            for(int h = 9; h - i > 0 ; h--){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("_________________________________________");
    }

    public static void ex3(){
        int abs = 9;
        int a = abs;
        int b = 0;

        for(int h = a; h >= b; h--){
            for(int k = abs; k - h >= 0 ; k--){
                System.out.print("  ");
            }
            for (int i = a; i > b; i--) {
                System.out.print(i + " ");
            }
            for (int j = b; j <= a; j++) {
                System.out.print(j + " ");
            }

            System.out.print("\n");
            a--;

        }
        System.out.println("_________________________________________");
    }

    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
    }
}

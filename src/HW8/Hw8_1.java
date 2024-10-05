package HW8;

public class Hw8_1 {


    public static String nameOfNumber(int num) {
        String res = "";

        for (char ch : String.valueOf(num).toCharArray()) {
            switch (ch) {
                case '1':
                    res += "один ";
                    break;
                case '2':
                     res += "два ";
                    break;
                case '3':
                     res += "три ";
                    break;
                case '4':
                     res += "четыре ";
                    break;
                case '5':
                     res += "пять ";
                    break;
                case '6':
                     res += "шесть ";
                    break;
                case '7':
                     res += "семь ";
                    break;
                case '8':
                     res += "восемь ";
                     break;
                case '9':
                     res += "девять ";
                    break;
                case '0':
                     res += "ноль ";
                    break;
                default:
                    break;
            }
        }
        return res.trim();
    }

    public static void main(String[] args) {
        System.out.println(nameOfNumber(652));
    }
}
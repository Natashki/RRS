package HW5;

public class HW5_2class {
    public static void ex1(String s){
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        for(char ch : s.toCharArray()){
            if(ch == 'о'){
                System.out.print(ch);
            }
        }
    }

    public static void ex2(String s){
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        int countE = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'е'){
                countE ++;
            }
        }
        System.out.println("\n" + countE );
    }

    public static void ex3(String s){
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        String st = s.toLowerCase();
        int i = st.indexOf("рит");
        for(int j = 0; j < s.length() - 1; j++){ //попробовать с while
            if(i == j){
                System.out.print(st.indexOf("рит", i) + " ");
                i = st.indexOf("рит", i + 1);
            }
        }
    }

    public static void ex4(String[][] array){
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        int i = 0;
        for(String[] ar : array){
            for(String s : ar){
                if(s.indexOf('е') > 0){
                    i++;
                }
            }
        }
        System.out.println("\n" + i);
    }



    public static void main(String[] args){
        String s = "Перестановочный алгоритм быстрого действия";
        String s2 = "Перевыборы выбранного президента";
        String s3 = "Посмотрите как Рите нравится ритм ыаваы ритритфыв рит";
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        ex1(s);
        ex2(s2);
        ex3(s3);
        ex4(array);
    }
}

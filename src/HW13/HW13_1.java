package HW13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW13_1 {

//    Создать лист и добавить в него следующие слова:
//    White.
//            Tan.
//            Yellow.
//            Orange.
//            Red.
//            Pink.
//            Purple.
//            Blue.
//    Затем удалить из этого списка все цвета в которых встречается буква “L”

    public static void main(String[] args){
        List<String> colors = new ArrayList<>(Arrays.asList("White", "Tan", "Yellow", "Orange", "Yellow", "Pink", "Purple", "Blue"));
        colors.removeIf(color -> color.toUpperCase().contains("L"));
        System.out.println(colors);
    }

}

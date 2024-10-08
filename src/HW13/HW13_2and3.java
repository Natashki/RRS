package HW13;

import java.util.ArrayList;
import java.util.List;

public class HW13_2and3 {
//    Создать лист со значениями от 100 до 1000.
public static void main(String[] args){
    List<Integer> numbers = new ArrayList<>();
    for(Integer i = 100; i<=1000; i++){
        numbers.add(i);
    }
    System.out.println(numbers);

    numbers.removeIf(number -> number % 2 == 0);

    System.out.println(numbers);
}

}

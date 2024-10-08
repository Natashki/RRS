package HW13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW13_4 {
//    Найти наиболее часто встречающееся слово в следующем тексте:

    public static void main(String[] args){
        String text = "Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare. Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis tincidunt litora natoque per himenaeos velit. Consequat quis vestibulum ornare tortor quam pharetra. Proin ante ex habitasse consequat habitant a consequat.\n" +
                "\n" +
                "Suscipit quis scelerisque elementum morbi massa auctor magnis, massa habitasse. Quis libero pellentesque aenean; dolor nec potenti porttitor sem. Sagittis litora per tristique cubilia ultricies ridiculus. Urna sagittis hendrerit integer suspendisse potenti euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare sagittis sapien. Feugiat fusce scelerisque metus cursus aenean ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit fames eleifend varius ligula.\n";

        String textWIthpitC = text.replaceAll("[^a-zA-Z0-9\\s]","");
        List<String> words = Arrays.asList(textWIthpitC.split(" "));
        System.out.println(words);

        int countMax = Integer.MIN_VALUE;
        String wordMax = "";
        for(String word : words){
            Integer count = words.get(word);
            if(count > countMax){
                countMax = count;
                wordMax = word;
                words.removeIf(a -> a.equals(word));
            }
        }
        System.out.println(wordMax + " in text " + countMax + " times");


    }
}

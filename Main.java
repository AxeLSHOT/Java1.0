package Collection;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Lion", "Berry", "Chicken",
                "Cheese", "Sun", "Chicken",
                "Dog", "Cat", "Sun",
                "Wolf", "Turtle", "Lion",
                "Dog", "Danger", "Chicken",
                "Cat", "Sun", "Wolf", "Dog"
        };

        for (String word : words) {
            if (hm.containsKey(word))
                hm.put(word, hm.get(word) + 1);
            else
                hm.put(word, 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("rotenberg", "89212180976");
        directory.add("siluanov", "89119039475");
        directory.add("peskov", "89119039482");
        directory.add("milonov", "89119249523");
        directory.add("zuganov", "89062938475");
        directory.add("zhirinovskii", "89012039491");
        directory.add("putin", "89999999998");
        directory.add("medvedev", "88122417684");
        directory.add("rogozin", "8129817682");

        System.out.println(directory.get("rotenberg"));
        System.out.println(directory.get("siluanov"));
        System.out.println(directory.get("peskov"));
        System.out.println(directory.get("milonov"));
    }
}


package item5;

import java.util.List;
import java.util.Objects;

public class SpellChecker3 {
    private final RrineauDictionary dictionary;

    public SpellChecker3(RrineauDictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) {
        /**
         * ....
         */
        return true;
    }

    public static List<String> suggestions(String typo) {
        return List.of("Apple");
    }
}

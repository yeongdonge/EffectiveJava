package item5;

import java.util.List;

public class SpellChecker {
    private static final RrineauDictionary dictionary = new RrineauDictionary();

    private SpellChecker() {} // private 생성자로 객체 생성 방지

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

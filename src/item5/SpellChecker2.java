package item5;

import java.util.List;

public class SpellChecker2 {
    private static final RrineauDictionary dictionary = new RrineauDictionary();

    private SpellChecker2() {} // private 생성자로 객체 생성 방지

    public static SpellChecker2 INSTANCE = new SpellChecker2();

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

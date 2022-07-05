package item6;

import java.util.regex.Pattern;

public class Item6Main {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$")

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    static long sum() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}

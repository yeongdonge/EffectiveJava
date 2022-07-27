package item11;

import item10.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class Item11Main {
    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(123, 456, 789), "동영");

        String value = m.get(new PhoneNumber(123, 456, 789));
        System.out.println("value = " + value);
    }
}

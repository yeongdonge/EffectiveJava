package item10;

import java.util.ArrayList;
import java.util.List;

public class Item10Main {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Parrineau");
        String s = "parrineau";

        System.out.println("cis.equals(s) = " + cis.equals(s));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println("list.contains(cis) = " + list.contains(cis));
    }
}

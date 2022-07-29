package item12;

import item10.PhoneNumber;

public class Item12Main {
    public static void main(String[] args) {
        Human human = new Human("김동영", 25);
//        System.out.println(human + "- 존재하지 않는 인물입니다(?)");

        PhoneNumber phoneNumber = new PhoneNumber(123, 456, 789);
        System.out.println("phoneNumber = " + phoneNumber);
    }
}

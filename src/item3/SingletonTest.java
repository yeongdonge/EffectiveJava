package item3;

public class SingletonTest {

    public static void main(String[] args) {
        Parrineau parrineau1 = Parrineau.INSTANCE; // public static final 필드 방식의 싱글턴
        Parrineau2 parrineau2 = Parrineau2.getInstance(); // 정적 팩터리 방식의 싱글턴
        Parrineau3 parrineau3 = Parrineau3.INSTANCE; // 열거 타입 방식의 싱글턴

        parrineau1.startIntelliJ();
        parrineau2.startIntelliJ();
        parrineau3.startIntelliJ();
    }
}

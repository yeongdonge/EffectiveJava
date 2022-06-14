package item3;

public class Parrineau2 {

    //정적 팩터리 방식의 싱글턴
    private static final Parrineau2 INSTANCE = new Parrineau2();

    public static Parrineau2 getInstance() {
        return INSTANCE;
    }

    private String name;
    private int age;

    private Parrineau2() {
        name = "Developer";
        age = 25;
    }

    public void startIntelliJ() {
        System.out.println("PARRINEAU2, IntelliJ를 시작합니다.");
    }

}

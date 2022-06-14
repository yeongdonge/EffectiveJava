package item3;

public class Parrineau {

    //public static final 필드 방식의 싱글턴
    public static final Parrineau INSTANCE = new Parrineau();

    private String name;
    private int age;

    private Parrineau() {
        name = "Developer";
        age = 25;
    }

    public void startIntelliJ() {
        System.out.println("PARRINEAU, IntelliJ를 시작합니다.");
    }

}

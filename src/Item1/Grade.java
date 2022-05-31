package Item1;

public class Grade {
    private int grade;

    private Grade(int grade) {
        this.grade = grade;
    }

    public static Grade of(int grade) {
        if (grade > 90) {
            return new HighScore();
        } else if (grade > 70) {
            return new MiddleScore();
        } else {
            return new LowScore();
        }
    }
}

package AssignmentDen;

public class Report {
    public String FirstStudentId;
    public String SecondStudentId;
    public String ThirdStudentId;

    public Report(String FirstStudentId, String SecondStudentId, String ThirdStudentId) {
        this.FirstStudentId = FirstStudentId;
        this.SecondStudentId = SecondStudentId;
        this.ThirdStudentId = ThirdStudentId;

    }

    public String setFirstStudentId() {
        return FirstStudentId;
    }

    public String getFirstStudentId() {
        return FirstStudentId;
    }

    public String setSecondStudentId() {
        return SecondStudentId;
    }

    public String getSecondStudentId() {
        return SecondStudentId;
    }

    public String setThirdStudentId() {
        return ThirdStudentId;
    }

    public String getThirdStudentId() {
        return ThirdStudentId;
    }
    public int score1;
    public int score2;
    public int score3;


    public void setHighestSubjectMark(int Student1Score, int Student2Score, int Student3Score) {
        this.score1 = Student1Score;
        this.score2 = Student2Score;
        this.score3 = Student3Score;

    }

    public int getHighestSubjectMark() {
        if ( score1 < score2 && score1 < score3 ) {
            if (score3 < score1 && score3 < score2) {
                return  score3;

            }
            return score1;

        }
        return 0;
    }


}

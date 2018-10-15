/**
 * Richard Fitzgerald
 * CH4PC3 - TestScore
 * Programming III - AP
 * 10/12/18
 */
public class TestScoreRunner {

   
    public static void main(String[] args) {
        TestScores Lucas = new TestScores(81.5, 96.0, 88.7);
        Lucas.CalcAverage();
        Lucas.GradeLetter();
        System.out.println("Your average grade letter is " + Lucas.getGrade());
    }

}

/**
 * Richard Fitzgerald
 * TestScores Class
 * 10/12/18
 */
public class TestScores {
    private double testScore1;
    private double testScore2;
    private double testScore3;
    private double average;
    private char grade;
    public TestScores(double tS1, double tS2, double tS3){
        testScore1 = tS1;
        testScore2 = tS2;
        testScore3 = tS3;
    }
    
    public void setTestScore1(double tS1){
        testScore1 = tS1;
    }
    public void setTestScore2(double tS2){
        testScore2 = tS2;
    }
    public void setTestScore3(double tS3){
        testScore3 = tS3;
    }
    public void setAverage(double aver){
        average = aver;
    }
    public double TestScore1(){
        return testScore1;
    }
    public double TestScore2(){
        return testScore2;
    }
    public double TestScore3(){
        return testScore3;
    }
    public void CalcAverage(){
        average = (testScore1 + testScore2 + testScore3) / 3;
    }
    public void GradeLetter(){
        if(average >= 90){
            grade = ('A');
        }else if(average >= 80){
            grade = ('B');
        }else if(average >= 70){
            grade = ('C');
        }else if(average >= 60){
            grade = ('D');
        }else{
            grade = ('F');
        }
    }
    public char getGrade(){
        return grade;
    }
    
    
    
    
    
    
    
}

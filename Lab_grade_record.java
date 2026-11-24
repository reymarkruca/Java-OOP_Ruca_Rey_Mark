/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_grade_record;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Lab_grade_record {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Lab_Grade_Record ana = new Lab_Grade_Record("Ana", 80, 90);
        System.out.println(ana.getStudentName() + ": " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        Lab_Grade_Record ben = new Lab_Grade_Record("Ben", 101, 85);
        System.out.println(ben.getStudentName() + ": " + ben.getFinalGrade() + "; "
                + (ben.isPassing() ? "passing" : "not passing"));

        System.out.println( ana.updateScores(95, 101)
                + "; grade stays " + ana.getFinalGrade());

        System.out.println( ana.updateScores(74, 75)
                + "; " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        System.out.println( ana.updateScores(75, 75)
                + "; " + ana.getFinalGrade() + "; "
                + (ana.isPassing() ? "passing" : "not passing"));

        System.out.println(ben.getStudentName() + ": " + ben.getFinalGrade() + "; "
                + (ben.isPassing() ? "passing" : "not passing"));
    }
}
      public class Lab_Grade_Record {
   private String studentName;
    private int quizScore;
    private int labScore;

    public Lab_Grade_Record (String studentName, int quizScore, int labScore){
        this.studentName = studentName;

        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
        } else {
            this.quizScore = 0;
        }

        if (labScore >= 0 && labScore <= 100) {
            this.labScore = labScore;
        } else {
            this.labScore = 0;
        }
    }

    public boolean updateScores(int quizScore, int labScore) {
        if (quizScore < 0 || quizScore > 100 || labScore < 0 || labScore > 100) {
            return false;
        }
        this.quizScore = quizScore;
        this.labScore = labScore;
        return true;
    }

    public double getFinalGrade() {
        return (this.quizScore * 40 + this.labScore * 60) / 100.0;
    }

    public boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    public String getStudentName() {
        return this.studentName;
    }
}

//Why must you validate both new scores before assigning either one?
//You need to check both scores first to make sure they are valid. This prevents one score from changing if the other score is invalid.


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printing_account;

/**
 *
 * @author RUCA_CPE113
 */
public class Printing_Account {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        System.out.println("Initial Credits:");
        System.out.println("Mia: " + mia.getCredits());
        System.out.println("Luis: " + luis.getCredits());

        System.out.println("\nMia prints 4 pages:");
        System.out.println(mia.printPages(4));
        System.out.println("Mia Credits: " + mia.getCredits());

        System.out.println("\nMia tries to print 7 pages:");
        System.out.println(mia.printPages(7));
        System.out.println("Mia Credits: " + mia.getCredits());

        System.out.println("\nMia tries to add -3 credits:");
        System.out.println(mia.addCredits(-3));
        System.out.println("Mia Credits: " + mia.getCredits());

        System.out.println("\nMia adds 4 credits:");
        System.out.println(mia.addCredits(4));

        System.out.println("\nFinal Credits:");
        System.out.println("Mia: " + mia.getCredits());
        System.out.println("Luis: " + luis.getCredits());
    }
}
   class PrintAccount {

    private String studentName;
    private int credits;

    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    public boolean printPages(int pages) {
        if (pages <= 0 || pages > credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getStudentName() {
        return this.studentName;
    }
}



//Activity 1 - AI Use Note

//Prompt Used:
//"Help me create a Java program for a Campus Printing
//Account using constructors and methods."

//What I Accepted:
//I accepted the suggestions about adding credits,
//printing pages, and checking if the account has
//enough credits before printing.

//What I Rejected:
//I did not use Scanner because the activity only
//requires fixed test inputs. I also kept the code
//simple and easy to understand.

//How I Checked It:
//I ran the program in NetBeans and checked the
//results based on the expected output in the handout.
//I also tested invalid inputs to make sure the
//credits would not change when an action failed.



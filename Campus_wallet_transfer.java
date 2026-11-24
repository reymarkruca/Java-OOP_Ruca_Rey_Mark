/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campus_wallet_transfer;

/**
 *
 * @author Rey Mark S. Ruca
 */
public class Campus_wallet_transfer {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Campus_Wallet_Transfer aly = new Campus_Wallet_Transfer("Aly", 100);
        Campus_Wallet_Transfer ben = new Campus_Wallet_Transfer("Ben");
        System.out.println( "Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        
        System.out.println( aly.transferTo(ben, 35)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(ben, 70)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(aly, 10)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.deposit(15)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( aly.transferTo(ben, 65)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.transferTo(aly, 0)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
        System.out.println( ben.transferTo(null, 10)
                + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}
    
    public class Campus_Wallet_Transfer {
    private String owner;
    private int balance;


    public Campus_Wallet_Transfer(String owner, int balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public Campus_Wallet_Transfer(String owner) {
        this(owner, 0);
    }
    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }
    public boolean transferTo(Campus_Wallet_Transfer recipient, int amount) {    
        if (recipient == null || recipient == this || amount <= 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }
    public int getBalance() {
        return this.balance;
    }
    public String getOwner() {
        return this.owner;
    }
}




/* Bankcustomer class with acno,atype,amt fields using parameterized constructor? */

public class BankCustomer {

    // Private properties
    private int acno;
    private String atype;
    private int amt;

    // No-argument constructor
    public BankCustomer() {
    }

    // Parameterized constructor
    public BankCustomer(int acno, String atype, int amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter and Setter for acno
    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    // Getter and Setter for atype
    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    // Getter and Setter for amt
    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating BankCustomer objects using the parameterized constructor
        BankCustomer cus1 = new BankCustomer(101, "Current", 30000);
        BankCustomer cus2 = new BankCustomer(102, "Savings", 70000);
        BankCustomer cus3 = new BankCustomer(103, "Savings", 58000);

        // Displaying customer details
        System.out.println("Customer 1:");
        System.out.println("Account No.: " + cus1.getAcno());
        System.out.println("Account Type: " + cus1.getAtype());
        System.out.println("Amount: " + cus1.getAmt());

        System.out.println("\nCustomer 2:");
        System.out.println("Account No.: " + cus2.getAcno());
        System.out.println("Account Type: " + cus2.getAtype());
        System.out.println("Amount: " + cus2.getAmt());

        System.out.println("\nCustomer 3:");
        System.out.println("Account No.: " + cus3.getAcno());
        System.out.println("Account Type: " + cus3.getAtype());
        System.out.println("Amount: " + cus3.getAmt());
    }
}


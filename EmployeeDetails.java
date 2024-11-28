
/* Create Emp details eid,ename,companyname using static variable,static method? */

public class EmployeeDetails {

    // Static variables
    private static int eid;
    private static String ename;
    private static String companyname;

    // No-argument constructor
    public EmployeeDetails() {
    }

    // Parameterized constructor
    public EmployeeDetails(int eid, String ename, String companyname) {
        EmployeeDetails.eid = eid;
        EmployeeDetails.ename = ename;
        EmployeeDetails.companyname = companyname;
    }

    // Getter and Setter for eid
    public static int getEid() {
        return eid;
    }

    public static void setEid(int eid) {
        EmployeeDetails.eid = eid;
    }

    // Getter and Setter for ename
    public static String getEname() {
        return ename;
    }

    public static void setEname(String ename) {
        EmployeeDetails.ename = ename;
    }

    // Getter and Setter for companyname
    public static String getCompanyname() {
        return companyname;
    }

    public static void setCompanyname(String companyname) {
        EmployeeDetails.companyname = companyname;
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of EmployeeDetails and initialize static variables
        EmployeeDetails emp = new EmployeeDetails(1001, "Anirban", "Infosys");

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + EmployeeDetails.getEid());
        System.out.println("Employee Name: " + EmployeeDetails.getEname());
        System.out.println("Company Name: " + EmployeeDetails.getCompanyname());
    }
}


import java.util.Scanner;

class employee {
    double Employee_no;
    String Empolyee_name;
    double basic;
    double DA;
    double ID;
    double IT;
    double netSalary;

    void employeeDetails (double employee_no, String name, double ID, double basic) {
        this.Employee_no = employee_no;
        this.Empolyee_name = name;
        this.ID = ID;
        this.basic = basic;
    }

    void netSalary(double basic){
        this.DA = 1.32 * basic;
        this.IT = 0.3 * (basic + this.DA);
        this.netSalary = (basic + this.DA) - this.IT;
    }

    void display() {
        System.out.println(" Employee No : " + Employee_no);
        System.out.println(" Employee Name : " + Empolyee_name);
        System.out.println(" ID : " + ID);
        System.out.println(" Basic : " + basic);
        System.out.println(" DA : " + DA);
        System.out.println(" IT : " + IT);
        System.out.println(" Net Salary : " + netSalary);
    }
}

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employee employ = new employee();

        System.out.print(" Enter Employee No : ");
        double no = sc.nextInt();
        System.out.print(" Enter Employee Name : ");
        String name = sc.next();
        System.out.print("  Enter Employee ID : ");
        double ID = sc.nextInt();
        System.out.print(" Enter basic : ");
        double basic = sc.nextInt();

        employ.employeeDetails(no, name, ID, basic);
        employ.netSalary(basic);
        employ.display();

    }
}
import java.util.Scanner;

class CollegeClass {
    String className;
    String staffName;
    int noOfStudents;

    int[] rollNo;
    String[] name;

    CollegeClass(String className, String staffName, int noOfStudents) {
        this.className = className;
        this.staffName = staffName;
        this.noOfStudents = noOfStudents;

        rollNo = new int[noOfStudents];
        name = new String[noOfStudents];
    }

    void acceptStudents(Scanner sc) {
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Student Name: ");
            name[i] = sc.nextLine();
        }
    }

    void displayClassDetails() {
        System.out.println("\n========== Class Details ==========");
        System.out.println("Class Name      : " + className);
        System.out.println("Staff Name      : " + staffName);
        System.out.println("No. of Students : " + noOfStudents);

        System.out.println("\nStudent Details");
        System.out.println("------------------------");

        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
        }
    }
}

class FirstYearClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Class Name (BCA/B.Com/BSc): ");
        String className = sc.nextLine();

        System.out.print("Enter Staff Name: ");
        String staffName = sc.nextLine();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        CollegeClass c = new CollegeClass(className, staffName, n);

        c.acceptStudents(sc);

        c.displayClassDetails();

        sc.close();
    }
}
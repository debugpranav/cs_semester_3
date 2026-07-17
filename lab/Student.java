package lab;
import java.util.Scanner;

class Student {
    int enrollmentNo;
    String name;
    int sub1, sub2, sub3;
    int total;

    static Scanner sc = new Scanner(System.in);

    Student(int enrollmentNo, String name, int sub1, int sub2, int sub3) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;

        if (sub1 >= 50 && sub2 >= 50 && sub3 >= 50) {
            total = sub1 + sub2 + sub3;
        } else {
            total = 0;
        }
    }

    static Student acceptDetails() {
        System.out.print("Enter Enrollment No: ");
        int eno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int s3 = sc.nextInt();

        return new Student(eno, name, s1, s2, s3);
    }

    void displayDetails() {
        System.out.println("\nEnrollment No : " + enrollmentNo);
        System.out.println("Name          : " + name);
        System.out.println("Subject 1     : " + sub1);
        System.out.println("Subject 2     : " + sub2);
        System.out.println("Subject 3     : " + sub3);

        if (total == 0) {
            System.out.println("Result        : Fail");
        } else {
            System.out.println("Result        : Pass");
        }

        System.out.println("Total Marks   : " + total);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            
            students[i] = Student.acceptDetails();
            students[i].displayDetails();
        }
        
        Student.sc.close();
    }
}
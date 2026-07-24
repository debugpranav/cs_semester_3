import java.util.Scanner;

class Student {
    String name;
    int regNo;
    int[] marks = new int[3];
    int total;

    Student(String name, int regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;

        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Register No  : " + regNo);
        System.out.println("Total Marks  : " + total);
    }
}

class FirstYear {
    String className;
    String staffName;
    int noOfStudents;
    Student[] students;

    FirstYear(String className, String staffName, int noOfStudents) {
        this.className = className;
        this.staffName = staffName;
        this.noOfStudents = noOfStudents;
        students = new Student[noOfStudents];
    }

    Student bestStudent(FirstYear fy) {
        Student best = fy.students[0];

        for (int i = 1; i < fy.noOfStudents; i++) {
            if (fy.students[i].total > best.total) {
                best = fy.students[i];
            }
        }
        return best;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Class Name (BCA/B.Com/B.Sc): ");
        String className = sc.nextLine();

        System.out.print("Enter Staff Name: ");
        String staffName = sc.nextLine();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        FirstYear fy = new FirstYear(className, staffName, n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Register No. : ");
            int regNo = sc.nextInt();

            int[] marks = new int[3];
            System.out.println("Enter Marks of 3 Subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            fy.students[i] = new Student(name, regNo, marks);
        }

        Student best = fy.bestStudent(fy);

        System.out.println("\n----- Best Student -----");
        System.out.println("Class Name : " + fy.className);
        System.out.println("Staff Name : " + fy.staffName);
        best.display();

        sc.close();
    }
}

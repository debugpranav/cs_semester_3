import java.util.Scanner;

class Employee {
    String name;
    String appointmentDate;

    void read(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        appointmentDate = sc.nextLine();
    }

    void display() {
        System.out.println(name + "\t" + appointmentDate);
    }
}

public class EmployeeSeniority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[10];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].read(sc);
        }

        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = 0; j < emp.length - 1 - i; j++) {
                if (emp[j].appointmentDate.compareTo(emp[j + 1].appointmentDate) > 0) {
                    Employee temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
                }
            }
        }

        System.out.println("\nEmployees Sorted by Seniority");
        System.out.println("------------------------------------");
        System.out.println("Name\tAppointment Date");
        System.out.println("------------------------------------");

        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
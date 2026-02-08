import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks1;
    int marks2;

    Student(int r, String n, int m1, int m2) {
        rollNo = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
    }

    double calculateAverage() {
        return (marks1 + marks2) / 2.0;
    }

    void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks 1: ");
            int m1 = sc.nextInt();

            System.out.print("Marks 2: ");
            int m2 = sc.nextInt();

            students[i] = new Student(roll, name, m1, m2);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].displayInfo();
        }

        sc.close();
    }
}

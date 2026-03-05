import java.util.Scanner;

class Student {

    String name;
    int standard;
    long collegeId;
    String collegeName;

    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;

    Student(String name, int standard, long collegeId, String collegeName,
            int marks1, int marks2, int marks3, int marks4, int marks5) {

        this.name = name;
        this.standard = standard;
        this.collegeId = collegeId;
        this.collegeName = collegeName;

        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
    }

    void displayDetails() {

        System.out.println("Student name: " + name);
        System.out.println(standard + " -> th standard");

        if (collegeName.equals("BGS")) {
            System.out.println("Valid school name: " + collegeName);
        } else {
            System.out.println("This is not valid school name");
        }

        if (collegeId <= 6) {
            System.out.println("Valid collegeId");
        } else {
            System.out.println("Invalid collegeId");
        }
    }

    void calculateMarks() {

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Marks4: " + marks4);
        System.out.println("Marks5: " + marks5);

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;

        System.out.println("Total marks: " + totalMarks);

        double percentage = totalMarks / 5.0;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage > 90) {
            System.out.println("A -> GRADE");
            System.out.println("First class");
        } else if (percentage >= 60 && percentage <= 90) {
            System.out.println("B -> GRADE");
            System.out.println("2nd class");
        } else if (percentage >= 35 && percentage < 60) {
            System.out.println("C -> GRADE");
            System.out.println("3rd class");
        } else {
            System.out.println("Failed");
        }

        checkPassFail();
        highestMarks();
        lowestMarks();
    }

    void checkPassFail() {

        if (marks1 < 35 || marks2 < 35 || marks3 < 35 || marks4 < 35 || marks5 < 35) {
            System.out.println("Result: FAIL ( subject below 35)");
        } else {
            System.out.println("Result: PASS");
        }
    }

    void highestMarks() {

        int highest = Math.max(marks1,
                Math.max(marks2,
                Math.max(marks3,
                Math.max(marks4, marks5))));

        System.out.println("Highest Marks: " + highest);
    }

    void lowestMarks() {

        int lowest = Math.min(marks1,
                Math.min(marks2,
                Math.min(marks3,
                Math.min(marks4, marks5))));

        System.out.println("Lowest Marks: " + lowest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter standard:");
        int standard = sc.nextInt();

        System.out.println("Enter college ID:");
        long collegeId = sc.nextLong();

        System.out.println("Enter college name:");
        String collegeName = sc.next();

        System.out.println("Enter marks1:");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks2:");
        int marks2 = sc.nextInt();

        System.out.println("Enter marks3:");
        int marks3 = sc.nextInt();

        System.out.println("Enter marks4:");
        int marks4 = sc.nextInt();

        System.out.println("Enter marks5:");
        int marks5 = sc.nextInt();

        Student s1 = new Student(name, standard, collegeId, collegeName,
                marks1, marks2, marks3, marks4, marks5);

        s1.displayDetails();
        s1.calculateMarks();

        System.out.println("--------------------------------");
    }
}
		
		
		
		

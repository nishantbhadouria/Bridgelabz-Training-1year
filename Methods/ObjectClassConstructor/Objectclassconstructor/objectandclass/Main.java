class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Aman";
        s.rollNumber = 12;
        s.marks = 82;

        s.display();
    }
}
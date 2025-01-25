package com.example;

class Student {
    int roll;
    String name;
    int marks;

    
    // Method to update the marks based on the certification
    public static void updateMarks(Student student, String certification) {
        switch (certification) {
            case "OCJP":
                student.marks = 90; // Update marks for OCJP certification
                break;
            case "OCA":
                student.marks = 80; // Update marks for OCA certification
                break;
            case "MCSA":
                student.marks = 77; // Update marks for MCSA certification
                break;
            case "GCP":
                student.marks = 92; // Update marks for GCP certification
                break;
            default:
                System.out.println("Invalid certification!");
                return;
        }
        System.out.println("Marks updated for " + student.name + " after completing " + certification + ": " + student.marks + "%");
    }

    public static void main(String[] args) {
        // Creating an array of 3 students
        Student[] students = new Student[3];

        // Initializing the Student objects
        students[0] = new Student();
        students[0].roll = 101;
        students[0].name = "Sayantani";
        students[0].marks = 85; // Initial marks

        students[1] = new Student();
        students[1].roll = 102;
        students[1].name = "Ahana";
        students[1].marks = 90; // Initial marks

        students[2] = new Student();
        students[2].roll = 103;
        students[2].name = "Poulomi";
        students[2].marks = 78; // Initial marks

        // Display initial marks
        System.out.println("Initial Marks:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", Marks: " + student.marks);
        }

        // Update marks based on certifications
        updateMarks(students[0], "OCJP"); 
        updateMarks(students[1], "MCSA"); 
        updateMarks(students[2], "GCP");  
        // Display updated marks
        System.out.println("\nUpdated Marks:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", Marks: " + student.marks);
        }
    }
}




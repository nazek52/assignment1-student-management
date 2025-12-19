# assignment1-student-management
Rymbek Nazerke se2520
# Student Management System

## Project Overview
This project is a simple Student Management System written in Java.
The goal of the program is to manage students, their GPA, credits,
and courses using Object-Oriented Programming concepts.

The project demonstrates the use of classes, objects, constructors,
methods, arrays, encapsulation, and composition.

---

## Class Descriptions

### Student Class
The Student class represents a student.

Fields:
- name – student name
- id – student ID
- major – student major
- gpa – student GPA
- credits – total earned credits

Constructor:
- Initializes name, id, and major
- Sets GPA and credits to 0

Methods:
- updateGpa() – updates student GPA
- addCredits() – adds credits
- isHonors() – checks if GPA ≥ 3.5
- getGpa(), getCredits() – return GPA and credits
- toString() – displays student information

---

### Course Class
The Course class represents a course and contains students.
This shows a composition relationship because a course has students.

Fields:
- courseName
- instructor
- students (array of Student objects)

Methods:
- addStudent() – adds a student to the course
- courseAverageGPA() – calculates average GPA
- highestCredit() – finds student with highest credits
- toString() – displays course information

---

## How to Compile and Run

Compile the program:
```bash
javac *.java



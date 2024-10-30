import java.util.Scanner;

class Student{
    int totalMarks = 0;
    int[] marks;
    Scanner sc = new Scanner(System.in);
    int noOfSubjects;
    float avgMarks;
    void setMarks(int noOfSubjects){
        this.noOfSubjects = noOfSubjects;
        marks = new int[noOfSubjects];
        for(int i = 0;i < noOfSubjects;i++){
            System.out.println("Enter subject " + (i + 1) + " mark:");
            marks[i] = sc.nextInt();
        }
    }
    int getTotalMarks(){
        for(int i = 0;i < noOfSubjects;i++){
            totalMarks += marks[i];
        }
        return totalMarks;
    }
    float getAverage(){
        avgMarks = (float)totalMarks / (float)noOfSubjects;
        return avgMarks;
    }
    char getGrade(){
        if(avgMarks > 90)
            return 'A';
        else if(avgMarks > 80)
            return 'B';
        else if(avgMarks > 70)
            return 'C';
        else if(avgMarks > 60)
            return 'D';
        else if(avgMarks > 50)
            return 'E';
        else
            return 'F';
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students:");
        int noOfStudents = sc.nextInt();
        Student s[] = new Student[noOfStudents];
        for(int i = 0;i < noOfStudents;i++) {
            s[i] = new Student();
            System.out.println("Enter no of subjects for the student " + (i + 1));
            int noOfSubjects = sc.nextInt();
            System.out.println("Enter marks for the student " + (i + 1));
            s[i].setMarks(noOfSubjects);
            System.out.println("The total marks for the student " + (i + 1) + " is " + s[i].getTotalMarks());
            System.out.println("The average marks for the student " + (i + 1) + " is " + s[i].getAverage());
            System.out.println("The grade for the student " + (i + 1) + " is " + s[i].getGrade());
        }
    }
}

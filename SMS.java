import java.util.ArrayList;
import java.util.Scanner;

class ClassStudent{
    private String name;
    private int age;
    private int roll;
    private char grade;
    public ClassStudent(String name,int age,int roll,char grade){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public void getDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll : " + roll);
        System.out.println("Grade : " + grade);
    }
}
class StudentManagementSystem{
    static int i = 0;
    private ArrayList<ClassStudent> students = new ArrayList<>();
    private ArrayList<String> OriginalName = new ArrayList<>();
    private String name;
    private int age;
    private int roll;
    private char grade;
    Scanner sc = new Scanner(System.in);
    public void add(){
        System.out.println("Enter the name of student " + (i + 1) +":");
        name = sc.nextLine();
        if(name == "")
            name = sc.nextLine();
        System.out.println("Enter the age of student " + (i + 1) +":");
        age = sc.nextInt();
        System.out.println("Enter the roll of student " + (i + 1) +":");
        roll = sc.nextInt();
        System.out.println("Enter the grade of student " + (i + 1) +":");
        grade = sc.next().charAt(0);
        students.add(new ClassStudent(name,age,roll,grade));
        OriginalName.add(name);
        System.out.println("STUDENT ADDED!");
        i++;
    }
    public void delete() throws NullPointerException{
        int count = 0;
        String name = "";
        System.out.println("Enter the name of the student to delete:");
        name = sc.nextLine();
        if(name == "")
            name = sc.nextLine();
        for (ClassStudent std : students) {
            String stdName = std.getName();
            if(stdName.toLowerCase().equals(name.toLowerCase())){
                students.remove(stdName);
                OriginalName.remove(stdName);
                i--;
                System.out.println("STUDENT REMOVED!");
                count = 1;
            }
        }
        if(count != 1)
            System.out.println("No such student is found!");
    }
    public void search() throws NullPointerException{
        int count = 0;
        String name = "";
        System.out.println("Enter the name of the student to search:");
        name = sc.nextLine();
        if(name == "")
            name = sc.nextLine();
        for (ClassStudent std : students) {
            String stdName = std.getName();
            if(stdName.toLowerCase().equals(name.toLowerCase())){
                std.getDetails();
                count = 1;
            }
        }
        if(count != 1)
            System.out.println("No such student is found!");
    }
    public void display(){
        if(OriginalName.isEmpty())
            System.out.println("There are no student!");
        else{
            System.out.println("The name of the students are:");
            for(String name : OriginalName){
                System.out.println(name);
            }
        }
    }
}
public class SMS{
    public static void main(String[] args){
        int condNum;
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem obj = new StudentManagementSystem();
        boolean condition = true;
        int op;
        while(condition){
            System.out.println("Operations to perform:\n1.Add a student\n2.Remove a student\n3.Search a student\n4.Display all the students");
            op = sc.nextInt();
            switch(op){
                case 1:
                    obj.add();
                    break;
                case 2:
                    try {
                        obj.delete();
                    }catch(NullPointerException E){
                        System.out.println("The are no students to delete!");
                    }
                    break;
                case 3:
                    try {
                        obj.search();
                    }catch(NullPointerException E){
                        System.out.println("The is no such student!");
                    }
                    break;
                case 4:
                    obj.display();
                    break;
                default:
                    System.out.println("Invalid Parameter");
            }
            boolean tryCondition = true;
            while(tryCondition){
                System.out.println("Try Again(0 to No/1 to Yes)?");
                condNum = sc.nextInt();
                if(condNum == 0){
                    System.out.println("Thankyou!");
                    condition = false;
                    break;
                }
                else if(condNum != 1)
                    System.out.println("Invalid Number...\n");
                else
                    break;
            }
        }

    }
}

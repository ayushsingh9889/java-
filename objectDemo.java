// java is almost an Object oriented programing language
//

public class objectDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "Ayush";
        student1.age = 20;
        student1.rollNumber = 101;
        student1.college = "Uka tarsadiya university College";
        student1.markAttendance();
        student1.print();

        student2.name = "Yuvraj";
        student2.age = 21;
        student2.rollNumber = 102;
        student2.college = "Uka tarsadiya university College";
        student2.markAttendance();
        student2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;
    void markAttendance(){
        System.out.println("Attendance marked for " + name);
    }
    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College: " + college);
    }
}

package Buoi6.StaticMethod.method;

public class StaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Codegym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}


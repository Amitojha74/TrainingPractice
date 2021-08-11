package DI_Examples;

public class Student1 {
    private int rollNo;
    private String name;
    private Subject subject;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void Display(){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Subject Name: "+subject);
    }
}

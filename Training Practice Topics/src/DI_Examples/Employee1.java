package DI_Examples;

public class Employee1 {

    private int eid;
    private String name;
    private long salary;

    public Employee1() {
        System.out.println("Def Constructor");
    }

    public Employee1(int eid, String name, long salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public Employee1(int eid) {
        this.eid = eid;
    }

    public Employee1(String name) {
        this.name = name;
    }

    public Employee1(long salary) {
        this.salary = salary;
    }

    public void Display(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Id: "+ eid);
        System.out.println("Salary: "+ salary);
    }
}

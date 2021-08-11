import java.util.Comparator;

public class Student implements Comparator<Student> {

    private int id;
    private String name;
    private int age;
    private String place;

    public Student() {
        super();
    }

    public Student(int id, String name, int age, String place) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "[Id=" + id + ", Name=" + name + ", Age=" + age + ", Place=" + place + "]";
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

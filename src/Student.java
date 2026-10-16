public class Student {
    int rollNo;
    String name;
    int marks;

    public Student() {
    }

    public Student(int rollNo, String name, int marks) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }
    int getMarks(){
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

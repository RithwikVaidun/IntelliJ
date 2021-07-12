package School;

public class Classroom {
    Student[] students;
    String name;

    public Classroom(int nStud, String n){
        students =  new Student[nStud];
        name = n;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

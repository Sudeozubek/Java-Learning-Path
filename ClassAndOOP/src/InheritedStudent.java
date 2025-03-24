public class InheritedStudent extends BasePerson {
    int studentId;
    static int idCounter = 1000;

    public InheritedStudent(String name, int age) {
        super(name, age);
        this.studentId = idCounter;
        idCounter++;
    }
    public void showStudentInfo(){
        showInfo();
        System.out.println("Student ID: "+ studentId);
    }
}


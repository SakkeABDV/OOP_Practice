import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Student student = new Student();
        student.setId(10);
        student.setFullName("Sanzhar Abdymomunov");
        student.setAge(19);
        student.setGroup("Java-8");


        Student student1 = new Student();
        student1.setId(20);
        student1.setFullName("Nuradil Dzholdoshbekov");
        student1.setAge(19);
        student1.setGroup("Java-8");

        Student student2 = new Student();
        student2.setId(30);
        student2.setFullName("Ilim Shabdanov");
        student2.setAge(19);
        student2.setGroup("Java-8");

        Student student3 = new Student();
        student3.setId(40);
        student3.setFullName("Dastan Akbaraliev");
        student3.setAge(19);
        student3.setGroup("Java-8");

        Student student4 = new Student();
        student4.setId(50);
        student4.setFullName("Davran Joldoshbaev");
        student4.setAge(18);
        student4.setGroup("Java-8");

        Student[] students = {student, student1, student2, student3, student4};


        findById(scanner1.nextInt(), students);


    }

    public static void findById(int id, Student[] students) {
        for (Student studs : students) {
            if (id == studs.getId()) {
                studs.showInfo();
                System.out.println();
            }

        }
    }
}


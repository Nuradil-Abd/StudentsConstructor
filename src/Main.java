import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

       Student student = new Student("Adilet",(byte) 19, 75);
       Student student1 = new Student("Atai",(byte)16, 45);
       Student student2 = new Student("Baysal",(byte) 25, 55);

       Student[] students = {student,student1,student2};

       Instructor instructor = new Instructor("Urmat","JAVA backend");

       Course course =  new Course("Js",instructor, student, student1, student2);

       Course course1 = new Course(students, "English",instructor);

        System.out.println(course.getCourseName());
        System.out.println(course.instructor.getInstructorInfo());
        for (Student stud : course.students) {
            System.out.println(stud.getStudentInfo());

        }


    }
}
public class Course {


    String courseName;
    Instructor instructor;
    Student[] students;

    public Course(){

    }

    public Course(String courseName){
        this.courseName = courseName;
    }

    public Course(String courseName,Instructor instructor,Student...students){

        if(courseName.length() <= 2){
            System.err.println("""
            Введите корекктное название курса!
            (название должно содержать больше 2 символов!
            """);
            this.courseName = "Null";
            this.instructor =new Instructor();
            this.students = new Student[0];

        }else{


        this.courseName = courseName;
        this.instructor = instructor;
        this.students = students;
        }
    }
    public Course(Student[] students,String courseName,Instructor instructor){
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = students;
    }



    public String getCourseName(){
        return String.format("""
                Course
                Name: %s
                """,courseName);
    }

}

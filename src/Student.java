public class Student {

    String name;
    byte age;
    int typeRacer;

    public Student(){

    }

    public Student(String name, byte age,int typeRacer){
        if(age <= 16) {
            System.err.println( name + " не может быть студентом!");
            this.name = "null";
            this.age = 0;
            this.typeRacer = 0;
        }else{
        this.name = name;
        this.age = age;
        this.typeRacer = typeRacer;
        }
    }

    public String getStudentInfo(){
        return String.format("""
                
                Student
                Name: %s
                Age: %d
                Type Racer: %d""",name,age,typeRacer);
    }

}

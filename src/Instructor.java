public class Instructor {


    String name;
    String programmerLanguage;

    public Instructor(){

    }

    public Instructor(String name,String programmerLanguage){
        this.name = name;
        this.programmerLanguage = programmerLanguage;
    }


    public String getInstructorInfo(){
        return String.format("""
                Instructor:
                Name: %s
                Programming Languege: %s
                """,name,programmerLanguage);
    }

}

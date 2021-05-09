package Examples;

import studentMgt.Student;

public class Class1 extends Student {
    public void showStudentGroup(Student st)
    {
        //String g=st.group; //erreur car group est protected, la classe "Class1" n'est pas une classe fille de Student
        //et nous ne sommes pas dans le meme pacage

    }
}

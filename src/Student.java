import java.util.Scanner;

public class Student {
    //Attributs (les caracteristiques de l'étudiant)
    private int code;
    private String firstName;
    private String lastName;


   //une classe ne contenant pas de constructeur explicite a un constructeur par defaut
    //definit par la JVM : Java Virtual Machine
    //ce constructeur est non paramétré et ne fait rien
    //si on defint un constructeur explicitement, il n'y a plus de constructeur par defaut
    //surcharge du constructeur
    public Student(int c1)
    {
        code=c1;
    }
    public Student(int c1, String fName, String lName)
    {
        code=c1;
        firstName=fName;
        lastName=lName;
    }
    public Student()
    {
        code=0;
        firstName="";
        lastName="";
    }

    //getter : c'est méthode permettant de recuperer la valeur d'un attribut private ou protected
    public int getCode() //permet de lire la valeur de code
    {
        return code;
    }
    //setter : c'est une méthode permettant d'affecter une valeur à un attributs(private ou protected)
    public void setFirstName(String fn)//ecriture dans l'attribut firstName
    {
        firstName = fn;
    }
    public String getFirstName()
    {
        return firstName;
    }
    //Methodes
    public void showStudentInfos()
    {
        //on veut afficher ainsi Etudent[code=11, nom=Ben Ahmed, prénom=Salah]
        System.out.println("Etudiant[code = "+code+", nom = "+firstName+",prénom = "+lastName);
    }
    //recupère les propreités d'un étudiant à partir du clavier
    public void getStudentInfos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Code de l'étudiant ? ");
        code=sc.nextInt();
        System.out.println("Nom de l'étudiant ? ");
        sc.nextLine();
        firstName=sc.nextLine();
        System.out.println("Prénom de l'étudiant ? ");
        lastName=sc.nextLine();
    }
}

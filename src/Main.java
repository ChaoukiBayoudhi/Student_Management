import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Saisir les informations de l'étudiant");
        //La relation entre classe est objet est assurée par la notion d'instanciation
        //l'instanciation <==>reservation d'espace mémoire
        //la reservation d'espace mémoire en java se fait avec "new"
        //syntaxe : <nomClasse> nomobjet=new NomClasse(paramètres);
        //Student st1=new Student(); //st1 est un objet
        //pour appeler une méthode ou attribut public la syntaxe
        //nombjet.nomMethod();
//        st1.getStudentInfos();
       // System.out.println("Les caracteristiques de l'étudiant sont :");
       // st1.showStudentInfos();
//        System.out.println("code ="+st1.getCode());
//        st1.mark=13.3;
//        System.out.println("Note de l'étudient = "+st1.mark);
//        System.out.println("Donner le nouveau nom : ");
//        Scanner sc=new Scanner(System.in);
//        String firstName=sc.nextLine();
//        st1.setFirstName(firstName);
//        System.out.println("Les nouvelles infos de l'étudiant :");
//        st1.showStudentInfos();
//        st1.group="2LMAD";
//        System.out.println("Le groupe de l'étudiant = "+st1.group);

        //Surcharge de constructeur
        Student st1=new Student();
        st1.setFirstName("Meriem");
        System.out.println("Les caracteristiques de l'étudiant st1 sont :");
        st1.showStudentInfos();
        Student st2=new Student(12);
        System.out.println("Les caracteristiques de l'étudiant st2 sont :");
        st2.showStudentInfos();
        Student st3=new Student(25,"Ben Mohamed","Bochra");
        System.out.println("Les caracteristiques de l'étudiant st3 sont :");
        st3.showStudentInfos();

    }
}

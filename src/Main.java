import studentMgt.Student;
import studentMgt.StudentGroup;

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
//        Student st1=new Student();
//        st1.setFirstName("Meriem");
//        System.out.println("Les caracteristiques de l'étudiant st1 sont :");
//        st1.showStudentInfos();
//        Student st2=new Student(12);
//        System.out.println("Les caracteristiques de l'étudiant st2 sont :");
//        st2.showStudentInfos();
//        Student st3=new Student(25,"Ben Mohamed","Bochra");
//        Student st4=new Student(11,"Ben Mohamed","Bochra");
//        //st3 est une reference (une adresse mémoire)
//        //st4 est aussi une reference (une autre adresse mémoire)
//        if(st3==st4)
//            System.out.println("identiques");
//        else
//            System.out.println("Ne sont pas identiques");
//        //resultat "Ne sont pas identiques" malgré qu'ils contiennet les même valeurs
//        //rappel pour invoquer une méthode -->syntaxe : nom_objet.nom_méthode(nom_paramètres)
//        boolean ident=st3.isEqual(st4);
//        //st3 est l'objet avec lequel nous avons applé la méthode
//        //cet objet est appelé "objet courant"
//        //isEqual compare deux objets "l'objet courant" et st4
//        System.out.println("students are equal = "+ident);

        Student st3=new Student(25,"Ben Mohamed","Bochra");
        Student st4=new Student(11,"Ben Salah","Ahmed");
        //creation d'un  groupe des étudiants
        StudentGroup gr1=new StudentGroup(30);
        //ajout de deux étudiants au groupe
        gr1.addStudent(st3);
        gr1.addStudent(st4);
        //afficher les étudaints
        gr1.listStudents();
        int index1=0,index2=1;
        boolean equal= gr1.compare(index1,index2);
        System.out.println("Les étudiants aux indices "+index1+" et "+ index2 +" sont identiques ="+ equal);


    }
}

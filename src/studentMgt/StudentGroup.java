package studentMgt;

public class StudentGroup {
    //tableau en java
    //declaration :
    //UnType[] nom_tab=new Untype[taille];
    //accés à une case d'un tableau --> se fait via indice
    //nom_tab[index] avec index appartient à [0,nom_tab.length[
    //avec nom_tab.length est la taille (le nombre des elements) du tableau.
    //exemple declaration d'un tableau des entiers
//    int[] tab1=new int[5];//un tableau de 5 entiers
//    tab1[0]=11;
//    int[] tab1; //declaration
//    tab1=new int[5];//reservation de l'espace mémoire
    private Student[] group;
    private int nbStudents;

    public StudentGroup() {
        group=new Student[50];
        nbStudents=0;
    }

    public StudentGroup(Student[] group) {
        this.group = group;
        nbStudents=group.length;
    }
    public StudentGroup(int size)
    {
        group=new Student[size];
        nbStudents=0;
    }
    public void listStudents() //afficher la liste des étudiants du groupe
    {
        System.out.println("La liste des étudiants du groupe :");
        for(int i=0;i< nbStudents;i++) {
            System.out.println("L'étudiant n° "+(i+1));
            this.group[i].showStudentInfos();
        }
    }
    public void addStudent(Student st) //ajoute un étudiant au groupe à la fin du tableau
    {
        //si nbStudents=0 --> on ajoute à l'indice 0
        //si nbStudents=1 --> on ajoute à l'indice 1
        //...
        if(nbStudents< group.length) {
            group[nbStudents] = st;
            nbStudents++;
            System.out.println("L'étudiant a été ajouté");
        }
        else
            System.out.println("Group saturé !! Ajout impossible");
    }
    public boolean compare(int indexStudent1, int indexStudent2)
    {
        if((indexStudent1>=0&&indexStudent1<nbStudents)&&(indexStudent2>=0&&indexStudent2<nbStudents)) {
            Student st1 = group[indexStudent1];
            Student st2 = group[indexStudent2];
            return st1.isEqual(st2);
        }
        return false;
    }

}

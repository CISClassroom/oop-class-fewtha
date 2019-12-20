import com.company.Student;

public class Main {

    public static void main(String[] args) {
        // create Student object
        Student mark = new Student();
        Student tontan = new Student();
        Student dream = new Student();

        //input data to Object
        mark.name = "X Mark";
        mark.id = "001";
        mark.major = "CIS";
        tontan.name = "Ton Tan";
        tontan.id = "002";
        tontan.major = "CIS";
        dream.name = "Dream all night";
        dream.id = "003";
        dream.major = "CS";

        //get data from Object
        //System.out.println("1. " + mark.name + " " + mark.major);
        //System.out.println("2. " + tontan.name + " " + tontan.major);

        // add student to array
        // array index
        Student[] oopStudent = {mark, tontan};

        System.out.println("1. " + oopStudent[0].name);
        System.out.println("1. " + oopStudent[1].name);

    }
    // To find CIS Student
    public static void find_CIS_Student(Student[] student){
        for(int i = 0; i < student.length; i++){
            if(student[i].major == "CIS"){
                System.out.println(i+1 + ". " + student[i].name);
            }
        }
    }
    public void find_CS_Student(){

    }
}


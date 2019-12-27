import com.company.Student;

public class Main {

    public static void main(String[] args) {
        Student few = new Student();

        few.name = "thanagon piromchai";
        few.id = "623410034-7";
        few.major = "CIS";
        //add your code here
        System.out.println("1. " + few.name + " "+ few.major);
        Student[] oopStudents = {few,};
        System.out.println("1. "+oopStudents[0].name);
        
        find_CIS_Student(oopStudents);

    }

    public static void find_CIS_Student(Student[] student){
        for(int i = 0; i < student.length; i++){
            if(student[i].major == "CIS"){
                System.out.println(i+1 + ". " + student[i].name);
            }
        }
    }
}


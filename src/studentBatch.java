import java.util.Arrays;
import java.util.stream.IntStream;
//ENCAPSULATION
public class studentBatch{
    //data section
    //what is studentBatch
    // a list of students registered in a studentBatch
    //"list of students?"  an array of student
    Student studentList[] = new Student[10];
    int currsz = 0;

    //operation
    public void add(Student student,int i){
        studentList[i] = student;
    }

    //method overloading
    public void add(Student student){
        studentList[currsz++] = student;
    }


    boolean find(String name){
        // loop through the array student
        //for each student in students
        //check whether name is the same as that in student
        for (int i=0;i<currsz;i++){
            if (studentList[i].name.getFname() == name)
                return true;
        }
        return false;
    }
}

import java.util.*;
public class Student {
    Name name;
    private String IC;
    private Address address;
    private int year;
    private String schoolName;
    private List<Double> scores;
    
    public Student(Name name,String IC,Address address, int year,String schoolName){
        this.name=name;
        this.IC=IC;
        this.address=address;
        this.year=year;
        this.schoolName=schoolName;
       // this.scores= new ArrayList<>();
    }
    
    public void setScores(List<Double> score){

        this.scores = score;
    }
    
    public List<Double> getScores(){
        return scores;
    }
}
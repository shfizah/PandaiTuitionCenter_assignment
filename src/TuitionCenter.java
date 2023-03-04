import java.util.*;

public class TuitionCenter {
    private String name;
    private String location;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;
    private List<studentBatch> sb;
    
    public TuitionCenter(String name, String location, HeadMaster headMaster) {
        this.name = name;
        this.location = location;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }
    
    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeStudent(Student student) {
        students.remove(student);
    }

    
    public int getNumTutors() {
        return tutors.size();
    }
    
    public int getNumStudents() {
        return students.size();
    }
    
    public double getAvgMarks() {
        double sum = 0.0;
        int count = 0;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (double score : scores) {
                sum += score;
                count++;
            }
        }
        return sum / count;
    }
    
    public double getMinMarks() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (double score : scores) {
                if (score < min) {
                    min = score;
                }
            }
        }
        return min;
    }
    
    public double getMaxMarks() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            List<Double> scores = student.getScores();
            for (double score : scores) {
                if (score > max) {
                    max = score;
                }
            }
        }
        return max;
    }
    
    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<studentBatch> getSb() {
        return sb;
    }

    @Override
    public String toString() {
        return "TuitionCenter Name: " + name.toString() + '\n' +
                "Location          : " + location + '\n' +
                "Headmaster        :" + headMaster.toString() ;
    }
}
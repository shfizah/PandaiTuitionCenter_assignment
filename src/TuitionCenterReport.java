import java.text.DecimalFormat;
import java.util.*;
import java.util.Formatter;
public class TuitionCenterReport {
    private TuitionCenter tuitionCenter;

    public TuitionCenterReport(TuitionCenter tuitionCenter) {
        this.tuitionCenter = tuitionCenter;
    }
    
    public void generateReport() {
        System.out.println(tuitionCenter.toString());
        System.out.println("Number of Tutors  : " + tuitionCenter.getNumTutors());
        System.out.println("Number of Students: " + tuitionCenter.getNumStudents());
        System.out.printf("Average Marks     : %.2f", tuitionCenter.getAvgMarks());
        System.out.println("\nMinimum Marks     : " + tuitionCenter.getMinMarks());
        System.out.println("Maximum Marks     : " + tuitionCenter.getMaxMarks());
        
        System.out.println("\nList of Tutors of "+ tuitionCenter.getName() +":");
        List<Tutor> tutors = tuitionCenter.getTutors();
        for (Tutor tutor : tutors) {
            System.out.println("Tutor Name         : " + tutor.getName());
            System.out.println("Identification Card: " + tutor.getIC());
            System.out.println("Address            : " + tutor.getAddress().toString());
            System.out.println("Qualification      : " + tutor.getQualification());
            System.out.println("Years of Experience: " + tutor.getYearsOfExp());
            System.out.println("Date Joined        : " + tutor.getDateJoined());
            System.out.println("Years in Center    : " + tutor.getYearsInCenter());
            System.out.println();
        }
    }
}

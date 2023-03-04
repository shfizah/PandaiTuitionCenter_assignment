import java.util.*;
public class Date {
    private int day;
    private int month;
    private  int year;
    
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "" + day + '/' + month + '/' + year ;
    }
}

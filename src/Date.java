import java.text.SimpleDateFormat;
import java.util.*;
public class Date {
    private int day;
    private int month;
    private  int year;

    Date(){}
    Scanner in = new Scanner(System.in);
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public Date enterDate(){
        System.out.print("Enter DD MM YYYY: ");
        day=in.nextInt();
        month=in.nextInt();
        year=in.nextInt();
        return new Date(day,month,year);
    }

    public int getYear() {
        return year;
    }

    public void dateFormat() throws Exception {
            System.out.println("dd-mm-yyyy");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();
            java.util.Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate= DateFor.format(date1);
            System.out.println(stringDate);
            //System.out.println(date1);
        }

    @Override
    public String toString() {
        return "" + day + '/' + month + '/' + year ;
    }
    public static void main(String[] args){
        Date d = new Date();
        d.enterDate().toString();
        System.out.print(d);
    }
}

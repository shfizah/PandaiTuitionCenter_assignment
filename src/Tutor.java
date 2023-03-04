public class Tutor {
    private Name name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsOfExp;
    private Date dateJoined;
    private int yearsInCenter;
    
    public Tutor(Name name, String IC, String address, String qualification, int yearsOfExp, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExp = yearsOfExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }
    
    public Name getName() {
        return name;
    }
    
    public String getIC() {
        return IC;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public int getYearsOfExp() {
        return yearsOfExp;
    }
    
    public Date getDateJoined() {
        return dateJoined;
    }
    
    public int getYearsInCenter() {
        return yearsInCenter;
    }
}
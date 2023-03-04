public class Name {
    private String fname;
    private String mname;
    private String lname;

    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    @Override
    public String toString() {
        return  fname + " " + mname + " " + lname;
    }


}

import java.util.*;

public class HeadMaster {
    private String name;
    private String IC;
    private String contact;
    
    public HeadMaster(String name, String IC, String contact) {
        this.name = name;
        this.IC = IC;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return " "+name ;
    }
}
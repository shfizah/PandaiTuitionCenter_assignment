public class Address {
    private String district;
    private String postcode;
    private String state;

    public Address(){}
    public Address(String postcode, String district, String state) {
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    @Override
    public String toString() {
        return  district + ','+ postcode +  "," + state ;
    }
}

public class Address {
    private int streetNum;
    private String streetName;
    private String aptNum;
    private String city;
    private String state;
    private int zip;

    public Address(int streetNum, String streetName, String aptNum, String city, String state, int zip) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(int streetNum, String streetName, String city, String state, int zip) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        aptNum = "-1";
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address address) {
        this.streetNum = address.getStreetNum();
        this.streetName = address.getStreetName();
        this.aptNum = address.getAptNum();
        this.city = address.getCity();
        this.state = address.getState();
        this.zip = address.getZip();
    }

    public Address(String address) {

    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        if (!aptNum.equals("-1")) {
            return streetNum + " " + streetName + " Apt " + aptNum + ", " + city + ", " + state + " " + zip;
        }
        return streetNum + " " + streetName + ", " + city + ", " + state + " " + zip;
    }
}

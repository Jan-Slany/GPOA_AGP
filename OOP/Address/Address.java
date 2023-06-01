public class Address {
    private String street;
    private int houseNumber;
    private String city;
    private int zipCode;

    public Address(String street, int houseNumber, String city, int zipCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    // setting values
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    // getting values
    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    // functions
    @Override
    public String toString() {
        return "Street: " + street + "\nHouse number: " + houseNumber + "\nCity: " + city + "\nZip code: " + zipCode;
    }
}

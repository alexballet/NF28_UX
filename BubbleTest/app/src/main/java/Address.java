/**
 * Created by Alxd on 15/05/2017.
 */

public class Address {

    private String streetNumber;

    private String street;

    private String city;

    private String country;

    private String apartmentNumber;

    private String ZIPCode;

    public Address(String streetNumber, String street, String city, String country, String ZIPCode, String apartmentNumber) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.country = country;
        this.ZIPCode = ZIPCode;
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getZIPCode() {
        return ZIPCode;
    }

    public void setZIPCode(String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }
}

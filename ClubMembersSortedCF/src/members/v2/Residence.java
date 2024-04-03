package members.v1;

import java.util.Objects;

public class Residence {
    private int postalCode;
    private String city;
    private String address;

    public Residence() {
    }

    public Residence(int postalCode, String city, String address) {
        if (postalCode < 1000 || postalCode > 9999) {
            throw new IllegalPostalCodeException("Postal code is wrong! It has to be between 1000 and 9999");
        }
        this.postalCode = postalCode;
        this.city = city;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Residence residence = (Residence) o;
        return postalCode == residence.postalCode && Objects.equals(city, residence.city) && Objects.equals(address, residence.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode, city, address);
    }

    @Override
    public String toString() {
        return  postalCode +
                " " + city +
                " " + address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

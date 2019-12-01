package pl.mpas.firstspringexample.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Krok 1 -nadaj encje na klasa
@Entity
public class Address {
    //2 Utworz klucz głowny private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String street;
    private String postalCode;

    // 3 Konstruktor bezargumentowy
    public Address() {
    }

    public Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @JsonProperty("miasto")
    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

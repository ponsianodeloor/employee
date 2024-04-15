package ec.com.apptics.employee.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetMain;
    private String streetSecondary;
    private String number;
    private String city;
    private String state;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Address() {
    }

    public Address(Long id, String streetMain, String streetSecondary, String number, String city, String state, String zipCode) {
        this.id = id;
        this.streetMain = streetMain;
        this.streetSecondary = streetSecondary;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetMain() {
        return streetMain;
    }

    public void setStreetMain(String streetMain) {
        this.streetMain = streetMain;
    }

    public String getStreetSecondary() {
        return streetSecondary;
    }

    public void setStreetSecondary(String streetSecondary) {
        this.streetSecondary = streetSecondary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

package ec.com.apptics.employee.model;

import jakarta.persistence.*;

@Entity
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String identification;

    @OneToOne(mappedBy = "spouse")
    private Employee employee;

    public Spouse() {
    }

    public Spouse(String name, String lastName, String identification) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}

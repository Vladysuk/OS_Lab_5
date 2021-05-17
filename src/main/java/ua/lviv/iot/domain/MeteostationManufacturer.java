package ua.lviv.iot.domain;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "meteostation_manufacturer")
public class MeteostationManufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "email", length = 45)
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private ManufacturerAddress address;

    public MeteostationManufacturer() {
    }

    public MeteostationManufacturer(String name, String phone, String email, ManufacturerAddress address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public MeteostationManufacturer(Integer id, String name, String phone, String email, ManufacturerAddress address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ManufacturerAddress getAddress() {
        return address;
    }

    public void setAddress(ManufacturerAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MeteostationManufacturer[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeteostationManufacturer that = (MeteostationManufacturer) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email, address);
    }
}

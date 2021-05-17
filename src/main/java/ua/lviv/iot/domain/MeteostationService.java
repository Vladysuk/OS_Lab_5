package ua.lviv.iot.domain;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "meteostation_service")
public class MeteostationService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "service_description")
    private String serviceDescription;
    @Column(name = "service_date")
    private Date serviceDate;
    @Column(name = "is_regular")
    private Boolean isRegular;

    @ManyToOne
    @JoinColumn(name = "meteostation_id")
    private Meteostation meteostation;

    public MeteostationService() {
    }

    public MeteostationService(String serviceDescription, Date serviceDate, Boolean isRegular, Meteostation meteostation) {
        this.serviceDescription = serviceDescription;
        this.serviceDate = serviceDate;
        this.isRegular = isRegular;
        this.meteostation = meteostation;
    }

    public MeteostationService(Integer id, String serviceDescription, Date serviceDate, Boolean isRegular, Meteostation meteostation) {
        this.id = id;
        this.serviceDescription = serviceDescription;
        this.serviceDate = serviceDate;
        this.isRegular = isRegular;
        this.meteostation = meteostation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Boolean getRegular() {
        return isRegular;
    }

    public void setRegular(Boolean regular) {
        isRegular = regular;
    }

    public Meteostation getMeteostation() {
        return meteostation;
    }

    public void setMeteostation(Meteostation meteostation) {
        this.meteostation = meteostation;
    }

    @Override
    public String toString() {
        return "MeteostationService[" +
                "id=" + id +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDate=" + serviceDate +
                ", isRegular=" + isRegular +
                ", meteostation=" + meteostation +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeteostationService that = (MeteostationService) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(serviceDescription, that.serviceDescription) &&
                Objects.equals(serviceDate, that.serviceDate) &&
                Objects.equals(isRegular, that.isRegular) &&
                Objects.equals(meteostation, that.meteostation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceDescription, serviceDate, isRegular, meteostation);
    }
}

package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledDate;

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", completedDate=" + completedDate +
                ", scheduledDate=" + scheduledDate +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id && Objects.equals(patient, that.patient) && Objects.equals(doctor, that.doctor) && Objects.equals(completedDate, that.completedDate) && Objects.equals(scheduledDate, that.scheduledDate) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patient, doctor, completedDate, scheduledDate, status);
    }

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private STATUS status;


}

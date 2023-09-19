package egaz.egaz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer staffTrainingId;


    @ManyToOne // Many-to-one relationship with Staff
    @JoinColumn(name = "staff_id") // This specifies the foreign key column in the StaffTraining table
    private Staff staff;

}

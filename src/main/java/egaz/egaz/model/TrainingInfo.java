package egaz.egaz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class TrainingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String content;


//    @OneToMany(mappedBy = "trainingInfo")
//    private List<Venue> venues;
}

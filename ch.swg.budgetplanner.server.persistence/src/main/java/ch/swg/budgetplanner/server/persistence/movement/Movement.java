package ch.swg.budgetplanner.server.persistence.movement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
@NoArgsConstructor
@Table(name = "bp_movements")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer amount;
    private Boolean reoccurring;

    public Movement(String description, Integer amount, Boolean reoccurring) {
        this.description = description;
        this.amount = amount;
        this.reoccurring = reoccurring;
    }
}

package ch.swg.budgetplanner.server.persistence.movement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer amount;
    private Boolean reoccurring;

    public Movement() {
    }

    public Movement(String description, Integer amount, Boolean reoccurring) {
        this.description = description;
        this.amount = amount;
        this.reoccurring = reoccurring;
    }

}

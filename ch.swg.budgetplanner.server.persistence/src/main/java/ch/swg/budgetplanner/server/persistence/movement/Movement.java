package ch.swg.budgetplanner.server.persistence.movement;

import ch.swg.budgetplanner.server.persistence.account.Account;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
  @Column(nullable = false)
  private Integer amount;
  @Column(nullable = false)
  private Boolean reoccurring;
  @ManyToOne
  private Account fromAccount;
  @ManyToOne
  private Account toAccount;

  public Movement(String description, Integer amount, Boolean reoccurring, Account fromAccount, Account toAccount) {
    this.description = description;
    this.amount = amount;
    this.reoccurring = reoccurring;
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
  }
}

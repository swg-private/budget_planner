package ch.swg.budgetplanner.server.rest.movement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.swg.budgetplanner.server.persistence.movement.Movement;
import ch.swg.budgetplanner.server.persistence.movement.MovementRepository;

@RestController
public class MovementController {

  @Autowired
  private MovementRepository repository;

  @GetMapping("/movements")
  public List<Movement> getMovements() {
    return repository.findAll();
  }

  @GetMapping("/movements/{id}")
  public Movement getMovement(@PathVariable Long id) {
    return repository.findById(id)
        .orElseThrow(() -> new MovementNotFoundException(id));
  }
}

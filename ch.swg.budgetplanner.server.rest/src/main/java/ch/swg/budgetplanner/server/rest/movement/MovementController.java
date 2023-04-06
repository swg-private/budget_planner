package ch.swg.budgetplanner.server.rest.movement;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.swg.budgetplanner.server.persistence.movement.Movement;
import ch.swg.budgetplanner.server.persistence.movement.MovementRepository;

@RestController
public class MovementController {
	
	private MovementRepository repository;

	public MovementController(MovementRepository repository) {
		this.repository = repository;
	}

    @GetMapping("/movements")
	public List<Movement> movements() {
		return repository.findAll();
	}

	@GetMapping("/movements/{id}")
	public Movement movement(@PathVariable Long id) {
		return repository.findById(id)
			.orElseThrow(() -> new MovementNotFoundException(id));
	}
}

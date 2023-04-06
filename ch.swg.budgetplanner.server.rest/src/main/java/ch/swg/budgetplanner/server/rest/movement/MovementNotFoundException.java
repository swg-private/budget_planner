package ch.swg.budgetplanner.server.rest.movement;

public class MovementNotFoundException extends RuntimeException {

    public MovementNotFoundException(Long id) {
        super("Could not find movement with ID " + id);
    } 
}

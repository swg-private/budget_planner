package ch.swg.budgetplanner.server.rest.movement;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MovementNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(MovementNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String movementNotFoundHandler(MovementNotFoundException ex) {
        return ex.getMessage();
    }
}

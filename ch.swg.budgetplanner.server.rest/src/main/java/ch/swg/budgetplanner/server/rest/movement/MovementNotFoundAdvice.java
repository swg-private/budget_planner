package ch.swg.budgetplanner.server.rest.movement;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ch.swg.budgetplanner.server.rest.exception.ExceptionResponse;

@ControllerAdvice
public class MovementNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(MovementNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse movementNotFoundHandler(MovementNotFoundException ex) {
        return ExceptionResponse.builder()
            .message(ex.getMessage())
            .build();
    }
}

package com.devsuperior.movieflix.resources.exceptions;

import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import com.devsuperior.movieflix.services.exceptions.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    private static final String RESOURCE_NOT_FOUND = "Resource not found";
    private static final String INVALID_USER = "Invalid user";

    private HttpStatus status;
    String error;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(HttpServletRequest request,
                                                          ResourceNotFoundException ex) {
        status = HttpStatus.NOT_FOUND;
        error = RESOURCE_NOT_FOUND;
        StandardError err = this.buildError(request, ex, status, error);
        return ResponseEntity.status(err.getStatus()).body(err);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<StandardError> unauthorized(HttpServletRequest request,
                                                      UnauthorizedException ex) {
        status = HttpStatus.UNAUTHORIZED;
        error = INVALID_USER;
        StandardError err = this.buildError(request, ex, status, error);
        return ResponseEntity.status(err.getStatus()).body(err);
    }

    private StandardError buildError(HttpServletRequest request,
                                     RuntimeException ex,
                                     HttpStatus status, String error) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setError(error);
        err.setMessage(ex.getMessage());
        err.setPath(request.getRequestURI());
        return err;
    }
}

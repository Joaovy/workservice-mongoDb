package com.webServiceNoSQL.bancoNoSQL.resource.exception;

import com.webServiceNoSQL.bancoNoSQL.service.exception.ObjectNoFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// classe responsavel por tratar possiveis erros nas requesições
@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNoFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNoFoundException e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "não encontrado", e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

}

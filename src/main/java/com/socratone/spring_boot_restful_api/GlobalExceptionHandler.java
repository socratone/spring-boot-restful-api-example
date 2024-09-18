package com.socratone.spring_boot_restful_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 모든 컨트롤러에 대한 전역 예외 처리를 위한 클래스
@ControllerAdvice
public class GlobalExceptionHandler {

    // Validation 오류 발생 시 처리할 메서드
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        // 첫 번째 validation 오류 메시지를 가져오기
        String errorMessage = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .findFirst()
                .orElse("Validation error."); // 기본 메시지 설정

        // 커스텀 에러 응답 객체 생성
        ErrorResponse errorResponse = new ErrorResponse(errorMessage);

        // BAD REQUEST(400) 상태 코드와 함께 에러 응답 반환
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}

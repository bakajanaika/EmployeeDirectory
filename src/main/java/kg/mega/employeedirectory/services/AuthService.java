package kg.mega.employeedirectory.services;

import kg.mega.employeedirectory.models.dtos.AuthRequestDto;
import kg.mega.employeedirectory.models.dtos.RegistrationDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> auth(AuthRequestDto requestDto);
    ResponseEntity<?> createNewUser(RegistrationDto registrationDto);
}
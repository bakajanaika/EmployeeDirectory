package kg.mega.employeedirectory.models;
import kg.mega.employeedirectory.models.dtos.RegistrationDto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;
    @ManyToOne
    Employee employee;
    LocalDate startDate;
    String email;

    public User(RegistrationDto registrationDto) {
        this.email = registrationDto.getEmail();
        this.password = registrationDto.getPassword();
        this.userName = registrationDto.getUsername();
    }

    public User(String userName, String password) {
    }
}
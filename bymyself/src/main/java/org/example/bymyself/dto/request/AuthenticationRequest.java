package org.example.bymyself.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequest {


        private String username;
        @Size(min = 8, message = "PASSWORD_INVALID")
        private String password;
        private String firstName;
        private String lastName;
        private LocalDate dob;
    }


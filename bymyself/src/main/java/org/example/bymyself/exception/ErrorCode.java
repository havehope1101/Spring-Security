package org.example.bymyself.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    INVALID_KEY(999, "Invalid key"),
    USER_EXITED(1001, "User already exists"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    USERNAME_INVALID(1003, "Username is invalid"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    ;


    private int code;
    private String message;

}

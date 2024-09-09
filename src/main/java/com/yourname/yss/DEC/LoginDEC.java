package com.yourname.yss.DEC;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoginDEC {
    String yssId;
    String password;
    String loginError;
}

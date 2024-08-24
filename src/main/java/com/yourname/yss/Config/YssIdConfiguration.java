package com.yourname.yss.Config;

import com.yourname.yss.Enum.UserRole;
import com.yourname.yss.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class YssIdConfiguration {
    @Autowired
    DonorRepository donorRepository;
    @Autowired
    YachakRepository yachakRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    SuperAdminRepository superAdminRepository;
    @Autowired
    UserRepository userRepository;

    public String generateUniqueYssId(UserRole userRole) {
        String yssId;
        do {
            yssId = generateYssId(userRole.toString());
        } while (donorRepository.findByYssId(yssId).isPresent());

        return yssId;
    }

    private String generateYssId(String role) {
        String rolePrefix = role.substring(0, Math.min(role.length(), 3)).toUpperCase();
        String randomString = generateRandomStringFromUUID();
        return rolePrefix + randomString;
    }

    private String generateRandomStringFromUUID() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        StringBuilder result = new StringBuilder();

        // Extract 7 characters: 4 digits and 3 letters
        int digitsAdded = 0;
        int lettersAdded = 0;

        for (char ch : uuid.toCharArray()) {
            if (Character.isDigit(ch) && digitsAdded < 4) {
                result.append(ch);
                digitsAdded++;
            } else if (Character.isAlphabetic(ch) && lettersAdded < 3) {
                result.append(("" + ch).toUpperCase());
                lettersAdded++;
            }
            if (result.length() == 7) {
                break;
            }
        }

        return result.toString();
    }

}

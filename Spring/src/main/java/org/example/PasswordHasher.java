package org.example;

import org.springframework.stereotype.Component;

@Component
public class PasswordHasher {
    public String hash(String name){
        return new StringBuilder(name).reverse().toString();
    }

}

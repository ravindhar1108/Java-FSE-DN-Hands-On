package com.digitalnurture;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void saveUser(String username) {
        System.out.println("User " + username + " saved.");
    }
}

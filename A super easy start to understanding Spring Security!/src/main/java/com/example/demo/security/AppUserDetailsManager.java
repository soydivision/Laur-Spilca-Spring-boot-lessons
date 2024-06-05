package com.example.demo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.ArrayList;
import java.util.List;

public class AppUserDetailsManager implements UserDetailsManager {

    private List<UserDetails> users = new ArrayList<>();

    @Override
    public void createUser(UserDetails userDetails) {
        users.add(userDetails);
    }

    @Override
    public void updateUser(UserDetails userDetails) {
    }

    @Override
    public void deleteUser(String s) {
    }

    @Override
    public void changePassword(String s, String s1) {
    }

    @Override
    public boolean userExists(String s) {
        return users.stream().anyMatch(u -> u.getUsername().equals(s));
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return users.stream()
                .filter(u -> u.getUsername().equals(s))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("Sorry user not found"));
    }
}

package com.nanny.backend.service;

import com.nanny.backend.domain.User;
import com.nanny.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

/*    public User getUserByName(String name) {
        userRepository.getUserByPersonalInformationEmail("");
    }*/

    public User getUserByEmail(String email) {
        return userRepository.getUserByPersonalInformationEmail(email);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> findAll (){
        return userRepository.findAll();
    }
}
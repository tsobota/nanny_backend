package com.nanny.backend.service;

import com.nanny.backend.domain.User;
import com.nanny.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByName(String name) {
        userRepository.getUserByPersonalInformationEmail("");
    }
}

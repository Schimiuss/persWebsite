package com.project.persWebsite.service;

import com.project.persWebsite.dtos.RegisterDto;
import com.project.persWebsite.User.User;
import com.project.persWebsite.User.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserManagementService {

    private UserRepository userRepository;

    public Optional<User> newUser(RegisterDto registerDto){
        if (userExists(registerDto.getName(), registerDto.getEmail())){
            return  Optional.empty();
        }

        User userEnt = new User();
        userEnt.setName(registerDto.getName());
        userEnt.setPassword(registerDto.getEmail());
        userEnt.setEmail(registerDto.getEmail());
        userRepository.save(userEnt);

        return Optional.of(userEnt);
    }

    public boolean userExists(String username, String email){
        boolean taken = false;
        if (userRepository.userExistsByEmail(email) || userRepository.userExistsByName(username)){
            taken = true;
        }
        return taken;
    }
}

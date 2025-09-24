package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.UserInfo;
import com.example.clinicalSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void user (String name){
        UserInfo userInfo = new UserInfo(name);
        userRepository.save(userInfo);

    }

    public Optional<UserInfo> getUser(Long user_id){
        return userRepository.findById(user_id);
    }
}

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

    public void deleteUser(Long user_Id){
        userRepository.deleteById(user_Id);
    }

    public  UserInfo updateUser(Long user_id, UserInfo newdata) {
        return userRepository.findById(user_id)
                .map(userInfo -> {
                   if(newdata.getUserName() != null){
                       userInfo.setUserName(newdata.getUserName());
                   }
                    return userRepository.save(userInfo);
                })
                .orElse(null);
    }

}




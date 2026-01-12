package com.example.clinicalSystem.Service;

import com.example.clinicalSystem.Entity.UserInfo;
import com.example.clinicalSystem.Repository.UserRepository;
<<<<<<< HEAD
import com.example.clinicalSystem.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

>>>>>>> c51862acf14b91dd05eb99f55a1ecbb85b7876bc
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

<<<<<<< HEAD
    //create user
    public UserInfo createuser(UserDto dto){
        UserInfo user = new UserInfo(
                dto.getUserName(),
                dto.getAddress(),
                dto.getBlood_G(),
                dto.getEmail(),
                dto.getDob(),
                dto.getGender()
        );
        return userRepository.save(user);
    }

    //Reda All users
    public List<UserInfo> getALlUsers(){
        return userRepository.findAll();
    }

    //read user by id
    public Optional<UserInfo> getUser(Long user_id){
        return userRepository.findById(user_id);
    }

    //delete user
    public void deleteUser(Long user_id){
        userRepository.deleteById(user_id);
    }

    //update user
    public UserInfo updateUser(Long id, UserDto dto) {
        return userRepository.findById(id).map(user -> {

            user.setUserName(dto.getUserName());
            user.setAddress(dto.getAddress());
            user.setBlood_G(dto.getBlood_G());
            user.setEmail(dto.getEmail());
            user.setDob(dto.getDob());
            user.setGender(dto.getGender());

            return userRepository.save(user);
        }).orElse(null);
    }
=======
    public void user (String name){
        UserInfo userInfo = new UserInfo(name);
        userRepository.save(userInfo);

    }

    public Optional<UserInfo> getUser(Long user_id){
        return userRepository.findById(user_id);
    }
>>>>>>> c51862acf14b91dd05eb99f55a1ecbb85b7876bc
}

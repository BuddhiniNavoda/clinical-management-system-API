package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.UserInfo;
import com.example.clinicalSystem.Service.UserService;
import com.example.clinicalSystem.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
=======
@RestController
>>>>>>> c51862acf14b91dd05eb99f55a1ecbb85b7876bc
public class UserController {
    @Autowired
    UserService userService;

<<<<<<< HEAD
    //create
    @PostMapping("/user")
    public ResponseEntity<UserInfo> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.createuser(userDto));
    }

    //read All
    @GetMapping("/users")
    public List<UserInfo> getAllUsers(){

        return userService.getALlUsers();
    }

    //read one
=======
    @RequestMapping("/user")
    public ResponseEntity<String> userName(@RequestBody UserDto userDto) {
        userService.user(userDto.getName());
        return ResponseEntity.ok("Add user");
    }

>>>>>>> c51862acf14b91dd05eb99f55a1ecbb85b7876bc
    @GetMapping("/getUser/{user_id}")
    public ResponseEntity<UserInfo> getUser(@PathVariable Long user_id) {
        return userService.getUser(user_id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
<<<<<<< HEAD

    //delete
    @DeleteMapping("/deleteUser/{user_id}")
    public String deleteUser(@PathVariable Long user_id){
        userService.deleteUser(user_id);
        return "user with id " + user_id + " deleted succesfull";
    }

    // UPDATE
    @PutMapping("/user/{user_id}")
    public ResponseEntity<UserInfo> updateUser(
            @PathVariable Long user_id,
            @RequestBody UserDto userDto) {

        UserInfo updated = userService.updateUser(user_id, userDto);
        if (updated == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(updated);
    }



=======
>>>>>>> c51862acf14b91dd05eb99f55a1ecbb85b7876bc
}

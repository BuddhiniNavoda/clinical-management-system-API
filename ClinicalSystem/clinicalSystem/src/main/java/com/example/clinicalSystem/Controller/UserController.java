package com.example.clinicalSystem.Controller;

import com.example.clinicalSystem.Entity.UserInfo;
import com.example.clinicalSystem.Service.UserService;
import com.example.clinicalSystem.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public ResponseEntity<String> userName(@RequestBody UserDto userDto) {
        userService.user(userDto.getName());
        return ResponseEntity.ok("Add user");
    }

    @GetMapping("/getUser/{user_id}")
    public ResponseEntity<UserInfo> getUser(@PathVariable Long user_id) {
        return userService.getUser(user_id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

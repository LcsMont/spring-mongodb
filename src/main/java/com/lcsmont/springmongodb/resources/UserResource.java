package com.lcsmont.springmongodb.resources;

import com.lcsmont.springmongodb.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Brown", "maria@gmail.com");
        User pedro = new User("2", "Pedro Silva", "pedro@gmail.com");
        List<User> users = new ArrayList<>(Arrays.asList(maria, pedro));
        return ResponseEntity.ok().body(users);
    }
}

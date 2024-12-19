package org.voiculescu.springboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.voiculescu.springboot.Address;
import org.voiculescu.springboot.model.User;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/addresses")
    ResponseEntity<List<Address>> getAddresses() {
        var address = new Address();
        return ResponseEntity.ok(List.of(address));
    }

    @GetMapping("/users")
    ResponseEntity<List<User>> getUsers() {
        var user = new User().setEmail("email").setFirstName("firstname").setLastName("lastname");
        return ResponseEntity.ok(List.of(user));
    }


}

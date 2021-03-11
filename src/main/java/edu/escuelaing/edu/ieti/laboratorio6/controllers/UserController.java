package edu.escuelaing.edu.ieti.laboratorio6.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import edu.escuelaing.edu.ieti.laboratorio6.model.User;
import edu.escuelaing.edu.ieti.laboratorio6.services.servicesImpl.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired 
    UserServicesImpl userServices;

    @GetMapping("/Users")
    List<User> getAll() {
        return userServices.getAll();
    }

    @PostMapping("/newUser")
    User createUser(@RequestBody User newUser) {
        return userServices.create(newUser);
    }

    @GetMapping("/User/{Id}")
    User getUser(@PathVariable String Id) {

        return userServices.getById(Id);
    }

    @DeleteMapping("/UserDel/{Id}")
    void deleteUser(@PathVariable String Id) {
        userServices.remove(Id);

    }

}
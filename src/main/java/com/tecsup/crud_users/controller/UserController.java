package com.tecsup.crud_users.controller;

import com.tecsup.crud_users.model.entities.User;
import com.tecsup.crud_users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    // LISTAR
    @GetMapping
    public List<User> listar() {
        return repo.findAll();
    }

    // CREAR
    @PostMapping
    public User crear(@RequestBody User user) {
        return repo.save(user);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public User actualizar(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return repo.save(user);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
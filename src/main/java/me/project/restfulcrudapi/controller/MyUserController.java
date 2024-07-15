package me.project.restfulcrudapi.controller;

import me.project.restfulcrudapi.entity.MyUser;
import me.project.restfulcrudapi.repository.MyUserRepo;
import me.project.restfulcrudapi.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users/")
public class MyUserController {

    @Autowired
    private MyUserService service;

    @PostMapping("C")
    public ResponseEntity<MyUser> create(@RequestBody MyUser myUser) {
        return new ResponseEntity<>(service.save(myUser), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<MyUser>> read() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PutMapping("U")
    public ResponseEntity<MyUser> update(@RequestBody MyUser myUser) {
        return new ResponseEntity<>(service.update(myUser), HttpStatus.OK);
    }

    @DeleteMapping("D/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

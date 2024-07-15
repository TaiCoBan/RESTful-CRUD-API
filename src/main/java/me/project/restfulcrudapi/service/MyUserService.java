package me.project.restfulcrudapi.service;

import me.project.restfulcrudapi.entity.MyUser;

import java.util.List;

public interface MyUserService {
    MyUser save(MyUser myUser);
    List<MyUser> findAll();
    MyUser update(MyUser user);
    void delete(int id);
}

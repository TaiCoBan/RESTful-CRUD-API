package me.project.restfulcrudapi.service.impl;

import me.project.restfulcrudapi.entity.MyUser;
import me.project.restfulcrudapi.repository.MyUserRepo;
import me.project.restfulcrudapi.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private MyUserRepo repo;

    @Override
    public MyUser save(MyUser myUser) {
        return repo.save(myUser);
    }

    @Override
    public List<MyUser> findAll() {
        return repo.findAll();
    }

    @Override
    public MyUser update(MyUser user) {
        MyUser exist = repo.findById(user.getId());

        exist.setName(user.getName());
        exist.setAge(user.getAge());

        return repo.save(exist);
    }

    @Override
    public void delete(int id) {
        repo.delete(repo.findById(id));
    }
}

package me.project.restfulcrudapi.repository;

import me.project.restfulcrudapi.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends JpaRepository<MyUser, Integer> {
    MyUser findById(int id);
}

package com.jupite.appcustomerlogin.service;


import com.jupite.appcustomerlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 将该UserRepository类在容器中命名为UserRepository
 *
 * @author huizh
 * @Repository的作用为给bean在容器中命名
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

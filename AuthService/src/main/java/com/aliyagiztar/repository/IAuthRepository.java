package com.aliyagiztar.repository;

import com.aliyagiztar.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  IAuthRepository extends JpaRepository<Auth,Long> {

    Boolean existsByUsernameA(String username);

    Optional<Auth> findByUsernaeAndPassword(String username, String password);

}

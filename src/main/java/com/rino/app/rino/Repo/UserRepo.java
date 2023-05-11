package com.rino.app.rino.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rino.app.rino.Model.User;

public interface UserRepo extends JpaRepository<User, Long>{

}

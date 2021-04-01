package com.elberthbrandao.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

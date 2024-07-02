package com.example.jscom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
     User findByNameAndPassword(String name, String password);

     @Query(value = "SELECT * FROM users WHERE name = :name", nativeQuery = true)
     User findByName(@Param("name") String name);

}

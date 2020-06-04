package com.vgrupper.demo.repository;

import com.vgrupper.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User save(User user);

}

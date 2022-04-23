package io.springsecurity.userservice.repo;

import io.springsecurity.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{
    User findByUsername(String username);
}

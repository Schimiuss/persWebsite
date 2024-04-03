package com.project.persWebsite.User;


import com.project.persWebsite.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT User FROM User user WHERE user.name=username")
    boolean userExistsByName(String username);
    @Query("SELECT User FROM User user WHERE user.email=email")
    boolean userExistsByEmail(String email);

    Optional<User> findByName(String email);

}

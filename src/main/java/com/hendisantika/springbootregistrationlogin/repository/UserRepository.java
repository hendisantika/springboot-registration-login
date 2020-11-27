package com.hendisantika.springbootregistrationlogin.repository;

import com.hendisantika.springbootregistrationlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-registration-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/11/20
 * Time: 06.27
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

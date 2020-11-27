package com.hendisantika.springbootregistrationlogin.repository;

import com.hendisantika.springbootregistrationlogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-registration-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/11/20
 * Time: 06.26
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
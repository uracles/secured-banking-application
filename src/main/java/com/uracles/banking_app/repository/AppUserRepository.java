package com.uracles.banking_app.repository;

import com.uracles.banking_app.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {


}

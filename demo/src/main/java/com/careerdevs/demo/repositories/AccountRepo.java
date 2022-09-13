package com.careerdevs.demo.repositories;

import com.careerdevs.demo.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Long> {
}

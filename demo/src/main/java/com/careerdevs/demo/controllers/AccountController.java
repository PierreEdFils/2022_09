package com.careerdevs.demo.controllers;

import com.careerdevs.demo.models.Account;
import com.careerdevs.demo.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepo accountRepo;

    @PostMapping("/createUser")
    public ResponseEntity<Account> createAccount(@RequestBody Account newAccount) {

        Account saveAccount = accountRepo.save(newAccount);
        return new ResponseEntity<>(saveAccount, HttpStatus.CREATED);
    }

    @GetMapping("/add")
    public ResponseEntity<Iterable<Account>> getAllAccounts () {
        Iterable<Account> AllAccounts = accountRepo.findAll();
        return  new ResponseEntity<>(AllAccounts, HttpStatus.OK);
    }

    @GetMapping("/createUser/{id}")
    public ResponseEntity<Account> getUserbyId (@PathVariable ("id") Long id ){
       Account saveId = accountRepo.findById(id).get();
       return new ResponseEntity<>(saveId, HttpStatus.OK);
    }

    @PutMapping("/createUser")
    public ResponseEntity <Account> updateAccount(@RequestBody Account updateAccount ) {
        Account updatedAccount = accountRepo.save(updateAccount);
        return new ResponseEntity<>(updatedAccount, HttpStatus.OK);
    }

    @DeleteMapping("/createUser/{id}")
    public ResponseEntity<Account> deleteUserById (@PathVariable ("id") Long id) {
      accountRepo.deleteById(id);
      return new ResponseEntity<>( HttpStatus.OK);
    }
}

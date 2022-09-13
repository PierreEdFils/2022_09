package com.careerdevs.demo.models;

import javax.persistence.*;

@Entity
@Table (name = "NameAccount")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private  String name;
    private int age ;
    private int account_number ;
    private double balance;

    public Account() {
    }

    public Account(Long id, String name, int age, int account_number, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account_number = account_number;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

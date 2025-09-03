package org.codetime.elearning.auth;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    private String detail;
    private String imgUrl;
    @Column(name = "registration_date")
    private LocalDate date;

    public User(String username, String password, String name, String surname, String email, String imgUrl, LocalDate date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.imgUrl = imgUrl;
        this.date = date;
    }

    public User(String detail) {
        this.detail = detail;
    }

}

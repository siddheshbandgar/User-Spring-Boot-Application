package com.wellsfargo.springboot.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection="users")
public class User {

    private String id;
    private String firstName;

    public User(String firstName, String lastName, String email, LocalDate birthDate, Gender gender, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
        this.country = country;
    }

    private String lastName;
    private String email;
    private LocalDate birthDate;
    private Gender gender;
    private String country;
}

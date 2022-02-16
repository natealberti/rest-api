package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique =true)
    private String email;
    private Gender gender;
    private String address;
    private List<String> favoriteSubjects;
    private BigDecimal totalSpentOnBooks;
    private LocalDateTime created;

    public Student(String firstName, 
    String lastName,
    String email,
    Gender gender,
    String address,
    List<String> favoriteSubjects,
    BigDecimal totalSpentOnBooks,
    LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteSubjects = favoriteSubjects;
        this.totalSpentOnBooks = totalSpentOnBooks;
        this.created = created;
    } 

}

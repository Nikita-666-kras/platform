package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cage", schema = "public", catalog = "PlatformBD")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "role")
    private String user_role;
}

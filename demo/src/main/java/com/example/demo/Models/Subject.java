package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cage", schema = "public", catalog = "PlatformBD")
public class Subject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column (name = "titli_subject")
    private String title;

}

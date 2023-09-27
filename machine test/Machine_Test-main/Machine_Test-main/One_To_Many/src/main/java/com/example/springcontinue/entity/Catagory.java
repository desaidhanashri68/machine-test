package com.example.springcontinue.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catagoryId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId" , referencedColumnName = "catagoryId")
    private List<Products>products;
}

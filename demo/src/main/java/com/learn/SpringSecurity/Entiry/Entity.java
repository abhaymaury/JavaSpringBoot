package com.learn.SpringSecurity.Entiry;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@Table(name = "test")
public class Entity {

    @jakarta.persistence.Id
    private String Id;
    private String name;
    private String about;
    private String email;
}

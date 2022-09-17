package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;
//import javax.validation.constraints.NotBlank;
/**
 * @author Zhifan Li
 * @since 1.0
 */
public class Person {
    private final UUID id;
//    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

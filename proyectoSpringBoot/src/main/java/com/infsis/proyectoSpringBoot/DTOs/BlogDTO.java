package com.infsis.proyectoSpringBoot.DTOs;

public class BlogDTO {

    private String name;

    public BlogDTO(String name) {
        this.name = name;
    }

    public BlogDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

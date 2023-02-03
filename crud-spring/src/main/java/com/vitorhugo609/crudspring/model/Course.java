package com.vitorhugo609.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity(name = "cad_curso")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private long id;

    @Column(name = "curso", length = 200, nullable = false)
    private String nome;
    @Column(name = "duracao", length = 200, nullable = false)
    private String duracao;

}

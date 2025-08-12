package br.com.matheus.entities.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

}

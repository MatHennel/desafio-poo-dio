package br.com.matheus.entities.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mentoring {

    private String title;
    private String description;
    private LocalDate date;

}

package br.com.matheus.entities.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Mentoring extends Content{


    private LocalDate date;

    @Override
    public double xpCalculation() {
        return PATTERN_XP + 200;
    }
}

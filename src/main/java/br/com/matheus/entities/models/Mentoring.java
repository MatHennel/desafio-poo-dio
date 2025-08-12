package br.com.matheus.entities.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Mentoring extends Content{


    private LocalDate date;

    @Override
    public double xpCalculation() {
        return PATTERN_XP + 200;
    }

    @Override
    public String toString() {
        return "\n\tMentoring{" +
                "\n\t\ttitle=" + getTitle() +
                "\n\t\tdescruption=" + getDescription() +
                "\n\t\tdate=" + date +
                "\n\t} ";
    }
}

package br.com.matheus.entities.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Course extends Content{


    private int workload;

    @Override
    public double xpCalculation() {
        return PATTERN_XP * workload;
    }

    @Override
    public String toString() {
        return "\n\tCourse{" +
                "\n\t\ttitle=" + getTitle() +
                "\n\t\tdescruption=" + getDescription() +
                "\n\t\tworkload=" + workload +
                "\n\t} ";
    }
}

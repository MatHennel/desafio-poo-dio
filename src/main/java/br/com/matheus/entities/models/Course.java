package br.com.matheus.entities.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class Course extends Content{


    private int workload;

    @Override
    public double xpCalculation() {
        return PATTERN_XP * workload;
    }
}

package br.com.matheus.entities.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Content {

    protected static final double PATTERN_XP = 10d;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    public abstract double xpCalculation();

}

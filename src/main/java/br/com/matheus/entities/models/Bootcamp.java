package br.com.matheus.entities.models;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);

    @Builder.Default
    private Set<Dev> subscribedDevs = new HashSet<>();

    @Builder.Default
    private Set<Content> contents = new LinkedHashSet<>();
}

package br.com.matheus.entities.models;

import lombok.*;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Dev {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        content.ifPresentOrElse(c -> {
            this.completedContents.add(c);
            this.subscribedContent.remove(c);
        }, () -> System.out.println("Você não está matriculado em nenhum curso") );
    }

    public double xpTotalCalculation(){
       return this.completedContents.stream().mapToDouble(Content::xpCalculation).sum();
    }
}

package de.cw.cwcocktailapi.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "making_step")
public class MakingStep {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;

  private Integer position;

  private LocalDate created;

  private LocalDate updated;

  @Enumerated(EnumType.STRING)
  private Language language = Language.EN;

  @ManyToOne
  private Cocktail cocktail;

}

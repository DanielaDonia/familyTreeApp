package com.genealogicaltreeapp.genealogicaltreeapp.domain;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table (name = "family_information")
@Data
public class FamilyInformation {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "family_id")
    private Long family_id;

    @JoinColumn(name = "person_id")
    @ManyToOne(cascade = CascadeType.ALL)
  private PersonInformation personInformation;
}

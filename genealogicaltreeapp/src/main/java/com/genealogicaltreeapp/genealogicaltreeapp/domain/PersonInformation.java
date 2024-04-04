package com.genealogicaltreeapp.genealogicaltreeapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table (name = "person_information")
@Data
public class PersonInformation {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "person_id")
    private Long personId;

    private String firstName;

@Column (name = "family_id")
    private Long familyId;

    private Date birthdayDay;

    private String birthplace;

}

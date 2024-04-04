package com.genealogicaltreeapp.genealogicaltreeapp.repositories;

import com.genealogicaltreeapp.genealogicaltreeapp.domain.PersonInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInformationRepository extends JpaRepository<PersonInformation, Long> {
}

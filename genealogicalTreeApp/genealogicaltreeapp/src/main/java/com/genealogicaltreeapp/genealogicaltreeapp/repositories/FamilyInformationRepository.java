package com.genealogicaltreeapp.genealogicaltreeapp.repositories;

import com.genealogicaltreeapp.genealogicaltreeapp.domain.FamilyInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyInformationRepository extends JpaRepository<FamilyInformation, Long> {


}

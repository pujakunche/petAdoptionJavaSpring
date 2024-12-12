package com.petApp.adoption.repository;

import com.petApp.adoption.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet,Integer> {
}

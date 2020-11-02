package com.jenlubejko.dog.repositories;

import com.jenlubejko.dog.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}

package com.gal.mockito_training.repo;

import com.gal.mockito_training.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // converts sql exception to runtime exception
public interface TrainingRepository extends JpaRepository<Training, Integer> {
}

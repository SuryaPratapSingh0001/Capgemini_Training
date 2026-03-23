package com.gal.mockito_training.service;

import com.gal.mockito_training.model.Training;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Override
    public List<Training> findByTopic(String topic) {
        return List.of();
    }

    @Override
    public Training findById(int trainingid) {
        return null;
    }

    @Override
    public Training addTraining(Training training) {
        return null;
    }

    @Override
    public Training updateTraining(Training training) {
        return null;
    }

    @Override
    public boolean deleteTraining(int trainingid) {
        return false;
    }
}

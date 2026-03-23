package com.gal.mockito_training.service;

import com.gal.mockito_training.model.Training;

import java.util.List;

public interface TrainingService {
    List<Training> findByTopic(String topic);
    Training findById(int trainingid);
    Training addTraining(Training training);
    Training updateTraining(Training training);
    boolean deleteTraining(int trainingid);
}

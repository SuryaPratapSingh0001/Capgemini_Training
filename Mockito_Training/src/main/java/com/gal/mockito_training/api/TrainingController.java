package com.gal.mockito_training.api;

import com.gal.mockito_training.model.Training;
import com.gal.mockito_training.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training")
public class TrainingController {
    private TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService){
        super();
        this.trainingService = trainingService;
    }

    @GetMapping("/{trainingid}")
    Training findById(@PathVariable ("trainingid") int trainingid){
        Training training = trainingService.findById(trainingid);
        return training;
    }
}

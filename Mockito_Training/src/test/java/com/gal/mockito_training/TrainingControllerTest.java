package com.gal.mockito_training;

import com.gal.mockito_training.api.TrainingController;
import com.gal.mockito_training.model.Training;
import com.gal.mockito_training.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.sql.Date;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
@WebMvcTest(TrainingController.class)
public class TrainingControllerTest {

    @MockitoBean
    TrainingService trainingService;

    @Autowired
    MockMvc mockMvc;

    @Test
    void testFindById() throws Exception {
        //fail("not yet Implemented");
        Training t = new Training(101, Date.valueOf("2026-03-07"), Date.valueOf("2026-03-06"), "Mockito", "Dinesh Kumar");
        when(trainingService.findById(101)).thenReturn(t);

        mockMvc.perform(get("/training/101").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.trainingid").value("101"));
    }
}

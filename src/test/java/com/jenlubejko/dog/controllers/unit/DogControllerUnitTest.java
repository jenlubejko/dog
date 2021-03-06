package com.jenlubejko.dog.controllers.unit;

import com.jenlubejko.dog.controllers.DogController;
import com.jenlubejko.dog.repositories.DogRepository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = DogController.class)
public class DogControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DogRepository dogRepository;

    @Test
    @DisplayName("Test for get all API")
    public void itShouldGetAllDogsAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/dogs")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Test for get one API")
    public void itShouldGetDogByIdAPI() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/dogs/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}

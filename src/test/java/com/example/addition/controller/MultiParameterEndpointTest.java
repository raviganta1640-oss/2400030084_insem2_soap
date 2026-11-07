package com.example.addition.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class MultiParameterEndpointTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdditionWithNegativeNumbers() throws Exception {

        mockMvc.perform(get("/ms1/add")
                .param("a", "-5")
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 0"));
    }
}
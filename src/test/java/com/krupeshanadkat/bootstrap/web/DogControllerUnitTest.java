package com.krupeshanadkat.bootstrap.web;

import com.krupeshanadkat.bootstrap.service.DogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(DogController.class)
public class DogControllerUnitTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    DogService dogService;

    @Test
    @WithMockUser(username = "admin", password = "password")
    public void getAllDogs() throws Exception {
        mockMvc.perform(get("/dogs"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(dogService, times(1)).retrieveDogs();
    }
}

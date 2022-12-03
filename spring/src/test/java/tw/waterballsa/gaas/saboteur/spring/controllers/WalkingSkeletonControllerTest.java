package tw.waterballsa.gaas.saboteur.spring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import tw.waterballsa.gaas.saboteur.spring.SaboteurApplication;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@ContextConfiguration(classes = SaboteurApplication.class)
@SpringBootTest
@AutoConfigureMockMvc
class WalkingSkeletonControllerTest {
    @Autowired
    MockMvc mockMvc;


    @Test
    void walkingSkeleton() throws Exception {
        mockMvc.perform(get("/walking-skeleton"))
                .andExpect(status().isOk())
                .andExpect(content().string("Walk"));
    }

}
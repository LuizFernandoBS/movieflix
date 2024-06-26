package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.tests.TokenUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class UserControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TokenUtil tokenUtil;

    private String visitorUsername;
    private String visitorPassword;
    private String memberUsername;
    private String memberPassword;

    @BeforeEach
    void setUp() throws Exception {

        visitorUsername = "bob@gmail.com";
        visitorPassword = "123456";
        memberUsername = "ana@gmail.com";
        memberPassword = "123456";
    }

    @Test
    public void getProfileShouldReturnSelfWhenVisitorLogged() throws Exception {

        String accessToken = tokenUtil.obtainAccessToken(mockMvc, visitorUsername, visitorPassword);

        ResultActions result =
                mockMvc.perform(MockMvcRequestBuilders.get("/users/profile")
                        .header("Authorization", "Bearer " + accessToken)
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.id").isNotEmpty());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.name").isNotEmpty());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.email").value(visitorUsername));
    }

    @Test
    public void getProfileShouldReturnSelfWhenMemberLogged() throws Exception {

        String accessToken = tokenUtil.obtainAccessToken(mockMvc, memberUsername, memberPassword);

        ResultActions result =
                mockMvc.perform(MockMvcRequestBuilders.get("/users/profile")
                        .header("Authorization", "Bearer " + accessToken)
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.id").isNotEmpty());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.name").isNotEmpty());
        result.andExpect(MockMvcResultMatchers.jsonPath("$.email").value(memberUsername));
    }

    @Test
    public void getProfileShouldReturnUnauthorizedWhenNoUserLogged() throws Exception {

        ResultActions result =
                mockMvc.perform(MockMvcRequestBuilders.get("/users/profile")
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isUnauthorized());
    }
}

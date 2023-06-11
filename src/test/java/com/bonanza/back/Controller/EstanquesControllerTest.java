package com.bonanza.back.Controller;

import com.bonanza.back.Model.Estanques;
import com.bonanza.back.Service.EstanquesService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
class EstanquesControllerTest {

    private final static String BASE_URL_LISTAR = "/estanques/listar/";
    private final static String BASE_URL_CREAR = "/estanques/";
    MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private EstanquesService estanquesService;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void name() {
    }

    @Test
    void listarEspecies() throws Exception {
            MvcResult mockMvcResult = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL_LISTAR)
                            .queryParam("enablePagination", "false")
                    .accept(MediaType.APPLICATION_JSON_VALUE))
                    .andReturn();
            assertEquals(200, mockMvcResult.getResponse().getStatus());
    }

    @Test
    void testEstanques() throws Exception {
        //given
        Estanques estanques = Estanques.builder()
                .id(1L)
                .nombre_estanque("Andres")
                .uso("aaa")
                .consecutivo("")
                .densidad_siembra("hombre")
                .medicion("10210211")
                .densidad_siembra("40 mts")
                .medicion("j1234")
                .geolocation("31311021")
                .evidencia_fotografica("nada")
                .id_usuario(1)
                .build();
        given(estanquesService.save(Mockito.any())).willReturn(estanques);
        //when
        ResultActions response = mockMvc.perform(
                post("/estanques/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(estanques)
                        )
        );
        //then
        response.andDo(print())
                .andExpect(status().isCreated());
    }



}
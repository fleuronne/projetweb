package org.isj.ing.travel.webapp.Travel.model.controller;

import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.service.ReservationService;
import org.mockito.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Transactional
public class ReservationControllerTest {
    private static final String ENDPOINT_URL = "/api/reservation";
    @InjectMocks
    private ReservationController reservationController;
    @Mock
    private ReservationService reservationService;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(reservationController)
                //.setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                //.addFilter(CustomFilter::doFilter)
                .build();
    }

    @Test
    public void findAllByPage() throws Exception {
        Page<ReservationDto> page = new PageImpl<>(Collections.singletonList(ReservationBuilder.getDto()));

        Mockito.when(reservationService.findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any())).thenReturn(page);

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.content", Matchers.hasSize(1)));

        Mockito.verify(reservationService, Mockito.times(1)).findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verifyNoMoreInteractions(reservationService);

    }

    @Test
    public void getById() throws Exception {
        Mockito.when(reservationService.findById(ArgumentMatchers.anyLong())).thenReturn(ReservationBuilder.getDto());

        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
        Mockito.verify(reservationService, Mockito.times(1)).findById("1");
        Mockito.verifyNoMoreInteractions(reservationService);
    }

    @Test
    public void save() throws Exception {
        Mockito.when(reservationService.save(ArgumentMatchers.any(ReservationDto.class))).thenReturn(ReservationBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.post(ENDPOINT_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(ReservationBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isCreated());
        Mockito.verify(reservationService, Mockito.times(1)).save(ArgumentMatchers.any(ReservationDto.class));
        Mockito.verifyNoMoreInteractions(reservationService);
    }

    @Test
    public void update() throws Exception {
        Mockito.when(reservationService.update(ArgumentMatchers.any(), ArgumentMatchers.anyLong())).thenReturn(ReservationBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(ReservationBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(reservationService, Mockito.times(1)).update(ArgumentMatchers.any(ReservationDto.class), ArgumentMatchers.anyLong());
        Mockito.verifyNoMoreInteractions(reservationService);
    }

    @Test
    public void delete() throws Exception {
        Mockito.doNothing().when(reservationService).deleteById(ArgumentMatchers.anyLong());
        mockMvc.perform(
                MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(CustomUtils.asJsonString(ReservationBuilder.getIds()))).andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(reservationService, Mockito.times(1)).deleteById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(reservationService);
    }
}
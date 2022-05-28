package org.isj.ing.travel.webapp.Travel.model.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ReservationBuilder {
    public static List<String> getIds() {
        return Collections.singletonList("1");
    }

    public static ReservationDto getDto() {
        ReservationDto dto = new ReservationDto();
        dto.setId("1");
        return dto;
    }
}
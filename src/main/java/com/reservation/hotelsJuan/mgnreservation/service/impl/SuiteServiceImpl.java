package com.reservation.hotelsJuan.mgnreservation.service.impl;

import com.reservation.hotelsJuan.mgnreservation.dto.ReservationRequestDto;
import com.reservation.hotelsJuan.mgnreservation.dto.SuiteDto;
import com.reservation.hotelsJuan.mgnreservation.exception.BadRequestException;
import com.reservation.hotelsJuan.mgnreservation.service.SuiteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuiteServiceImpl implements SuiteService {
    @Override
    public List<SuiteDto> getSuites(int page, String clientId, String secretId, String correlationId) throws BadRequestException {
        SuiteDto suit = new SuiteDto("123we5yty" ,"9093023902930ioio",
                2, 120000, 1);

        SuiteDto suit2 = new SuiteDto("123we5yty" ,"9093023902930ioio",
                2, 120000, 1);

        List<SuiteDto> suitDto = new ArrayList<>();
        suitDto.add(suit);
        suitDto.add(suit2);
        return suitDto;

    }

    @Override
    public String createReservation(ReservationRequestDto request, String clientId, String secretId, String correlationId) throws BadRequestException {

        return "Ok";
    }
}

package com.nan.winningnumbers.mapper;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoField;

import com.nan.winningnumbers.dto.JackpotDTO;
import com.nan.winningnumbers.entity.Jackpot;

@Component
public class JackpotMapper {

    public Jackpot mapDtoToEntity(JackpotDTO jackpotDTO){
        return Jackpot.builder()
                .first(jackpotDTO.getFirstNumber())
                .second(jackpotDTO.getSecondNumber())
                .third(jackpotDTO.getThirdNumber())
                .fourth(jackpotDTO.getFourthNumber())
                .fifth(jackpotDTO.getFifthNumber())
                .sixth(jackpotDTO.getSixthNumber())
                .seventh(jackpotDTO.getSeventhNumber())
                .eighth(jackpotDTO.getEighthNumber())
                .createdDate(Instant.now())
                .build();
    }

    public JackpotDTO mapEntityToDto(Jackpot jackpot){
        return JackpotDTO.builder()
                .firstNumber(jackpot.getFirst())
                .secondNumber(jackpot.getSecond())
                .thirdNumber(jackpot.getThird())
                .fourthNumber(jackpot.getFourth())
                .fifthNumber(jackpot.getFifth())
                .sixthNumber(jackpot.getSixth())
                .seventhNumber(jackpot.getSeventh())
                .eighthNumber(jackpot.getEighth())
                .timestamp(getTimeStampMillisecond(jackpot.getCreatedDate()))
                .build();
    }

    private Long getTimeStampMillisecond(Instant createdDate){
        return (createdDate.getEpochSecond() * 1000) + createdDate.getLong(ChronoField.MILLI_OF_SECOND);
    }
}

package com.nan.winningnumbers.service;

import java.util.List;

import com.nan.winningnumbers.entity.Jackpot;

public interface JackpotService {
    void addJackpot(Jackpot jackpot);
    List<Jackpot> findJackpots(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer fourthNumber,
        Integer fifthNumber, Integer sixthNumber, Integer seventhNumber, Integer eighthNumber);
}

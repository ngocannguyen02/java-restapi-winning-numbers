package com.nan.winningnumbers.service.impl;

import com.nan.winningnumbers.entity.Jackpot;
import com.nan.winningnumbers.repository.JackpotRepository;
import com.nan.winningnumbers.service.JackpotService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JackpotServiceImpl implements JackpotService {

    private final JackpotRepository jackpotRepository;

    @Override
    public void addJackpot(Jackpot jackpot) {
        jackpotRepository.save(jackpot);
    }

    @Override
    public List<Jackpot> findJackpots(Integer firstNumber, Integer secondNumber, Integer thirdNumber,
            Integer fourthNumber, Integer fifthNumber, Integer sixthNumber, Integer seventhNumber,
            Integer eighthNumber) {
        return jackpotRepository.findByFirstAndSecondAndThirdAndFourthAndFifthAndSixthAndSeventhAndEighth(firstNumber, 
            secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber, seventhNumber, eighthNumber);
    }
    
}
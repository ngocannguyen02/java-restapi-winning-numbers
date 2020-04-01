package com.nan.winningnumbers.repository;

import java.util.List;

import com.nan.winningnumbers.entity.Jackpot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JackpotRepository extends MongoRepository<Jackpot, String> {

    List<Jackpot> findByFirstAndSecondAndThirdAndFourthAndFifthAndSixthAndSeventhAndEighth(
        Integer first, Integer second, Integer third, Integer fourth, Integer fifth, Integer sixth, Integer seventh, Integer eighth);
    
}
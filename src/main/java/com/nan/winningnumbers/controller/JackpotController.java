package com.nan.winningnumbers.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.nan.winningnumbers.dto.JackpotDTO;
import com.nan.winningnumbers.mapper.JackpotMapper;
import com.nan.winningnumbers.service.JackpotService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class JackpotController {

    private final JackpotService jackpotService;
    private final JackpotMapper jackpotMapper;

    @PostMapping(value = "/jackpot")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a jackpot entry into database")
    public void createJackpo(
            @RequestBody JackpotDTO jackpotDTO) {
        jackpotService.addJackpot(jackpotMapper.mapDtoToEntity(jackpotDTO));
    }

    @RequestMapping(value = "/jackpot", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ApiOperation(value = "Get all jackpots matching the eight numbers", response = JackpotDTO.class, httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<JackpotDTO> getJackpotByNumbers(
            @RequestParam(value = "firstNumber", required = false) Integer firstNumber,
            @RequestParam(value = "secondNumber", required = false) Integer secondNumber,
            @RequestParam(value = "thirdNumber", required = false) Integer thirdNumber,
            @RequestParam(value = "fourthNumber", required = false) Integer fourthNumber,
            @RequestParam(value = "fifthNumber", required = false) Integer fifthNumber,
            @RequestParam(value = "sixthNumber", required = false) Integer sixthNumber,
            @RequestParam(value = "seventhNumber", required = false) Integer seventhNumber,
            @RequestParam(value = "eighthNumber", required = false) Integer eighthNumber) {
        return jackpotService
                .findJackpots(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber,
                        seventhNumber, eighthNumber)
                .stream().map(jackpotMapper::mapEntityToDto).collect(Collectors.toList());
    }

}
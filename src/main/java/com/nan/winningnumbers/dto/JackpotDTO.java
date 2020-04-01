package com.nan.winningnumbers.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class JackpotDTO {

    @ApiModelProperty(value = "First winning number" , required = true , example = "1")
    @NotNull
    private Integer firstNumber;

    @ApiModelProperty(value = "Second winning number" , required = true , example = "2")
    @NotNull
    private Integer secondNumber;

    @ApiModelProperty(value = "Third winning number" , required = true , example = "3")
    @NotNull
    private Integer thirdNumber;

    @ApiModelProperty(value = "Fourth winning number" , required = true , example = "4")
    @NotNull
    private Integer fourthNumber;

    @ApiModelProperty(value = "Fifth winning number" , required = true , example = "5")
    @NotNull
    private Integer fifthNumber;

    @ApiModelProperty(value = "Sixth winning number" , required = true , example = "6")
    @NotNull
    private Integer sixthNumber;

    @ApiModelProperty(value = "Seventh winning number" , required = true , example = "7")
    @NotNull
    private Integer seventhNumber;

    @ApiModelProperty(value = "Eighth winning number" , required = true , example = "8")
    @NotNull
    private Integer eighthNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long timestamp;
}

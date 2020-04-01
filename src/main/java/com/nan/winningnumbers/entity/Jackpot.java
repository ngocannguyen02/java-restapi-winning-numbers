package com.nan.winningnumbers.entity;

import java.time.Instant;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
@Data
@Builder
public class Jackpot {

  @Id
  private String id;

  @NotNull
  private Integer first;
  
  @NotNull
  private Integer second;

  @NotNull
  private Integer third;

  @NotNull
  private Integer fourth;

  @NotNull
  private Integer fifth;

  @NotNull
  private Integer sixth;

  @NotNull
  private Integer seventh;

  @NotNull
  private Integer eighth;

  @Indexed
  private Instant createdDate;

}

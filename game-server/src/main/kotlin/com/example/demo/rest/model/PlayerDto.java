package com.example.demo.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Player
 */
public enum PlayerDto {
  
  HUMAN("HUMAN"),
  
  COMPUTER("COMPUTER");

  private String value;

  PlayerDto(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PlayerDto fromValue(String text) {
    for (PlayerDto b : PlayerDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


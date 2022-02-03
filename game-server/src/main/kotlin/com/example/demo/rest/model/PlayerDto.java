package com.example.demo.rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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


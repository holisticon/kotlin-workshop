package com.example.demo.rest.model;

import java.util.Objects;
import com.example.demo.rest.model.PlayerDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TurnDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-03T14:41:25.055+01:00")

public class TurnDto   {
  @JsonProperty("takenItems")
  private Integer takenItems = null;

  @JsonProperty("player")
  private PlayerDto player = null;

  public TurnDto takenItems(Integer takenItems) {
    this.takenItems = takenItems;
    return this;
  }

   /**
   * Get takenItems
   * @return takenItems
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getTakenItems() {
    return takenItems;
  }

  public void setTakenItems(Integer takenItems) {
    this.takenItems = takenItems;
  }

  public TurnDto player(PlayerDto player) {
    this.player = player;
    return this;
  }

   /**
   * Get player
   * @return player
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PlayerDto getPlayer() {
    return player;
  }

  public void setPlayer(PlayerDto player) {
    this.player = player;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TurnDto turn = (TurnDto) o;
    return Objects.equals(this.takenItems, turn.takenItems) &&
        Objects.equals(this.player, turn.player);
  }

  @Override
  public int hashCode() {
    return Objects.hash(takenItems, player);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurnDto {\n");
    
    sb.append("    takenItems: ").append(toIndentedString(takenItems)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


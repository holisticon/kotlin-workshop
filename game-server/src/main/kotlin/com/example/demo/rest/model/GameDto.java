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
 * GameDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-03T14:33:39.534+01:00")

public class GameDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("remainingItems")
  private Integer remainingItems = null;

  @JsonProperty("initialItems")
  private Integer initialItems = null;

  @JsonProperty("finished")
  private Boolean finished = null;

  @JsonProperty("nextPlayer")
  private PlayerDto nextPlayer = null;

  @JsonProperty("winner")
  private PlayerDto winner = null;

  public GameDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GameDto remainingItems(Integer remainingItems) {
    this.remainingItems = remainingItems;
    return this;
  }

   /**
   * Get remainingItems
   * @return remainingItems
  **/
  @ApiModelProperty(value = "")


  public Integer getRemainingItems() {
    return remainingItems;
  }

  public void setRemainingItems(Integer remainingItems) {
    this.remainingItems = remainingItems;
  }

  public GameDto initialItems(Integer initialItems) {
    this.initialItems = initialItems;
    return this;
  }

   /**
   * Get initialItems
   * @return initialItems
  **/
  @ApiModelProperty(value = "")


  public Integer getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(Integer initialItems) {
    this.initialItems = initialItems;
  }

  public GameDto finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")


  public Boolean Finished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public GameDto nextPlayer(PlayerDto nextPlayer) {
    this.nextPlayer = nextPlayer;
    return this;
  }

   /**
   * Get nextPlayer
   * @return nextPlayer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PlayerDto getNextPlayer() {
    return nextPlayer;
  }

  public void setNextPlayer(PlayerDto nextPlayer) {
    this.nextPlayer = nextPlayer;
  }

  public GameDto winner(PlayerDto winner) {
    this.winner = winner;
    return this;
  }

   /**
   * Get winner
   * @return winner
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PlayerDto getWinner() {
    return winner;
  }

  public void setWinner(PlayerDto winner) {
    this.winner = winner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameDto game = (GameDto) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.remainingItems, game.remainingItems) &&
        Objects.equals(this.initialItems, game.initialItems) &&
        Objects.equals(this.finished, game.finished) &&
        Objects.equals(this.nextPlayer, game.nextPlayer) &&
        Objects.equals(this.winner, game.winner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remainingItems, initialItems, finished, nextPlayer, winner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remainingItems: ").append(toIndentedString(remainingItems)).append("\n");
    sb.append("    initialItems: ").append(toIndentedString(initialItems)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    nextPlayer: ").append(toIndentedString(nextPlayer)).append("\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
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


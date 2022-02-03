package com.example.demo.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewGameDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-03T14:41:25.055+01:00")

public class NewGameDto   {
  @JsonProperty("initialItems")
  private Integer initialItems = null;

  public NewGameDto initialItems(Integer initialItems) {
    this.initialItems = initialItems;
    return this;
  }

   /**
   * Get initialItems
   * @return initialItems
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(Integer initialItems) {
    this.initialItems = initialItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewGameDto newGame = (NewGameDto) o;
    return Objects.equals(this.initialItems, newGame.initialItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewGameDto {\n");
    
    sb.append("    initialItems: ").append(toIndentedString(initialItems)).append("\n");
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


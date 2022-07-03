
package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RatingCountMap {

    @JsonProperty("1")
    public Integer _1;
    @JsonProperty("2")
    public Integer _2;
    @JsonProperty("3")
    public Integer _3;
    @JsonProperty("4")
    public Integer _4;
    @JsonProperty("5")
    public Integer _5;

}


package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReviewSummary {

    @JsonProperty("cursor")
    public String cursor;
    @JsonProperty("data")
    public Data data;

}

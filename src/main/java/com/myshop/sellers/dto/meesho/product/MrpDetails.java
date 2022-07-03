
package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MrpDetails {

    @JsonProperty("mrp")
    public Integer mrp;
    @JsonProperty("title")
    public String title;
    @JsonProperty("message")
    public String message;

}

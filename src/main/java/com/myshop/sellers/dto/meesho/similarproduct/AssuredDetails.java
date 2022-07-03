
package com.myshop.sellers.dto.meesho.similarproduct;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssuredDetails {

    @JsonProperty("is_assured")
    public Boolean isAssured;
    @JsonProperty("message")
    public String message;

}

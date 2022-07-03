
package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Author {

    @JsonProperty("name")
    public String name;
    @JsonProperty("helpful")
    public Integer helpful;
    @JsonProperty("profile_image")
    public String profileImage;

}

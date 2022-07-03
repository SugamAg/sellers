
package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShopValueProp {

    @JsonProperty("type")
    public String type;
    @JsonProperty("rating")
    public RatingValueProp rating;
    @JsonProperty("follower")
    public FollowerValueProp follower;
    @JsonProperty("product")
    public ProductValueProp product;

}


package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RatingValueProp {

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("average_rating")
    public Double averageRating;
    @JsonProperty("few_ratings")
    public Boolean fewRatings;

}

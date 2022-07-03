
package com.myshop.sellers.dto.meesho.similarproduct;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarProduct {

    @JsonProperty("product_id")
    public String productId;
    @JsonProperty("name")
    public String name;
    @JsonProperty("slug")
    public String slug;
    @JsonProperty("price")
    public Integer price;
    @JsonProperty("original_price")
    public Integer originalPrice;
    @JsonProperty("transient_price")
    public Integer transientPrice;
    @JsonProperty("discount")
    public Integer discount;
    @JsonProperty("images")
    public List<String> images = null;
    @JsonProperty("assured_details")
    public AssuredDetails assuredDetails;

}

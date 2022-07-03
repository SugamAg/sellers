
package com.myshop.sellers.dto.meesho.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopImageReview {

    @JsonProperty("review_id")
    public Integer reviewId;
    @JsonProperty("created")
    public String created;
    @JsonProperty("rating")
    public Integer rating;
    @JsonProperty("helpful_count")
    public Integer helpfulCount;
    @JsonProperty("comments")
    public String comments;
    @JsonProperty("media")
    public List<Medium> media = null;
    @JsonProperty("author")
    public Author author;
    @JsonProperty("product_name")
    public String productName;
    @JsonProperty("product_description")
    public String productDescription;
    @JsonProperty("product_image_thumb_url")
    public String productImageThumbUrl;
    @JsonProperty("product_image_large_url")
    public String productImageLargeUrl;

}

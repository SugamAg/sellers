
package com.myshop.sellers.dto.meesho.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    @JsonProperty("rating_count_map")
    public RatingCountMap ratingCountMap;
    @JsonProperty("average_rating")
    public Double averageRating;
    @JsonProperty("rating_scale")
    public Integer ratingScale;
    @JsonProperty("review_count")
    public Integer reviewCount;
    @JsonProperty("rating_count")
    public Integer ratingCount;
    @JsonProperty("reviews")
    public List<Review> reviews = null;
    @JsonProperty("total_images_count")
    public Integer totalImagesCount;
    @JsonProperty("total_media_count")
    public Integer totalMediaCount;
    @JsonProperty("top_image_reviews")
    public List<TopImageReview> topImageReviews = null;

}

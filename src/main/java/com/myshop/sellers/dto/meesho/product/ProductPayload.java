
package com.myshop.sellers.dto.meesho.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductPayload {

    @JsonProperty("product_id")
    public String productId;
    @JsonProperty("valid")
    public Boolean valid;
    @JsonProperty("in_stock")
    public Boolean inStock;
    @JsonProperty("name")
    public String name;
    @JsonProperty("description")
    public String description;
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
    @JsonProperty("shipping")
    public Shipping shipping;
    @JsonProperty("supplier_name")
    public String supplierName;
    @JsonProperty("supplier_average_rating")
    public Double supplierAverageRating;
    @JsonProperty("variations")
    public List<String> variations = null;
    @JsonProperty("suppliers")
    public List<Supplier> suppliers = null;
    @JsonProperty("meta_info")
    public MetaInfo metaInfo;
    @JsonProperty("mrp_details")
    public MrpDetails mrpDetails;
    @JsonProperty("review_summary")
    public ReviewSummary reviewSummary;
    @JsonProperty("catalog")
    public Catalog catalog;
    @JsonProperty("original_product_id")
    public Integer originalProductId;


}

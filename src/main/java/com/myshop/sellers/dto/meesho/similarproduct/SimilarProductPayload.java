
package com.myshop.sellers.dto.meesho.similarproduct;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimilarProductPayload {
    @JsonProperty("products")
    public List<SimilarProduct> products = null;
}

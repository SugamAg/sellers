
package com.myshop.sellers.dto.meesho.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inventory {

    @JsonProperty("variation")
    public Variation variation;
    @JsonProperty("in_stock")
    public Boolean inStock;

}


package com.myshop.sellers.dto.meesho.product;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shipping {
    @JsonProperty("shipping_time")
    public String shippingTime;
    @JsonProperty("charges")
    public Integer charges;
    @JsonProperty("discount")
    public Integer discount;
}

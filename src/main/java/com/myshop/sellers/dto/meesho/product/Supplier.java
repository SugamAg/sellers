
package com.myshop.sellers.dto.meesho.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Supplier {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("handle")
    public String handle;
    @JsonProperty("is_rpc")
    public Boolean isRpc;
    @JsonProperty("default_delivery_time")
    public String defaultDeliveryTime;
    @JsonProperty("delivery_time_message")
    public String deliveryTimeMessage;
    @JsonProperty("shipping_time")
    public String shippingTime;
    @JsonProperty("delayed_shipping")
    public Boolean delayedShipping;
    @JsonProperty("price")
    public Integer price;
    @JsonProperty("original_price")
    public Integer originalPrice;
    @JsonProperty("transient_price")
    public Integer transientPrice;
    @JsonProperty("discount")
    public Integer discount;
    @JsonProperty("cod_available")
    public Boolean codAvailable;
    @JsonProperty("cod_charges")
    public Integer codCharges;
    @JsonProperty("manufacturer")
    public Boolean manufacturer;
    @JsonProperty("in_stock")
    public Boolean inStock;
    @JsonProperty("show_expected_delivery_date")
    public Boolean showExpectedDeliveryDate;
    @JsonProperty("promo_offer")
    public PromoOffer promoOffer;
    @JsonProperty("promo_offers")
    public List<PromoOffer> promoOffers = null;
    @JsonProperty("average_rating")
    public Double averageRating;
    @JsonProperty("rating_count")
    public Integer ratingCount;
    @JsonProperty("shipping")
    public Shipping shipping;
    @JsonProperty("variations")
    public List<String> variations = null;
    @JsonProperty("assured_details")
    public AssuredDetails assuredDetails;
    @JsonProperty("value_props")
    public List<ValueProp> valueProps = null;
    @JsonProperty("inventory")
    public List<Inventory> inventory = null;
    @JsonProperty("price_type_id")
    public String priceTypeId;
    @JsonProperty("shop_value_props")
    public List<ShopValueProp> shopValueProps = null;
    @JsonProperty("profile_image")
    public String profileImage;
    @JsonProperty("masked_id")
    public String maskedId;
}

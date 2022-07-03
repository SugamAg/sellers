package com.myshop.sellers.client;

import java.util.Map;
import java.util.HashMap;

import lombok.Builder;
import lombok.Value;

/**
  * Class Response provides a standard interface to an API's HTTP request.
  */
@Value
@Builder(toBuilder = true)
public class Request {
   Method method;
   String baseUri;
   String endpoint;
   String body;
   Map<String, String> headers;
   Map<String, String> queryParams;
}
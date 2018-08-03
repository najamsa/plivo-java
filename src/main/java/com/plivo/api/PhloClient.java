package com.plivo.api;

import okhttp3.OkHttpClient;

public class PhloClient extends BaseClient {
  protected static String BASE_URL = "https://phlo-runner-service-staging.ovilp.io/v1/";

  public PhloClient(String authId, String authToken) {
    super(authId, authToken, BASE_URL);
  }

  public PhloClient(String authId, String authToken, OkHttpClient.Builder httpClientBuilder) {
    super(authId, authToken, httpClientBuilder, BASE_URL);
  }
}

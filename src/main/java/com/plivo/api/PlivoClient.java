package com.plivo.api;

import okhttp3.OkHttpClient;

public class PlivoClient {

  private final RegularClient regularClient;
  private final PhloClient phloClient;

  public PlivoClient(final String authId, final String authToken) {
    this.regularClient = new RegularClient(authId, authToken);
    this.phloClient = new PhloClient(authId, authToken);
  }

  public PlivoClient(final String authId, final String authToken, final OkHttpClient.Builder httpClientBuilder) {
    this.regularClient = new RegularClient(authId, authToken, httpClientBuilder);
    this.phloClient = new PhloClient(authId, authToken, httpClientBuilder);
  }

  public RegularClient getRegularClient() {
    return regularClient;
  }

  public PhloClient getPhloClient() {
    return phloClient;
  }

}

package com.plivo.api;

import okhttp3.OkHttpClient;

public class PlivoClient {

  private final PlivoRestClient plivoRestClient;
  private final PhloRestClient phloRestClient;

  public PlivoClient(final String authId, final String authToken) {
    this.plivoRestClient = new PlivoRestClient(authId, authToken);
    this.phloRestClient = new PhloRestClient(authId, authToken);
  }

  public PlivoClient(final String authId, final String authToken, final OkHttpClient.Builder httpClientBuilder) {
    this.plivoRestClient = new PlivoRestClient(authId, authToken, httpClientBuilder);
    this.phloRestClient = new PhloRestClient(authId, authToken, httpClientBuilder);
  }

  public PlivoRestClient getPlivoRestClient() {
    return plivoRestClient;
  }

  public PhloRestClient getPhloRestClient() {
    return phloRestClient;
  }

}

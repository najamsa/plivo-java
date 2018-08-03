package com.plivo.api.models.conference;

import com.plivo.api.PlivoClient;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class ConferenceMemberSpeakDeleter extends ConferenceMemberDeleterAction<Conference> {

  public ConferenceMemberSpeakDeleter(String conferenceName, String id) {
    super(conferenceName, id);
  }

  @Override
  protected Call<ResponseBody> obtainCall() {
    return client().getRegularClient().getApiService()
      .conferenceMemberSpeakDelete(client().getRegularClient().getAuthId(), conferenceName, id);
  }

  @Override
  public ConferenceMemberSpeakDeleter client(final PlivoClient plivoClient) {
    this.plivoClient = plivoClient;
    return this;
  }

}

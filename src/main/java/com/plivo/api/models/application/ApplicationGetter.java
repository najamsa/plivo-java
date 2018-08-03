package com.plivo.api.models.application;

import com.plivo.api.models.base.Getter;
import retrofit2.Call;

public class ApplicationGetter extends Getter<Application> {

  public ApplicationGetter(String id) {
    super(id);
  }

  @Override
  protected Call<Application> obtainCall() {
    return client().getRegularClient().getApiService().applicationGet(client().getRegularClient().getAuthId(), id);
  }
}

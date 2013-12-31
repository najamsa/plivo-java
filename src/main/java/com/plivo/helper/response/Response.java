package com.plivo.helper.response;

import com.google.gson.annotations.SerializedName;

public class Response {
	@SerializedName("server_code")
	private Integer serverCode;

	private Object error;

	private String message;

	@SerializedName("api_id")
	private String apiId;

	public Integer getServerCode() {
		return serverCode;
	}

	public String getError() {
		return error.toString();
	}

	public String getMessage() {
		return message;
	}

	public String getApiId() {
		return apiId;
	}

}

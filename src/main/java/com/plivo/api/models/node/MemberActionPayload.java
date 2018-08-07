package com.plivo.api.models.node;

public class MemberActionPayload {

  private MemberActionType action;
  private String triggerSource;
  private String to;
  private String role;

  public MemberActionPayload(final String triggerSource, final String to, final String role, final MemberActionType action) {
    this.triggerSource = triggerSource;
    this.to = to;
    this.role = role;
    this.action = action;
  }

  public MemberActionPayload(final MemberActionType action){
    this.action = action;
  }

  public MemberActionPayload triggerSource(final String triggerSource) {
    this.triggerSource = triggerSource;
    return this;
  }

  public MemberActionPayload to(final String to) {
    this.to = to;
    return this;
  }

  public MemberActionPayload role(final String role) {
    this.role = role;
    return this;
  }

  public MemberActionType getAction() {
    return action;
  }
}


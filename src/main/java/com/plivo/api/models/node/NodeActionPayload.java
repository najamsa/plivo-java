package com.plivo.api.models.node;

public class NodeActionPayload {

  private String triggerSource;
  private String to;
  private String role;
  private NodeActionType action;

  public NodeActionPayload(final String triggerSource, final String to, final String role, final NodeActionType action) {
    this.triggerSource = triggerSource;
    this.to = to;
    this.role = role;
    this.action = action;
  }

  public NodeActionPayload(final NodeActionType action) {
    this.action = action;
  }

  public NodeActionPayload triggerSource(final String triggerSource){
    this.triggerSource = triggerSource;
    return this;
  }

  public NodeActionPayload to(final String to){
    this.to = to;
    return this;
  }

  public NodeActionPayload role(final String role){
    this.role = role;
    return this;
  }

  public String getTriggerSource() {
    return triggerSource;
  }

  public String getTo() {
    return to;
  }

  public String getRole() {
    return role;
  }

  public NodeActionType getAction() {
    return action;
  }
}

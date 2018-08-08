package com.plivo.api.models.node;

public class MultiPartyCall extends Node {

  private MultiPartyCallMember member;

  public MultiPartyCallMember getMember() {
    return member;
  }

  public NodeAction call(final String triggerSource, final String to,
                         final String role) {
    return update(NodeActionType.CALL, NodeType.MULTIPARTYCALL, triggerSource, to, role);
  }

  public NodeAction warmTransfer(final String triggerSource, final String to,
                                 final String role) {
    return update(NodeActionType.WARMTRANSFER, NodeType.MULTIPARTYCALL, triggerSource, to, role);
  }

  public NodeAction coldTransfer(final String triggerSource, final String to,
                                 final String role) {
    return update(NodeActionType.COLDTRANSFER, NodeType.MULTIPARTYCALL, triggerSource, to, role);
  }

  public MultiPartyCallMember member(final String memberId) {
    return new MultiPartyCallMember(getPhloId(), NodeType.MULTIPARTYCALL, getNodeId(), memberId);
  }
}

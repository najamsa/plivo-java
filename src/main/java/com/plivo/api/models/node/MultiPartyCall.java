package com.plivo.api.models.node;

public class MultiPartyCall extends Node {

  private Member member;

  public Member getMember() {
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

  public Member member(final String memberId){
    return new Member(getPhloId(), NodeType.MULTIPARTYCALL, getNodeId(), memberId);
  }
}

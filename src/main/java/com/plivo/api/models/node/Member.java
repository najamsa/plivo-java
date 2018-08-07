package com.plivo.api.models.node;

import com.plivo.api.models.base.BaseResource;

public class Member extends BaseResource {

  private String nodeId;
  private String phloId;
  private NodeType nodeType;
  private String memberId;

  public Member(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    this.nodeId = nodeId;
    this.phloId = phloId;
    this.nodeType = nodeType;
    this.memberId = memberId;
  }

  public Member() {
  }

  public String getMemberId() {
    return memberId;
  }

  public String getNodeId() {
    return nodeId;
  }

  public String getPhloId() {
    return phloId;
  }

  public NodeType getNodeType() {
    return nodeType;
  }

  public MemberAction update(final MemberActionType actionType) {
    return new MemberAction(this.phloId, this.nodeType, this.nodeId, this.memberId, actionType);
  }

  public MemberAction hold() {
    return update(MemberActionType.HOLD);
  }

  public MemberAction unhold() {
    return update(MemberActionType.UNHOLD);
  }

  public MemberAction hangup() {
    return update(MemberActionType.HANGUP);
  }

  public MemberAction resumeCall() {
    return update(MemberActionType.RESUMECALL);
  }

  public MemberAction abortWarmTransfer() {
    return update(MemberActionType.ABORTWARMTRANSFER);
  }

  public MemberAction voiceMailDrop() {
    return update(this.phloId, this.nodeType, this.nodeId, this.memberId, MemberActionType.VOICEMAILDROP);
  }

  public static MemberAction update(final String phloId, final NodeType nodeType, final String nodeId, final String memberId, final MemberActionType actionType) {
    return new MemberAction(phloId, nodeType, nodeId, memberId, actionType);
  }

  public static MemberAction hold(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.HOLD);
  }

  public static MemberAction unhold(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.UNHOLD);
  }

  public static MemberAction hangup(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.HANGUP);
  }

  public static MemberAction resumeCall(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.RESUMECALL);
  }

  public static MemberAction abortWarmTransfer(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.ABORTWARMTRANSFER);
  }

  public static MemberAction voiceMailDrop(final String phloId, final NodeType nodeType, final String nodeId, final String memberId) {
    return update(phloId, nodeType, nodeId, memberId, MemberActionType.VOICEMAILDROP);
  }

  @Override
  public String getId() {
    return getMemberId();
  }
}

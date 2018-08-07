package com.plivo.api;

import com.plivo.api.models.node.MultiPartyCall;
import com.plivo.api.models.phlo.Phlo;
import org.junit.Before;
import org.junit.Test;

public class MultiPartyCallMemberTest extends BaseTest{
  private Phlo phlo;
  private MultiPartyCall multiPartyCall;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    expectResponse("phloGetResponse.json", 200);
    expectResponse("multiPartyCallGetResponse.json", 200);
    expectResponse("multiPartyCallActionResponse.json", 200);

    phlo = Phlo
      .getter("a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6")
      .get();

    multiPartyCall = phlo.multiPartyCallGetter(
      "f4789ccf-25f5-4a1f-91a4-55ca022ba903").get();
  }

  @Test
  public void abortTransferShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").abortWarmTransfer().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"abortwarmtransfer\"}");
  }

  @Test
  public void abortTransferWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").abortWarmTransfer()
        .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"abortwarmtransfer\"}");
  }

  @Test
  public void resumeCallShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").resumeCall().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"resumecall\"}");
  }

  @Test
  public void resumeCallWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").resumeCall()
      .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"resumecall\"}");
  }

  @Test
  public void voiceMailDropShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").voiceMailDrop().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"voicemaildrop\"}");
  }

  @Test
  public void voiceMailDropWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").voiceMailDrop()
      .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"voicemaildrop\"}");
  }

  @Test
  public void hangupShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").hangup().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"hangup\"}");
  }

  @Test
  public void hangupWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").hangup()
      .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"hangup\"}");
  }

  @Test
  public void holdShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").hold().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"hold\"}");
  }

  @Test
  public void holdWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").hold()
      .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"hold\"}");
  }

  @Test
  public void unholdShouldSucceed() throws Exception {

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").unhold().create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"unhold\"}");
  }

  @Test
  public void unholdWithClientShouldSucceed() throws Exception {

    PlivoClient client = new PlivoClient("MA123456789012345678",
      "Zmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    assertRequestWithBody("GET", "/", "phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6");

    assertRequestWithBody("GET", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903");

    multiPartyCall.member("11111111111").unhold()
      .client(client).create();

    assertRequestWithBody("POST", "/phlo/a9f74ec4-2d3f-41d6-b8f0-f341fcfb59b6/",
      "multi_party_call/f4789ccf-25f5-4a1f-91a4-55ca022ba903/members/11111111111",
      "{\"action\":\"unhold\"}");
  }

}

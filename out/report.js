$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/zadanie1.feature");
formatter.feature({
  "line": 1,
  "name": "Create new address",
  "description": "",
  "id": "create-new-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can create new address on online store",
  "description": "",
  "id": "create-new-address;user-can-create-new-address-on-online-store",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with https://prod-kurs.coderslab.pl/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks button Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fill field Email with value anna.testerska1@test.pl",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "fill field Password with value coderslab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click button Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click link Addresses on page\u0027s footer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click link Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill form with Alias \u003calias\u003e, Address \u003caddress\u003e, City \u003ccity\u003e, Zip/Postal Code \u003ccode\u003e, Country \u003ccountry\u003e, Phone \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click button Save",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "will see message Address successfully added!",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "see added address with data \u003calias\u003e, Anna Testerska, \u003caddress\u003e, \u003ccity\u003e, \u003ccode\u003e, \u003ccountry\u003e, \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "create-new-address;user-can-create-new-address-on-online-store;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "code",
        "country",
        "phone"
      ],
      "line": 18,
      "id": "create-new-address;user-can-create-new-address-on-online-store;;1"
    },
    {
      "cells": [
        "Adres1",
        "Testowa 1",
        "Kraków",
        "31-317",
        "United Kingdom",
        "661662663"
      ],
      "line": 19,
      "id": "create-new-address;user-can-create-new-address-on-online-store;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "user can create new address on online store",
  "description": "",
  "id": "create-new-address;user-can-create-new-address-on-online-store;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with https://prod-kurs.coderslab.pl/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks button Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fill field Email with value anna.testerska1@test.pl",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "fill field Password with value coderslab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click button Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click link Addresses on page\u0027s footer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click link Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill form with Alias Adres1, Address Testowa 1, City Kraków, Zip/Postal Code 31-317, Country United Kingdom, Phone 661662663",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click button Save",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "will see message Address successfully added!",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "see added address with data Adres1, Anna Testerska, Testowa 1, Kraków, 31-317, United Kingdom, 661662663",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Zadanie1Steps.openMyStore()"
});
formatter.result({
  "duration": 13163465200,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.clickSignIn()"
});
formatter.result({
  "duration": 680541100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anna.testerska1@test.pl",
      "offset": 28
    }
  ],
  "location": "Zadanie1Steps.setEmail(String)"
});
formatter.result({
  "duration": 198745500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "coderslab",
      "offset": 31
    }
  ],
  "location": "Zadanie1Steps.setPassword(String)"
});
formatter.result({
  "duration": 161187300,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.clickButtonSignIn()"
});
formatter.result({
  "duration": 948180600,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.clickLinkAddresses()"
});
formatter.result({
  "duration": 722702700,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.clickLinkCreate()"
});
formatter.result({
  "duration": 781405700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adres1",
      "offset": 21
    },
    {
      "val": "Testowa 1",
      "offset": 37
    },
    {
      "val": "Kraków",
      "offset": 53
    },
    {
      "val": "31-317",
      "offset": 77
    },
    {
      "val": "United Kingdom",
      "offset": 93
    },
    {
      "val": "661662663",
      "offset": 115
    }
  ],
  "location": "Zadanie1Steps.setForm(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 871655400,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.clickButtonSave()"
});
formatter.result({
  "duration": 654358600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 17
    }
  ],
  "location": "Zadanie1Steps.displayAllertSuccess(String)"
});
formatter.result({
  "duration": 61168300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adres1",
      "offset": 28
    },
    {
      "val": "Anna Testerska",
      "offset": 36
    },
    {
      "val": "Testowa 1",
      "offset": 52
    },
    {
      "val": "Kraków",
      "offset": 63
    },
    {
      "val": "31-317",
      "offset": 71
    },
    {
      "val": "United Kingdom",
      "offset": 79
    },
    {
      "val": "661662663",
      "offset": 95
    }
  ],
  "location": "Zadanie1Steps.displayData(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 100823200,
  "status": "passed"
});
formatter.match({
  "location": "Zadanie1Steps.closeBrowser()"
});
formatter.result({
  "duration": 959327000,
  "status": "passed"
});
});
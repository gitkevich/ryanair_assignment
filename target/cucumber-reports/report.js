$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/payments.feature");
formatter.feature({
  "name": "Payments",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Booking with a declined payment due to invalid card details",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.PaymentsStepDefinitions.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User makes a booking",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.PaymentsStepDefinitions.user_makes_a_booking()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Failed to convert data to an object\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027Vlads.local\u0027, ip: \u0027fe80:0:0:0:1c62:177c:81d0:572%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 73.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200207195153, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 85535, moz:profile: /var/folders/q4/dgtll1514s9..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 17.5.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9b4662e1-0323-7942-85b1-d48bf03273b2\n*** Element info: {Using\u003dxpath, value\u003d//div[2]/button}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\n\tat PageObjects.BookingDetailsFlow.skipAnythingElseScreen(BookingDetailsFlow.java:52)\n\tat Steps.PaymentsStepDefinitions.user_makes_a_booking(PaymentsStepDefinitions.java:70)\n\tat ✽.User makes a booking(file:///Users/Vlad/Documents/GitHub/ryanair_assignment/src/test/java/Features/payments.feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "User pays for booking with invalid card details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.PaymentsStepDefinitions.user_pays_for_booking_with_invalid_card_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should get payment declined message",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.PaymentsStepDefinitions.user_should_get_payment_declined_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
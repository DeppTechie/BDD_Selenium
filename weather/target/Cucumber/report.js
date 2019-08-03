$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/Holiday.feature");
formatter.feature({
  "name": "Holiday Maker",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "A happy holidaymaker",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I like to holiday in Sydney",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_like_to_holiday_in_sydney()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I only like to holiday on Thursdays",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_only_like_to_holiday_on_thursdays()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I look up the weather forecast",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_look_up_the_weather_forecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive the weather forecast",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_receive_the_weather_forecast()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the temperature is warmer than 10 degrees",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.the_temperature_is_warmer_than_10_degrees()"
});
formatter.result({
  "status": "passed"
});
});
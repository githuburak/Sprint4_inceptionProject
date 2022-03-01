package com.seamlessly.step_definitions;

import com.seamlessly.pages.CalendarPage;
import io.cucumber.java.en.Given;

public class CalendarStepDefs {


    @Given("the user clicks on {string} icon")
    public void the_user_clicks_on_icon(String calendar) {
        CalendarPage calendarPage = new CalendarPage();
        calendarPage.navigateTo(calendar);


    }
}
package com.test.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestStep {
    Response res1;

    @Given("I trigger the get API")
    public void i_trigger_the_get_api() {
        RestAssured.baseURI = "https://gorest.co.in/public-api";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();

        System.out.println("API Response Code"+response.statusCode());
        res1= response ;
        //Response header
        String contentType = response.header("Content-Type");
        System.out.println("Content-Type: " + contentType);
        System.out.println("Response:"+response.asString());

    }
    @Then("I verify API statuscode")
    public void i_verify_api_statuscode() {
        //Validate Status Code
        System.out.println("API Response Code" + res1.statusCode());
        try {
            if (res1.statusCode() == 200) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue("STATUS CODE : " + res1.statusCode(), false);
            }
        } catch (Exception e) {
            Assert.assertTrue(false);
        }

    }
    @Then("I verify title")
    public void i_verify_title() throws FileNotFoundException {
        HashMap<String, String> datadetails1 = res1.getBody().jsonPath().get("data[0]");
        String resposnetitle1= datadetails1.get("title");
        System.out.println("restile"+resposnetitle1);

    }
}


package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Privet"))
        ;
    }
}

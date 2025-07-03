package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ProductAPITest {

    @Test
    public void testGetProducts() {
        RestAssured.baseURI = "https://fakestoreapi.com";
        given()
        .when()
            .get("/products")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0));
    }
}

package tests.steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BreedsSteps {

    private Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = given().baseUri("https://catfact.ninja").when().get(endpoint);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response should contain a non-empty list of breeds")
    public void the_response_should_contain_a_non_empty_list() {
        response.then().body("data", not(empty()));
    }

    @Then("each breed should have a breed, country, origin, coat, and pattern")
    public void validate_fields_in_each_breed() {
        response.then().body("data.breed", everyItem(notNullValue()))
                .body("data.country", everyItem(notNullValue()))
                .body("data.origin", everyItem(notNullValue()))
                .body("data.coat", everyItem(notNullValue()))
                .body("data.pattern", everyItem(notNullValue()));
    }

    @Then("the response should contain exactly {int} breeds")
    public void response_should_contain_exact_number_of_breeds(int limit) {
        response.then().body("data.size()", equalTo(limit));
    }
}

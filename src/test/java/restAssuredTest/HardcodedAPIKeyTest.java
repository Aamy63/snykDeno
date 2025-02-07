package restAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class HardcodedAPIKeyTest {
	
	@Test
    public void testHardcodedAPIKey() {
        // Hardcoded API Key (Security Risk)
        String apiKey = "sk_test_1234567890abcdef";

        // Making a request using the hardcoded API key
        Response response =
        		given().
        			basePath("https://api.example.com").
        			header("Authorization", "Bearer " + apiKey).
                when().
                	get("/protected-resource").
                then().
                	extract().
                	response();

        // Validate response status
        Assert.assertEquals(response.getStatusCode(), 200, "API request failed!");
    }

}

package requests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_request {
	
	@Test
	public static void main(String[] args) {
		RestAssured.baseURI="https://bookstore.toolsqa.com/";
		String payload="{\r\n"
			    + "  \"userName\": \"AshishT3\",\r\n"
			    + "  \"password\": \"@ashishT1998\"\r\n"
			    + "}";

		
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		Response response=httpRequest.body(payload).post("/Account/V1/User");
		int statusCode=response.getStatusCode();
		Assertions.assertEquals(201, statusCode);
		System.out.println(response.getBody().asPrettyString());
	}

}

/*{
    "userID": "ae53d07e-34cb-4791-908c-94a1783efcf8",
    "username": "AshishT3",
    "books": [
        
    ]
}*/



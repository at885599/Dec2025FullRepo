package requests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Bearer_token_Request {
	@Test
	public static void main(String[] args) {
		
		RestAssured.baseURI ="https://bookstore.toolsqa.com";
		RequestSpecification request=RestAssured.given();
		String payload="{\r\n"
			    + "  \"userName\": \"AshishT3\",\r\n"
			    + "  \"password\": \"@ashishT1998\"\r\n"
			    + "}";
		request.header("Content-Type","application/json");
		Response responseFromGenerateToken=request.body(payload).post("/Account/v1/GenerateToken");
		responseFromGenerateToken.prettyPrint();
		String jsonString=responseFromGenerateToken.getBody().asString();
		String tokenGenerated=JsonPath.from(jsonString).get("token");
		request.header("Authorization","Bearer "+tokenGenerated).header("Content-Type","application/json");
		String payload2="{\r\n"
				+ "  \"userId\": \"ae53d07e-34cb-4791-908c-94a1783efcf8\",\r\n"
				+ "  \"collectionOfIsbns\": [\r\n"
				+ "    {\r\n"
				+ "      \"isbn\": \"9781491904244\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		Response AddBooksResponse=request.body(payload2).post("/BookStore/v1/Books");
		Assertions.assertEquals(201, AddBooksResponse.getStatusCode());
		AddBooksResponse.prettyPrint();
	}

}

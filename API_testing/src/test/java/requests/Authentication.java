package requests;

import java.util.Base64;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {

	@Test
	public static void main(String[] args) {
		RestAssured.baseURI="https://bookstore.toolsqa.com/";
		RequestSpecification request=RestAssured.given();
		String credentials="AshishT3:@ashishT1998";
		String encodedCredentialsAsString=Base64.getEncoder().encodeToString(credentials.getBytes());
		request.header("Authorization","Basic "+encodedCredentialsAsString );
		String payload="{\r\n"
				+ "  \"userId\": \"ae53d07e-34cb-4791-908c-94a1783efcf8\",\r\n"
				+ "  \"collectionOfIsbns\": [\r\n"
				+ "    {\r\n"
				+ "      \"isbn\": \"9781491904244\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		request.header("Content-Type","application/json");
		Response response=request.body(payload).post("/BookStore/v1/Books");
		System.out.println("Response status code is "+response.getStatusCode());
		response.prettyPrint();
	}

}

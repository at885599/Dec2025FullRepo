package requests;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PUT_request {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="";
		RequestSpecification request=RestAssured.given();
		request.header("Authorization","")
	}

}

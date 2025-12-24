package requests;

import org.junit.jupiter.api.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET_request {
	public static void main(String args[]){
		RestAssured.baseURI="https://bookstore.toolsqa.com";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/BookStore/v1/Books");
		int statusCode=response.getStatusCode();
		Assertions.assertEquals(200, statusCode);
		System.out.println("Status code is: "+statusCode);
		Headers header=response.getHeaders();
		System.out.println("Response headers are: "+header);
		int headerCount=header.asList().size();
		Assertions.assertEquals(5, headerCount);
		String headervalue=response.getHeader("Content-Type");
		Assertions.assertEquals("application/json; charset=utf-8", headervalue);
		ResponseBody body=response.getBody();
		body.prettyPeek();
		System.out.println("Response body is: "+ body.asString());
		String responseBodyAsString=response.getBody().asString();
		Assertions.assertTrue(responseBodyAsString.contains("Git Pocket Guide"));
	}

}
  
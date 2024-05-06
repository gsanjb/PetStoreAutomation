package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPoints {
	public static Response createUser(Store payload)
	{
		Response response = given()
		   .contentType(ContentType.JSON)
		   .accept(ContentType.JSON)
		   .body(payload)
		.when()
		.post(Routes.storepost_url);
		
		
		return response;
	}

	public static Response readUser(int id)
	{
		Response response = given()
		  .pathParam("orderId", id)
		.when()
		.get(Routes.storeget_url);
		
		
		return response;
	}
	public static Response deleteUser(int id)
	{
		Response response = given()
		  .pathParam("orderId", id)
		.when()
		.delete(Routes.storedelete_url);
		
		
		return response;
	}
}

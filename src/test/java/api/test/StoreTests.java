package api.test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.StoreEndPoints;

import api.payload.Store;
import io.restassured.response.Response;


public class StoreTests {
	Faker faker;
	Store storePayLoad;
	
	@BeforeClass
	public void setup()
	{
		faker=new Faker();
		storePayLoad=new Store();
		
		storePayLoad.setId(faker.idNumber().hashCode());
		storePayLoad.setPetId(faker.idNumber().hashCode());
		storePayLoad.setQuantity(faker.idNumber().hashCode());
		storePayLoad.setShipDate(faker.date().birthday());
		
		
	}
	@Test(priority=1)
	public void placeOrderForPet()
	{
		
		Response response=StoreEndPoints.createUser(storePayLoad);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(),200);
		
		
			
	}
	
	@Test(priority=2)
	public void findPetByID()
	{
		
		
		Response response=StoreEndPoints.readUser(this.storePayLoad.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
		
		
	}
	@Test(priority=4)
	public void deletePet()
	{
		
		
		Response response=StoreEndPoints.deleteUser(this.storePayLoad.getId());
		Assert.assertEquals(response.getStatusCode(),200);
		
		
	}
	

}

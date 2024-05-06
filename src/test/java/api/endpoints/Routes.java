package api.endpoints;

public class Routes {

public static String base_url  ="https://petstore.swagger.io/v2";
 	
 	//User Model
    public static String post_url  = base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";
     
    
    //Store Model
    public static String storepost_url  = base_url+"/store/order";
    public static String storeget_url=base_url+"/store/order/{orderId}";
    public static String storedelete_url=base_url+"/store/order/{orderId}";
    
    
    //Pet Model
   
    


	
}

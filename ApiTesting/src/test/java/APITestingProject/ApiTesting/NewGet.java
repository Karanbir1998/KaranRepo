package APITestingProject.ApiTesting;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class NewGet {
	
	public static void main(String[] args) {
	
		Response rs=given().contentType(ContentType.JSON).when()
		.get("http://localhost:3000/UserLogin");
		System.out.println("Status Code is: "+rs.statusCode());
		System.out.println("Data of Response is: "+rs.asString());	
	}
}

package JSONValidator;

	import org.testng.annotations.Test;
	import static io.restassured.RestAssured.given;
	import java.io.File;
	import io.restassured.module.jsv.JsonSchemaValidator;

	
	public class JsonValidator {
	   @Test
	   public void validateJSONSchema(){

	      given()
	      .when().get("http://localhost:3000/posts")
          .then().assertThat()
	      .body(JsonSchemaValidator.
	      matchesJsonSchema(new File("src/tryschema.json")));
	   }
	}

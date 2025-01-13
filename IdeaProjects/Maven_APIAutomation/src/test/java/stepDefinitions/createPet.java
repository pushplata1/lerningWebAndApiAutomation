package stepDefinitions;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class createPet {

    private static final String BASE_URL = "https://petstore.swagger.io";

    RequestSpecification request=RestAssured.given();

    RequestSpecBuilder builder = new RequestSpecBuilder();

    Response response=null ;


    @Then("Validate the status {int}")
    public void validate_the_status(int expectedStatusCode) {
       int code= response.getStatusCode();
       boolean flag;
       if(code==expectedStatusCode){
           flag=true;
       }

//        JsonObject js = new JsonObject(response);
//       String xs= js.getString("data.stuff.othertype[0].n");


    }


    @When("Enter {string} {string} CreatePetApi")
    public void enter_create_pet_api(String MethodType, String endpoint) {

        switch (MethodType) {
            case "POST":
                response= request.when().post(endpoint);
                break;
            case "GET":
                response= request.when().get(endpoint);
                break;
            case "PUT":
                response= request.when().put(endpoint);
                break;
            case "PATCH":
                response= request.when().patch(endpoint);
                break;
            case "DELETE":
                response=  request.when().delete(endpoint);
                break;
        }
    }


    @When("Add RequestBody {string}")
    public void add_request_body(String filename) throws Exception {
        String file = "src/RequestBody/CreatePet.json";
        String json = readFileAsString(file); // here we did only use jason file in read mode which will not court file in any future problem
        // also we read out and store in varialble name "json" to manipulate according to need
       // System.out.println(json);
        builder.setBaseUri(BASE_URL).setBody(json);


     request.spec(builder.build());

    }
    public  String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }


    @Given("Add header map details")
    public void add_header_map_details(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> headerList = dataTable.asMaps(String.class,String.class);
        System.out.println(headerList.size());
      for(Map<String,String>m:headerList){
          builder.addHeader(m.get("Key"),m.get("Value"));
      }

    }

    @Given("Enter POST <EndPoint> CreatePetApi")
    public void enter_post_end_point_create_pet_api(io.cucumber.datatable.DataTable dataTable) {

    }

}


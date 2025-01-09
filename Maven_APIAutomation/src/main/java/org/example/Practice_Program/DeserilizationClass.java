package org.example.Practice_Program;


import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class DeserilizationClass {

    public static void main(String[] args) throws JsonProcessingException {


 ObjectMapper mapper = new ObjectMapper();
       String Json = "{ \"name\" : \"Pushplata\"," +
               "  \"gender\" : \"Female\"," +
               "  \"age\" : 32," +
               "  \"address\" : \"Al Murabha\"," +
               "  \"ocupation\" : \"SoftWare Test Engineer\"," +
               "  \"mobileNo\" : \"9911392343\"}";
     employee value = mapper.readValue(Json, employee.class);
        System.out.println(value.getGender());
        System.out.println(value.getName());

    }

}

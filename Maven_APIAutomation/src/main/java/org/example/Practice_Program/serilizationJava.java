package org.example.Practice_Program;


import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

public class serilizationJava {


    public static void main(String[] args) throws JsonProcessingException {
        Map<String , Object> map = new LinkedHashMap<>();

        map.put("name","Pushplata");
        map.put("Gender","Female");
        map.put("Age",32);
        map.put("Address","Al Murabha");
        map.put("Ocupation","SoftWare Test Engineer");
        map.put("MobileNo", "9911392343");

        ObjectMapper mapper = new ObjectMapper();

        String jsonResult =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

        System.out.println(jsonResult);




    }



}

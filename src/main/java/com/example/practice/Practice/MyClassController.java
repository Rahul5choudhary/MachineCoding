package com.example.practice.Practice;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@RestController
public class MyClassController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }


    @PostMapping("/abcd")
    public String sayHello(@RequestBody String requestBody){
        JSONObject json = new JSONObject(requestBody);
        String firstName = json.optString("firstName");
        String lastName = json.optString("LastName");
        System.out.println("First Name: " + firstName + " LastName :" + lastName);

        return "OK";

    }

    @PostMapping("/abcd/{userName}")
    public String userName(@RequestBody String requestBody , @PathVariable String userName){

        System.out.println("UserName: " + userName);
        JSONObject json = new JSONObject(requestBody);
        String firstName = json.optString("firstName");
        String lastName = json.optString("LastName");

        System.out.println("First Name: " + firstName + " LastName :" + lastName);
        return "Ok";
    }



}

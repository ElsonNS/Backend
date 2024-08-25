package com.example.bfhl.controller;

import com.example.bfhl.model.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @PostMapping
    public Response handlePost(@RequestBody Map<String, List<String>> request){
        List<String> data = request.get("data");

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        String highestLowercase ="";

        for(String item : data){
            if(item.matches("\\d+")){
                numbers.add(item);
            }
            else if(item.matches("[a-zA-Z]")){
                alphabets.add(item);
                if(item.matches("[a-z]") & item.compareTo(highestLowercase) > 0){
                    highestLowercase = item;
                }
            }
        }

        Response response = new Response();
        response.setIsSuccess(true);
        response.setUserId("26032002");
        response.setEmail("elson.nag2021@vitbhopal.ac.in");
        response.setRollNumber("21BSA10048");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);
        response.setHighestLowercaseAlphabet(highestLowercase.isEmpty() ? null : highestLowercase);

        return response;
    }

    @GetMapping
    public Map<String, Integer> handleGet(){
        return Map.of("operation_code", 1);
    }
}

package com.eduit.service.resource;

import com.eduit.service.resource.response.AutoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoResource {


    @GetMapping(path = "car/{id}",produces = "application/json")
    public AutoResponse getAutoById(@PathVariable(name = "id") Long id){

        return new AutoResponse(id,"test_brand","test_model",10.0D);
    }


}

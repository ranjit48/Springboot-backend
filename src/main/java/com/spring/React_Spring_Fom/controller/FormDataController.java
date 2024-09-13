package com.spring.React_Spring_Fom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.React_Spring_Fom.Service.FormDataService;
import com.spring.React_Spring_Fom.Entity.FormData;

@RestController // Ensure the class is recognized as a REST Controller
@RequestMapping("/api/form") // Base URL mapping for the form submission
@CrossOrigin(origins = "http://localhost:3000")
public class FormDataController {

    @Autowired
    private FormDataService service;

    @PostMapping("/submit")
    public ResponseEntity<FormData> submitForm(@RequestBody FormData formData) {
        try {
            FormData savedData = service.saveFormData(formData);
            return new ResponseEntity<>(savedData, HttpStatus.CREATED);
        } catch (Exception e) {
            // Return an error response in case something goes wrong
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

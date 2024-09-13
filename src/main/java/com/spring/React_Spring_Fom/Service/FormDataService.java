package com.spring.React_Spring_Fom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.React_Spring_Fom.Entity.FormData;
import com.spring.React_Spring_Fom.repository.FormDataRepository;

@Service
public class FormDataService {

    @Autowired
    private FormDataRepository repository;

    public FormData saveFormData(FormData formData) {
        return repository.save(formData);
    }
}

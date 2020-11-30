package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Lec_lectura;
import com.example.easynotes.repository.Lec_lecturaRepository;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Lec_lecturaController {



    @Autowired
    Lec_lecturaRepository lec_lecturaRepository;

    @GetMapping("/lec_lectura")
    public List<Lec_lectura> getAllLec_lecturas() {return lec_lecturaRepository.findAll();}



}

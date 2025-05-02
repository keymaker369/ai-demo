package com.aidemo.controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  OllamaChatModel ollamaChatModel;

  @GetMapping(path = "/hello")
  public String hello() {
   return "Hello world!";
  }

  @PostMapping(path = "/ollama")
  public String ollama(@RequestBody String body) {
    final String response = ollamaChatModel.call(body);
    return response;
  }


}

package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.JhipsterApplication1App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterApplication1App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

package com.example.springbootstudy;

import com.example.springbootstudy.study3.getRestApi.dao.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class SpringBootStudyApplication {


    private static final Logger log = LoggerFactory.getLogger(SpringBootStudyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }
/*
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            ResponseEntity<Quote> responseEntity =  restTemplate.getForEntity("http://quoters.apps.pcfone.io/api/random", Quote.class);
            log.info("responseEntity : "+responseEntity.getStatusCode());
            log.info("responseEntity : "+responseEntity.getBody());

            Quote quote = restTemplate.getForObject(
                    "http://quoters.apps.pcfone.io/api/random", Quote.class);
            log.info("quote : "+quote);
            //log.info(quote.toString());
        };
    }
 */
}

//package ru.ugrasu.portfolio.controllers;
//
//import com.google.common.collect.ImmutableList;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.web.client.RestTemplate;
//import ru.ugrasu.portfolio.PortfolioApplication;
//import ru.ugrasu.portfolio.models.entities.AboutMeEntity;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//import static java.util.stream.Collectors.collectingAndThen;
//import static java.util.stream.Collectors.toCollection;
//import static java.util.stream.Collectors.toList;
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.*;
//
///**
// * Created by Марсель on 17.11.2017.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class AboutControllersIT {
//    RestTemplate restTemplate = new TestRestTemplate().getRestTemplate();
//
//    @Test
//    public void testGetAll() throws Exception{
//        ResponseEntity<List<AboutMeEntity>> responseEntity = restTemplate.exchange(
//                "http://localhost:8080/about/allAbout", HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<AboutMeEntity>>() {});
//        List<AboutMeEntity> actualList = responseEntity.getBody();
//        //validate
//        assertThat(actualList.size(), is(2));
//        List<String> actualIds = actualList.stream()
//                //.map(aboutMeEntity -> aboutMeEntity.getIdAbout())
//                //.collect(toCollection(toList()));
//    }
//}
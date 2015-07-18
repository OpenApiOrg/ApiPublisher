package com.tcs.opi.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.tcs.opi.app.domain.SearchListing;
import com.tcs.opi.app.domain.SearchResult;

@SpringBootApplication
public class ReferenceApp{

    public static void main(String[] args) {
        SpringApplication.run(ReferenceApp.class, args);
    }
    
    
   /* @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        SearchResult searchResult = restTemplate.getForObject("http://pubapi.yp.com/search-api/search/devapi/coupons?format=JSON&key=24c9b4p9qk&searchloc=55343&term=groceries", SearchResult.class);
       System.out.println(""+searchResult.toString());
       
       System.out.println(searchResult.getSearchListings().get(0).le);
       
       List a.size
    }*/
}

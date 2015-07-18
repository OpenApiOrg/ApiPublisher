package com.tcs.opi.app.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tcs.opi.app.domain.SearchResult;
import com.tcs.opi.app.service.DeptService;

@RestController
public class DeptController {
	
    @Autowired
    private DeptService deptService;
    
    @RequestMapping("/api/depts/dept")
    String getDept() {
//    	DeptService deptService;
//    	
//    	deptService = new DeptService();
    	
    	deptService.getDept(0);
    	
    	
    	/*RestTemplate restTemplate = new RestTemplate();
        SearchResult searchResult = restTemplate.getForObject("http://pubapi.yp.com/search-api/search/devapi/coupons?format=JSON&key=24c9b4p9qk&searchloc=55343&term=groceries", SearchResult.class);
       System.out.println(""+searchResult.toString());
       
      System.out.println("size of "+searchResult.getSearchListings().get(0).getBusinessName());
       
    	*/
    	
    	RestTemplate restTemplate = new RestTemplate();
    	
    	String aa = restTemplate.getForObject("http://pubapi.yp.com/search-api/search/devapi/coupons?format=JSON&key=24c9b4p9qk&searchloc=55343&term=groceries", String.class);
    	
    	System.out.println(aa + "aa");
    	
    	 RestTemplate restTemplate1 = new RestTemplate();
    	 Map<String,Object> map = restTemplate1.getForObject("http://pubapi.yp.com/search-api/search/devapi/coupons?format=JSON&key=24c9b4p9qk&searchloc=55343&term=groceries", Map.class);
        /*System.out.println(""+searchResult.toString());
        
       System.out.println("size of "+searchResult.getSearchListings().get(0).getBusinessName());
        */
    	System.out.println("Map is"+map.toString());
    	
    	System.out.println(map.get("searchResult"));
    	
    	Map <String,Object> map1 = (Map<String, Object>) map.get("searchResult");
    	
    	Map <String,Object> map2 = (Map<String, Object>) map1.get("searchListings");
    	
    	List <String> lis1 = (List<String>) map2.get("searchListing");
    	
    	
    	System.out.println(lis1.toString());
    	
    	
    	
    	/*Map <String,Object> map3 = (Map <String,Object>) lis1.get(0);
    	*/
    	
        return aa;
    }
	
}

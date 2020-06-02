package com.cook.talk.model.serviceImpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.cook.talk.model.VO.RecipeVO;
import com.cook.talk.model.dao.ChefDAO;
import com.cook.talk.model.service.MainService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class MainServiceImpl implements MainService {

	@Autowired(required = false)
	private ChefDAO chef;
	@Override
	public List<RecipeVO> recipeList(String expl) {
		
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
	    converters.add(new FormHttpMessageConverter());
	    converters.add(new StringHttpMessageConverter());
	 
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.setMessageConverters(converters);
	 
	    // parameter 세팅
	    // REST API 호출
	    ObjectMapper mapper=new ObjectMapper();
	    MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
	    map.add("expl", expl);
	    try {
			mapper.writeValueAsString(map);
		    // REST API 호출
		    String result = restTemplate.postForObject("http://localhost:5000/recommend", map, String.class);
		    System.out.println(result);
		    
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

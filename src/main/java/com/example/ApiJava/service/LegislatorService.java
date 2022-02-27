package com.example.ApiJava.service;

import com.example.ApiJava.model.Legislator;
import com.example.ApiJava.repository.LegislatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


@Service
public class LegislatorService {
    private LegislatorRepository legislatorRepository;

    @Autowired
    public LegislatorService(LegislatorRepository legislatorRepository) {
        this.legislatorRepository = legislatorRepository;
    }

    private List<Object> data = new ArrayList<>();

    public List<Object> getLegislator(){
        String url="http://www.opensecrets.org/api/?method=getLegislators&id=NJ&apikey=1337d856f889809777bfcbab51c63a33";
        RestTemplate restTemplate=new RestTemplate();
        Object[] test=restTemplate.getForObject(url,Object[].class);
        data= Arrays.asList(test);
        return data;
    }

    public Iterable<Legislator> addLegislator(List<Legislator> legislators){
        return legislatorRepository.saveAll(legislators);
    }

}

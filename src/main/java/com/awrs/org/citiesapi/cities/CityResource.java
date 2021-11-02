package com.awrs.org.citiesapi.cities;

import com.awrs.org.citiesapi.cities.City;
import com.awrs.org.citiesapi.cities.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }
         /* 1st
        @GetMapping
        public List<City> cities() {
             return repository.findAll();
        }*/

        // 2nd - Pageable

        @GetMapping
        public Page<City> cities( final Pageable page){
            return repository.findAll(page);
        }

}

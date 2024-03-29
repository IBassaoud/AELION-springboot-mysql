package org.myownstock.user.cities;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")

public class CityController {
    @Autowired
    CityService cityService;
    @PostMapping
    public City add(@RequestBody City city) {
        return cityService.add(city);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody City city) {
    return this.cityService.update(city);
    }

    @GetMapping
    public List<City> findAll(){
        return this.cityService.findAll();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> remote(@PathVariable Long id){
        return this.cityService.remove(id);
    }

}

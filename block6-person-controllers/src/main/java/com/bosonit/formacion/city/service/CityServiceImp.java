package com.bosonit.formacion.city.service;

import com.bosonit.formacion.city.model.City;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service // --> This annotation implements the CityService interface and writes the logic to store, retrieve, delete and update the city.

public class CityServiceImp implements CityService {

    //Create an interface that contains add, edit, get and delete methods
    private static Map<String, City> cityRepo = new HashMap<>();
    static {
        City city = new City();
        city.setName("Seville");
        city.setPopulation(652123);
        cityRepo.put(city.getName(),city);

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPopulation() {
        return 0;
    }

    @Override
    public City getCity(City city) {
        return null;
    }

    @Override
    public City createCity(City city) {
        cityRepo.put(city.getName(),city);
        return city;
    }

    @Override
    public void updateCity(String name, int population) {

    }

    @Override
    public void deleteCity(String name) {

    }

    @Override
    public Collection<City> getCities() {
        return cityRepo.values();
    }
}

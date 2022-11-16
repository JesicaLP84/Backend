package com.bosonit.formacion.City;

import com.bosonit.formacion.City.Model.City;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CityServiceImp implements CityService {
    private static Map<String, City> cityRepo = new HashMap<>();
    static {
        City city = new City();
        city.setName("Seville");
        city.setPopulation(652123);
        cityRepo.put(city.getName(),city);

        city.setName("Madrid");
        city.setPopulation(3652123);
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
        cityRepo.remove(name);
        City city = new City();
        city.setName(name);
        cityRepo.put(name,city);
    }

    @Override
    public void deleteCity(String name) {
        cityRepo.remove(name);
    }

    @Override
    public Collection<City> getCities() {
        return cityRepo.values();
    }

//
}

package com.bosonit.formacion.City;

import com.bosonit.formacion.City.Model.City;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface CityService {

    List<City> listCities = new ArrayList<>();
    String getName();

    int getPopulation();

    static void add(City city) {
    }
    City getCity(City city);

    public abstract City createCity(City city);

    public abstract void updateCity(String name, int population);

    public abstract void deleteCity(String name);

    public abstract Collection<City> getCities();


}

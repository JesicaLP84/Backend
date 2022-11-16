package com.bosonit.formacion.Class;

import org.springframework.stereotype.Component;
import java.util.List;
import java.lang.String;

@Component
public class City {

   private List<String> nameList;
   private List<Integer> populationList;

   private String name;
   private int population;

   public City(){

   }

   public City(String name, int population){
       this.name = name;
       this.population = population;
   }

   public String toString() {
       return "The City" + " " +  name  + " "  + "has  a population of " +  " " + population;
   }


    public void setNameList(List<String> nameList) {
        this.name = name;
    }

    public void setPopulationList(List<Integer> populationList) {
        this.population = population;
    }
}

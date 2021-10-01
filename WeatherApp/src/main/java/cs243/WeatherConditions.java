package cs243;

import java.util.List;

public class WeatherConditions {
    //The variables inside the WeatherConditions2 class, are names found in the API.
    //Main is going to be a Map of more properties
    class WeatherConditions2{
        Integer id;
        String name;
        String main;
    }
    // I am creating a  list of the data I am going to get from the API and it will be called weather
    // which is the name found in the API data retrieved.
    List<WeatherConditions2> weather;
//  Map<String, float>



    //These are two maps I am creating that have data inside another array coming from the API.
    //The class containing these two maps is declared below as "public class + name"
    public Main main;
    public Sys sys;

    // this is the property found inside the sys array.
    public String name;

    public class Main{
        public float temp;
        public float pressure;
        public float tempMin;
        public float tempMax;
    }

    public class Sys{
        public String name;
    }
}

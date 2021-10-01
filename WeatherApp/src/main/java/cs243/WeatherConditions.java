package cs243;

import java.util.List;

public class WeatherConditions {
    class WeatherConditions2{
        Integer id;
        String name;
        Main main;
    }

    List<WeatherConditions2> weather;
    public String name;
    public Main main;

    public class Main{
        public float temp;
        public float pressure;
        public float tempMin;
        public float tempMax;
    }
}

package cs243.models;

import java.util.ArrayList;
import java.util.List;

public class ForecastCity {
    public String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<WeatherForecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<WeatherForecast> forecasts) {
        this.forecasts = forecasts;
    }

    public List<WeatherForecast> forecasts = new ArrayList<>();
}

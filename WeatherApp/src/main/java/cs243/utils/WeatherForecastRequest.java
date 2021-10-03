package cs243.utils;

import cs243.models.WeatherConditions;
import cs243.parsers.WeatherForecastResponse;

public class WeatherForecastRequest extends MyHttpUtility {
    public WeatherForecastResponse makeRequest() {
        System.out.println("Making WeatherForecast Request");
        String cityUrl = super.getForecastUrl();
        System.out.println(cityUrl);
        String myWeather = super.readHTTP(cityUrl);
        System.out.println(myWeather);
        return gson.fromJson(myWeather, WeatherForecastResponse.class);
    }
}

package cs243.utils;

import cs243.models.WeatherConditions;

public class WeatherConditionsRequest extends MyHttpUtility {

    public WeatherConditions makeRequest() {
        System.out.println("Making WeatherConditions Request");
        String cityUrl = super.getWeatherUrl();
        System.out.println(cityUrl);
        String myWeather = super.readHTTP(cityUrl);
        System.out.println(myWeather);

        return gson.fromJson(myWeather, WeatherConditions.class);
    }
}

package cs243;

import com.google.gson.*;
import cs243.models.ForecastCity;
import cs243.models.WeatherConditions;
import cs243.models.WeatherForecast;
import cs243.parsers.ListItem;
import cs243.parsers.WeatherForecastResponse;
import cs243.utils.MyHttpUtility;
import cs243.utils.WeatherConditionsRequest;
import cs243.utils.WeatherForecastRequest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherTest {
    public static void main(String[] args) {
        makeWeatherConditionsRequest();
        makeWeatherForecastRequest();
        //makeWeatherForecastRequestForNCities();
    }

    public static void makeWeatherConditionsRequest() {
        WeatherConditionsRequest wc = new WeatherConditionsRequest();
        WeatherConditions first = wc.makeRequest();
        first.displayData();
    }

    public static void makeWeatherForecastRequest() {
        List<WeatherForecast> forecasts = new ArrayList<>();
        WeatherForecastRequest wf = new WeatherForecastRequest();
        WeatherForecastResponse response = wf.makeRequest();
        for (ListItem item: response.items) {
            if (forecasts.size() < 3) {

                Date date = new java.util.Date(item.datetime*1000L);

                String description = "";

                if (item.weatherList.size() > 0) {
                    description = item.weatherList.get(0).description;
                }

                forecasts.add(new WeatherForecast(
                        date,
                        item.measurement.temp,
                        description,
                        item.wind.speed
                ));
            }
        }

        System.out.println("Forecast items collected");
        System.out.println(forecasts.size());
        for (WeatherForecast item: forecasts) {
            System.out.println("time:" + item.date);
            System.out.println("temperature: " +item.temp);
            System.out.println("A description of the weather conditions: " + item.description);
            System.out.println("wind speed: "+item.windSpeed);
        }
    }

    public static void makeWeatherForecastRequestForNCities() {
        int cities = Integer.parseInt(JOptionPane.showInputDialog("give me cities"));
        List<ForecastCity> forecasts = new ArrayList<>();

        for (int i = 1; i < cities; i++) {
            WeatherForecastRequest wf = new WeatherForecastRequest();
            WeatherForecastResponse response = wf.makeRequest();
            ForecastCity f = new ForecastCity();
            f.setCity(wf.city);

            for (ListItem item: response.items) {
                if (f.forecasts.size() < 3) {

                    Date date = new java.util.Date(item.datetime*1000L);

                    String description = "";

                    if (item.weatherList.size() > 0) {
                        description = item.weatherList.get(0).description;
                    }

                    f.forecasts.add(new WeatherForecast(
                            date,
                            item.measurement.temp,
                            description,
                            item.wind.speed
                    ));
                }
            }

            forecasts.add(f);
        }

        for (ForecastCity f: forecasts) {
            System.out.println("city " + f.getCity());
            for (WeatherForecast item: f.forecasts) {
                System.out.println("time:" + item.date);
                System.out.println("temperature: " +item.temp);
                System.out.println("A description of the weather conditions: " + item.description);
                System.out.println("wind speed: "+item.windSpeed);
            }
        }


    }

}

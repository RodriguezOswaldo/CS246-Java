package cs243.utils;

import com.google.gson.Gson;
import cs243.models.WeatherConditions;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MyHttpUtility {
    public static String URL = "https://api.openweathermap.org/data/2.5/";
    public static String WEATHER = "weather";
    public static String FORECAST = "forecast";
    public static String KEY = "8d7178b81fed26ae734b0d4364f47036";
    public static Gson gson = new Gson();
    public String city;

    public String readHTTP(String url){
        try{
            URL urlObj = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
            BufferedReader r = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            StringBuilder data = new StringBuilder();
            String line;
            do{
                line = r.readLine();
                if (line != null){
                    data.append(line);
                }

            }while (line != null);

            return  data.toString();

        } catch (IOException e) {
            System.out.println("Error Reading HTTP DataL " + e);
            return null;
//            e.printStackTrace();
        }
    }

    public String getCity() {
        return JOptionPane.showInputDialog("give me the city: ");
    }

    public String buildUrl(String origin) {
        return URL.concat(origin) + "?q=";
    }

    public String appendApiKey(String url) {
        String apiKey = "&apiKey=".concat(KEY);
        return url.concat(apiKey);
    }

    public String getForecastUrl() {
        this.city = this.getCity();
        String base = this.buildUrl(FORECAST).concat(this.city);
        return this.appendApiKey(base);
    }

    public String getWeatherUrl() {
        this.city = this.getCity();
        String base = this.buildUrl(WEATHER).concat(this.city);
        return this.appendApiKey(base);
    }

}

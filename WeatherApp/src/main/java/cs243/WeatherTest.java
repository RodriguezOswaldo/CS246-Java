package cs243;
import com.google.gson.*;

import java.util.Map;

public class WeatherTest {
    //https://api.openweathermap.org/data/2.5/weather?q=Rexburg&apiKey=8d7178b81fed26ae734b0d4364f47036
    public static void main(String[] args){
        String myWeather;

        MyHttpUtility httpUtility = new MyHttpUtility();
        myWeather = httpUtility.readHTTP("https://api.openweathermap.org/data/2.5/weather?q=Rexburg&apiKey=8d7178b81fed26ae734b0d4364f47036");
        System.out.println(myWeather);
        //parsing
        gsonHttpReturn(myWeather);

    }
    public static void gsonHttpReturn(String strParse){
        Gson gson = new Gson();
        WeatherConditions we = gson.fromJson(strParse, WeatherConditions.class);
//        System.out.println("City id " +we.weather.get(0).id);
        System.out.println("Max Temperature " + we.main.tempMax);
        System.out.println("Min Temperature " + we.main.tempMin);
        System.out.println("Temperature " + we.main.temp);
        System.out.println("Pressure " + we.main.pressure);
        System.out.println("City name " + we.sys.name);
        System.out.println("Sys id " + we.sys.id);

    }
}

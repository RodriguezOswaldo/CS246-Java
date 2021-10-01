package cs243;

import com.google.gson.*;

public class Main {
    //https://api.openweathermap.org/data/2.5/weather?q=Rexburg&apiKey=8d7178b81fed26ae734b0d4364f47036
    public static void main(String[] args){
        String myWeather;

        MyHttpUtility httpUtility = new MyHttpUtility();
        myWeather = httpUtility.readHTTP("https://api.openweathermap.org/data/2.5/weather?q=Rexburg&apiKey=8d7178b81fed26ae734b0d4364f47036");
        System.out.println(myWeather);
        System.out.println(myWeather.coord);

    }
    public static void gsonHttpReturn(String strParse){
        Gson gson = new Gson();
        Weather we = gson.fromJson(strParse, Weather.class);
    }
}

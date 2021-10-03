package cs243.parsers;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListItem {
    @SerializedName("dt")
    public long datetime;
    @SerializedName("main")
    public MainTemperature measurement;

    @SerializedName("weather")
    public List<WeatherItem> weatherList;

    @SerializedName("wind")
    public Wind wind;
}

package cs243.parsers;

import com.google.gson.annotations.SerializedName;
import cs243.parsers.MainTemperature;

import java.util.List;

public class WeatherForecastResponse {
    @SerializedName("list")
    public List<ListItem> items;

}

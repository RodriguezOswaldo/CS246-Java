package cs243.models;
import java.util.Date;

public class WeatherForecast {
    public Date date;
    public float temp;
    public String description;
    public float windSpeed;

    public WeatherForecast(Date date, float temp, String description, float windSpeed) {
        this.date = date;
        this.temp = temp;
        this.description = description;
        this.windSpeed = windSpeed;
    }
}

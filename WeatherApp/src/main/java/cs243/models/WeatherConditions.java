package cs243.models;

import com.google.gson.annotations.SerializedName;
import cs243.parsers.MainTemperature;

public class WeatherConditions {
    public int id;
    public String name;

    @SerializedName("main")
    public MainTemperature measurement;

    public void displayData() {
        System.out.println("Max Temperature " + this.measurement.tempMax);
        System.out.println("Min Temperature " + this.measurement.tempMin);
        System.out.println("Temperature " + this.measurement.temp);
        System.out.println("Pressure " + this.measurement.pressure);
        System.out.println("City name " + this.name);
        System.out.println("id " + this.id);
        System.out.println(this.measurement.get());
    }


    // this is the property found inside the sys array.


}


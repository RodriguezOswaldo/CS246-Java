package cs243.parsers;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class MainTemperature {
    public float temp;
    public float pressure;

    @SerializedName("temp_min")
    public float tempMin;

    @SerializedName("temp_max")
    public float tempMax;

    public Map<String, Float> get() {
        Map<String, Float> values = new HashMap<String,Float>();
        values.put("temp_max", this.tempMax);
        values.put("temp_min", this.tempMin);
        values.put("pressure", this.pressure);
        values.put("temp", this.temp);
        return  values;
    }
}
package main.weather.model;

/**
 * Created by alix on 2017-07-25.
 */
public class Namwon {

    private int Namwon_location_code;
    private String location_engname;
    private String date;
    private float temp_avg;
    private float temp_max;
    private float temp_min;
    private float humidity_avg;
    private float ws_avg;
    private float rainfall;

    public Namwon() {
    }

    public Namwon(int namwon_location_code, String location_engname, String date, float temp_avg, float temp_max, float temp_min, float humidity_avg, float ws_avg, float rainfall) {
        Namwon_location_code = namwon_location_code;
        this.location_engname = location_engname;
        this.date = date;
        this.temp_avg = temp_avg;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.humidity_avg = humidity_avg;
        this.ws_avg = ws_avg;
        this.rainfall = rainfall;
    }

    public int getNamwon_location_code() {
        return Namwon_location_code;
    }

    public void setNamwon_location_code(int namwon_location_code) {
        Namwon_location_code = namwon_location_code;
    }

    public String getLocation_engname() {
        return location_engname;
    }

    public void setLocation_engname(String location_engname) {
        this.location_engname = location_engname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTemp_avg() {
        return temp_avg;
    }

    public void setTemp_avg(float temp_avg) {
        this.temp_avg = temp_avg;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getHumidity_avg() {
        return humidity_avg;
    }

    public void setHumidity_avg(float humidity_avg) {
        this.humidity_avg = humidity_avg;
    }

    public float getWs_avg() {
        return ws_avg;
    }

    public void setWs_avg(float ws_avg) {
        this.ws_avg = ws_avg;
    }

    public float getRainfall() {
        return rainfall;
    }

    public void setRainfall(float rainfall) {
        this.rainfall = rainfall;
    }

    @Override
    public String toString() {
        return "Namwon{" +
                "Namwon_location_code=" + Namwon_location_code +
                ", location_engname='" + location_engname + '\'' +
                ", date='" + date + '\'' +
                ", temp_avg=" + temp_avg +
                ", temp_max=" + temp_max +
                ", temp_min=" + temp_min +
                ", humidity_avg=" + humidity_avg +
                ", ws_avg=" + ws_avg +
                ", rainfall=" + rainfall +
                '}';
    }
}

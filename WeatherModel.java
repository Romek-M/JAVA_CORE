package lessons_2_8;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;
}

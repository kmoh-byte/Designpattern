package ca.bcit.comp2526.weather;

public interface WeatherState {
    public void next(Weather weather);
    public void back(Weather weather);
    public void showLogo();

}

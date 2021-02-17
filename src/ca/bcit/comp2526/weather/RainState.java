package ca.bcit.comp2526.weather;

public class RainState implements WeatherState {
    @Override
    /*Rain state is changed to cloudy state in the weather object*/
    public void next(Weather weather) {
        weather.setState(new CloudyState());
    }

    @Override
    /*RainState is changed to SunState*/
    public void back(Weather weather) {
        weather.setState(new SunState());
    }

    @Override
    public void showLogo() {
        System.out.println("Show rainy logo");
    }
}

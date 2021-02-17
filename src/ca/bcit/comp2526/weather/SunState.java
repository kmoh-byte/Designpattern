package ca.bcit.comp2526.weather;

public class SunState implements WeatherState {
    @Override
    /*SunState is changed to Rain state in the weather object*/
    public void next(Weather weather) {
        weather.setState(new RainState());
    }

    @Override
    /*SunState is changed to RainState*/
    public void back(Weather weather) {
        weather.setState(new CloudyState());
    }

    @Override
    public void showLogo() {
        System.out.println("Show sunny logo");
    }
}

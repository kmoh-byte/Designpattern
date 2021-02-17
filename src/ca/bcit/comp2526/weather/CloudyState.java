package ca.bcit.comp2526.weather;

public class CloudyState implements WeatherState {

    @Override
    /*Cloudy state is changed to sun state in the weather object*/
    public void next(Weather weather) {
        weather.setState(new SunState());
    }

    @Override
    /*CloudyState changes to RainState*/
    public void back(Weather weather) {
        weather.setState(new RainState());
    }

    @Override
    public void showLogo() {
        System.out.println("Show cloudy logo");
    }
}

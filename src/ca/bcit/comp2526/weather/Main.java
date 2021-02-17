package ca.bcit.comp2526.weather;

public class Main {

    public static void main(String[] args) {
        Weather weatherObj = new Weather();

        //start with rainy weather
        weatherObj.showWeatherLogo();

        weatherObj.nextWeatherState();
        weatherObj.showWeatherLogo();

        weatherObj.nextWeatherState();
        weatherObj.showWeatherLogo();

        weatherObj.nextWeatherState();
        weatherObj.showWeatherLogo();

        weatherObj.previousWeatherState();
        weatherObj.showWeatherLogo();
    }
}

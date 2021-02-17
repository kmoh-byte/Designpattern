package ca.bcit.comp2526.weather;

public class Weather {
    /* Sets an instance of the rain state class */
    private WeatherState state = new RainState();

    public void setState(WeatherState state) {
        this.state = state;
    }

    public WeatherState getState() {
        return this.state;
    }
    /*These three methods show the state design pattern in action*/
    /*The three methods depend on which weather state is used*/

    public void previousWeatherState() {
        state.back(this);
    }

    public void nextWeatherState() {
        state.next(this);
    }

    public void showWeatherLogo() {
        state.showLogo();
    }

}

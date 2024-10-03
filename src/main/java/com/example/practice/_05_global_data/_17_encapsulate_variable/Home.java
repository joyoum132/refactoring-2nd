package com.example.practice._05_global_data._17_encapsulate_variable;

public class Home {

    public static void main(String[] args) {
        //getter 나 setter 를 통해 접근
        System.out.println(Thermostats.getTargetTemperature());
        Thermostats.setTargetTemperature(68);
        Thermostats.setReadInFahrenheit(false);
    }
}

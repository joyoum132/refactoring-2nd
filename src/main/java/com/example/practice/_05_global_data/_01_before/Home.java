package com.example.practice._05_global_data._01_before;

public class Home {

    public static void main(String[] args) {
        System.out.println(Thermostats.targetTemperature);
        //말도 안되는 값으로 바꾸거나, 혹은 여기 저기서 값을 바꿔버릴 수 있음
        Thermostats.targetTemperature = -1111600;
        Thermostats.fahrenheit = false;
    }
}

package com.company;

public class Volkswagen extends Brand{

    public Volkswagen(AlarmSys alarmSys) {
        super(alarmSys);
    }

    @Override
    public void move() {
        System.out.println("На автомобиль марки Volkswagen ");
        alarmSys.setAlarmSys();
    }
}

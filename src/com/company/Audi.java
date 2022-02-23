package com.company;

public class Audi extends Brand{

    public Audi(AlarmSys alarmSys) {
        super(alarmSys);
    }

    @Override
    public void move() {
        System.out.println("На автомобиль марки Audi ");
        alarmSys.setAlarmSys();
    }
}
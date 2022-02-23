package com.company;

public abstract class Brand {

    protected AlarmSys alarmSys;

    public Brand(AlarmSys alarmSys) {
        this.alarmSys = alarmSys;
    }

    public abstract void move();
}

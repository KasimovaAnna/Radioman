package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setIncreaseCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation < 0) {
            this.currentRadioStation = 9;
        }
    }

    public void setSlowRadioStation() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= 0) {
            this.currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStationSwitch(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolumeMore(int currentVolume) {
        if (currentVolume > 10) {
            this.currentVolume = 10;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }

    }

    public void setCurrentVolumeDown0(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
    }

    public void setSlowCurrentVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}





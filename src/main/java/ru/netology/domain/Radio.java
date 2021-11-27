package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


    public void setIncreaseCurrentRadioStation() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }

    }

    public void setSlowRadioStation() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0) {
            this.currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStationSwitch(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation > 0 || currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation;
        }
    }
    public int getCurrentVolume (){
        return currentVolume;
    }
    public void setCurrentVolume (int currentVolume){
        this.currentVolume = currentVolume;
    }
    public void setIncreaseCurrentVolumeInPeriod (){
        if (currentVolume <10){
            this.currentVolume = currentVolume +1;
        }
    }
    public void setIncreaseCurrentVolumeMore10 (){
        if (currentVolume >10){
            this.currentVolume = 10;
        }
    }
    public void setSlowCurrentVolumeInPeriod (){
        if (currentVolume <10){
            this.currentVolume = currentVolume -1;
        }
    }
    public void setSlowCurrentVolumeDown0 (){
        if (currentVolume <0){
            this.currentVolume = 0;
        }
    }
}

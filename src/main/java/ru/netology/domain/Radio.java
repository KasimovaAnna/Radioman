package ru.netology.domain;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation () {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >9) {
           this.currentRadioStation = 0;
        }
        if (currentRadioStation <9) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation <0) {
            this.currentRadioStation = 9;
        }
    }
    public void slowRadioStation () {
        if (currentRadioStation <9) {
            this.currentRadioStation = currentRadioStation-1;
        }
        if (currentRadioStation <=0) {
            this.currentRadioStation = 9;
        }
    }
    public void setCurrentRadioStationSwitch (int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }


}





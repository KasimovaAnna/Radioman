package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int quntityRadioStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int quntityRadioStation) {
        this.quntityRadioStation = quntityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getQuntityRadioStation() {
        return quntityRadioStation;
    }

    public void setQuntityRadioStation(int quntityRadioStation) {
        if (quntityRadioStation < 1 || quntityRadioStation > 10) {
            this.quntityRadioStation = quntityRadioStation;
        }
    }

    public void setIncreaseCurrentRadioStation() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
    }

    public void setDecreaseCurrentRadioStation() {
        if (currentRadioStation <= 9) {
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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseCurrentVolume() {
        if (currentVolume > 100) {
            this.currentVolume = 100;
        }
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }


    }
    public void setSlowCurrentVolume () {
        if (currentVolume <100){
            this.currentVolume = currentVolume -1;
        }
        if (currentVolume <0) {
            this.currentVolume = 0;
        }
    }
}





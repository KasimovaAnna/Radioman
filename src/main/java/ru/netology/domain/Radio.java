package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int quntityRadioStation = 10;

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

    public void setQuntityRadioStation (int quntityRadioStation){
        if (quntityRadioStation < 1 || quntityRadioStation >10) {
            this.quntityRadioStation = quntityRadioStation;
        }
    }
    public void setIncreaseCurrentRadioStation (int currentRadioStation) {
        if (currentRadioStation >9) {
            this.currentRadioStation = 0;
        }
        if (currentRadioStation <9) {
            this.currentRadioStation = currentRadioStation +1;
        }
    }
    public void setDecreaseCurrentRadioStation (int currentRadioStation) {
        if (currentRadioStation <0) {
            this.currentRadioStation = 9;
        }
        if (currentRadioStation <=9) {
            this.currentRadioStation = currentRadioStation -1;
        }
    }
    public void setCurrentRadioStationSwitch (int currentRadioStation) {
        if (currentRadioStation >0 || currentRadioStation <9) {
            this.currentRadioStation = currentRadioStation;
        }
    }

}





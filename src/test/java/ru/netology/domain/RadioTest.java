package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldQuantityRadioStation3() {
        Radio radio = new Radio(3);
        radio.setQuntityRadioStation(3);
        int expected = 3;
        int actual = radio.getQuntityRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldQuantityRadioStationNotChoice() {
        Radio radio = new Radio(10);
        radio.setQuntityRadioStation(10);
        int expected = 10;
        int actual = radio.getQuntityRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentRadioStationMore9 () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.setIncreaseCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationDown0 () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.setDecreaseCurrentRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationSwitch () {
        Radio radio = new Radio();
        radio.setCurrentRadioStationSwitch (7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationOn4To5 () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.setIncreaseCurrentRadioStation();
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationOn3To2 () {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.setDecreaseCurrentRadioStation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseCurrentVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(58);
        radio.setIncreaseCurrentVolume();
        int expected = 59;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseCurrentVolumeMore100 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setIncreaseCurrentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSlowCurrentVolumeInPeriod () {
        Radio radio = new Radio();
        radio.setCurrentVolume(26);
        radio.setSlowCurrentVolume();
        int expected = 25;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldSlowCurrentVolumeDown0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setSlowCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationSwitchMoreMax () {
        Radio radio = new Radio();
        radio.setCurrentRadioStationSwitch (11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationSwitchDownMin () {
        Radio radio = new Radio();
        radio.setCurrentRadioStationSwitch (-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
}
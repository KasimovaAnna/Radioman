package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldQuantityRadioStation3() {
        Radio radio = new Radio(3);
        int expected = 3;
        int actual = radio.getQuntityRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldQuantityRadioStationNotChoice() {
        Radio radio = new Radio(10);
        int expected = 10;
        int actual = radio.getQuntityRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentRadioStationMore9 () {
        Radio radio = new Radio();
        radio.setIncreaseCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationDown0 () {
        Radio radio = new Radio();
        radio.setDecreaseCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationSwitch () {
        Radio radio = new Radio();
        radio.setCurrentRadioStationSwitch(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationOn4To5 () {
        Radio radio = new Radio();
        radio.setIncreaseCurrentRadioStation(4);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCurrentRadioStationOn3To2 () {
        Radio radio = new Radio();
        radio.setDecreaseCurrentRadioStation(3);
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
}
package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldRadioStationUpFrom2To3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        radio.setIncreaseCurrentRadioStation();
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(12);
        radio.setIncreaseCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldRadioStationReducer0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.setSlowRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationSlowInPeriod() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setSlowRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationReducerMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(12);
        radio.setIncreaseCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationSwitch() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationSwitch(6);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeIncreaseOn4To5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setIncreaseCurrentVolumeInPeriod();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeIncreaseMore10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.setIncreaseCurrentVolumeMore10();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setSlowCurrentVolumeDown0();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownOn7To6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.setSlowCurrentVolumeInPeriod();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
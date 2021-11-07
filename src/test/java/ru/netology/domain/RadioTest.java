package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldRadioStationUpFrom2To3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(100);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationReducer0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.slowRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationReducerInPeriod() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.slowRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationReducerMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(75);
        radio.slowRadioStation();
        int expected = 9;
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
        radio.setIncreaseVolume(4);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeIncreaseMore() {
        Radio radio = new Radio();

        radio.setCurrentVolumeMore(12);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown0() {
        Radio radio = new Radio();

        radio.setCurrentVolumeDown0(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownOn7To6() {
        Radio radio = new Radio();

        radio.setSlowCurrentVolume(7);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
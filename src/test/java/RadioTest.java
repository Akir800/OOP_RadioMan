import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2147483647,2147483647"})
    public void setRadioTest(int setStation, int expected) {
        Radio radio = new Radio(setStation);

        int actual = radio.getCountStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,-1", "1,0", "2147483647,2147483646"})
    public void setMaxRadioStationTest(int setStation, int expected) {
        Radio radio = new Radio(setStation);

        int actual = radio.getMaxCountStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "2147483647,2147483647"})
    public void setCountRadioStationTest(int setStation, int expected) {
        Radio radio = new Radio();

        radio.setCountStation(setStation);
        int actual = radio.getCountStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "10,11", "2147483647,-2147483648"})
    public void setNextTest(int setStation, int expected) {
        Radio radio = new Radio(setStation);

        radio.next();
        int actual = radio.getCountStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setNextNullTest() {
        Radio radio = new Radio();

        radio.setMaxCountStation(5);
        radio.setCountStation(5);
        radio.next();
        int actual = radio.getCountStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,-2", "1,0", "10,9", "-2147483648,2147483647"})
    public void setPrevtTest(int setStation, int expected) {
        Radio radio = new Radio(setStation);

        radio.prev();
        int actual = radio.getCountStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "2,3", "99,100", "101,101"})
    public void volumePlusTest(int setVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(setVolume);
        radio.volumePlus();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,0", "100,99", "101,100"})
    public void volumeMinusTest(int setVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(setVolume);
        radio.volumeMinus();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
public class Radio {
    private int countStation = 10;
    private int maxCountStation;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;


    public Radio() {

    }

    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxCountStation = calculateMaxStation();
    }

    public int calculateMaxStation() {
        return this.maxCountStation = this.countStation - 1;
    }

    public int setCountStation(int countStation) {
        return this.countStation = countStation;
    }

    //для тестового случая next() countStation == maxCountStation
    public void setMaxCountStation(int maxCountStation) {
        this.maxCountStation = maxCountStation;
    }

    public int next() {
        if (countStation == maxCountStation) {
            return this.countStation = 0;
        }
        return this.countStation = countStation + 1;
    }

    public void prev() {
        if (countStation == 0) {
            this.countStation = maxCountStation;
        }
        countStation--;
    }

    public int getCountStation() {
        return this.countStation;
    }

    public int getMaxCountStation() {
        return this.maxCountStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void volumePlus() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeMinus() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
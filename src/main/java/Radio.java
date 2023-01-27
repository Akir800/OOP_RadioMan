public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) { //Проверка и установка значения от 0 до 9
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() { //Получение значения
        return currentStation;
    }

    public void next() {
        if (currentStation == 9) { //Увеличение на +1
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() { //Уменьшение на -1
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int currentVolume) { //Проверка и установка значения от 0 до 10
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() { //Получение значения
        return currentVolume;
    }

    public void volumePlus() { // Увеличение +1 до 10
        if (currentVolume == 10) {
            return;
        }
        currentVolume++;
    }

    public void volumeMin() { // Уменьшение -1 до 0
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }

}

package ru.netology.domain;


public class Radio {
    private int amountRadioStation;
    private int currentNumberRadio;
    private int currentSoundVolume;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }




    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;

    }

    public Radio() {
    }

    public void setAmountRadioStation(int amountRadioStation) {
        if(amountRadioStation<0){
            return;
        }
        this.amountRadioStation = amountRadioStation;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > amountRadioStation) {
            return;

        }
        if (currentNumberRadio < 0) {
            return;
        }
        this.currentNumberRadio = currentNumberRadio;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }


    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int clickButtonNext() {
        if (currentNumberRadio == amountRadioStation) {
            return 0;
        }
        currentNumberRadio++;
        return currentNumberRadio;
    }

    public int clickButtonPrev() {
        if (currentNumberRadio == 0) {
            return amountRadioStation;
        }
        currentNumberRadio--;
        return currentNumberRadio;
    }




    public int inputNumberRadio(int number) {
        if(number>amountRadioStation || number<0){
            return currentNumberRadio;
        }
        currentNumberRadio=number;
        return currentNumberRadio;
    }


    public int changeVolumeSoundPlus() {
        if (currentSoundVolume == 100) {
            return currentSoundVolume;
        }
        currentSoundVolume++;
        return currentSoundVolume;
    }


    public int changeVolumeSoundMinus() {
        if (currentSoundVolume == 0) {
            return currentSoundVolume;
        }
        currentSoundVolume--;
        return currentSoundVolume;
    }
}


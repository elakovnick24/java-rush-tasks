package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 90;
    }

    @Override
    String getDescription() {
        return "Я - курица." + " Моя страна - " + Country.UKRAINE + ". " + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

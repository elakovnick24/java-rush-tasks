package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 70;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
       // return "Я - курица." + " Моя страна - " + Country.BELARUS + ". " + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

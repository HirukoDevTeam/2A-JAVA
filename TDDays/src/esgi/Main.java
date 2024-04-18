package esgi;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[ ] args){
        DataPair<Integer, Day>[] days = new DataPair[Day.values().length];

        int i = 0;
        for (Day day : Day.values()) {
            days[i] = new DataPair<>(i + 1, day);
            i++;
        }
        displayDaysWithNums(days, 0,-1,1,2,5,7,8);
    }

    public static void displayDaysWithNums(DataPair<Integer, Day>[] days, int... nums) {
        for (int num : nums) {
            for (DataPair<Integer, Day> dayPair : days) {
                if (dayPair.getNumero().equals(num)) {
                    System.out.println("Jour " + num + " : " + dayPair.getJours());
                }
            }
        }
    }
}
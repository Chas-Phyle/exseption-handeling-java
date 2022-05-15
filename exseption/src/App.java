//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String [] callSign = new String[8];
    Float [] frequency = new Float[8];
    // FMRadioStation first = new FMRadioStation("AAAA", 89.5f);
    // System.out.println(first);
    for(int i = 0; i < callSign.length; i++ ) {
        System.out.println("What is the call Sign of the Station?");
        callSign[i] = keyboard.next();
        System.out.println("What is the frequency of the station?");
        frequency[i] = keyboard.nextFloat();
        System.out.println("You have "+(callSign.length-i-1)+" left to go");
    }
    for(int i = 0 ; i < callSign.length; i++){
        String temp = callSign[i];
        Float temp2 = frequency[i];
        FMRadioStation fromArray = new FMRadioStation(temp, temp2);
        System.out.println(fromArray);
    }
    keyboard.close();
    FMRadioStation newStation = new FMRadioStation("AABC", 95);
    }
}

package com.company;

//Austin Roach
// CS141
//HW Core Topics: static methods, printlns

//This program outputs a cumulative song - the process was an exploration of redundancy and refactoring
public class CumulativeSong {

    public static void main(String[] args) {
	monday();
    tuesday();
    wednesday();
    thursday();
    friday();
    saturday();
    sunday();

    hungryChildren();
    }

    public static void hungryChildren() {
        System.out.println("All you hungry children, come and eat it up!");
        System.out.println();
    }

    public static void mondayBeans() {
        System.out.println("Monday, String Beans");
        hungryChildren();
    }

    public static void tuesdaySpaghetti() {
        System.out.println("Tuesday, Spaghetti");
        mondayBeans();
    }

    public static void wednesdayZoooop() {
        System.out.println("Wednesday, Zoooop");
        tuesdaySpaghetti();
    }

    public static void thursdayBeef() {
        System.out.println("Thursday, Roast Beef");
        wednesdayZoooop();
    }

    public static void fridayFish() {
        System.out.println("Friday, Fresh Fish");
        thursdayBeef();
    }

    public static void saturdayChicken() {
        System.out.println("Saturday, Chicken");
        fridayFish();
    }

    public static void sundayIcecream() {
        System.out.println("Sunday, Ice Cream");
        saturdayChicken();
    }

    public static void monday() {
        System.out.println("Today is Monday, Today is Monday");
        mondayBeans();
    }

    public static void tuesday() {
        System.out.println("Today is Tuesday, Today is Tuesday");
        tuesdaySpaghetti();
    }

    public static void wednesday() {
        System.out.println("Today is Wednesday, Today is Wednesday");
        wednesdayZoooop();
    }

    public static void thursday() {
        System.out.println("Today is Thursday, Today is Thursday");
        thursdayBeef();
    }

    public static void friday() {
        System.out.println("Today is Friday, Today is Friday");
        fridayFish();
    }

    public static void saturday() {
        System.out.println("Today is Saturday, Today is Saturday");
        saturdayChicken();
    }

    public static void sunday() {
        System.out.println("Today is Sunday, Today is Sunday");
        sundayIcecream();
    }

}

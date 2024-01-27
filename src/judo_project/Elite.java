/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judo_project;

public class Elite {

    private String name;
    private double weight;
    private int vipSession;
    private int competition;
    private String weightCateg;

    public Elite(String name, double weight, int vipSession, 
            int competition, String weightCateg) {
        this.name = name;
        this.weight = weight;
        this.vipSession = vipSession;
        this.competition = competition;
        this.weightCateg = weightCateg;
    }

    public double calc_training_cost() {
        return 4 * 35.00;
    }

    public double calc_personal_cost() {
        return vipSession * 9.50;
    }

    public double calc_competition_cost() {
        return competition * 22.00;
    }

    public double total_cost() {
        return (calc_training_cost() + calc_personal_cost()
                + calc_competition_cost());
    }

    public void select_categ_weight() {
        if (weight <= 66) {
            weightCateg = "Flyweight";
        } else if (weight <= 73) {
            weightCateg = "Lightweight";
        } else if (weight <= 81) {
            weightCateg = "Light-Middleweight";
        } else if (weight <= 90) {
            weightCateg = "Middleweight";
        } else if (weight <= 100) {
            weightCateg = "Light-Heavyweight";
        } else {
            weightCateg = "Heavyweight";
        }
    }
    public String get_categ_weight(){
        return weightCateg;
    }
}

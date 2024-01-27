/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judo_project;

public class Intermediate {

    private String name;
    private double weight;
    private int vipSession;
    private int competition;
    private String weightCateg;

    public Intermediate(String name, double weight, int vipSession,
            int competition, String weightCateg) {
        this.name = name;
        this.weight = weight;
        this.vipSession = vipSession;
        this.competition = competition;
        this.weightCateg = weightCateg;
    }

    public double calc_training_cost() {
        return 4 * 30.00;
    }

    public double calc_personal_cost() {
        return vipSession * 9.50;
    }

    public double calc_competition_cost() {
        return competition * 22.00;
    }

    public double total_cost() {
        return (calc_training_cost() + calc_personal_cost() + calc_competition_cost());
    }

    public void select_categ_weight() {
        if (weight <= 66) {
            weightCateg = "Fly Weight";
        } else if (weight <= 77) {
            weightCateg = "Light Weight";
        } else if (weight <= 88) {
            weightCateg = "Light Middle Weight";
        } else if (weight <= 90) {
            weightCateg = "Middle Weight";
        } else if (weight <= 100) {
            weightCateg = "Light Heavy Weight";
        } else {
            weightCateg = "Heavy Weight";
        }

    }

    public String set_categ_weight() {
        return weightCateg;
    }
}

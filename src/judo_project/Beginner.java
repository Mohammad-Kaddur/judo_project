/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judo_project;

public class Beginner {

    private String name;
    private double weight;
    private int vipSession;

    public Beginner(String name, double weight, int vipSession) {
        this.name = name;
        this.weight = weight;
        this.vipSession = vipSession;
    }

    public double calc_training_cost() {
        return 4 * 25.00;
    }

    public double calc_personal_cost() {
        return vipSession * 9.50;
    }

    public double total_cost() {
        return (calc_training_cost() + calc_personal_cost());
    }

}

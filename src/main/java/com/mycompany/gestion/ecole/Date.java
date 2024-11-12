/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion.ecole;

/**
 *
 * @author souis
 */
public class Date {
    private int jour;
    private int mois;
    private int annee;

    // Constructeur
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    // Getters et setters
    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // MÃ©thode pour afficher la date sous un format lisible
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", jour, mois, annee);
    }

    // MÃ©thode pour comparer deux dates (ex : savoir si une date est antÃ©rieure Ã  une autre)
    public boolean estAvant(Date autreDate) {
        if (this.annee < autreDate.annee) return true;
        if (this.annee == autreDate.annee && this.mois < autreDate.mois) return true;
        return this.annee == autreDate.annee && this.mois == autreDate.mois && this.jour < autreDate.jour;
    }
}

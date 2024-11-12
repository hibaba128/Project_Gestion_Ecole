/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnes;

/**
 *
 * @author souis
 */
public class Absence {
  private String idAbsence ;
    
private Date date;
 private Cours cours;

    public Absence(String idAbsence, Date  date, String motif, Cours cours) {
        this.idAbsence = idAbsence;
        this.date = date;
        this.cours = cours;
    }

    public Date getDate() {
        return date;
    }

    

    public Cours getCours() {
        return cours;
    }

    @Override
    public String toString() {
        return "Absence le " + date + " pour le cours " + cours.getTitreCours() + " - Motif : " + motif;
    }
}


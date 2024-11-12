/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnes;
import com.mycompany.gestion.ecole.Date;
import matiere.cours;

/**
 *
 * @author souis
 */
public class Absence {
  private String idAbsence ;
    private String motif;
private Date date;
 private cours cours;

    public Absence(String idAbsence, Date  date, String motif, cours cours) {
        this.idAbsence = idAbsence;
        this.date = date;
        this.cours = cours;
    }

    public Date getDate() {
        return date;
    }

    

    public cours getCours() {
        return cours;
    }

    @Override
    public String toString() {
        return "Absence le " + date + " pour le cours " + cours.getTitreCours() + " - Motif : " + motif;
    }
}


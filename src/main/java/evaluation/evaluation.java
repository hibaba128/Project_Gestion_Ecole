/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluation;
import matiere.matiere;

/**
 *
 * @author souis
 */
import java.util.Date;

public class evaluation {
    private int idEvaluation;           // Identifiant unique pour chaque évaluation
    private Date dateEvaluation;        // Date de l'évaluation
    private matiere matiereEvaluation;  // Matière de l'évaluation

    // Constructeur
    public evaluation(int idEvaluation, Date dateEvaluation, matiere matiereEvaluation) {
        this.idEvaluation = idEvaluation;
        this.dateEvaluation = dateEvaluation;
        this.matiereEvaluation = matiereEvaluation;
    }

    // Getters et Setters
    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public matiere getMatiereEvaluation() {
        return matiereEvaluation;
    }

    public void setMatiereEvaluation(matiere matiereEvaluation) {
        this.matiereEvaluation = matiereEvaluation;
    }

    // Méthode toString pour afficher une description de l'évaluation
    @Override
    public String toString() {
        return "ID de l'évaluation: " + idEvaluation + "\n" +
               "Date de l'évaluation: " + dateEvaluation + "\n" +
               "Matière de l'évaluation: " + matiereEvaluation;
    }
}

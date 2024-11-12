/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnes;

/**
 *
 * @author souis
 */
import java.util.ArrayList;

public class Enseignant extends Personne {
    private String specialite;
    private ArrayList<matiere> listeMatieresEnseignes; // Remplacez `matieres` avec `String` si `matieres` n'est pas dÃ©fini

    // Constructeur
    public Enseignant(String id, String nom, String prenom, String email, String specialite) {
        super(id, nom, prenom, email); // Appel au constructeur de la classe parente `Personne`
        this.specialite = specialite;
        this.listeMatieresEnseignes = new ArrayList<>(); // Initialisation de la liste
    }

    // Getter et setter pour la spÃ©cialitÃ©
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    // MÃ©thode pour ajouter un cours enseignÃ©
    public void ajouterMatiere(matiere m) {
        listeMatieresEnseignes.add(m);
    }
    
   
    

    // MÃ©thode pour afficher la liste des cours enseignÃ©s
    public void afficherMatiereEnseignes() {
        System.out.println("Matiere enseignÃ©s par " + getNom() + " " + getPrenom() + " : " + listeMatieresEnseignes);
    }
}

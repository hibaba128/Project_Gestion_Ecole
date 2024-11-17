/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matiere;
import personnes.Etudiant ;
        /**
 *
 * @author souis
 */
import java.util.ArrayList;
import java.util.List;

public class classe {
    private int idClasse;
    private String nomClasse;
    private List<Etudiant> listeEtudiants;

    // Constructeur
    public classe(int idClasse, String nomClasse) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
        this.listeEtudiants = new ArrayList<>();
    }

    // Méthode pour ajouter un étudiant à la liste
    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    // Getters et Setters
    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public List<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    @Override
    public String toString() {
        return "Classe " + nomClasse + " (ID: " + idClasse + "), Nombre d'étudiants: " + listeEtudiants.size();
    }
}


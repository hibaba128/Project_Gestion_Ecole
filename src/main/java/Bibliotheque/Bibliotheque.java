/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bibliotheque;
import personnes.Etudiant ;
import java.util.ArrayList ;

/**
 *
 * @author user
*/
    

    public class Bibliotheque implements Gestionnaire<Livre> {
    private String idBibliotheque;
    private String nom;
    private ArrayList<Livre> livresDisponibles;
    private ArrayList<Etudiant> listeEtudiants;

    public Bibliotheque(String idBibliotheque, String nom) {
        this.idBibliotheque = idBibliotheque;
        this.nom = nom;
        this.livresDisponibles = new ArrayList<>();
        this.listeEtudiants = new ArrayList<>();
    }

    // Méthodes pour gérer les livres
    @Override
    public void ajouter(Livre livre) {
        livresDisponibles.add(livre);
    }

    @Override
    public void supprimer(Livre livre) {
        if (livresDisponibles.remove(livre)) {
            System.out.println("Livre supprimé : " + livre.getTitre());
        } else {
            System.out.println("Le livre n'existe pas dans la bibliothèque.");
        }
    }

    @Override
    public void afficher() {
        System.out.println("Livres disponibles dans la bibliothèque " + nom + " :");
        for (Livre livre : livresDisponibles) {
            System.out.println(livre);
        }
    }

    // Gérer les étudiants
    public void inscrireEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    public void emprunterLivre(Livre livre, Etudiant etudiant) {
        if (livresDisponibles.contains(livre)) {
            System.out.println(etudiant.getNom() + " a emprunté le livre : " + livre.getTitre());
            livresDisponibles.remove(livre);
        } else {
            System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible.");
        }
    }

    public void afficherEtudiantsInscrits() {
        System.out.println("Étudiants inscrits à la bibliothèque : ");
        for (Etudiant e : listeEtudiants) {
            System.out.println(e.getNom() + " " + e.getPrenom());
        }
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "idBibliotheque='" + idBibliotheque + '\'' +
                ", nom='" + nom + '\'' +
                ", livresDisponibles=" + livresDisponibles +
                ", listeEtudiants=" + listeEtudiants +
                '}';
    }
}

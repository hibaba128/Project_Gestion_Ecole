/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnes;
import matiere.matiere;
import matiere.cours; 
import matiere.certificat; 
        

/**
 *
 * @author souis
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class administrateur {
    private ArrayList<Etudiant> listeEtudiants;
    private ArrayList<Enseignant> listeProfesseurs;
    private ArrayList<matiere> listeMatieres;
    private Map<Integer, ArrayList<cours>> mapCoursParMatiere;
    private ArrayList<certificat> listeCertificats;

    // Constructeur
    public administrateur() {
        this.listeEtudiants = new ArrayList<>();
        this.listeProfesseurs = new ArrayList<>();
        this.listeMatieres = new ArrayList<>();
        this.mapCoursParMatiere = new HashMap<>();
        this.listeCertificats = new ArrayList<>();
    }

    // Getters et Setters
    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public ArrayList<Enseignant> getListeProfesseurs() {
        return listeProfesseurs;
    }

    public void setListeProfesseurs(ArrayList<Enseignant> listeProfesseurs) {
        this.listeProfesseurs = listeProfesseurs;
    }

    public ArrayList<matiere> getListeMatieres() {
        return listeMatieres;
    }

    public void setListeMatieres(ArrayList<matiere> listeMatieres) {
        this.listeMatieres = listeMatieres;
    }

    public Map<Integer, ArrayList<cours>> getMapCoursParMatiere() {
        return mapCoursParMatiere;
    }

    public void setMapCoursParMatiere(Map<Integer, ArrayList<cours>> mapCoursParMatiere) {
        this.mapCoursParMatiere = mapCoursParMatiere;
    }

    public ArrayList<certificat> getListeCertificats() {
        return listeCertificats;
    }

    public void setListeCertificats(ArrayList<certificat> listeCertificats) {
        this.listeCertificats = listeCertificats;
    }

    // Méthodes pour gérer les données
    public void ajouterEtudiant(Etudiant etudiant) {
        this.listeEtudiants.add(etudiant);
    }

    public void ajouterProfesseur(Enseignant professeur) {
        this.listeProfesseurs.add(professeur);
    }

    public void ajouterMatiere(matiere matiere) {
        this.listeMatieres.add(matiere);
    }

    public void ajouterCoursPourMatiere(int idMatiere, cours cours) {
        this.mapCoursParMatiere.computeIfAbsent(idMatiere, k -> new ArrayList<>()).add(cours);
    }

    public void ajouterCertificat(certificat certificat) {
        this.listeCertificats.add(certificat);
    }
}


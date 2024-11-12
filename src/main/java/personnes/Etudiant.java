/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnes;
import matiere.cours;
import matiere.matiere;

/**
 *
 * @author souis
 */
import java.util.ArrayList;

public class Etudiant extends Personne {
    private String niveauEtudes;
    private ArrayList<cours> listeCoursInscrits;
    private ArrayList<matiere> listeCertificats;
    private ArrayList<Absence> listeAbssences ;

    public Etudiant(String id, String nom, String prenom, String email, String niveauEtudes) {
        super(id, nom, prenom, email); // Appel au constructeur de Personne
        this.niveauEtudes = niveauEtudes;
        this.listeCoursInscrits = new ArrayList<>(); // Initialisation des listes
        this.listeCertificats = new ArrayList<>();
        this.listeAbssences=new ArrayList();
    }

    public String getNiveauEtudes() {
        return niveauEtudes;//gg
    }

    public void inscrireCours(cours c) {
        listeCoursInscrits.add(c);
    }

   /* public void ajouterCertificat(certificat ce) {
        listeCertificats.add(ce);
    }*/
public void ajouterAbsence(Absence a){
    listeAbssences.add(a) ;
}
    public void afficherCoursInscrits() {
        System.out.println("Cours inscrits : " + listeCoursInscrits);
    }

    public void afficherCertificats() {
        System.out.println("Certificats : " + listeCertificats);
    }
    public void afficherAbsences() {
        System.out.println("les Absences : " + listeAbssences);
    }
}
///YA HIBAA ZID TOSTRINGGG
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestion.ecole;
import evaluation.Resultat;
import evaluation.examen;
import evaluation.test;
import java.util.Arrays;
import java.util.List;
import matiere.cours;
import personnes.Enseignant;
import personnes.Etudiant; 
import matiere.matiere;
import personnes.Absence;
import personnes.administrateur;

/**
 *
 * @author souis
 */
////LES INTERFACES FONCTIONELLES ET L EXPRESSION LAMBDA MA FHEMT WELOU 

public class GestionEcole {

    public static void main(String[] args) {
        /*Etudiant e1 = new Etudiant ("123","Dupont", "Marie","osfpiji@gmail","proff");
        Etudiant e3= new Etudiant("1234","ahmed", "saleh ","osfpiji@gmail","proff");
         Etudiant e2= new Etudiant ("14","ferdaws", "ines ","osfpiji@gmail","proff");
         Absence a = new Absence("120");
         Absence a2 = new Absence("112");
         Absence a3 = new Absence("142");
         Absence a4 = new Absence("127");
         Absence a5 = new Absence("1212");
         Absence a6 = new Absence("1112");
         
         e1.ajouterAbsence(a);
         e1.ajouterAbsence(a6);
         e1.ajouterAbsence(a2);
         
         
        e2.ajouterAbsence(a3);
        e2.ajouterAbsence(a4);
        e2.ajouterAbsence(a5);
        e2.ajouterAbsence(a2);
        
        administrateur admin = new administrateur ( );
        admin.ajouterEtudiant(e1);
        admin.ajouterEtudiant(e2);
        admin.ajouterEtudiant(e3);
        
        admin.afficherEtudiantsAvecAbsences(1);*/
        //tester l'enumeration 
         matiere matiere1 = new matiere("Mathématiques", 3); // Exemple de classe matière
        matiere matiere2 = new matiere("Physique", 2);

        List<cours> chapitres = Arrays.asList(new cours("Chapitre 1"), new cours("Chapitre 2")); // Exemple de cours

        examen exam1 = new examen(15, null, matiere1, (float) 0.75, chapitres);
        test test1 = new test(12,null, matiere2, "Interrogation", 2, new cours("Chapitre 3"));

        // Création de l'objet résultat
        Resultat resultat = new Resultat();

        // Ajouter les évaluations
        resultat.ajouterEvaluation(exam1);
        resultat.ajouterEvaluation(test1);

        // Afficher les résultats
        resultat.afficherResultats();
    }
  
       
        
        
    }


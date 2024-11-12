/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestion.ecole;
import matiere.cours;
import personnes.Enseignant;

/**
 *
 * @author souis
 */
public class GestionEcole {

    public static void main(String[] args) {
        Enseignant enseignant1 = new Enseignant("123","Dupont", "Marie","osfpiji@gmail","proff");
        cours cours1 = new cours("Mathématiques", enseignant1);
         System.out.println(cours1);
        
    }
}

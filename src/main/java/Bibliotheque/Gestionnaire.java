/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bibliotheque;

/**
 *
 * @author user
 */
public interface Gestionnaire<T> {
     void ajouter(T objet);
    void supprimer(T objet);
    void afficher();
}

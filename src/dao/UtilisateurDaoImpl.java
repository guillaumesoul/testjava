package dao;

import beans.Test;

public class UtilisateurDaoImpl implements UtilisateurDao {
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    @Override
    public Test trouver( String email ) throws DAOException {
        return null;
    }

    /* Implémentation de la méthode creer() définie dans l'interface UtilisateurDao */
    @Override
    public void creer( Test utilisateur ) throws IllegalArgumentException, DAOException {
    }
}

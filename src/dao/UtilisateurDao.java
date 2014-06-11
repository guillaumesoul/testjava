package dao;

import beans.Test;

public interface UtilisateurDao {

    void creer( Test test ) throws DAOException;

    Test trouver( String email ) throws DAOException;

}


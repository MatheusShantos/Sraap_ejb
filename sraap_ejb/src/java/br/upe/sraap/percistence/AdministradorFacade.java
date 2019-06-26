/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upe.sraap.percistence;

import br.upe.sraap.entities.Administrador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matheus
 */
@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador> {

    @PersistenceContext(unitName = "sraap_ejbPU")
    private EntityManager em;

    private EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("administradores");

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministradorFacade() {
        super(Administrador.class);
    }

    public Administrador getUsuario(String email, String senha) {

        try {
            Administrador adm = (Administrador) em
                    .createQuery(
                            "SELECT a FROM Administrador a WHERE a.senha = :senha AND a.email = :email")
                    .setParameter("name", email)
                    .setParameter("senha", senha).getSingleResult();

            return adm;
        } catch (NoResultException e) {
            return null;
        }
    }
}

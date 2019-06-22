/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upe.sraap.session;

import br.upe.sraap.entities.Turma;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matheus
 */
@Stateless
public class TurmaFacade extends AbstractFacade<Turma> {

    @PersistenceContext(unitName = "sraap_ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TurmaFacade() {
        super(Turma.class);
    }
    
}

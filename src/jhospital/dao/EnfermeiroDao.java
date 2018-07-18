/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jhospital.dao.exceptions.NonexistentEntityException;
import jhospital.dao.exceptions.PreexistingEntityException;
import jhospital.model.Enfermeiro;

/**
 *
 * @author Rebecca
 */
public class EnfermeiroDao implements Serializable {

    public EnfermeiroDao(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Enfermeiro enfermeiro) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(enfermeiro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEnfermeiro(enfermeiro.getId()) != null) {
                throw new PreexistingEntityException("Enfermeiro " + enfermeiro + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Enfermeiro enfermeiro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            enfermeiro = em.merge(enfermeiro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = enfermeiro.getId();
                if (findEnfermeiro(id) == null) {
                    throw new NonexistentEntityException("The enfermeiro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Enfermeiro enfermeiro;
            try {
                enfermeiro = em.getReference(Enfermeiro.class, id);
                enfermeiro.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The enfermeiro with id " + id + " no longer exists.", enfe);
            }
            em.remove(enfermeiro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Enfermeiro> findEnfermeiroEntities() {
        return findEnfermeiroEntities(true, -1, -1);
    }

    public List<Enfermeiro> findEnfermeiroEntities(int maxResults, int firstResult) {
        return findEnfermeiroEntities(false, maxResults, firstResult);
    }

    private List<Enfermeiro> findEnfermeiroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Enfermeiro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Enfermeiro findEnfermeiro(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Enfermeiro.class, id);
        } finally {
            em.close();
        }
    }

    public int getEnfermeiroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Enfermeiro> rt = cq.from(Enfermeiro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

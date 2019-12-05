package dev.mior.esconsultorio.dao;

import dev.mior.esconsultorio.entity.Consultorio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * 
 * @author Mior
 * @param <T> 
 */
public class EntityDAO<T> implements Serializable {

    public static Consultorio consultorio = new Consultorio(251L, "Fabiano Consultório Odontológico", "sfabiano", "Axxxxxhiqqu");
    public static EntityManagerFactory EMF;
    private final Class<T> clazz;
    
    public EntityDAO(Class<T> clazz) {
        this.clazz = clazz;
    }

    public EntityManager getEntityManager() {
        return EMF.createEntityManager();
    }

    public void create(T objeto) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(T objeto) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            T objeto = em.find(clazz, id);
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void destroy(T objeto) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(objeto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }    

    public List<T> findEntities() {
        return findEntities(true, -1, -1);
    }

    public List<T> findEntities(int maxResults, int firstResult) {
        return findEntities(false, maxResults, firstResult);
    }

    private List<T> findEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(clazz));
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

    public T findEntity(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(clazz, id);
        } finally {
            em.close();
        }
    }
    
    public T findEntityByColumn(String column, String value) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("FROM " + clazz.getSimpleName() + " o WHERE o." + column + " = '" + value + "'");
            return (T) q.getSingleResult();
        } catch (Throwable e) {
            return null;
        } finally {
            em.close();
        }
    }

    public int getEntityCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<T> rt = cq.from(clazz);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
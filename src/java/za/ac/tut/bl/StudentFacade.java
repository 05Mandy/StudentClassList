/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Student;

/**
 *
 * @author mandy
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "ABCCompanyEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> findYoungest() {

        Query query = em.createQuery("SELECT s FROM Student s WHERE s.age=(SELECT MIN(s.age) FROM Student s)");
        List<Student> list = (List<Student>) query.getResultList();

        return list;
    }

    @Override
    public Double averageAgeMales() {

        Query query = em.createQuery("SELECT AVG(s.age) FROM Student s WHERE s.gender = 'M'");
        Double avg = (Double) query.getSingleResult();

        return avg;
    }

    @Override
    public Double averageAgeFemales() {

        Query query = em.createQuery("SELECT AVG(s.age) FROM Student s WHERE s.gender = 'F'");
        Double avg = (Double) query.getSingleResult();

        return avg;
    }

    @Override
    public Long countTotalNumOfFemales() {
        
        Query query = em.createQuery("SELECT COUNT(s.gender) FROM Student s WHERE s.gender = 'F'");
        Long count = (Long) query.getSingleResult();

        return count;
    }

    @Override
    public Long countTotalNumOfMales() {
        
        Query query = em.createQuery("SELECT COUNT(s.gender) FROM Student s WHERE s.gender = 'M'");
        Long count = (Long) query.getSingleResult();

        return count;
    }

    @Override
    public Long countTotalNumOfStudents() {
       
        Query query = em.createQuery("SELECT COUNT(s.gender) FROM Student s");
        Long tot = (Long) query.getSingleResult();

        return tot;
    }
}

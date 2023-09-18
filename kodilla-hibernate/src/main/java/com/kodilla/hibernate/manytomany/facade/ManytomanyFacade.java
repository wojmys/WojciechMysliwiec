package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManytomanyFacade {

    private final EntityManager entityManager;

    @Autowired
    public ManytomanyFacade(EntityManager entityManager) {

        this.entityManager = entityManager;
    }

    public List<Company> findCompanyByNameFragment(String fragment) {

        TypedQuery<Company> namedQuery =
                entityManager.createNamedQuery("Company.findCompaniesContainingFragment", Company.class);
        namedQuery.setParameter("ARG", fragment);
        return namedQuery.getResultList();
    }

    public List<Employee> findEmployeesWithLastnameFragment(String fragment) {

        TypedQuery<Employee> namedQuery =
                entityManager.createNamedQuery("Employee.findEmployeesWithFragment", Employee.class);
        namedQuery.setParameter("ARG", fragment);
        return namedQuery.getResultList();
    }
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ManytomanyFacadeTest {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ManytomanyFacade manytomanyFacade;

    @Test
    void shouldReturnOneCompanyResult() {

        //given
        Company softwareMachine = new Company("Software Machine");
        companyDao.save(softwareMachine);
        int softId = softwareMachine.getId();
        Company dataMasters = new Company("Data Masters");
        companyDao.save(dataMasters);
        int dataId = dataMasters.getId();
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(greyMatter);
        int greyId = greyMatter.getId();

        //when
        List<Company> result = manytomanyFacade.findCompanyByNameFragment("ste");

        //then

        try {
            assertEquals(1, result.size());
            assertEquals(dataId, result.get(0).getId());
        } finally {
            companyDao.deleteById(softId);
            companyDao.deleteById(dataId);
            companyDao.deleteById(greyId);
        }
    }

    @Test
    void shouldReturnOneEmployeeResult() {

        //given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        int johnId = johnSmith.getId();
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        employeeDao.save(stephanieClarckson);
        int stephId = stephanieClarckson.getId();
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(lindaKovalsky);
        int lindaId = lindaKovalsky.getId();

        //when
        List<Employee> result = manytomanyFacade.findEmployeesWithLastnameFragment("val");

        //then
        try {
            assertEquals(1, result.size());
            assertEquals(lindaId, result.get(0).getId());
        } finally {
            employeeDao.deleteById(johnId);
            employeeDao.deleteById(stephId);
            employeeDao.deleteById(lindaId);
        }
    }
}
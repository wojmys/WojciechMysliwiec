//package com.kodilla.hibernate.manytomany.dao;
//
//import com.kodilla.hibernate.manytomany.Company;
//import com.kodilla.hibernate.manytomany.Employee;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class CompanyDaoTestSuite {
//
//    @Autowired
//    private CompanyDao companyDao;
//
//    @Autowired
//    private EmployeeDao employeeDao;
//
//    @Test
//    void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//        int johnSmithID = johnSmith.getId();
//        int stephanieClarcksonID = stephanieClarckson.getId();
//        int lindaKovalskyID = lindaKovalsky.getId();
//
//
//        //Then
//        assertNotEquals(0, softwareMachineId);
//        assertNotEquals(0, dataMaestersId);
//        assertNotEquals(0, greyMatterId);
//
//        //   CleanUp
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//            employeeDao.deleteById(johnSmithID);
//            employeeDao.deleteById(stephanieClarcksonID);
//            employeeDao.deleteById(lindaKovalskyID);
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//
//    @Test
//    void testRetrieveEmployeeByLastname() {
//
//        //given
//        Employee johnBrown = new Employee("John", "Brown");
//        Company softwareMachine = new Company("Software Machine");
//        softwareMachine.getEmployees().add(johnBrown);
//        //when
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        int johnBrownID = johnBrown.getId();
//
//        List<Employee> retrieveEmployeeByLastname = employeeDao.retrieveEmployeeByLastname("Brown");
//
//        //then
//        assertEquals(1, retrieveEmployeeByLastname.size());
//
//        //cleanUp
//        companyDao.deleteById(softwareMachineId);
//        employeeDao.deleteById(johnBrownID);
//
//
//    }
//
//    @Test
//    void testRetrieveCompanyByFirst3Characters() {
//
//        //given
//        Employee johnSmith = new Employee("John", "Smith");
//        Company softwareMachine = new Company("Xyz Software");
//        softwareMachine.getEmployees().add(johnSmith);
//        //when
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        int johnSmithID = johnSmith.getId();
//        List<Company> retrieveCompanyByFirst3Characters = companyDao.retrieveCompanyByFirst3Characters("Xyz");
//
//        //then
//        assertEquals(1, retrieveCompanyByFirst3Characters.size());
//
//        //cleanUp
//        companyDao.deleteById(softwareMachineId);
//        employeeDao.deleteById(johnSmithID);
//
//    }
//}
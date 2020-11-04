package tn.esprit.spring;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tn.esprit.spring.services.DepartementServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DepartementServicemplTest {

	@Autowired
	IDepartementService ds ; 	
	@Autowired
	IEntrepriseService en ; 

	DepartementServiceImpl depart = new DepartementServiceImpl ();

	@Test
	public void testgetalldepartement() {
		/*Departement dept = new Departement("TestDept");
    	int deptAdded = en.ajouterDepartement(dept); 
    	List<Departement> listeDep = new ArrayList<>();
    	Departement depTest = ds.getDepartementById(deptAdded);
    	 listeDep.add(depTest);
    	 System.out.println(listeDep.toString());
    	assertEquals(1, listeDep.size());*/
		Departement dept1 = new Departement("TestDept");
    	Departement dept4 = new Departement("TestDept");
    	Departement dept2 = new Departement("TestDept");
    	Departement dept3 = new Departement("TestDept");
    	/*int deptAdded = en.ajouterDepartement(dept1); 
    	int deptAdded1 = en.ajouterDepartement(dept2); 
    	int deptAdded2 = en.ajouterDepartement(dept3); 
    	int deptAdded3 = en.ajouterDepartement(dept4); */

	List<Departement> listeDep = new ArrayList<>();
    	listeDep = ds.getAllDepartements();
    	 
    	listeDep.clear();
    	System.out.println("//////////////////"+listeDep.size());
    	assertEquals(4, listeDep.size());
    	
	}
}

package tn.esprit.spring.services;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {

	private static final Logger l = Logger.getLogger(EntrepriseServiceImpl.class);

	@Autowired
	DepartementRepository deptRepoistory;


	public List<Departement> getAllDepartements() {
		try {
			l.info("In getAllDepartements() : ");
			l.debug("Je vais recuperer les departements.");
		
				
				
				l.debug("Je viens de recuperer les departements.");
				l.info("Out getAllDepartements() without errors.");
}
		catch (Exception e) {
				l.error("erreur de recuperer les departements "+e);
		}
		
		return (List<Departement>) deptRepoistory.findAll();
	}

}

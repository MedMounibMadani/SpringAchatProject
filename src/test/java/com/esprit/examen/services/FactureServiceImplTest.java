package com.esprit.examen.services;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.SpringExtension;
import com.esprit.examen.entities.Fature;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FactureServiceImplTest {
	@Autowired
	IFactureService factureService;
	
	@Test
	public void testAddStock() {
		List<Facture> factures = factureService.retrieveAllFactures();
		int expected=factures.size();
		Facture fac = new Facture(50.89f,10.77f,false);
	 	Facture savedFacture = factureService.addFacture(fac);
		
		assertEquals(expected+1, factureService.retrieveAllFactures().size());
	 	assertNotNull(savedFacture.getMontantFacture());
	 	factureService.deleteById(savedFacture.getIdFacture());
		
	} 

}

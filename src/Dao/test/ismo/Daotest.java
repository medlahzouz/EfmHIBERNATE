package Dao.test.ismo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.Dao.ismo.DaoFactory;
import com.Dao.ismo.IDao;
import com.Dao.ismo.TypeDao;

import ismo.efm.Appartement;



public class Daotest {
	@Test
	void getAlltest() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> ents = dao.getAll();
		
		assertNotNull(ents);
		assertEquals(ents.size(), 16);
	}
	
	@Test
	void getOnetest_1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement apt = (Appartement) dao.getOne(3);

		assertEquals(apt.getLettre_appartement(), "lettre1");
		assertEquals(apt.getNb_pieces_total(), 2);
		
	}
	
	@Test
	void getOnetest_2() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		Appartement ent = (Appartement) dao.getOne(3000);

		assertNull(ent);
	}
	
	@Test
	void savetest() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		IDao dao = DaoFactory.getDAO(TypeDao.Appartement);
		List<Appartement> aprt_before = dao.getAll();
		Appartement aprt = new Appartement("lettre5",3);
		dao.add();
		List<Appartement> aprt_after = dao.getAll();
		assertEquals(aprt_before.size()+1, aprt_after.size());
	
}}
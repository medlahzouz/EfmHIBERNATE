package com.Dao.ismo;

public class DaoFactory {
	
	
	public static IDao getDAO(TypeDao type) {
		switch (type) {
			case Appartement: return new DaoAppartement();
			case Etage: return new DaoEtage();
			case Immeuble: return new DaoImmeuble();
			case Rue: return new DaoRue();
			
		}
		return null;
	}

}

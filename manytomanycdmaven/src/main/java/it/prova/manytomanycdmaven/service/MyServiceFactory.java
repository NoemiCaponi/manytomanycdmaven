package it.prova.manytomanycdmaven.service;

import it.prova.manytomanycdmaven.dao.MyDaoFactory;
import it.prova.manytomanycdmaven.dao.cd.CdDAO;

public class MyServiceFactory {

	private static CdService cdServiceInstance = null;
	private static GenereService genereServiceInstance = null;
	private static CdDAO cdDao=null;

	public static CdService getCdServiceInstance() {
		if (cdServiceInstance == null)
			cdServiceInstance = new CdServiceImpl();
		cdDao=MyDaoFactory.getCdDAOInstance();
		cdServiceInstance.setCdDAO(MyDaoFactory.getCdDAOInstance());

		return cdServiceInstance;
	}

	public static GenereService getGenereServiceInstance() {
		if (genereServiceInstance == null)
			genereServiceInstance = new GenereServiceImpl();

		genereServiceInstance.setGenereDAO(MyDaoFactory.getGenereDAOInstance());

		return genereServiceInstance;
	}

}

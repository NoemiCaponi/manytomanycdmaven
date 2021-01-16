package it.prova.manytomanycdmaven.dao.genere;

import java.util.List;

import it.prova.manytomanycdmaven.dao.IBaseDAO;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;

public interface GenereDAO extends IBaseDAO<Genere>{
	
	public Genere findByDescrizione(String descrizioneInput) throws Exception;

	public List<Genere> findAllByCd(Cd cdInput) throws Exception;
}

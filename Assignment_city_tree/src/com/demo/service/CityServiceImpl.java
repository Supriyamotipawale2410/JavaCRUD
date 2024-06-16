package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.dao.CityDao;
import com.demo.dao.CityDaoImpl;

public class CityServiceImpl implements CityService{

	private CityDao cdao;

	public CityServiceImpl() {
		super();
		cdao = new CityDaoImpl();
	}

	@Override
	public Map<String, String> showAll() {
		
		return cdao.displayAll();
	}

	@Override
	public String findByCity(String cty) {
		
		return cdao.showByCity(cty);
	}

	@Override
	public Boolean deleteEntry(String cty) {
		
		return cdao.removeByCity(cty);
	}

	@Override
	public boolean addNewEntry(String cty, String trees) {
		
		return cdao.save(cty,trees);
	}

	@Override
	public Map<String, String> showByIterator() {
		
		return cdao.displayAll();
	}

	@Override
	public Boolean addTrees(String cty, String trees) {
		
		return cdao.saveTrees(cty,trees);
	}

	@Override
	public List<String> displayByTrees(String tree) {
		
		return cdao.showByTrees(tree);
	}
	
}

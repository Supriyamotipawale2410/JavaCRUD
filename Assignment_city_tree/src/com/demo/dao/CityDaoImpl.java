package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CityDaoImpl implements CityDao{

	static Map<String,String> tm;
	
	static {
		tm = new TreeMap<>();
		tm.put("Pune", "Neem,Mango,Coconut");
		tm.put("Mumbai", "Bamboo,Palm,Coconut");
		tm.put("Banglore", "Guava,Bamboo,Cucumber");
		tm.put("Agra", "Pumkin,Watermelon,Papaya");
		
	}

	@Override
	public Map<String, String> displayAll() {
		
		return tm;
	}

	@Override
	public String showByCity(String cty) {
		for(String s : tm.keySet()) {
			if(s.equals(cty)) {
				return tm.get(cty);
			}
		}
		return null;
	}

	@Override
	public Boolean removeByCity(String cty) {
		for(String s : tm.keySet()) {
			if(s.equals(cty)) {
				tm.remove(cty);
				return true;
			}
		}
		return null;
	}

	@Override
	public boolean save(String cty, String trees) {
		tm.put(cty, trees);
		return true;
	}

	
	@Override
	public Boolean saveTrees(String cty, String trees) {
		for(String s : tm.keySet()) {
			if(s.equals(cty)) {
				tm.put(cty, tm.get(s)+","+trees);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<String> showByTrees(String tree) {
		List<String> lst = new ArrayList<>();
		for(String s : tm.keySet()) {
			if(tm.get(s).contains(tree)) {
				lst.add(s);
			}
		}
		return lst;
	}

	

}



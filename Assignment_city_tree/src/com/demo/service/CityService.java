package com.demo.service;

import java.util.List;
import java.util.Map;

public interface CityService {

	Map<String, String> showAll();

	String findByCity(String cty);

	Boolean deleteEntry(String cty);

	boolean addNewEntry(String cty, String trees);

	Map<String, String> showByIterator();

	Boolean addTrees(String cty, String trees);

	List<String> displayByTrees(String tree);

}

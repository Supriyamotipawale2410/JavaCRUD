package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface CityDao {

	Map<String, String> displayAll();

	String showByCity(String cty);

	Boolean removeByCity(String cty);

	boolean save(String cty, String trees);

	Boolean saveTrees(String cty, String trees);

	List<String> showByTrees(String tree);

}

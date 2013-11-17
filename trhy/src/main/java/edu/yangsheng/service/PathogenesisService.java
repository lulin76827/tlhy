package edu.yangsheng.service;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Pathogenesis;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Pathogenesis entities
 * 
 */
public interface PathogenesisService {

	/**
	 */
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id);

	/**
	 * Save an existing Category entity
	 * 
	 */
	public Pathogenesis savePathogenesisCategory(Integer id_1, Category related_category);

	/**
	 * Load an existing Pathogenesis entity
	 * 
	 */
	public Set<Pathogenesis> loadPathogenesiss();

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	public void savePathogenesis(Pathogenesis pathogenesis);

	/**
	 * Delete an existing Category entity
	 * 
	 */
	public Pathogenesis deletePathogenesisCategory(Integer pathogenesis_id, Integer related_category_id);

	/**
	 * Return all Pathogenesis entity
	 * 
	 */
	public List<Pathogenesis> findAllPathogenesiss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Pathogenesis entity
	 * 
	 */
	public Integer countPathogenesiss();

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	public void deletePathogenesis(Pathogenesis pathogenesis_1);
}
package edu.yangsheng.service;

import edu.yangsheng.dao.CategoryDAO;
import edu.yangsheng.dao.PathogenesisDAO;

import edu.yangsheng.domain.Category;
import edu.yangsheng.domain.Pathogenesis;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Pathogenesis entities
 * 
 */

@Service("PathogenesisService")
@Transactional
public class PathogenesisServiceImpl implements PathogenesisService {

	/**
	 * DAO injected by Spring that manages Category entities
	 * 
	 */
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * DAO injected by Spring that manages Pathogenesis entities
	 * 
	 */
	@Autowired
	private PathogenesisDAO pathogenesisDAO;

	/**
	 * Instantiates a new PathogenesisServiceImpl.
	 *
	 */
	public PathogenesisServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Pathogenesis findPathogenesisByPrimaryKey(Integer id) {
		return pathogenesisDAO.findPathogenesisByPrimaryKey(id);
	}

	/**
	 * Save an existing Category entity
	 * 
	 */
	@Transactional
	public Pathogenesis savePathogenesisCategory(Integer id, Category related_category) {
		Pathogenesis pathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(id, -1, -1);
		Category existingcategory = categoryDAO.findCategoryByPrimaryKey(related_category.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcategory != null) {
			existingcategory.setId(related_category.getId());
			existingcategory.setCategoryField(related_category.getCategoryField());
			existingcategory.setDescrib(related_category.getDescrib());
			related_category = existingcategory;
		}

		pathogenesis.setCategory(related_category);
		related_category.getPathogenesises().add(pathogenesis);
		pathogenesis = pathogenesisDAO.store(pathogenesis);
		pathogenesisDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		return pathogenesis;
	}

	/**
	 * Load an existing Pathogenesis entity
	 * 
	 */
	@Transactional
	public Set<Pathogenesis> loadPathogenesiss() {
		return pathogenesisDAO.findAllPathogenesiss();
	}

	/**
	 * Save an existing Pathogenesis entity
	 * 
	 */
	@Transactional
	public void savePathogenesis(Pathogenesis pathogenesis) {
		Pathogenesis existingPathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(pathogenesis.getId());

		if (existingPathogenesis != null) {
			if (existingPathogenesis != pathogenesis) {
				existingPathogenesis.setId(pathogenesis.getId());
				existingPathogenesis.setDescrib(pathogenesis.getDescrib());
				existingPathogenesis.setPathogenesisField(pathogenesis.getPathogenesisField());
				existingPathogenesis.setType(pathogenesis.getType());
			}
			pathogenesis = pathogenesisDAO.store(existingPathogenesis);
		} else {
			pathogenesis = pathogenesisDAO.store(pathogenesis);
		}
		pathogenesisDAO.flush();
	}

	/**
	 * Delete an existing Category entity
	 * 
	 */
	@Transactional
	public Pathogenesis deletePathogenesisCategory(Integer pathogenesis_id, Integer related_category_id) {
		Pathogenesis pathogenesis = pathogenesisDAO.findPathogenesisByPrimaryKey(pathogenesis_id, -1, -1);
		Category related_category = categoryDAO.findCategoryByPrimaryKey(related_category_id, -1, -1);

		pathogenesis.setCategory(null);
		related_category.getPathogenesises().remove(pathogenesis);
		pathogenesis = pathogenesisDAO.store(pathogenesis);
		pathogenesisDAO.flush();

		related_category = categoryDAO.store(related_category);
		categoryDAO.flush();

		categoryDAO.remove(related_category);
		categoryDAO.flush();

		return pathogenesis;
	}

	/**
	 * Return all Pathogenesis entity
	 * 
	 */
	@Transactional
	public List<Pathogenesis> findAllPathogenesiss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Pathogenesis>(pathogenesisDAO.findAllPathogenesiss(startResult, maxRows));
	}

	/**
	 * Return a count of all Pathogenesis entity
	 * 
	 */
	@Transactional
	public Integer countPathogenesiss() {
		return ((Long) pathogenesisDAO.createQuerySingleResult("select count(o) from Pathogenesis o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Pathogenesis entity
	 * 
	 */
	@Transactional
	public void deletePathogenesis(Pathogenesis pathogenesis) {
		pathogenesisDAO.remove(pathogenesis);
		pathogenesisDAO.flush();
	}
}

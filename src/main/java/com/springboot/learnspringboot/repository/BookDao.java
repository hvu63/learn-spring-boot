package com.springboot.learnspringboot.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.learnspringboot.entity.Book;
import com.springboot.learnspringboot.enums.Status;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository("bookDao")
public class BookDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Book> findBookByStatus(Status status) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
        Root<Book> root = criteriaQuery.from(Book.class);

        // Create predicates for filtering
        if (status != null) {
        	Predicate predicate = criteriaBuilder.equal(root.get("status"), status);
        	// Apply predicates to the criteria query
        	criteriaQuery.where(predicate);
        }

        // Execute the query and return results
        return entityManager.createQuery(criteriaQuery).getResultList();
	}

}

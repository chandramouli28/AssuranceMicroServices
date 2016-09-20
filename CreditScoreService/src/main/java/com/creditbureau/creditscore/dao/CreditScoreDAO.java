package com.creditbureau.creditscore.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.creditbureau.creditscore.model.CreditScore;

/**
 * In this class, we will get the creditScore from the database by SSN
 * @author Jude Mariarajan
 *
 */
public class CreditScoreDAO {

	public int getCreditScore(String ssn) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CreditScoreService");

		EntityManager entitymanager = emfactory.createEntityManager();

		CreditScore creditScore = entitymanager.find(CreditScore.class, ssn);

		return creditScore.getCreditScore();

	}

}

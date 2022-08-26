package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;

import javax.persistence.EntityManager;

public class CompanyDataJpaDao extends JpaDao<CompanyData, Long> implements CompanyDataDao {

	public CompanyDataJpaDao() {
		super(CompanyData.class);

		if (findAll().isEmpty()) {
			TestData.createTestCompanyData(this);
		}
	}

	@Override
	public List<CompanyData> findAll() {
		EntityManager em = newEntityManager();
		return em.createQuery("SELECT e FROM CompanyData e", CompanyData.class).getResultList();
	}
}

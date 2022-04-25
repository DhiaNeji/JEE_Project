package org.exemple.project1.controllers;

import org.exemple.project1.entities.City;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

public class CityManager implements GenericDAO<City,Integer>{

	@Inject
    private EntityManager manager;

	@Override
	public EntityManager getEntityManager() {
		return manager;
	}

	@Override
	public Class<City> getEntityClass() {
		return City.class;
	}
	
}

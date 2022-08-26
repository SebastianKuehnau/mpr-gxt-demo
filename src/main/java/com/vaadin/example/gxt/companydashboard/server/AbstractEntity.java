package com.vaadin.example.gxt.companydashboard.server;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;


@MappedSuperclass
public class AbstractEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	@Version
	protected Integer version;

	public Long getId() {
		return id;
	}

	public Integer getVersion() {
		return version;
	}
}

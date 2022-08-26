package com.vaadin.example.gxt.companydashboard.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.math.BigDecimal;

public class CompanyDataDTO implements IsSerializable, Serializable {

	private Long id;

	private Integer version;

	private String name;

	private BigDecimal price;

	private BigDecimal revenuePct;

	private BigDecimal growthPct;

	private BigDecimal productPct;

	private BigDecimal marketPct;

	public CompanyDataDTO(Long id, Integer version, String name, BigDecimal price, BigDecimal revenuePct,
			BigDecimal growthPct,
			BigDecimal productPct, BigDecimal marketPct) {
		this.id = id;
		this.version = version;
		this.name = name;
		this.price = price;
		this.revenuePct = revenuePct;
		this.growthPct = growthPct;
		this.productPct = productPct;
		this.marketPct = marketPct;
	}

//	public CompanyDataDTO(Long id) {
//		this.id = id;
//	}

	private CompanyDataDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getRevenuePct() {
		return revenuePct;
	}

	public void setRevenuePct(BigDecimal revenuePct) {
		this.revenuePct = revenuePct;
	}

	public BigDecimal getGrowthPct() {
		return growthPct;
	}

	public void setGrowthPct(BigDecimal growthPct) {
		this.growthPct = growthPct;
	}

	public BigDecimal getProductPct() {
		return productPct;
	}

	public void setProductPct(BigDecimal productPct) {
		this.productPct = productPct;
	}

	public BigDecimal getMarketPct() {
		return marketPct;
	}

	public void setMarketPct(BigDecimal marketPct) {
		this.marketPct = marketPct;
	}

}

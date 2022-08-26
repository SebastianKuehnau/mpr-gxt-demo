package com.vaadin.example.gxt.companydashboard.server;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class TestData {
	private final static String[] companies = { "3m Co", "Alcoa Inc", "Altria Group Inc", "American Express Company",
			"American International Group, Inc.", "AT&T Inc", "Boeing Co.", "Caterpillar Inc.", "Citigroup, Inc.",
			"E.I. du Pont de Nemours and Company", "Exxon Mobil Corp", "General Electric Company",
			"General Motors Corporation", "Hewlett-Packard Co", "Honeywell Intl Inc", "Intel Corporation",
			"International Business Machines", "Johnson & Johnson", "JP Morgan & Chase & Co", "McDonald\"s Corporation",
			"Merck & Co., Inc.", "Microsoft Corporation", "Pfizer Inc", "The Coca-Cola Company", "The Home Depot, Inc.",
			"The Procter & Gamble Company", "United Technologies Corporation", "Verizon Communications",
			"Wal-Mart Stores, Inc." };

	public static void createTestCompanyData(CompanyDataJpaDao dao) {
		Random rand = new Random();
		List<CompanyData> data = new ArrayList<>();
		for (int i = 0; i < companies.length; i++) {
			CompanyData entry = new CompanyData();
			entry.setName(companies[i]);
			entry.setPrice(BigDecimal.valueOf(rand.nextDouble() * 100));
			entry.setRevenuePct(BigDecimal.valueOf(rand.nextDouble() * 100));
			entry.setGrowthPct(BigDecimal.valueOf(rand.nextDouble() * 100));
			entry.setProductPct(BigDecimal.valueOf(rand.nextDouble() * 100));
			entry.setMarketPct(BigDecimal.valueOf(rand.nextDouble() * 100));
			data.add(entry);
		}
		dao.saveAll(data);
	}
}

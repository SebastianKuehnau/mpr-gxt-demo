package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.annotation.WebServlet;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.vaadin.example.gxt.companydashboard.client.CompanyDataService;
import com.vaadin.example.gxt.companydashboard.shared.CompanyDataDTO;

@WebServlet(urlPatterns = { "/framework/VAADIN/widgetsets/CompanyDashboard/companyData" })
public class CompanyDataServiceImpl extends RemoteServiceServlet implements CompanyDataService {

	private final CompanyDataJpaDao dao = new CompanyDataJpaDao();

	@Override
	public List<CompanyDataDTO> getAllCompanyData() {
		return dao.findAll().stream().map(CompanyData::mapToDTO).collect(Collectors.toList());
	}

	@Override
	public CompanyDataDTO saveCompanyData(CompanyDataDTO data) {
		return CompanyData.mapToDTO(dao.save(new CompanyData(data)));
	}
}

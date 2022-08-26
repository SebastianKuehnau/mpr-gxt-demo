package com.vaadin.example.gxt.companydashboard.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.vaadin.example.gxt.companydashboard.shared.CompanyDataDTO;

@RemoteServiceRelativePath("companyData")
public interface CompanyDataService extends RemoteService {
	List<CompanyDataDTO> getAllCompanyData();

	CompanyDataDTO saveCompanyData(CompanyDataDTO data);
}

package com.vaadin.example.gxt.companydashboard.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.vaadin.example.gxt.companydashboard.shared.CompanyDataDTO;

public interface CompanyDataServiceAsync {

	void getAllCompanyData(AsyncCallback<List<CompanyDataDTO>> callback);

	void saveCompanyData(CompanyDataDTO data, AsyncCallback<CompanyDataDTO> callback);

}

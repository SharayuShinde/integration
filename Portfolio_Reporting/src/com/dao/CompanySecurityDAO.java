package com.dao;

import com.pojo.CompanySecurity;
import com.pojo.Security;

public interface CompanySecurityDAO {
	public CompanySecurity getCompanySecurity(int companyId);
	public CompanySecurity updateCompanySecurity(CompanySecurity cs,int companyId);
	public CompanySecurity deleteCompanySecurity(int companyId);
	public CompanySecurity addCompanySecurity(CompanySecurity cs);
}

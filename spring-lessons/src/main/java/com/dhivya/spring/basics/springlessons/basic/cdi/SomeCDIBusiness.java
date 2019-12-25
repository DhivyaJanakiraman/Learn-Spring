package com.dhivya.spring.basics.springlessons.basic.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	@Inject
	SomeCDIDao someCDIDao;

	public SomeCDIDao getSomeCdiDao() {
		return someCDIDao;
	}

	public void setSomeCdiDao(SomeCDIDao someCDIDao) {
		this.someCDIDao = someCDIDao;
	}
}

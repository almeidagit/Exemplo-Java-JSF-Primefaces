package br.com.user.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class InventoryStatus {

	private static String INSTOCK = "INSTOCK";

	private String LOWSTOCK = "LOWSTOCK";

	private String OUTOFSTOCK = "OUTOFSTOCK";

	public static String getINSTOCK() {
		return INSTOCK;
	}

	public void setINSTOCK(String iNSTOCK) {
		INSTOCK = iNSTOCK;
	}

	public String getLOWSTOCK() {
		return LOWSTOCK;
	}

	public void setLOWSTOCK(String lOWSTOCK) {
		LOWSTOCK = lOWSTOCK;
	}

	public String getOUTOFSTOCK() {
		return OUTOFSTOCK;
	}

	public void setOUTOFSTOCK(String oUTOFSTOCK) {
		OUTOFSTOCK = oUTOFSTOCK;
	}

}

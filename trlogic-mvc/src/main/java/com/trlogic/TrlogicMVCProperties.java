package com.trlogic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="trlogicmvc")
public class TrlogicMVCProperties {
	private boolean aktif = false;
	
	public boolean isAktif() {
		return aktif;
	}
	
	public void setAktif(boolean aktif) {
		this.aktif = aktif;
	}
}

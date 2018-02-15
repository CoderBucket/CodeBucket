package com.spring.nifi.adminconsole.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ORD database table.
 * 
 */
@Embeddable
public class OrdPK implements Serializable {
	
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String ordnum;

	@Column(name="WH_ID")
	private String whId;

	@Column(name="CLIENT_ID")
	private String clientId;

	public OrdPK() {
	}
	public String getOrdnum() {
		return this.ordnum;
	}
	public void setOrdnum(String ordnum) {
		this.ordnum = ordnum;
	}
	public String getWhId() {
		return this.whId;
	}
	public void setWhId(String whId) {
		this.whId = whId;
	}
	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrdPK)) {
			return false;
		}
		OrdPK castOther = (OrdPK)other;
		return 
			this.ordnum.equals(castOther.ordnum)
			&& this.whId.equals(castOther.whId)
			&& this.clientId.equals(castOther.clientId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ordnum.hashCode();
		hash = hash * prime + this.whId.hashCode();
		hash = hash * prime + this.clientId.hashCode();
		
		return hash;
	}
	

	@Override
	public String toString() {
		return "OrdPK [ordnum=" + ordnum + ", whId=" + whId + ", clientId=" + clientId + "]";
	}

}
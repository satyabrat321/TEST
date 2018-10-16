package com.wag.test;

import java.sql.Date;

public class commonCd {
	
	private int NUM_CD ;    
	private String ALPH_CD;            
	private String CODE_TYPE ;
	private String CODE_DESC ; 
	private int CREATE_ID  ;           
	private Date CREATE_DT ;
	
	public commonCd(){}
	
	public commonCd(String ALPH_CD,String CODE_DESC,String CODE_TYPE,int CREATE_ID,Date CREATE_DT )
	{
		this.ALPH_CD=ALPH_CD;
		this.CODE_DESC=CODE_DESC;
		this.CODE_TYPE=CODE_TYPE;
		this.CREATE_ID=CREATE_ID;
		this.CREATE_DT=CREATE_DT;
		
	}
	
	
	public String getALPH_CD() {
		return ALPH_CD;
	}
	public void setALPH_CD(String aLPH_CD) {
		ALPH_CD = aLPH_CD;
	}
	public String getCODE_TYPE() {
		return CODE_TYPE;
	}
	public void setCODE_TYPE(String cODE_TYPE) {
		CODE_TYPE = cODE_TYPE;
	}
	public String getCODE_DESC() {
		return CODE_DESC;
	}
	public void setCODE_DESC(String cODE_DESC) {
		CODE_DESC = cODE_DESC;
	}
	public int getCREATE_ID() {
		return CREATE_ID;
	}
	public void setCREATE_ID(int cREATE_ID) {
		CREATE_ID = cREATE_ID;
	}
	public Date getCREATE_DT() {
		return CREATE_DT;
	}
	public void setCREATE_DT(Date cREATE_DT) {
		CREATE_DT = cREATE_DT;
	}

	public int getNUM_CD() {
		return NUM_CD;
	}

	public void setNUM_CD(int nUM_CD) {
		NUM_CD = nUM_CD;
	}        

}

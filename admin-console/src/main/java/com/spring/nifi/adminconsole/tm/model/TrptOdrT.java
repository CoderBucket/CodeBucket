package com.spring.nifi.adminconsole.tm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRPT_ODR_T database table.
 * 
 */
@Entity
@Table(name="TRPT_ODR_T")
@NamedQuery(name="TrptOdrT.findAll", query="SELECT t FROM TrptOdrT t")
public class TrptOdrT implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRPT_ODR_ID")
	private long trptOdrId;

	@Column(name="AP_SRVC_CD")
	private String apSrvcCd;

	@Column(name="AR_SRVC_CD")
	private String arSrvcCd;

	@Column(name="BILLTO_CUST_CD")
	private String billtoCustCd;

	@Column(name="BILLTO_CUST_VER_ID")
	private BigDecimal billtoCustVerId;

	@Column(name="BS_LDN_LEN")
	private BigDecimal bsLdnLen;

	@Column(name="BTCH_NUM")
	private BigDecimal btchNum;

	@Column(name="CARR_CD")
	private String carrCd;

	@Column(name="CDTY_CD")
	private String cdtyCd;

	@Column(name="CNCY_TYP")
	private BigDecimal cncyTyp;

	@Temporal(TemporalType.DATE)
	@Column(name="CRTD_DTT")
	private Date crtdDtt;

	@Column(name="CRTD_USR_CD")
	private String crtdUsrCd;

	@Column(name="CUST_CD")
	private String custCd;

	@Column(name="CUST_VER_ID")
	private BigDecimal custVerId;

	@Column(name="DCLD_VAL_DLR")
	private BigDecimal dcldValDlr;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="DRCT_FRHT_YN")
	private String drctFrhtYn;

	@Column(name="ECHG_RATE")
	private BigDecimal echgRate;

	@Column(name="ELMT_ID")
	private BigDecimal elmtId;

	@Column(name="ETMD_SKID_FCTR")
	private BigDecimal etmdSkidFctr;

	@Column(name="FLEX_QNTY1")
	private BigDecimal flexQnty1;

	@Column(name="FLEX_QNTY2")
	private BigDecimal flexQnty2;

	@Column(name="FLEX_QNTY3")
	private BigDecimal flexQnty3;

	@Column(name="FLEX_QNTY4")
	private BigDecimal flexQnty4;

	@Column(name="FLEX_QNTY5")
	private BigDecimal flexQnty5;

	@Column(name="FRHT_CLS_CD")
	private String frhtClsCd;

	@Column(name="FRHT_TRM_ENU")
	private BigDecimal frhtTrmEnu;

	@Column(name="FRM_ADDR_ID")
	private BigDecimal frmAddrId;

	@Column(name="FRM_CTRY_CD")
	private String frmCtryCd;

	@Column(name="FRM_CTY_NAME")
	private String frmCtyName;

	@Temporal(TemporalType.DATE)
	@Column(name="FRM_DLVY_DTT")
	private Date frmDlvyDtt;

	@Column(name="FRM_NAME")
	private String frmName;

	@Temporal(TemporalType.DATE)
	@Column(name="FRM_PKUP_DTT")
	private Date frmPkupDtt;

	@Column(name="FRM_PSTL_CD")
	private String frmPstlCd;

	@Column(name="FRM_SHIP_LOC_ENU")
	private BigDecimal frmShipLocEnu;

	@Column(name="FRM_SHPG_LOC_CD")
	private String frmShpgLocCd;

	@Column(name="FRM_STA_CD")
	private String frmStaCd;

	@Column(name="INPT_SRC_ENU")
	private BigDecimal inptSrcEnu;

	@Column(name="ITM_FAM_CD")
	private String itmFamCd;

	@Column(name="ITM_PICK_LOC1")
	private BigDecimal itmPickLoc1;

	@Column(name="ITM_PICK_LOC2")
	private BigDecimal itmPickLoc2;

	@Column(name="JRNY_TPLT_CD")
	private String jrnyTpltCd;

	@Column(name="LDN_LEN")
	private BigDecimal ldnLen;

	@Column(name="LGST_GRP_CD")
	private String lgstGrpCd;

	@Column(name="NMNL_WGT")
	private BigDecimal nmnlWgt;

	@Column(name="NUM_SHPM_SPLIT")
	private BigDecimal numShpmSplit;

	@Column(name="ODR_CSLD_GRP_ID")
	private BigDecimal odrCsldGrpId;

	@Column(name="ODR_GRP1_CD")
	private String odrGrp1Cd;

	@Column(name="ODR_GRP2_CD")
	private String odrGrp2Cd;

	@Column(name="ODR_LINE_NUM_CD")
	private String odrLineNumCd;

	@Column(name="ODR_NUM_CD")
	private String odrNumCd;

	@Column(name="ODR_TYP_CD")
	private String odrTypCd;

	@Column(name="ODR_VAL_DLR")
	private BigDecimal odrValDlr;

	@Column(name="OPT_LCK")
	private BigDecimal optLck;

	@Temporal(TemporalType.DATE)
	@Column(name="PCHS_ODR_DTT")
	private Date pchsOdrDtt;

	@Column(name="PCHS_ODR_NUM")
	private String pchsOdrNum;

	@Column(name="PRD_NUM_CD")
	private String prdNumCd;

	@Column(name="PRJ_CD")
	private String prjCd;

	private BigDecimal prty;

	@Column(name="SCLD_WGT")
	private BigDecimal scldWgt;

	@Column(name="SPLIT_MTHD_ENU")
	private BigDecimal splitMthdEnu;

	@Column(name="SPLIT_ODR_NUM")
	private String splitOdrNum;

	@Column(name="TO_ADDR_ID")
	private BigDecimal toAddrId;

	@Column(name="TO_CTRY_CD")
	private String toCtryCd;

	@Column(name="TO_CTY_NAME")
	private String toCtyName;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_DLVY_DTT")
	private Date toDlvyDtt;

	@Column(name="TO_ENT_TYP_CD")
	private String toEntTypCd;

	@Column(name="TO_ENT_VER_CD")
	private String toEntVerCd;

	@Column(name="TO_NAME")
	private String toName;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_PKUP_DTT")
	private Date toPkupDtt;

	@Column(name="TO_PSTL_CD")
	private String toPstlCd;

	@Column(name="TO_SHIP_LOC_ENU")
	private BigDecimal toShipLocEnu;

	@Column(name="TO_SHPG_LOC_CD")
	private String toShpgLocCd;

	@Column(name="TO_STA_CD")
	private String toStaCd;

	@Column(name="TOT_PCE")
	private BigDecimal totPce;

	@Column(name="TOT_SKID")
	private BigDecimal totSkid;

	@Column(name="TOT_TARE_WGT")
	private BigDecimal totTareWgt;

	@Column(name="TRPT_ODR_MD_ENU")
	private BigDecimal trptOdrMdEnu;

	@Column(name="TRPT_ODRSTAT_ID")
	private BigDecimal trptOdrstatId;

	@Column(name="UMSR_DIST_ENU")
	private BigDecimal umsrDistEnu;

	@Column(name="UMSR_LEN_ENU")
	private BigDecimal umsrLenEnu;

	@Column(name="UMSR_SYS_ENU")
	private BigDecimal umsrSysEnu;

	@Column(name="UMSR_WGT_ENU")
	private BigDecimal umsrWgtEnu;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDT_DTT")
	private Date updtDtt;

	@Column(name="UPDT_USR_CD")
	private String updtUsrCd;

	@Column(name="URGT_YN")
	private String urgtYn;

	private BigDecimal vol;

	public TrptOdrT() {
	}

	public long getTrptOdrId() {
		return this.trptOdrId;
	}

	public void setTrptOdrId(long trptOdrId) {
		this.trptOdrId = trptOdrId;
	}

	public String getApSrvcCd() {
		return this.apSrvcCd;
	}

	public void setApSrvcCd(String apSrvcCd) {
		this.apSrvcCd = apSrvcCd;
	}

	public String getArSrvcCd() {
		return this.arSrvcCd;
	}

	public void setArSrvcCd(String arSrvcCd) {
		this.arSrvcCd = arSrvcCd;
	}

	public String getBilltoCustCd() {
		return this.billtoCustCd;
	}

	public void setBilltoCustCd(String billtoCustCd) {
		this.billtoCustCd = billtoCustCd;
	}

	public BigDecimal getBilltoCustVerId() {
		return this.billtoCustVerId;
	}

	public void setBilltoCustVerId(BigDecimal billtoCustVerId) {
		this.billtoCustVerId = billtoCustVerId;
	}

	public BigDecimal getBsLdnLen() {
		return this.bsLdnLen;
	}

	public void setBsLdnLen(BigDecimal bsLdnLen) {
		this.bsLdnLen = bsLdnLen;
	}

	public BigDecimal getBtchNum() {
		return this.btchNum;
	}

	public void setBtchNum(BigDecimal btchNum) {
		this.btchNum = btchNum;
	}

	public String getCarrCd() {
		return this.carrCd;
	}

	public void setCarrCd(String carrCd) {
		this.carrCd = carrCd;
	}

	public String getCdtyCd() {
		return this.cdtyCd;
	}

	public void setCdtyCd(String cdtyCd) {
		this.cdtyCd = cdtyCd;
	}

	public BigDecimal getCncyTyp() {
		return this.cncyTyp;
	}

	public void setCncyTyp(BigDecimal cncyTyp) {
		this.cncyTyp = cncyTyp;
	}

	public Date getCrtdDtt() {
		return this.crtdDtt;
	}

	public void setCrtdDtt(Date crtdDtt) {
		this.crtdDtt = crtdDtt;
	}

	public String getCrtdUsrCd() {
		return this.crtdUsrCd;
	}

	public void setCrtdUsrCd(String crtdUsrCd) {
		this.crtdUsrCd = crtdUsrCd;
	}

	public String getCustCd() {
		return this.custCd;
	}

	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}

	public BigDecimal getCustVerId() {
		return this.custVerId;
	}

	public void setCustVerId(BigDecimal custVerId) {
		this.custVerId = custVerId;
	}

	public BigDecimal getDcldValDlr() {
		return this.dcldValDlr;
	}

	public void setDcldValDlr(BigDecimal dcldValDlr) {
		this.dcldValDlr = dcldValDlr;
	}

	public String getDivCd() {
		return this.divCd;
	}

	public void setDivCd(String divCd) {
		this.divCd = divCd;
	}

	public String getDrctFrhtYn() {
		return this.drctFrhtYn;
	}

	public void setDrctFrhtYn(String drctFrhtYn) {
		this.drctFrhtYn = drctFrhtYn;
	}

	public BigDecimal getEchgRate() {
		return this.echgRate;
	}

	public void setEchgRate(BigDecimal echgRate) {
		this.echgRate = echgRate;
	}

	public BigDecimal getElmtId() {
		return this.elmtId;
	}

	public void setElmtId(BigDecimal elmtId) {
		this.elmtId = elmtId;
	}

	public BigDecimal getEtmdSkidFctr() {
		return this.etmdSkidFctr;
	}

	public void setEtmdSkidFctr(BigDecimal etmdSkidFctr) {
		this.etmdSkidFctr = etmdSkidFctr;
	}

	public BigDecimal getFlexQnty1() {
		return this.flexQnty1;
	}

	public void setFlexQnty1(BigDecimal flexQnty1) {
		this.flexQnty1 = flexQnty1;
	}

	public BigDecimal getFlexQnty2() {
		return this.flexQnty2;
	}

	public void setFlexQnty2(BigDecimal flexQnty2) {
		this.flexQnty2 = flexQnty2;
	}

	public BigDecimal getFlexQnty3() {
		return this.flexQnty3;
	}

	public void setFlexQnty3(BigDecimal flexQnty3) {
		this.flexQnty3 = flexQnty3;
	}

	public BigDecimal getFlexQnty4() {
		return this.flexQnty4;
	}

	public void setFlexQnty4(BigDecimal flexQnty4) {
		this.flexQnty4 = flexQnty4;
	}

	public BigDecimal getFlexQnty5() {
		return this.flexQnty5;
	}

	public void setFlexQnty5(BigDecimal flexQnty5) {
		this.flexQnty5 = flexQnty5;
	}

	public String getFrhtClsCd() {
		return this.frhtClsCd;
	}

	public void setFrhtClsCd(String frhtClsCd) {
		this.frhtClsCd = frhtClsCd;
	}

	public BigDecimal getFrhtTrmEnu() {
		return this.frhtTrmEnu;
	}

	public void setFrhtTrmEnu(BigDecimal frhtTrmEnu) {
		this.frhtTrmEnu = frhtTrmEnu;
	}

	public BigDecimal getFrmAddrId() {
		return this.frmAddrId;
	}

	public void setFrmAddrId(BigDecimal frmAddrId) {
		this.frmAddrId = frmAddrId;
	}

	public String getFrmCtryCd() {
		return this.frmCtryCd;
	}

	public void setFrmCtryCd(String frmCtryCd) {
		this.frmCtryCd = frmCtryCd;
	}

	public String getFrmCtyName() {
		return this.frmCtyName;
	}

	public void setFrmCtyName(String frmCtyName) {
		this.frmCtyName = frmCtyName;
	}

	public Date getFrmDlvyDtt() {
		return this.frmDlvyDtt;
	}

	public void setFrmDlvyDtt(Date frmDlvyDtt) {
		this.frmDlvyDtt = frmDlvyDtt;
	}

	public String getFrmName() {
		return this.frmName;
	}

	public void setFrmName(String frmName) {
		this.frmName = frmName;
	}

	public Date getFrmPkupDtt() {
		return this.frmPkupDtt;
	}

	public void setFrmPkupDtt(Date frmPkupDtt) {
		this.frmPkupDtt = frmPkupDtt;
	}

	public String getFrmPstlCd() {
		return this.frmPstlCd;
	}

	public void setFrmPstlCd(String frmPstlCd) {
		this.frmPstlCd = frmPstlCd;
	}

	public BigDecimal getFrmShipLocEnu() {
		return this.frmShipLocEnu;
	}

	public void setFrmShipLocEnu(BigDecimal frmShipLocEnu) {
		this.frmShipLocEnu = frmShipLocEnu;
	}

	public String getFrmShpgLocCd() {
		return this.frmShpgLocCd;
	}

	public void setFrmShpgLocCd(String frmShpgLocCd) {
		this.frmShpgLocCd = frmShpgLocCd;
	}

	public String getFrmStaCd() {
		return this.frmStaCd;
	}

	public void setFrmStaCd(String frmStaCd) {
		this.frmStaCd = frmStaCd;
	}

	public BigDecimal getInptSrcEnu() {
		return this.inptSrcEnu;
	}

	public void setInptSrcEnu(BigDecimal inptSrcEnu) {
		this.inptSrcEnu = inptSrcEnu;
	}

	public String getItmFamCd() {
		return this.itmFamCd;
	}

	public void setItmFamCd(String itmFamCd) {
		this.itmFamCd = itmFamCd;
	}

	public BigDecimal getItmPickLoc1() {
		return this.itmPickLoc1;
	}

	public void setItmPickLoc1(BigDecimal itmPickLoc1) {
		this.itmPickLoc1 = itmPickLoc1;
	}

	public BigDecimal getItmPickLoc2() {
		return this.itmPickLoc2;
	}

	public void setItmPickLoc2(BigDecimal itmPickLoc2) {
		this.itmPickLoc2 = itmPickLoc2;
	}

	public String getJrnyTpltCd() {
		return this.jrnyTpltCd;
	}

	public void setJrnyTpltCd(String jrnyTpltCd) {
		this.jrnyTpltCd = jrnyTpltCd;
	}

	public BigDecimal getLdnLen() {
		return this.ldnLen;
	}

	public void setLdnLen(BigDecimal ldnLen) {
		this.ldnLen = ldnLen;
	}

	public String getLgstGrpCd() {
		return this.lgstGrpCd;
	}

	public void setLgstGrpCd(String lgstGrpCd) {
		this.lgstGrpCd = lgstGrpCd;
	}

	public BigDecimal getNmnlWgt() {
		return this.nmnlWgt;
	}

	public void setNmnlWgt(BigDecimal nmnlWgt) {
		this.nmnlWgt = nmnlWgt;
	}

	public BigDecimal getNumShpmSplit() {
		return this.numShpmSplit;
	}

	public void setNumShpmSplit(BigDecimal numShpmSplit) {
		this.numShpmSplit = numShpmSplit;
	}

	public BigDecimal getOdrCsldGrpId() {
		return this.odrCsldGrpId;
	}

	public void setOdrCsldGrpId(BigDecimal odrCsldGrpId) {
		this.odrCsldGrpId = odrCsldGrpId;
	}

	public String getOdrGrp1Cd() {
		return this.odrGrp1Cd;
	}

	public void setOdrGrp1Cd(String odrGrp1Cd) {
		this.odrGrp1Cd = odrGrp1Cd;
	}

	public String getOdrGrp2Cd() {
		return this.odrGrp2Cd;
	}

	public void setOdrGrp2Cd(String odrGrp2Cd) {
		this.odrGrp2Cd = odrGrp2Cd;
	}

	public String getOdrLineNumCd() {
		return this.odrLineNumCd;
	}

	public void setOdrLineNumCd(String odrLineNumCd) {
		this.odrLineNumCd = odrLineNumCd;
	}

	public String getOdrNumCd() {
		return this.odrNumCd;
	}

	public void setOdrNumCd(String odrNumCd) {
		this.odrNumCd = odrNumCd;
	}

	public String getOdrTypCd() {
		return this.odrTypCd;
	}

	public void setOdrTypCd(String odrTypCd) {
		this.odrTypCd = odrTypCd;
	}

	public BigDecimal getOdrValDlr() {
		return this.odrValDlr;
	}

	public void setOdrValDlr(BigDecimal odrValDlr) {
		this.odrValDlr = odrValDlr;
	}

	public BigDecimal getOptLck() {
		return this.optLck;
	}

	public void setOptLck(BigDecimal optLck) {
		this.optLck = optLck;
	}

	public Date getPchsOdrDtt() {
		return this.pchsOdrDtt;
	}

	public void setPchsOdrDtt(Date pchsOdrDtt) {
		this.pchsOdrDtt = pchsOdrDtt;
	}

	public String getPchsOdrNum() {
		return this.pchsOdrNum;
	}

	public void setPchsOdrNum(String pchsOdrNum) {
		this.pchsOdrNum = pchsOdrNum;
	}

	public String getPrdNumCd() {
		return this.prdNumCd;
	}

	public void setPrdNumCd(String prdNumCd) {
		this.prdNumCd = prdNumCd;
	}

	public String getPrjCd() {
		return this.prjCd;
	}

	public void setPrjCd(String prjCd) {
		this.prjCd = prjCd;
	}

	public BigDecimal getPrty() {
		return this.prty;
	}

	public void setPrty(BigDecimal prty) {
		this.prty = prty;
	}

	public BigDecimal getScldWgt() {
		return this.scldWgt;
	}

	public void setScldWgt(BigDecimal scldWgt) {
		this.scldWgt = scldWgt;
	}

	public BigDecimal getSplitMthdEnu() {
		return this.splitMthdEnu;
	}

	public void setSplitMthdEnu(BigDecimal splitMthdEnu) {
		this.splitMthdEnu = splitMthdEnu;
	}

	public String getSplitOdrNum() {
		return this.splitOdrNum;
	}

	public void setSplitOdrNum(String splitOdrNum) {
		this.splitOdrNum = splitOdrNum;
	}

	public BigDecimal getToAddrId() {
		return this.toAddrId;
	}

	public void setToAddrId(BigDecimal toAddrId) {
		this.toAddrId = toAddrId;
	}

	public String getToCtryCd() {
		return this.toCtryCd;
	}

	public void setToCtryCd(String toCtryCd) {
		this.toCtryCd = toCtryCd;
	}

	public String getToCtyName() {
		return this.toCtyName;
	}

	public void setToCtyName(String toCtyName) {
		this.toCtyName = toCtyName;
	}

	public Date getToDlvyDtt() {
		return this.toDlvyDtt;
	}

	public void setToDlvyDtt(Date toDlvyDtt) {
		this.toDlvyDtt = toDlvyDtt;
	}

	public String getToEntTypCd() {
		return this.toEntTypCd;
	}

	public void setToEntTypCd(String toEntTypCd) {
		this.toEntTypCd = toEntTypCd;
	}

	public String getToEntVerCd() {
		return this.toEntVerCd;
	}

	public void setToEntVerCd(String toEntVerCd) {
		this.toEntVerCd = toEntVerCd;
	}

	public String getToName() {
		return this.toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public Date getToPkupDtt() {
		return this.toPkupDtt;
	}

	public void setToPkupDtt(Date toPkupDtt) {
		this.toPkupDtt = toPkupDtt;
	}

	public String getToPstlCd() {
		return this.toPstlCd;
	}

	public void setToPstlCd(String toPstlCd) {
		this.toPstlCd = toPstlCd;
	}

	public BigDecimal getToShipLocEnu() {
		return this.toShipLocEnu;
	}

	public void setToShipLocEnu(BigDecimal toShipLocEnu) {
		this.toShipLocEnu = toShipLocEnu;
	}

	public String getToShpgLocCd() {
		return this.toShpgLocCd;
	}

	public void setToShpgLocCd(String toShpgLocCd) {
		this.toShpgLocCd = toShpgLocCd;
	}

	public String getToStaCd() {
		return this.toStaCd;
	}

	public void setToStaCd(String toStaCd) {
		this.toStaCd = toStaCd;
	}

	public BigDecimal getTotPce() {
		return this.totPce;
	}

	public void setTotPce(BigDecimal totPce) {
		this.totPce = totPce;
	}

	public BigDecimal getTotSkid() {
		return this.totSkid;
	}

	public void setTotSkid(BigDecimal totSkid) {
		this.totSkid = totSkid;
	}

	public BigDecimal getTotTareWgt() {
		return this.totTareWgt;
	}

	public void setTotTareWgt(BigDecimal totTareWgt) {
		this.totTareWgt = totTareWgt;
	}

	public BigDecimal getTrptOdrMdEnu() {
		return this.trptOdrMdEnu;
	}

	public void setTrptOdrMdEnu(BigDecimal trptOdrMdEnu) {
		this.trptOdrMdEnu = trptOdrMdEnu;
	}

	public BigDecimal getTrptOdrstatId() {
		return this.trptOdrstatId;
	}

	public void setTrptOdrstatId(BigDecimal trptOdrstatId) {
		this.trptOdrstatId = trptOdrstatId;
	}

	public BigDecimal getUmsrDistEnu() {
		return this.umsrDistEnu;
	}

	public void setUmsrDistEnu(BigDecimal umsrDistEnu) {
		this.umsrDistEnu = umsrDistEnu;
	}

	public BigDecimal getUmsrLenEnu() {
		return this.umsrLenEnu;
	}

	public void setUmsrLenEnu(BigDecimal umsrLenEnu) {
		this.umsrLenEnu = umsrLenEnu;
	}

	public BigDecimal getUmsrSysEnu() {
		return this.umsrSysEnu;
	}

	public void setUmsrSysEnu(BigDecimal umsrSysEnu) {
		this.umsrSysEnu = umsrSysEnu;
	}

	public BigDecimal getUmsrWgtEnu() {
		return this.umsrWgtEnu;
	}

	public void setUmsrWgtEnu(BigDecimal umsrWgtEnu) {
		this.umsrWgtEnu = umsrWgtEnu;
	}

	public Date getUpdtDtt() {
		return this.updtDtt;
	}

	public void setUpdtDtt(Date updtDtt) {
		this.updtDtt = updtDtt;
	}

	public String getUpdtUsrCd() {
		return this.updtUsrCd;
	}

	public void setUpdtUsrCd(String updtUsrCd) {
		this.updtUsrCd = updtUsrCd;
	}

	public String getUrgtYn() {
		return this.urgtYn;
	}

	public void setUrgtYn(String urgtYn) {
		this.urgtYn = urgtYn;
	}

	public BigDecimal getVol() {
		return this.vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

}
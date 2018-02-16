package com.spring.nifi.adminconsole.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORD database table.
 * 
 */
@Entity
@Table(name = "Ord")
@NamedQuery(name="Ord.findAll", query="SELECT o FROM Ord o")
public class Ord implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdPK id;

	@Temporal(TemporalType.DATE)
	private Date adddte;

	@Column(name="BCO_FLG")
	private BigDecimal bcoFlg;

	@Column(name="BILL_FREIGHT_FLG")
	private BigDecimal billFreightFlg;

	@Column(name="BR_ADR_ID")
	private String brAdrId;

	private String brcust;

	@Column(name="BT_ADR_ID")
	private String btAdrId;

	private String btcust;

	@Column(name="BTO_SEQNUM")
	private String btoSeqnum;

	@Column(name="BUS_GRP")
	private String busGrp;

	private BigDecimal carflg;

	@Column(name="COD_IND_TYPE")
	private BigDecimal codIndType;

	@Column(name="COD_PAYMENT_TYPE")
	private String codPaymentType;

	@Column(name="CONTRACT_NAM")
	private String contractNam;

	@Temporal(TemporalType.DATE)
	private Date cpodte;

	private String cponum;

	private String cpotyp;

	@Column(name="CRNCY_CODE")
	private String crncyCode;

	@Column(name="CSR_EMAIL_ADR")
	private String csrEmailAdr;

	@Column(name="CSR_NAM")
	private String csrNam;

	@Column(name="CSR_PHNNUM")
	private String csrPhnnum;

	@Column(name="CSTMS_ADDL_INFO")
	private String cstmsAddlInfo;

	@Column(name="CSTMS_DTYCUST")
	private String cstmsDtycust;

	@Column(name="CSTMS_ORD_STAT")
	private String cstmsOrdStat;

	@Column(name="CSTMS_ORDTYP")
	private String cstmsOrdtyp;

	@Column(name="CSTMS_STAT_NOTES")
	private String cstmsStatNotes;

	@Column(name="CUSTOMS_CLR_FLG")
	private BigDecimal customsClrFlg;

	private String deptno;

	@Column(name="DEST_NUM")
	private String destNum;

	@Column(name="DLV_CONTACT")
	private String dlvContact;

	private String dlvnum;

	private BigDecimal dlvseq;

	@Column(name="DUTY_PAYMENT_ACCT")
	private String dutyPaymentAcct;

	@Column(name="DUTY_PAYMENT_TYPE")
	private String dutyPaymentType;

	@Temporal(TemporalType.DATE)
	private Date entdte;

	@Column(name="EXCISE_DTYCUST")
	private String exciseDtycust;

	@Column(name="EXP_ADR_ID")
	private String expAdrId;

	@Column(name="EXP_CUST")
	private String expCust;

	@Column(name="EXT_ORDER_REF")
	private String extOrderRef;

	@Column(name="FRT_ALLOW")
	private BigDecimal frtAllow;

	@Column(name="HOST_APPT_NUM")
	private String hostApptNum;

	@Column(name="IMP_ADR_ID")
	private String impAdrId;

	@Column(name="IMP_CUST")
	private String impCust;

	@Column(name="MOD_USR_ID")
	private String modUsrId;

	@Temporal(TemporalType.DATE)
	private Date moddte;

	@Column(name="ORD_DIR")
	private String ordDir;

	@Column(name="ORD_FRTRTE")
	private BigDecimal ordFrtrte;

	@Column(name="ORD_SPL_COD")
	private String ordSplCod;

	private String ordtyp;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;

	private String paytrm;

	@Column(name="PLAN_SLOT_SEQ")
	private String planSlotSeq;

	private String relpartiescod;

	@Column(name="REQUIR_TMS_FLG")
	private BigDecimal requirTmsFlg;

	@Column(name="RET_ADR_ID")
	private String retAdrId;

	@Column(name="RET_CUST")
	private String retCust;

	private String rmanum;

	private BigDecimal rrlflg;

	@Column(name="RT_ADR_ID")
	private String rtAdrId;

	private String rtcust;

	private BigDecimal rtetransflg;

	@Column(name="RUSH_FLG")
	private BigDecimal rushFlg;

	@Column(name="SF_ADR_ID")
	private String sfAdrId;

	private String sfcust;

	private String shipby;

	@Column(name="SIG_REQ_FLG")
	private BigDecimal sigReqFlg;

	private String slot;

	@Column(name="SRV_TYPE")
	private String srvType;

	@Column(name="ST_ADR_ID")
	private String stAdrId;

	private String stcust;

	@Column(name="SUPER_ORD_FLG")
	private BigDecimal superOrdFlg;

	@Column(name="SUPER_ORDNUM")
	private String superOrdnum;

	@Column(name="TEMPLATE_FLG")
	private BigDecimal templateFlg;

	@Column(name="TEMPLATE_REF")
	private String templateRef;

	@Column(name="WAVE_FLG")
	private BigDecimal waveFlg;

	public Ord() {
	}

	public OrdPK getId() {
		return this.id;
	}

	public void setId(OrdPK id) {
		this.id = id;
	}

	public Date getAdddte() {
		return this.adddte;
	}

	public void setAdddte(Date adddte) {
		this.adddte = adddte;
	}

	public BigDecimal getBcoFlg() {
		return this.bcoFlg;
	}

	public void setBcoFlg(BigDecimal bcoFlg) {
		this.bcoFlg = bcoFlg;
	}

	public BigDecimal getBillFreightFlg() {
		return this.billFreightFlg;
	}

	public void setBillFreightFlg(BigDecimal billFreightFlg) {
		this.billFreightFlg = billFreightFlg;
	}

	public String getBrAdrId() {
		return this.brAdrId;
	}

	public void setBrAdrId(String brAdrId) {
		this.brAdrId = brAdrId;
	}

	public String getBrcust() {
		return this.brcust;
	}

	public void setBrcust(String brcust) {
		this.brcust = brcust;
	}

	public String getBtAdrId() {
		return this.btAdrId;
	}

	public void setBtAdrId(String btAdrId) {
		this.btAdrId = btAdrId;
	}

	public String getBtcust() {
		return this.btcust;
	}

	public void setBtcust(String btcust) {
		this.btcust = btcust;
	}

	public String getBtoSeqnum() {
		return this.btoSeqnum;
	}

	public void setBtoSeqnum(String btoSeqnum) {
		this.btoSeqnum = btoSeqnum;
	}

	public String getBusGrp() {
		return this.busGrp;
	}

	public void setBusGrp(String busGrp) {
		this.busGrp = busGrp;
	}

	public BigDecimal getCarflg() {
		return this.carflg;
	}

	public void setCarflg(BigDecimal carflg) {
		this.carflg = carflg;
	}

	public BigDecimal getCodIndType() {
		return this.codIndType;
	}

	public void setCodIndType(BigDecimal codIndType) {
		this.codIndType = codIndType;
	}

	public String getCodPaymentType() {
		return this.codPaymentType;
	}

	public void setCodPaymentType(String codPaymentType) {
		this.codPaymentType = codPaymentType;
	}

	public String getContractNam() {
		return this.contractNam;
	}

	public void setContractNam(String contractNam) {
		this.contractNam = contractNam;
	}

	public Date getCpodte() {
		return this.cpodte;
	}

	public void setCpodte(Date cpodte) {
		this.cpodte = cpodte;
	}

	public String getCponum() {
		return this.cponum;
	}

	public void setCponum(String cponum) {
		this.cponum = cponum;
	}

	public String getCpotyp() {
		return this.cpotyp;
	}

	public void setCpotyp(String cpotyp) {
		this.cpotyp = cpotyp;
	}

	public String getCrncyCode() {
		return this.crncyCode;
	}

	public void setCrncyCode(String crncyCode) {
		this.crncyCode = crncyCode;
	}

	public String getCsrEmailAdr() {
		return this.csrEmailAdr;
	}

	public void setCsrEmailAdr(String csrEmailAdr) {
		this.csrEmailAdr = csrEmailAdr;
	}

	public String getCsrNam() {
		return this.csrNam;
	}

	public void setCsrNam(String csrNam) {
		this.csrNam = csrNam;
	}

	public String getCsrPhnnum() {
		return this.csrPhnnum;
	}

	public void setCsrPhnnum(String csrPhnnum) {
		this.csrPhnnum = csrPhnnum;
	}

	public String getCstmsAddlInfo() {
		return this.cstmsAddlInfo;
	}

	public void setCstmsAddlInfo(String cstmsAddlInfo) {
		this.cstmsAddlInfo = cstmsAddlInfo;
	}

	public String getCstmsDtycust() {
		return this.cstmsDtycust;
	}

	public void setCstmsDtycust(String cstmsDtycust) {
		this.cstmsDtycust = cstmsDtycust;
	}

	public String getCstmsOrdStat() {
		return this.cstmsOrdStat;
	}

	public void setCstmsOrdStat(String cstmsOrdStat) {
		this.cstmsOrdStat = cstmsOrdStat;
	}

	public String getCstmsOrdtyp() {
		return this.cstmsOrdtyp;
	}

	public void setCstmsOrdtyp(String cstmsOrdtyp) {
		this.cstmsOrdtyp = cstmsOrdtyp;
	}

	public String getCstmsStatNotes() {
		return this.cstmsStatNotes;
	}

	public void setCstmsStatNotes(String cstmsStatNotes) {
		this.cstmsStatNotes = cstmsStatNotes;
	}

	public BigDecimal getCustomsClrFlg() {
		return this.customsClrFlg;
	}

	public void setCustomsClrFlg(BigDecimal customsClrFlg) {
		this.customsClrFlg = customsClrFlg;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDestNum() {
		return this.destNum;
	}

	public void setDestNum(String destNum) {
		this.destNum = destNum;
	}

	public String getDlvContact() {
		return this.dlvContact;
	}

	public void setDlvContact(String dlvContact) {
		this.dlvContact = dlvContact;
	}

	public String getDlvnum() {
		return this.dlvnum;
	}

	public void setDlvnum(String dlvnum) {
		this.dlvnum = dlvnum;
	}

	public BigDecimal getDlvseq() {
		return this.dlvseq;
	}

	public void setDlvseq(BigDecimal dlvseq) {
		this.dlvseq = dlvseq;
	}

	public String getDutyPaymentAcct() {
		return this.dutyPaymentAcct;
	}

	public void setDutyPaymentAcct(String dutyPaymentAcct) {
		this.dutyPaymentAcct = dutyPaymentAcct;
	}

	public String getDutyPaymentType() {
		return this.dutyPaymentType;
	}

	public void setDutyPaymentType(String dutyPaymentType) {
		this.dutyPaymentType = dutyPaymentType;
	}

	public Date getEntdte() {
		return this.entdte;
	}

	public void setEntdte(Date entdte) {
		this.entdte = entdte;
	}

	public String getExciseDtycust() {
		return this.exciseDtycust;
	}

	public void setExciseDtycust(String exciseDtycust) {
		this.exciseDtycust = exciseDtycust;
	}

	public String getExpAdrId() {
		return this.expAdrId;
	}

	public void setExpAdrId(String expAdrId) {
		this.expAdrId = expAdrId;
	}

	public String getExpCust() {
		return this.expCust;
	}

	public void setExpCust(String expCust) {
		this.expCust = expCust;
	}

	public String getExtOrderRef() {
		return this.extOrderRef;
	}

	public void setExtOrderRef(String extOrderRef) {
		this.extOrderRef = extOrderRef;
	}

	public BigDecimal getFrtAllow() {
		return this.frtAllow;
	}

	public void setFrtAllow(BigDecimal frtAllow) {
		this.frtAllow = frtAllow;
	}

	public String getHostApptNum() {
		return this.hostApptNum;
	}

	public void setHostApptNum(String hostApptNum) {
		this.hostApptNum = hostApptNum;
	}

	public String getImpAdrId() {
		return this.impAdrId;
	}

	public void setImpAdrId(String impAdrId) {
		this.impAdrId = impAdrId;
	}

	public String getImpCust() {
		return this.impCust;
	}

	public void setImpCust(String impCust) {
		this.impCust = impCust;
	}

	public String getModUsrId() {
		return this.modUsrId;
	}

	public void setModUsrId(String modUsrId) {
		this.modUsrId = modUsrId;
	}

	public Date getModdte() {
		return this.moddte;
	}

	public void setModdte(Date moddte) {
		this.moddte = moddte;
	}

	public String getOrdDir() {
		return this.ordDir;
	}

	public void setOrdDir(String ordDir) {
		this.ordDir = ordDir;
	}

	public BigDecimal getOrdFrtrte() {
		return this.ordFrtrte;
	}

	public void setOrdFrtrte(BigDecimal ordFrtrte) {
		this.ordFrtrte = ordFrtrte;
	}

	public String getOrdSplCod() {
		return this.ordSplCod;
	}

	public void setOrdSplCod(String ordSplCod) {
		this.ordSplCod = ordSplCod;
	}

	public String getOrdtyp() {
		return this.ordtyp;
	}

	public void setOrdtyp(String ordtyp) {
		this.ordtyp = ordtyp;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaytrm() {
		return this.paytrm;
	}

	public void setPaytrm(String paytrm) {
		this.paytrm = paytrm;
	}

	public String getPlanSlotSeq() {
		return this.planSlotSeq;
	}

	public void setPlanSlotSeq(String planSlotSeq) {
		this.planSlotSeq = planSlotSeq;
	}

	public String getRelpartiescod() {
		return this.relpartiescod;
	}

	public void setRelpartiescod(String relpartiescod) {
		this.relpartiescod = relpartiescod;
	}

	public BigDecimal getRequirTmsFlg() {
		return this.requirTmsFlg;
	}

	public void setRequirTmsFlg(BigDecimal requirTmsFlg) {
		this.requirTmsFlg = requirTmsFlg;
	}

	public String getRetAdrId() {
		return this.retAdrId;
	}

	public void setRetAdrId(String retAdrId) {
		this.retAdrId = retAdrId;
	}

	public String getRetCust() {
		return this.retCust;
	}

	public void setRetCust(String retCust) {
		this.retCust = retCust;
	}

	public String getRmanum() {
		return this.rmanum;
	}

	public void setRmanum(String rmanum) {
		this.rmanum = rmanum;
	}

	public BigDecimal getRrlflg() {
		return this.rrlflg;
	}

	public void setRrlflg(BigDecimal rrlflg) {
		this.rrlflg = rrlflg;
	}

	public String getRtAdrId() {
		return this.rtAdrId;
	}

	public void setRtAdrId(String rtAdrId) {
		this.rtAdrId = rtAdrId;
	}

	public String getRtcust() {
		return this.rtcust;
	}

	public void setRtcust(String rtcust) {
		this.rtcust = rtcust;
	}

	public BigDecimal getRtetransflg() {
		return this.rtetransflg;
	}

	public void setRtetransflg(BigDecimal rtetransflg) {
		this.rtetransflg = rtetransflg;
	}

	public BigDecimal getRushFlg() {
		return this.rushFlg;
	}

	public void setRushFlg(BigDecimal rushFlg) {
		this.rushFlg = rushFlg;
	}

	public String getSfAdrId() {
		return this.sfAdrId;
	}

	public void setSfAdrId(String sfAdrId) {
		this.sfAdrId = sfAdrId;
	}

	public String getSfcust() {
		return this.sfcust;
	}

	public void setSfcust(String sfcust) {
		this.sfcust = sfcust;
	}

	public String getShipby() {
		return this.shipby;
	}

	public void setShipby(String shipby) {
		this.shipby = shipby;
	}

	public BigDecimal getSigReqFlg() {
		return this.sigReqFlg;
	}

	public void setSigReqFlg(BigDecimal sigReqFlg) {
		this.sigReqFlg = sigReqFlg;
	}

	public String getSlot() {
		return this.slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getSrvType() {
		return this.srvType;
	}

	public void setSrvType(String srvType) {
		this.srvType = srvType;
	}

	public String getStAdrId() {
		return this.stAdrId;
	}

	public void setStAdrId(String stAdrId) {
		this.stAdrId = stAdrId;
	}

	public String getStcust() {
		return this.stcust;
	}

	public void setStcust(String stcust) {
		this.stcust = stcust;
	}

	public BigDecimal getSuperOrdFlg() {
		return this.superOrdFlg;
	}

	public void setSuperOrdFlg(BigDecimal superOrdFlg) {
		this.superOrdFlg = superOrdFlg;
	}

	public String getSuperOrdnum() {
		return this.superOrdnum;
	}

	public void setSuperOrdnum(String superOrdnum) {
		this.superOrdnum = superOrdnum;
	}

	public BigDecimal getTemplateFlg() {
		return this.templateFlg;
	}

	public void setTemplateFlg(BigDecimal templateFlg) {
		this.templateFlg = templateFlg;
	}

	public String getTemplateRef() {
		return this.templateRef;
	}

	public void setTemplateRef(String templateRef) {
		this.templateRef = templateRef;
	}

	public BigDecimal getWaveFlg() {
		return this.waveFlg;
	}

	public void setWaveFlg(BigDecimal waveFlg) {
		this.waveFlg = waveFlg;
	}

	@Override
	public String toString() {
		return "Ord [id=" + id + ", adddte=" + adddte + ", bcoFlg=" + bcoFlg + ", billFreightFlg=" + billFreightFlg
				+ ", brAdrId=" + brAdrId + ", brcust=" + brcust + ", btAdrId=" + btAdrId + ", btcust=" + btcust
				+ ", btoSeqnum=" + btoSeqnum + ", busGrp=" + busGrp + ", carflg=" + carflg + ", codIndType="
				+ codIndType + ", codPaymentType=" + codPaymentType + ", contractNam=" + contractNam + ", cpodte="
				+ cpodte + ", cponum=" + cponum + ", cpotyp=" + cpotyp + ", crncyCode=" + crncyCode + ", csrEmailAdr="
				+ csrEmailAdr + ", csrNam=" + csrNam + ", csrPhnnum=" + csrPhnnum + ", cstmsAddlInfo=" + cstmsAddlInfo
				+ ", cstmsDtycust=" + cstmsDtycust + ", cstmsOrdStat=" + cstmsOrdStat + ", cstmsOrdtyp=" + cstmsOrdtyp
				+ ", cstmsStatNotes=" + cstmsStatNotes + ", customsClrFlg=" + customsClrFlg + ", deptno=" + deptno
				+ ", destNum=" + destNum + ", dlvContact=" + dlvContact + ", dlvnum=" + dlvnum + ", dlvseq=" + dlvseq
				+ ", dutyPaymentAcct=" + dutyPaymentAcct + ", dutyPaymentType=" + dutyPaymentType + ", entdte=" + entdte
				+ ", exciseDtycust=" + exciseDtycust + ", expAdrId=" + expAdrId + ", expCust=" + expCust
				+ ", extOrderRef=" + extOrderRef + ", frtAllow=" + frtAllow + ", hostApptNum=" + hostApptNum
				+ ", impAdrId=" + impAdrId + ", impCust=" + impCust + ", modUsrId=" + modUsrId + ", moddte=" + moddte
				+ ", ordDir=" + ordDir + ", ordFrtrte=" + ordFrtrte + ", ordSplCod=" + ordSplCod + ", ordtyp=" + ordtyp
				+ ", paymentType=" + paymentType + ", paytrm=" + paytrm + ", planSlotSeq=" + planSlotSeq
				+ ", relpartiescod=" + relpartiescod + ", requirTmsFlg=" + requirTmsFlg + ", retAdrId=" + retAdrId
				+ ", retCust=" + retCust + ", rmanum=" + rmanum + ", rrlflg=" + rrlflg + ", rtAdrId=" + rtAdrId
				+ ", rtcust=" + rtcust + ", rtetransflg=" + rtetransflg + ", rushFlg=" + rushFlg + ", sfAdrId="
				+ sfAdrId + ", sfcust=" + sfcust + ", shipby=" + shipby + ", sigReqFlg=" + sigReqFlg + ", slot=" + slot
				+ ", srvType=" + srvType + ", stAdrId=" + stAdrId + ", stcust=" + stcust + ", superOrdFlg="
				+ superOrdFlg + ", superOrdnum=" + superOrdnum + ", templateFlg=" + templateFlg + ", templateRef="
				+ templateRef + ", waveFlg=" + waveFlg + "]";
	}

}
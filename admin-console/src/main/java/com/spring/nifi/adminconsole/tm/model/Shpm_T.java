package com.spring.nifi.adminconsole.tm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SHPM_T database table.
 * 
 */
@Entity
@Table(name="SHPM_T", schema= "TMSUSR03")
@NamedQuery(name="Shpm_T.findAll", query="SELECT s FROM Shpm_T s")
public class Shpm_T implements Serializable {
	@Override
	public String toString() {
		return "Shpm_T [shpmId=" + shpmId + ", adtnChrgDlr=" + adtnChrgDlr + ", apSrvcCd=" + apSrvcCd
				+ ", apSrvcCmtdYn=" + apSrvcCmtdYn + ", arCsldRfrcNum=" + arCsldRfrcNum + ", arSrvcCd=" + arSrvcCd
				+ ", arSrvcCmtdYn=" + arSrvcCmtdYn + ", arSrvcMdyYn=" + arSrvcMdyYn + ", billtoCustCd=" + billtoCustCd
				+ ", billtoCustName=" + billtoCustName + ", billtoCustVerId=" + billtoCustVerId + ", bkgMrgeCsldClsId="
				+ bkgMrgeCsldClsId + ", bsDcldDlr=" + bsDcldDlr + ", bsLdnLen=" + bsLdnLen + ", bsOdrDlr=" + bsOdrDlr
				+ ", bsVol=" + bsVol + ", bsWgt=" + bsWgt + ", btchNum=" + btchNum + ", buyerSellerEnu="
				+ buyerSellerEnu + ", carrCd=" + carrCd + ", carrCmtdYn=" + carrCmtdYn + ", cdtyCd=" + cdtyCd
				+ ", cdtyPickSeqNum=" + cdtyPickSeqNum + ", cfmdTms=" + cfmdTms + ", cfmgByLdLegId=" + cfmgByLdLegId
				+ ", cfmgByShpmlegId=" + cfmgByShpmlegId + ", cfmgCount=" + cfmgCount + ", cfmgUsrCd=" + cfmgUsrCd
				+ ", chgdAmtDlr=" + chgdAmtDlr + ", chrgBsdCarrYn=" + chrgBsdCarrYn + ", cncyTyp=" + cncyTyp
				+ ", cnseGrpTyp=" + cnseGrpTyp + ", codToClctDlr=" + codToClctDlr + ", compTypGrpCd=" + compTypGrpCd
				+ ", crtdDtt=" + crtdDtt + ", crtdUsrCd=" + crtdUsrCd + ", csldCls=" + csldCls + ", curFnclstatId="
				+ curFnclstatId + ", curOptlstatId=" + curOptlstatId + ", custCd=" + custCd + ", custName=" + custName
				+ ", custSrvcRepTyp=" + custSrvcRepTyp + ", custVerId=" + custVerId + ", dclValRqrdYn=" + dclValRqrdYn
				+ ", dcldValDlr=" + dcldValDlr + ", defrApRatgYn=" + defrApRatgYn + ", defrArRatgYn=" + defrArRatgYn
				+ ", dftIncoShpgLocTypEnu=" + dftIncoShpgLocTypEnu + ", displayStatus=" + displayStatus + ", divCd="
				+ divCd + ", drctFrhtYn=" + drctFrhtYn + ", dsctAmtDlr=" + dsctAmtDlr + ", echgRate=" + echgRate
				+ ", elgbDivTsfrYn=" + elgbDivTsfrYn + ", elgbLgstAssnYn=" + elgbLgstAssnYn + ", elpdTm=" + elpdTm
				+ ", entMdEnu=" + entMdEnu + ", eqmtTypCmtdYn=" + eqmtTypCmtdYn + ", eqmtTypTrctrCmtdYn="
				+ eqmtTypTrctrCmtdYn + ", extlEginVerCd=" + extlEginVerCd + ", fedlTaxAmtDlr=" + fedlTaxAmtDlr
				+ ", flexQnty1=" + flexQnty1 + ", flexQnty2=" + flexQnty2 + ", flexQnty3=" + flexQnty3 + ", flexQnty4="
				+ flexQnty4 + ", flexQnty5=" + flexQnty5 + ", fmxbillrunId=" + fmxbillrunId + ", fmxcollectrunDtt="
				+ fmxcollectrunDtt + ", fmxcollectrunId=" + fmxcollectrunId + ", fnclQueId=" + fnclQueId
				+ ", frhtTrmsEnu=" + frhtTrmsEnu + ", frmAddrId=" + frmAddrId + ", frmCtryCd=" + frmCtryCd
				+ ", frmCtyName=" + frmCtyName + ", frmDlvyDtt=" + frmDlvyDtt + ", frmName=" + frmName + ", frmPkupDtt="
				+ frmPkupDtt + ", frmPstlCd=" + frmPstlCd + ", frmShipLocEnu=" + frmShipLocEnu + ", frmShpgAddrId="
				+ frmShpgAddrId + ", frmShpgLocCd=" + frmShpgLocCd + ", frmStaCd=" + frmStaCd + ", fullChkRqrdYn="
				+ fullChkRqrdYn + ", highNoteIprsEnu=" + highNoteIprsEnu + ", holdSecCd=" + holdSecCd + ", holdYn="
				+ holdYn + ", incoShpgLocCd=" + incoShpgLocCd + ", incoShpgLocEnu=" + incoShpgLocEnu + ", incoTermsCd="
				+ incoTermsCd + ", incoTermsCmtdYn=" + incoTermsCmtdYn + ", incoVerEnu=" + incoVerEnu
				+ ", inelgbSelDltdYn=" + inelgbSelDltdYn + ", inptCncy=" + inptCncy + ", inptEchgRate=" + inptEchgRate
				+ ", inptSrcEnu=" + inptSrcEnu + ", inptUmsrDistEnu=" + inptUmsrDistEnu + ", inptUmsrLenEnu="
				+ inptUmsrLenEnu + ", inptUmsrSysEnu=" + inptUmsrSysEnu + ", inptUmsrWgtEnu=" + inptUmsrWgtEnu
				+ ", itmGrpCd=" + itmGrpCd + ", jrnyTpltCd=" + jrnyTpltCd + ", lastRatdDtt=" + lastRatdDtt
				+ ", lastRatdTffId=" + lastRatdTffId + ", ldGrp=" + ldGrp + ", ldLegId=" + ldLegId + ", ldnLen="
				+ ldnLen + ", lgstGrpCd=" + lgstGrpCd + ", lldDetlRptYn=" + lldDetlRptYn + ", locTaxAmtDlr="
				+ locTaxAmtDlr + ", maxOdrValAmt=" + maxOdrValAmt + ", maxShpmVol=" + maxShpmVol + ", maxShpmWgt="
				+ maxShpmWgt + ", minOdrValAmt=" + minOdrValAmt + ", mitccStrgEnu=" + mitccStrgEnu + ", mmoId=" + mmoId
				+ ", mrgeCsldClsId=" + mrgeCsldClsId + ", mrgeCsldSeqNum=" + mrgeCsldSeqNum + ", mxdLdYn=" + mxdLdYn
				+ ", nmnlWgt=" + nmnlWgt + ", numLdLegDetl=" + numLdLegDetl + ", numShpmSplit=" + numShpmSplit
				+ ", odrSrcEnu=" + odrSrcEnu + ", odrValDlr=" + odrValDlr + ", odrValRqrdYn=" + odrValRqrdYn
				+ ", opLstNonEmtyYn=" + opLstNonEmtyYn + ", optLck=" + optLck + ", ordrGrpCd=" + ordrGrpCd
				+ ", ovrdFrmDlvyDtt=" + ovrdFrmDlvyDtt + ", ovrdFrmPkupDtt=" + ovrdFrmPkupDtt + ", ovrdHrznLvlEnu="
				+ ovrdHrznLvlEnu + ", ovrdToDlvyDtt=" + ovrdToDlvyDtt + ", ovrdToPkupDtt=" + ovrdToPkupDtt
				+ ", planCount=" + planCount + ", planId=" + planId + ", plngYn=" + plngYn + ", postCnfnUpdYn="
				+ postCnfnUpdYn + ", precsldAmtDlr=" + precsldAmtDlr + ", prepaidSegOnlyYn=" + prepaidSegOnlyYn
				+ ", prfCtrTyp=" + prfCtrTyp + ", prjCd=" + prjCd + ", proRateCompsYn=" + proRateCompsYn
				+ ", prpdAmtDlr=" + prpdAmtDlr + ", prty=" + prty + ", ratdDtt=" + ratdDtt + ", rateCd=" + rateCd
				+ ", rateCdTffId=" + rateCdTffId + ", rateOvrdRsnTyp=" + rateOvrdRsnTyp + ", rateOvrdUsrCd="
				+ rateOvrdUsrCd + ", rateovrdDtt=" + rateovrdDtt + ", ratgVlidYn=" + ratgVlidYn + ", retFnclstatId="
				+ retFnclstatId + ", retOptlstatId=" + retOptlstatId + ", retShpmYn=" + retShpmYn + ", rfrcNumVbtyId="
				+ rfrcNumVbtyId + ", rfrcNum1=" + rfrcNum1 + ", rfrcNum10=" + rfrcNum10 + ", rfrcNum11=" + rfrcNum11
				+ ", rfrcNum12=" + rfrcNum12 + ", rfrcNum13=" + rfrcNum13 + ", rfrcNum14=" + rfrcNum14 + ", rfrcNum15="
				+ rfrcNum15 + ", rfrcNum16=" + rfrcNum16 + ", rfrcNum17=" + rfrcNum17 + ", rfrcNum18=" + rfrcNum18
				+ ", rfrcNum19=" + rfrcNum19 + ", rfrcNum2=" + rfrcNum2 + ", rfrcNum20=" + rfrcNum20 + ", rfrcNum21="
				+ rfrcNum21 + ", rfrcNum22=" + rfrcNum22 + ", rfrcNum23=" + rfrcNum23 + ", rfrcNum24=" + rfrcNum24
				+ ", rfrcNum25=" + rfrcNum25 + ", rfrcNum26=" + rfrcNum26 + ", rfrcNum27=" + rfrcNum27 + ", rfrcNum28="
				+ rfrcNum28 + ", rfrcNum29=" + rfrcNum29 + ", rfrcNum3=" + rfrcNum3 + ", rfrcNum30=" + rfrcNum30
				+ ", rfrcNum4=" + rfrcNum4 + ", rfrcNum5=" + rfrcNum5 + ", rfrcNum6=" + rfrcNum6 + ", rfrcNum7="
				+ rfrcNum7 + ", rfrcNum8=" + rfrcNum8 + ", rfrcNum9=" + rfrcNum9 + ", routLaneId=" + routLaneId
				+ ", rqrdEqmtTyp=" + rqrdEqmtTyp + ", rqrdEqmtTypTrctr=" + rqrdEqmtTypTrctr + ", rshpRsnCdTyp="
				+ rshpRsnCdTyp + ", rutdDestZnCd=" + rutdDestZnCd + ", rutdOriZnCd=" + rutdOriZnCd + ", rvnuTrptOdrYn="
				+ rvnuTrptOdrYn + ", salePersCd=" + salePersCd + ", scldWgt=" + scldWgt + ", shftSeq=" + shftSeq
				+ ", shpmDesc=" + shpmDesc + ", shpmNum=" + shpmNum + ", spfmAptRqrdYn=" + spfmAptRqrdYn
				+ ", splitMthdEnu=" + splitMthdEnu + ", splitReviewEnu=" + splitReviewEnu + ", splitShpmNum="
				+ splitShpmNum + ", spotRateYn=" + spotRateYn + ", sptoAptRqrdYn=" + sptoAptRqrdYn + ", staTaxAmtDlr="
				+ staTaxAmtDlr + ", sysCalcAmtDlr=" + sysCalcAmtDlr + ", tdracptCount=" + tdracptCount
				+ ", tenderCount=" + tenderCount + ", tffId=" + tffId + ", tffTotDist=" + tffTotDist + ", tnstMdCmtdYn="
				+ tnstMdCmtdYn + ", tnstMdEnu=" + tnstMdEnu + ", toAddrId=" + toAddrId + ", toCtryCd=" + toCtryCd
				+ ", toCtyName=" + toCtyName + ", toDlvyDtt=" + toDlvyDtt + ", toEntTypCd=" + toEntTypCd
				+ ", toEntVerCd=" + toEntVerCd + ", toName=" + toName + ", toPkupDtt=" + toPkupDtt + ", toPstlCd="
				+ toPstlCd + ", toShipLocEnu=" + toShipLocEnu + ", toShpgAddrId=" + toShpgAddrId + ", toShpgLocCd="
				+ toShpgLocCd + ", toStaCd=" + toStaCd + ", totMileDist=" + totMileDist + ", totPce=" + totPce
				+ ", totSkid=" + totSkid + ", totTareWgt=" + totTareWgt + ", trptOdrCd=" + trptOdrCd + ", umsrdistEnu="
				+ umsrdistEnu + ", umsrlenEnu=" + umsrlenEnu + ", umsrsysEnu=" + umsrsysEnu + ", umsrwgtEnu="
				+ umsrwgtEnu + ", unitsRqrdYn=" + unitsRqrdYn + ", updtDtt=" + updtDtt + ", updtUsrCd=" + updtUsrCd
				+ ", urgtYn=" + urgtYn + ", vchrRunExcpId=" + vchrRunExcpId + ", vldtItm=" + vldtItm + ", vol=" + vol
				+ ", volRqrdYn=" + volRqrdYn + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SHPM_ID")
	private long shpmId;

	@Column(name="ADTN_CHRG_DLR")
	private BigDecimal adtnChrgDlr;

	@Column(name="AP_SRVC_CD")
	private String apSrvcCd;

	@Column(name="AP_SRVC_CMTD_YN")
	private String apSrvcCmtdYn;

	@Column(name="AR_CSLD_RFRC_NUM")
	private String arCsldRfrcNum;

	@Column(name="AR_SRVC_CD")
	private String arSrvcCd;

	@Column(name="AR_SRVC_CMTD_YN")
	private String arSrvcCmtdYn;

	@Column(name="AR_SRVC_MDY_YN")
	private String arSrvcMdyYn;

	@Column(name="BILLTO_CUST_CD")
	private String billtoCustCd;

	@Column(name="BILLTO_CUST_NAME")
	private String billtoCustName;

	@Column(name="BILLTO_CUST_VER_ID")
	private BigDecimal billtoCustVerId;

	@Column(name="BKG_MRGE_CSLD_CLS_ID")
	private String bkgMrgeCsldClsId;

	@Column(name="BS_DCLD_DLR")
	private BigDecimal bsDcldDlr;

	@Column(name="BS_LDN_LEN")
	private BigDecimal bsLdnLen;

	@Column(name="BS_ODR_DLR")
	private BigDecimal bsOdrDlr;

	@Column(name="BS_VOL")
	private BigDecimal bsVol;

	@Column(name="BS_WGT")
	private BigDecimal bsWgt;

	@Column(name="BTCH_NUM")
	private BigDecimal btchNum;

	@Column(name="BUYER_SELLER_ENU")
	private BigDecimal buyerSellerEnu;

	@Column(name="CARR_CD")
	private String carrCd;

	@Column(name="CARR_CMTD_YN")
	private String carrCmtdYn;

	@Column(name="CDTY_CD")
	private String cdtyCd;

	@Column(name="CDTY_PICK_SEQ_NUM")
	private BigDecimal cdtyPickSeqNum;

	@Column(name="CFMD_TMS")
	private BigDecimal cfmdTms;

	@Column(name="CFMG_BY_LD_LEG_ID")
	private BigDecimal cfmgByLdLegId;

	@Column(name="CFMG_BY_SHPMLEG_ID")
	private BigDecimal cfmgByShpmlegId;

	@Column(name="CFMG_COUNT")
	private BigDecimal cfmgCount;

	@Column(name="CFMG_USR_CD")
	private String cfmgUsrCd;

	@Column(name="CHGD_AMT_DLR")
	private BigDecimal chgdAmtDlr;

	@Column(name="CHRG_BSD_CARR_YN")
	private String chrgBsdCarrYn;

	@Column(name="CNCY_TYP")
	private BigDecimal cncyTyp;

	@Column(name="CNSE_GRP_TYP")
	private BigDecimal cnseGrpTyp;

	@Column(name="COD_TO_CLCT_DLR")
	private BigDecimal codToClctDlr;

	@Column(name="COMP_TYP_GRP_CD")
	private String compTypGrpCd;

	@Temporal(TemporalType.DATE)
	@Column(name="CRTD_DTT")
	private Date crtdDtt;

	@Column(name="CRTD_USR_CD")
	private String crtdUsrCd;

	@Column(name="CSLD_CLS")
	private String csldCls;

	@Column(name="CUR_FNCLSTAT_ID")
	private BigDecimal curFnclstatId;

	@Column(name="CUR_OPTLSTAT_ID")
	private BigDecimal curOptlstatId;

	@Column(name="CUST_CD")
	private String custCd;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="CUST_SRVC_REP_TYP")
	private BigDecimal custSrvcRepTyp;

	@Column(name="CUST_VER_ID")
	private BigDecimal custVerId;

	@Column(name="DCL_VAL_RQRD_YN")
	private String dclValRqrdYn;

	@Column(name="DCLD_VAL_DLR")
	private BigDecimal dcldValDlr;

	@Column(name="DEFR_AP_RATG_YN")
	private String defrApRatgYn;

	@Column(name="DEFR_AR_RATG_YN")
	private String defrArRatgYn;

	@Column(name="DFT_INCO_SHPG_LOC_TYP_ENU")
	private BigDecimal dftIncoShpgLocTypEnu;

	@Column(name="DISPLAY_STATUS")
	private BigDecimal displayStatus;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="DRCT_FRHT_YN")
	private String drctFrhtYn;

	@Column(name="DSCT_AMT_DLR")
	private BigDecimal dsctAmtDlr;

	@Column(name="ECHG_RATE")
	private BigDecimal echgRate;

	@Column(name="ELGB_DIV_TSFR_YN")
	private String elgbDivTsfrYn;

	@Column(name="ELGB_LGST_ASSN_YN")
	private String elgbLgstAssnYn;

	@Column(name="ELPD_TM")
	private BigDecimal elpdTm;

	@Column(name="ENT_MD_ENU")
	private BigDecimal entMdEnu;

	@Column(name="EQMT_TYP_CMTD_YN")
	private String eqmtTypCmtdYn;

	@Column(name="EQMT_TYP_TRCTR_CMTD_YN")
	private String eqmtTypTrctrCmtdYn;

	@Column(name="EXTL_EGIN_VER_CD")
	private String extlEginVerCd;

	@Column(name="FEDL_TAX_AMT_DLR")
	private BigDecimal fedlTaxAmtDlr;

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

	@Column(name="FMXBILLRUN_ID")
	private BigDecimal fmxbillrunId;

	@Temporal(TemporalType.DATE)
	@Column(name="FMXCOLLECTRUN_DTT")
	private Date fmxcollectrunDtt;

	@Column(name="FMXCOLLECTRUN_ID")
	private BigDecimal fmxcollectrunId;

	@Column(name="FNCL_QUE_ID")
	private BigDecimal fnclQueId;

	@Column(name="FRHT_TRMS_ENU")
	private BigDecimal frhtTrmsEnu;

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

	@Column(name="FRM_SHPG_ADDR_ID")
	private BigDecimal frmShpgAddrId;

	@Column(name="FRM_SHPG_LOC_CD")
	private String frmShpgLocCd;

	@Column(name="FRM_STA_CD")
	private String frmStaCd;

	@Column(name="FULL_CHK_RQRD_YN")
	private String fullChkRqrdYn;

	@Column(name="HIGH_NOTE_IPRS_ENU")
	private BigDecimal highNoteIprsEnu;

	@Column(name="HOLD_SEC_CD")
	private String holdSecCd;

	@Column(name="HOLD_YN")
	private String holdYn;

	@Column(name="INCO_SHPG_LOC_CD")
	private String incoShpgLocCd;

	@Column(name="INCO_SHPG_LOC_ENU")
	private BigDecimal incoShpgLocEnu;

	@Column(name="INCO_TERMS_CD")
	private String incoTermsCd;

	@Column(name="INCO_TERMS_CMTD_YN")
	private String incoTermsCmtdYn;

	@Column(name="INCO_VER_ENU")
	private BigDecimal incoVerEnu;

	@Column(name="INELGB_SEL_DLTD_YN")
	private String inelgbSelDltdYn;

	@Column(name="INPT_CNCY")
	private BigDecimal inptCncy;

	@Column(name="INPT_ECHG_RATE")
	private BigDecimal inptEchgRate;

	@Column(name="INPT_SRC_ENU")
	private BigDecimal inptSrcEnu;

	@Column(name="INPT_UMSR_DIST_ENU")
	private BigDecimal inptUmsrDistEnu;

	@Column(name="INPT_UMSR_LEN_ENU")
	private BigDecimal inptUmsrLenEnu;

	@Column(name="INPT_UMSR_SYS_ENU")
	private BigDecimal inptUmsrSysEnu;

	@Column(name="INPT_UMSR_WGT_ENU")
	private BigDecimal inptUmsrWgtEnu;

	@Column(name="ITM_GRP_CD")
	private String itmGrpCd;

	@Column(name="JRNY_TPLT_CD")
	private String jrnyTpltCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_RATD_DTT")
	private Date lastRatdDtt;

	@Column(name="LAST_RATD_TFF_ID")
	private BigDecimal lastRatdTffId;

	@Column(name="LD_GRP")
	private String ldGrp;

	@Column(name="LD_LEG_ID")
	private BigDecimal ldLegId;

	@Column(name="LDN_LEN")
	private BigDecimal ldnLen;

	@Column(name="LGST_GRP_CD")
	private String lgstGrpCd;

	@Column(name="LLD_DETL_RPT_YN")
	private String lldDetlRptYn;

	@Column(name="LOC_TAX_AMT_DLR")
	private BigDecimal locTaxAmtDlr;

	@Column(name="MAX_ODR_VAL_AMT")
	private BigDecimal maxOdrValAmt;

	@Column(name="MAX_SHPM_VOL")
	private BigDecimal maxShpmVol;

	@Column(name="MAX_SHPM_WGT")
	private BigDecimal maxShpmWgt;

	@Column(name="MIN_ODR_VAL_AMT")
	private BigDecimal minOdrValAmt;

	@Column(name="MITCC_STRG_ENU")
	private BigDecimal mitccStrgEnu;

	@Column(name="MMO_ID")
	private BigDecimal mmoId;

	@Column(name="MRGE_CSLD_CLS_ID")
	private String mrgeCsldClsId;

	@Column(name="MRGE_CSLD_SEQ_NUM")
	private BigDecimal mrgeCsldSeqNum;

	@Column(name="MXD_LD_YN")
	private String mxdLdYn;

	@Column(name="NMNL_WGT")
	private BigDecimal nmnlWgt;

	@Column(name="NUM_LD_LEG_DETL")
	private BigDecimal numLdLegDetl;

	@Column(name="NUM_SHPM_SPLIT")
	private BigDecimal numShpmSplit;

	@Column(name="ODR_SRC_ENU")
	private BigDecimal odrSrcEnu;

	@Column(name="ODR_VAL_DLR")
	private BigDecimal odrValDlr;

	@Column(name="ODR_VAL_RQRD_YN")
	private String odrValRqrdYn;

	@Column(name="OP_LST_NON_EMTY_YN")
	private String opLstNonEmtyYn;

	@Column(name="OPT_LCK")
	private BigDecimal optLck;

	@Column(name="ORDR_GRP_CD")
	private String ordrGrpCd;

	@Temporal(TemporalType.DATE)
	@Column(name="OVRD_FRM_DLVY_DTT")
	private Date ovrdFrmDlvyDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="OVRD_FRM_PKUP_DTT")
	private Date ovrdFrmPkupDtt;

	@Column(name="OVRD_HRZN_LVL_ENU")
	private BigDecimal ovrdHrznLvlEnu;

	@Temporal(TemporalType.DATE)
	@Column(name="OVRD_TO_DLVY_DTT")
	private Date ovrdToDlvyDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="OVRD_TO_PKUP_DTT")
	private Date ovrdToPkupDtt;

	@Column(name="PLAN_COUNT")
	private BigDecimal planCount;

	@Column(name="PLAN_ID")
	private BigDecimal planId;

	@Column(name="PLNG_YN")
	private String plngYn;

	@Column(name="POST_CNFN_UPD_YN")
	private String postCnfnUpdYn;

	@Column(name="PRECSLD_AMT_DLR")
	private BigDecimal precsldAmtDlr;

	@Column(name="PREPAID_SEG_ONLY_YN")
	private String prepaidSegOnlyYn;

	@Column(name="PRF_CTR_TYP")
	private BigDecimal prfCtrTyp;

	@Column(name="PRJ_CD")
	private String prjCd;

	@Column(name="PRO_RATE_COMPS_YN")
	private String proRateCompsYn;

	@Column(name="PRPD_AMT_DLR")
	private BigDecimal prpdAmtDlr;

	private BigDecimal prty;

	@Temporal(TemporalType.DATE)
	@Column(name="RATD_DTT")
	private Date ratdDtt;

	@Column(name="RATE_CD")
	private String rateCd;

	@Column(name="RATE_CD_TFF_ID")
	private BigDecimal rateCdTffId;

	@Column(name="RATE_OVRD_RSN_TYP")
	private BigDecimal rateOvrdRsnTyp;

	@Column(name="RATE_OVRD_USR_CD")
	private String rateOvrdUsrCd;

	@Temporal(TemporalType.DATE)
	@Column(name="RATEOVRD_DTT")
	private Date rateovrdDtt;

	@Column(name="RATG_VLID_YN")
	private String ratgVlidYn;

	@Column(name="RET_FNCLSTAT_ID")
	private BigDecimal retFnclstatId;

	@Column(name="RET_OPTLSTAT_ID")
	private BigDecimal retOptlstatId;

	@Column(name="RET_SHPM_YN")
	private String retShpmYn;

	@Column(name="RFRC_NUM_VBTY_ID")
	private BigDecimal rfrcNumVbtyId;

	@Column(name="RFRC_NUM1")
	private String rfrcNum1;

	@Column(name="RFRC_NUM10")
	private String rfrcNum10;

	@Column(name="RFRC_NUM11")
	private String rfrcNum11;

	@Column(name="RFRC_NUM12")
	private String rfrcNum12;

	@Column(name="RFRC_NUM13")
	private String rfrcNum13;

	@Column(name="RFRC_NUM14")
	private String rfrcNum14;

	@Column(name="RFRC_NUM15")
	private String rfrcNum15;

	@Column(name="RFRC_NUM16")
	private String rfrcNum16;

	@Column(name="RFRC_NUM17")
	private String rfrcNum17;

	@Column(name="RFRC_NUM18")
	private String rfrcNum18;

	@Column(name="RFRC_NUM19")
	private String rfrcNum19;

	@Column(name="RFRC_NUM2")
	private String rfrcNum2;

	@Column(name="RFRC_NUM20")
	private String rfrcNum20;

	@Column(name="RFRC_NUM21")
	private String rfrcNum21;

	@Column(name="RFRC_NUM22")
	private String rfrcNum22;

	@Column(name="RFRC_NUM23")
	private String rfrcNum23;

	@Column(name="RFRC_NUM24")
	private String rfrcNum24;

	@Column(name="RFRC_NUM25")
	private String rfrcNum25;

	@Column(name="RFRC_NUM26")
	private String rfrcNum26;

	@Column(name="RFRC_NUM27")
	private String rfrcNum27;

	@Column(name="RFRC_NUM28")
	private String rfrcNum28;

	@Column(name="RFRC_NUM29")
	private String rfrcNum29;

	@Column(name="RFRC_NUM3")
	private String rfrcNum3;

	@Column(name="RFRC_NUM30")
	private String rfrcNum30;

	@Column(name="RFRC_NUM4")
	private String rfrcNum4;

	@Column(name="RFRC_NUM5")
	private String rfrcNum5;

	@Column(name="RFRC_NUM6")
	private String rfrcNum6;

	@Column(name="RFRC_NUM7")
	private String rfrcNum7;

	@Column(name="RFRC_NUM8")
	private String rfrcNum8;

	@Column(name="RFRC_NUM9")
	private String rfrcNum9;

	@Column(name="ROUT_LANE_ID")
	private BigDecimal routLaneId;

	@Column(name="RQRD_EQMT_TYP")
	private String rqrdEqmtTyp;

	@Column(name="RQRD_EQMT_TYP_TRCTR")
	private String rqrdEqmtTypTrctr;

	@Column(name="RSHP_RSN_CD_TYP")
	private BigDecimal rshpRsnCdTyp;

	@Column(name="RUTD_DEST_ZN_CD")
	private String rutdDestZnCd;

	@Column(name="RUTD_ORI_ZN_CD")
	private String rutdOriZnCd;

	@Column(name="RVNU_TRPT_ODR_YN")
	private String rvnuTrptOdrYn;

	@Column(name="SALE_PERS_CD")
	private String salePersCd;

	@Column(name="SCLD_WGT")
	private BigDecimal scldWgt;

	@Column(name="SHFT_SEQ")
	private BigDecimal shftSeq;

	@Column(name="SHPM_DESC")
	private String shpmDesc;

	@Column(name="SHPM_NUM")
	private String shpmNum;

	@Column(name="SPFM_APT_RQRD_YN")
	private String spfmAptRqrdYn;

	@Column(name="SPLIT_MTHD_ENU")
	private BigDecimal splitMthdEnu;

	@Column(name="SPLIT_REVIEW_ENU")
	private BigDecimal splitReviewEnu;

	@Column(name="SPLIT_SHPM_NUM")
	private String splitShpmNum;

	@Column(name="SPOT_RATE_YN")
	private String spotRateYn;

	@Column(name="SPTO_APT_RQRD_YN")
	private String sptoAptRqrdYn;

	@Column(name="STA_TAX_AMT_DLR")
	private BigDecimal staTaxAmtDlr;

	@Column(name="SYS_CALC_AMT_DLR")
	private BigDecimal sysCalcAmtDlr;

	@Column(name="TDRACPT_COUNT")
	private BigDecimal tdracptCount;

	@Column(name="TENDER_COUNT")
	private BigDecimal tenderCount;

	@Column(name="TFF_ID")
	private BigDecimal tffId;

	@Column(name="TFF_TOT_DIST")
	private BigDecimal tffTotDist;

	@Column(name="TNST_MD_CMTD_YN")
	private String tnstMdCmtdYn;

	@Column(name="TNST_MD_ENU")
	private BigDecimal tnstMdEnu;

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

	@Column(name="TO_SHPG_ADDR_ID")
	private BigDecimal toShpgAddrId;

	@Column(name="TO_SHPG_LOC_CD")
	private String toShpgLocCd;

	@Column(name="TO_STA_CD")
	private String toStaCd;

	@Column(name="TOT_MILE_DIST")
	private BigDecimal totMileDist;

	@Column(name="TOT_PCE")
	private BigDecimal totPce;

	@Column(name="TOT_SKID")
	private BigDecimal totSkid;

	@Column(name="TOT_TARE_WGT")
	private BigDecimal totTareWgt;

	@Column(name="TRPT_ODR_CD")
	private String trptOdrCd;

	@Column(name="UMSRDIST_ENU")
	private BigDecimal umsrdistEnu;

	@Column(name="UMSRLEN_ENU")
	private BigDecimal umsrlenEnu;

	@Column(name="UMSRSYS_ENU")
	private BigDecimal umsrsysEnu;

	@Column(name="UMSRWGT_ENU")
	private BigDecimal umsrwgtEnu;

	@Column(name="UNITS_RQRD_YN")
	private String unitsRqrdYn;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDT_DTT")
	private Date updtDtt;

	@Column(name="UPDT_USR_CD")
	private String updtUsrCd;

	@Column(name="URGT_YN")
	private String urgtYn;

	@Column(name="VCHR_RUN_EXCP_ID")
	private BigDecimal vchrRunExcpId;

	@Column(name="VLDT_ITM")
	private BigDecimal vldtItm;

	private BigDecimal vol;

	@Column(name="VOL_RQRD_YN")
	private String volRqrdYn;

	public Shpm_T() {
	}

	public long getShpmId() {
		return this.shpmId;
	}

	public void setShpmId(long shpmId) {
		this.shpmId = shpmId;
	}

	public BigDecimal getAdtnChrgDlr() {
		return this.adtnChrgDlr;
	}

	public void setAdtnChrgDlr(BigDecimal adtnChrgDlr) {
		this.adtnChrgDlr = adtnChrgDlr;
	}

	public String getApSrvcCd() {
		return this.apSrvcCd;
	}

	public void setApSrvcCd(String apSrvcCd) {
		this.apSrvcCd = apSrvcCd;
	}

	public String getApSrvcCmtdYn() {
		return this.apSrvcCmtdYn;
	}

	public void setApSrvcCmtdYn(String apSrvcCmtdYn) {
		this.apSrvcCmtdYn = apSrvcCmtdYn;
	}

	public String getArCsldRfrcNum() {
		return this.arCsldRfrcNum;
	}

	public void setArCsldRfrcNum(String arCsldRfrcNum) {
		this.arCsldRfrcNum = arCsldRfrcNum;
	}

	public String getArSrvcCd() {
		return this.arSrvcCd;
	}

	public void setArSrvcCd(String arSrvcCd) {
		this.arSrvcCd = arSrvcCd;
	}

	public String getArSrvcCmtdYn() {
		return this.arSrvcCmtdYn;
	}

	public void setArSrvcCmtdYn(String arSrvcCmtdYn) {
		this.arSrvcCmtdYn = arSrvcCmtdYn;
	}

	public String getArSrvcMdyYn() {
		return this.arSrvcMdyYn;
	}

	public void setArSrvcMdyYn(String arSrvcMdyYn) {
		this.arSrvcMdyYn = arSrvcMdyYn;
	}

	public String getBilltoCustCd() {
		return this.billtoCustCd;
	}

	public void setBilltoCustCd(String billtoCustCd) {
		this.billtoCustCd = billtoCustCd;
	}

	public String getBilltoCustName() {
		return this.billtoCustName;
	}

	public void setBilltoCustName(String billtoCustName) {
		this.billtoCustName = billtoCustName;
	}

	public BigDecimal getBilltoCustVerId() {
		return this.billtoCustVerId;
	}

	public void setBilltoCustVerId(BigDecimal billtoCustVerId) {
		this.billtoCustVerId = billtoCustVerId;
	}

	public String getBkgMrgeCsldClsId() {
		return this.bkgMrgeCsldClsId;
	}

	public void setBkgMrgeCsldClsId(String bkgMrgeCsldClsId) {
		this.bkgMrgeCsldClsId = bkgMrgeCsldClsId;
	}

	public BigDecimal getBsDcldDlr() {
		return this.bsDcldDlr;
	}

	public void setBsDcldDlr(BigDecimal bsDcldDlr) {
		this.bsDcldDlr = bsDcldDlr;
	}

	public BigDecimal getBsLdnLen() {
		return this.bsLdnLen;
	}

	public void setBsLdnLen(BigDecimal bsLdnLen) {
		this.bsLdnLen = bsLdnLen;
	}

	public BigDecimal getBsOdrDlr() {
		return this.bsOdrDlr;
	}

	public void setBsOdrDlr(BigDecimal bsOdrDlr) {
		this.bsOdrDlr = bsOdrDlr;
	}

	public BigDecimal getBsVol() {
		return this.bsVol;
	}

	public void setBsVol(BigDecimal bsVol) {
		this.bsVol = bsVol;
	}

	public BigDecimal getBsWgt() {
		return this.bsWgt;
	}

	public void setBsWgt(BigDecimal bsWgt) {
		this.bsWgt = bsWgt;
	}

	public BigDecimal getBtchNum() {
		return this.btchNum;
	}

	public void setBtchNum(BigDecimal btchNum) {
		this.btchNum = btchNum;
	}

	public BigDecimal getBuyerSellerEnu() {
		return this.buyerSellerEnu;
	}

	public void setBuyerSellerEnu(BigDecimal buyerSellerEnu) {
		this.buyerSellerEnu = buyerSellerEnu;
	}

	public String getCarrCd() {
		return this.carrCd;
	}

	public void setCarrCd(String carrCd) {
		this.carrCd = carrCd;
	}

	public String getCarrCmtdYn() {
		return this.carrCmtdYn;
	}

	public void setCarrCmtdYn(String carrCmtdYn) {
		this.carrCmtdYn = carrCmtdYn;
	}

	public String getCdtyCd() {
		return this.cdtyCd;
	}

	public void setCdtyCd(String cdtyCd) {
		this.cdtyCd = cdtyCd;
	}

	public BigDecimal getCdtyPickSeqNum() {
		return this.cdtyPickSeqNum;
	}

	public void setCdtyPickSeqNum(BigDecimal cdtyPickSeqNum) {
		this.cdtyPickSeqNum = cdtyPickSeqNum;
	}

	public BigDecimal getCfmdTms() {
		return this.cfmdTms;
	}

	public void setCfmdTms(BigDecimal cfmdTms) {
		this.cfmdTms = cfmdTms;
	}

	public BigDecimal getCfmgByLdLegId() {
		return this.cfmgByLdLegId;
	}

	public void setCfmgByLdLegId(BigDecimal cfmgByLdLegId) {
		this.cfmgByLdLegId = cfmgByLdLegId;
	}

	public BigDecimal getCfmgByShpmlegId() {
		return this.cfmgByShpmlegId;
	}

	public void setCfmgByShpmlegId(BigDecimal cfmgByShpmlegId) {
		this.cfmgByShpmlegId = cfmgByShpmlegId;
	}

	public BigDecimal getCfmgCount() {
		return this.cfmgCount;
	}

	public void setCfmgCount(BigDecimal cfmgCount) {
		this.cfmgCount = cfmgCount;
	}

	public String getCfmgUsrCd() {
		return this.cfmgUsrCd;
	}

	public void setCfmgUsrCd(String cfmgUsrCd) {
		this.cfmgUsrCd = cfmgUsrCd;
	}

	public BigDecimal getChgdAmtDlr() {
		return this.chgdAmtDlr;
	}

	public void setChgdAmtDlr(BigDecimal chgdAmtDlr) {
		this.chgdAmtDlr = chgdAmtDlr;
	}

	public String getChrgBsdCarrYn() {
		return this.chrgBsdCarrYn;
	}

	public void setChrgBsdCarrYn(String chrgBsdCarrYn) {
		this.chrgBsdCarrYn = chrgBsdCarrYn;
	}

	public BigDecimal getCncyTyp() {
		return this.cncyTyp;
	}

	public void setCncyTyp(BigDecimal cncyTyp) {
		this.cncyTyp = cncyTyp;
	}

	public BigDecimal getCnseGrpTyp() {
		return this.cnseGrpTyp;
	}

	public void setCnseGrpTyp(BigDecimal cnseGrpTyp) {
		this.cnseGrpTyp = cnseGrpTyp;
	}

	public BigDecimal getCodToClctDlr() {
		return this.codToClctDlr;
	}

	public void setCodToClctDlr(BigDecimal codToClctDlr) {
		this.codToClctDlr = codToClctDlr;
	}

	public String getCompTypGrpCd() {
		return this.compTypGrpCd;
	}

	public void setCompTypGrpCd(String compTypGrpCd) {
		this.compTypGrpCd = compTypGrpCd;
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

	public String getCsldCls() {
		return this.csldCls;
	}

	public void setCsldCls(String csldCls) {
		this.csldCls = csldCls;
	}

	public BigDecimal getCurFnclstatId() {
		return this.curFnclstatId;
	}

	public void setCurFnclstatId(BigDecimal curFnclstatId) {
		this.curFnclstatId = curFnclstatId;
	}

	public BigDecimal getCurOptlstatId() {
		return this.curOptlstatId;
	}

	public void setCurOptlstatId(BigDecimal curOptlstatId) {
		this.curOptlstatId = curOptlstatId;
	}

	public String getCustCd() {
		return this.custCd;
	}

	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BigDecimal getCustSrvcRepTyp() {
		return this.custSrvcRepTyp;
	}

	public void setCustSrvcRepTyp(BigDecimal custSrvcRepTyp) {
		this.custSrvcRepTyp = custSrvcRepTyp;
	}

	public BigDecimal getCustVerId() {
		return this.custVerId;
	}

	public void setCustVerId(BigDecimal custVerId) {
		this.custVerId = custVerId;
	}

	public String getDclValRqrdYn() {
		return this.dclValRqrdYn;
	}

	public void setDclValRqrdYn(String dclValRqrdYn) {
		this.dclValRqrdYn = dclValRqrdYn;
	}

	public BigDecimal getDcldValDlr() {
		return this.dcldValDlr;
	}

	public void setDcldValDlr(BigDecimal dcldValDlr) {
		this.dcldValDlr = dcldValDlr;
	}

	public String getDefrApRatgYn() {
		return this.defrApRatgYn;
	}

	public void setDefrApRatgYn(String defrApRatgYn) {
		this.defrApRatgYn = defrApRatgYn;
	}

	public String getDefrArRatgYn() {
		return this.defrArRatgYn;
	}

	public void setDefrArRatgYn(String defrArRatgYn) {
		this.defrArRatgYn = defrArRatgYn;
	}

	public BigDecimal getDftIncoShpgLocTypEnu() {
		return this.dftIncoShpgLocTypEnu;
	}

	public void setDftIncoShpgLocTypEnu(BigDecimal dftIncoShpgLocTypEnu) {
		this.dftIncoShpgLocTypEnu = dftIncoShpgLocTypEnu;
	}

	public BigDecimal getDisplayStatus() {
		return this.displayStatus;
	}

	public void setDisplayStatus(BigDecimal displayStatus) {
		this.displayStatus = displayStatus;
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

	public BigDecimal getDsctAmtDlr() {
		return this.dsctAmtDlr;
	}

	public void setDsctAmtDlr(BigDecimal dsctAmtDlr) {
		this.dsctAmtDlr = dsctAmtDlr;
	}

	public BigDecimal getEchgRate() {
		return this.echgRate;
	}

	public void setEchgRate(BigDecimal echgRate) {
		this.echgRate = echgRate;
	}

	public String getElgbDivTsfrYn() {
		return this.elgbDivTsfrYn;
	}

	public void setElgbDivTsfrYn(String elgbDivTsfrYn) {
		this.elgbDivTsfrYn = elgbDivTsfrYn;
	}

	public String getElgbLgstAssnYn() {
		return this.elgbLgstAssnYn;
	}

	public void setElgbLgstAssnYn(String elgbLgstAssnYn) {
		this.elgbLgstAssnYn = elgbLgstAssnYn;
	}

	public BigDecimal getElpdTm() {
		return this.elpdTm;
	}

	public void setElpdTm(BigDecimal elpdTm) {
		this.elpdTm = elpdTm;
	}

	public BigDecimal getEntMdEnu() {
		return this.entMdEnu;
	}

	public void setEntMdEnu(BigDecimal entMdEnu) {
		this.entMdEnu = entMdEnu;
	}

	public String getEqmtTypCmtdYn() {
		return this.eqmtTypCmtdYn;
	}

	public void setEqmtTypCmtdYn(String eqmtTypCmtdYn) {
		this.eqmtTypCmtdYn = eqmtTypCmtdYn;
	}

	public String getEqmtTypTrctrCmtdYn() {
		return this.eqmtTypTrctrCmtdYn;
	}

	public void setEqmtTypTrctrCmtdYn(String eqmtTypTrctrCmtdYn) {
		this.eqmtTypTrctrCmtdYn = eqmtTypTrctrCmtdYn;
	}

	public String getExtlEginVerCd() {
		return this.extlEginVerCd;
	}

	public void setExtlEginVerCd(String extlEginVerCd) {
		this.extlEginVerCd = extlEginVerCd;
	}

	public BigDecimal getFedlTaxAmtDlr() {
		return this.fedlTaxAmtDlr;
	}

	public void setFedlTaxAmtDlr(BigDecimal fedlTaxAmtDlr) {
		this.fedlTaxAmtDlr = fedlTaxAmtDlr;
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

	public BigDecimal getFmxbillrunId() {
		return this.fmxbillrunId;
	}

	public void setFmxbillrunId(BigDecimal fmxbillrunId) {
		this.fmxbillrunId = fmxbillrunId;
	}

	public Date getFmxcollectrunDtt() {
		return this.fmxcollectrunDtt;
	}

	public void setFmxcollectrunDtt(Date fmxcollectrunDtt) {
		this.fmxcollectrunDtt = fmxcollectrunDtt;
	}

	public BigDecimal getFmxcollectrunId() {
		return this.fmxcollectrunId;
	}

	public void setFmxcollectrunId(BigDecimal fmxcollectrunId) {
		this.fmxcollectrunId = fmxcollectrunId;
	}

	public BigDecimal getFnclQueId() {
		return this.fnclQueId;
	}

	public void setFnclQueId(BigDecimal fnclQueId) {
		this.fnclQueId = fnclQueId;
	}

	public BigDecimal getFrhtTrmsEnu() {
		return this.frhtTrmsEnu;
	}

	public void setFrhtTrmsEnu(BigDecimal frhtTrmsEnu) {
		this.frhtTrmsEnu = frhtTrmsEnu;
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

	public BigDecimal getFrmShpgAddrId() {
		return this.frmShpgAddrId;
	}

	public void setFrmShpgAddrId(BigDecimal frmShpgAddrId) {
		this.frmShpgAddrId = frmShpgAddrId;
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

	public String getFullChkRqrdYn() {
		return this.fullChkRqrdYn;
	}

	public void setFullChkRqrdYn(String fullChkRqrdYn) {
		this.fullChkRqrdYn = fullChkRqrdYn;
	}

	public BigDecimal getHighNoteIprsEnu() {
		return this.highNoteIprsEnu;
	}

	public void setHighNoteIprsEnu(BigDecimal highNoteIprsEnu) {
		this.highNoteIprsEnu = highNoteIprsEnu;
	}

	public String getHoldSecCd() {
		return this.holdSecCd;
	}

	public void setHoldSecCd(String holdSecCd) {
		this.holdSecCd = holdSecCd;
	}

	public String getHoldYn() {
		return this.holdYn;
	}

	public void setHoldYn(String holdYn) {
		this.holdYn = holdYn;
	}

	public String getIncoShpgLocCd() {
		return this.incoShpgLocCd;
	}

	public void setIncoShpgLocCd(String incoShpgLocCd) {
		this.incoShpgLocCd = incoShpgLocCd;
	}

	public BigDecimal getIncoShpgLocEnu() {
		return this.incoShpgLocEnu;
	}

	public void setIncoShpgLocEnu(BigDecimal incoShpgLocEnu) {
		this.incoShpgLocEnu = incoShpgLocEnu;
	}

	public String getIncoTermsCd() {
		return this.incoTermsCd;
	}

	public void setIncoTermsCd(String incoTermsCd) {
		this.incoTermsCd = incoTermsCd;
	}

	public String getIncoTermsCmtdYn() {
		return this.incoTermsCmtdYn;
	}

	public void setIncoTermsCmtdYn(String incoTermsCmtdYn) {
		this.incoTermsCmtdYn = incoTermsCmtdYn;
	}

	public BigDecimal getIncoVerEnu() {
		return this.incoVerEnu;
	}

	public void setIncoVerEnu(BigDecimal incoVerEnu) {
		this.incoVerEnu = incoVerEnu;
	}

	public String getInelgbSelDltdYn() {
		return this.inelgbSelDltdYn;
	}

	public void setInelgbSelDltdYn(String inelgbSelDltdYn) {
		this.inelgbSelDltdYn = inelgbSelDltdYn;
	}

	public BigDecimal getInptCncy() {
		return this.inptCncy;
	}

	public void setInptCncy(BigDecimal inptCncy) {
		this.inptCncy = inptCncy;
	}

	public BigDecimal getInptEchgRate() {
		return this.inptEchgRate;
	}

	public void setInptEchgRate(BigDecimal inptEchgRate) {
		this.inptEchgRate = inptEchgRate;
	}

	public BigDecimal getInptSrcEnu() {
		return this.inptSrcEnu;
	}

	public void setInptSrcEnu(BigDecimal inptSrcEnu) {
		this.inptSrcEnu = inptSrcEnu;
	}

	public BigDecimal getInptUmsrDistEnu() {
		return this.inptUmsrDistEnu;
	}

	public void setInptUmsrDistEnu(BigDecimal inptUmsrDistEnu) {
		this.inptUmsrDistEnu = inptUmsrDistEnu;
	}

	public BigDecimal getInptUmsrLenEnu() {
		return this.inptUmsrLenEnu;
	}

	public void setInptUmsrLenEnu(BigDecimal inptUmsrLenEnu) {
		this.inptUmsrLenEnu = inptUmsrLenEnu;
	}

	public BigDecimal getInptUmsrSysEnu() {
		return this.inptUmsrSysEnu;
	}

	public void setInptUmsrSysEnu(BigDecimal inptUmsrSysEnu) {
		this.inptUmsrSysEnu = inptUmsrSysEnu;
	}

	public BigDecimal getInptUmsrWgtEnu() {
		return this.inptUmsrWgtEnu;
	}

	public void setInptUmsrWgtEnu(BigDecimal inptUmsrWgtEnu) {
		this.inptUmsrWgtEnu = inptUmsrWgtEnu;
	}

	public String getItmGrpCd() {
		return this.itmGrpCd;
	}

	public void setItmGrpCd(String itmGrpCd) {
		this.itmGrpCd = itmGrpCd;
	}

	public String getJrnyTpltCd() {
		return this.jrnyTpltCd;
	}

	public void setJrnyTpltCd(String jrnyTpltCd) {
		this.jrnyTpltCd = jrnyTpltCd;
	}

	public Date getLastRatdDtt() {
		return this.lastRatdDtt;
	}

	public void setLastRatdDtt(Date lastRatdDtt) {
		this.lastRatdDtt = lastRatdDtt;
	}

	public BigDecimal getLastRatdTffId() {
		return this.lastRatdTffId;
	}

	public void setLastRatdTffId(BigDecimal lastRatdTffId) {
		this.lastRatdTffId = lastRatdTffId;
	}

	public String getLdGrp() {
		return this.ldGrp;
	}

	public void setLdGrp(String ldGrp) {
		this.ldGrp = ldGrp;
	}

	public BigDecimal getLdLegId() {
		return this.ldLegId;
	}

	public void setLdLegId(BigDecimal ldLegId) {
		this.ldLegId = ldLegId;
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

	public String getLldDetlRptYn() {
		return this.lldDetlRptYn;
	}

	public void setLldDetlRptYn(String lldDetlRptYn) {
		this.lldDetlRptYn = lldDetlRptYn;
	}

	public BigDecimal getLocTaxAmtDlr() {
		return this.locTaxAmtDlr;
	}

	public void setLocTaxAmtDlr(BigDecimal locTaxAmtDlr) {
		this.locTaxAmtDlr = locTaxAmtDlr;
	}

	public BigDecimal getMaxOdrValAmt() {
		return this.maxOdrValAmt;
	}

	public void setMaxOdrValAmt(BigDecimal maxOdrValAmt) {
		this.maxOdrValAmt = maxOdrValAmt;
	}

	public BigDecimal getMaxShpmVol() {
		return this.maxShpmVol;
	}

	public void setMaxShpmVol(BigDecimal maxShpmVol) {
		this.maxShpmVol = maxShpmVol;
	}

	public BigDecimal getMaxShpmWgt() {
		return this.maxShpmWgt;
	}

	public void setMaxShpmWgt(BigDecimal maxShpmWgt) {
		this.maxShpmWgt = maxShpmWgt;
	}

	public BigDecimal getMinOdrValAmt() {
		return this.minOdrValAmt;
	}

	public void setMinOdrValAmt(BigDecimal minOdrValAmt) {
		this.minOdrValAmt = minOdrValAmt;
	}

	public BigDecimal getMitccStrgEnu() {
		return this.mitccStrgEnu;
	}

	public void setMitccStrgEnu(BigDecimal mitccStrgEnu) {
		this.mitccStrgEnu = mitccStrgEnu;
	}

	public BigDecimal getMmoId() {
		return this.mmoId;
	}

	public void setMmoId(BigDecimal mmoId) {
		this.mmoId = mmoId;
	}

	public String getMrgeCsldClsId() {
		return this.mrgeCsldClsId;
	}

	public void setMrgeCsldClsId(String mrgeCsldClsId) {
		this.mrgeCsldClsId = mrgeCsldClsId;
	}

	public BigDecimal getMrgeCsldSeqNum() {
		return this.mrgeCsldSeqNum;
	}

	public void setMrgeCsldSeqNum(BigDecimal mrgeCsldSeqNum) {
		this.mrgeCsldSeqNum = mrgeCsldSeqNum;
	}

	public String getMxdLdYn() {
		return this.mxdLdYn;
	}

	public void setMxdLdYn(String mxdLdYn) {
		this.mxdLdYn = mxdLdYn;
	}

	public BigDecimal getNmnlWgt() {
		return this.nmnlWgt;
	}

	public void setNmnlWgt(BigDecimal nmnlWgt) {
		this.nmnlWgt = nmnlWgt;
	}

	public BigDecimal getNumLdLegDetl() {
		return this.numLdLegDetl;
	}

	public void setNumLdLegDetl(BigDecimal numLdLegDetl) {
		this.numLdLegDetl = numLdLegDetl;
	}

	public BigDecimal getNumShpmSplit() {
		return this.numShpmSplit;
	}

	public void setNumShpmSplit(BigDecimal numShpmSplit) {
		this.numShpmSplit = numShpmSplit;
	}

	public BigDecimal getOdrSrcEnu() {
		return this.odrSrcEnu;
	}

	public void setOdrSrcEnu(BigDecimal odrSrcEnu) {
		this.odrSrcEnu = odrSrcEnu;
	}

	public BigDecimal getOdrValDlr() {
		return this.odrValDlr;
	}

	public void setOdrValDlr(BigDecimal odrValDlr) {
		this.odrValDlr = odrValDlr;
	}

	public String getOdrValRqrdYn() {
		return this.odrValRqrdYn;
	}

	public void setOdrValRqrdYn(String odrValRqrdYn) {
		this.odrValRqrdYn = odrValRqrdYn;
	}

	public String getOpLstNonEmtyYn() {
		return this.opLstNonEmtyYn;
	}

	public void setOpLstNonEmtyYn(String opLstNonEmtyYn) {
		this.opLstNonEmtyYn = opLstNonEmtyYn;
	}

	public BigDecimal getOptLck() {
		return this.optLck;
	}

	public void setOptLck(BigDecimal optLck) {
		this.optLck = optLck;
	}

	public String getOrdrGrpCd() {
		return this.ordrGrpCd;
	}

	public void setOrdrGrpCd(String ordrGrpCd) {
		this.ordrGrpCd = ordrGrpCd;
	}

	public Date getOvrdFrmDlvyDtt() {
		return this.ovrdFrmDlvyDtt;
	}

	public void setOvrdFrmDlvyDtt(Date ovrdFrmDlvyDtt) {
		this.ovrdFrmDlvyDtt = ovrdFrmDlvyDtt;
	}

	public Date getOvrdFrmPkupDtt() {
		return this.ovrdFrmPkupDtt;
	}

	public void setOvrdFrmPkupDtt(Date ovrdFrmPkupDtt) {
		this.ovrdFrmPkupDtt = ovrdFrmPkupDtt;
	}

	public BigDecimal getOvrdHrznLvlEnu() {
		return this.ovrdHrznLvlEnu;
	}

	public void setOvrdHrznLvlEnu(BigDecimal ovrdHrznLvlEnu) {
		this.ovrdHrznLvlEnu = ovrdHrznLvlEnu;
	}

	public Date getOvrdToDlvyDtt() {
		return this.ovrdToDlvyDtt;
	}

	public void setOvrdToDlvyDtt(Date ovrdToDlvyDtt) {
		this.ovrdToDlvyDtt = ovrdToDlvyDtt;
	}

	public Date getOvrdToPkupDtt() {
		return this.ovrdToPkupDtt;
	}

	public void setOvrdToPkupDtt(Date ovrdToPkupDtt) {
		this.ovrdToPkupDtt = ovrdToPkupDtt;
	}

	public BigDecimal getPlanCount() {
		return this.planCount;
	}

	public void setPlanCount(BigDecimal planCount) {
		this.planCount = planCount;
	}

	public BigDecimal getPlanId() {
		return this.planId;
	}

	public void setPlanId(BigDecimal planId) {
		this.planId = planId;
	}

	public String getPlngYn() {
		return this.plngYn;
	}

	public void setPlngYn(String plngYn) {
		this.plngYn = plngYn;
	}

	public String getPostCnfnUpdYn() {
		return this.postCnfnUpdYn;
	}

	public void setPostCnfnUpdYn(String postCnfnUpdYn) {
		this.postCnfnUpdYn = postCnfnUpdYn;
	}

	public BigDecimal getPrecsldAmtDlr() {
		return this.precsldAmtDlr;
	}

	public void setPrecsldAmtDlr(BigDecimal precsldAmtDlr) {
		this.precsldAmtDlr = precsldAmtDlr;
	}

	public String getPrepaidSegOnlyYn() {
		return this.prepaidSegOnlyYn;
	}

	public void setPrepaidSegOnlyYn(String prepaidSegOnlyYn) {
		this.prepaidSegOnlyYn = prepaidSegOnlyYn;
	}

	public BigDecimal getPrfCtrTyp() {
		return this.prfCtrTyp;
	}

	public void setPrfCtrTyp(BigDecimal prfCtrTyp) {
		this.prfCtrTyp = prfCtrTyp;
	}

	public String getPrjCd() {
		return this.prjCd;
	}

	public void setPrjCd(String prjCd) {
		this.prjCd = prjCd;
	}

	public String getProRateCompsYn() {
		return this.proRateCompsYn;
	}

	public void setProRateCompsYn(String proRateCompsYn) {
		this.proRateCompsYn = proRateCompsYn;
	}

	public BigDecimal getPrpdAmtDlr() {
		return this.prpdAmtDlr;
	}

	public void setPrpdAmtDlr(BigDecimal prpdAmtDlr) {
		this.prpdAmtDlr = prpdAmtDlr;
	}

	public BigDecimal getPrty() {
		return this.prty;
	}

	public void setPrty(BigDecimal prty) {
		this.prty = prty;
	}

	public Date getRatdDtt() {
		return this.ratdDtt;
	}

	public void setRatdDtt(Date ratdDtt) {
		this.ratdDtt = ratdDtt;
	}

	public String getRateCd() {
		return this.rateCd;
	}

	public void setRateCd(String rateCd) {
		this.rateCd = rateCd;
	}

	public BigDecimal getRateCdTffId() {
		return this.rateCdTffId;
	}

	public void setRateCdTffId(BigDecimal rateCdTffId) {
		this.rateCdTffId = rateCdTffId;
	}

	public BigDecimal getRateOvrdRsnTyp() {
		return this.rateOvrdRsnTyp;
	}

	public void setRateOvrdRsnTyp(BigDecimal rateOvrdRsnTyp) {
		this.rateOvrdRsnTyp = rateOvrdRsnTyp;
	}

	public String getRateOvrdUsrCd() {
		return this.rateOvrdUsrCd;
	}

	public void setRateOvrdUsrCd(String rateOvrdUsrCd) {
		this.rateOvrdUsrCd = rateOvrdUsrCd;
	}

	public Date getRateovrdDtt() {
		return this.rateovrdDtt;
	}

	public void setRateovrdDtt(Date rateovrdDtt) {
		this.rateovrdDtt = rateovrdDtt;
	}

	public String getRatgVlidYn() {
		return this.ratgVlidYn;
	}

	public void setRatgVlidYn(String ratgVlidYn) {
		this.ratgVlidYn = ratgVlidYn;
	}

	public BigDecimal getRetFnclstatId() {
		return this.retFnclstatId;
	}

	public void setRetFnclstatId(BigDecimal retFnclstatId) {
		this.retFnclstatId = retFnclstatId;
	}

	public BigDecimal getRetOptlstatId() {
		return this.retOptlstatId;
	}

	public void setRetOptlstatId(BigDecimal retOptlstatId) {
		this.retOptlstatId = retOptlstatId;
	}

	public String getRetShpmYn() {
		return this.retShpmYn;
	}

	public void setRetShpmYn(String retShpmYn) {
		this.retShpmYn = retShpmYn;
	}

	public BigDecimal getRfrcNumVbtyId() {
		return this.rfrcNumVbtyId;
	}

	public void setRfrcNumVbtyId(BigDecimal rfrcNumVbtyId) {
		this.rfrcNumVbtyId = rfrcNumVbtyId;
	}

	public String getRfrcNum1() {
		return this.rfrcNum1;
	}

	public void setRfrcNum1(String rfrcNum1) {
		this.rfrcNum1 = rfrcNum1;
	}

	public String getRfrcNum10() {
		return this.rfrcNum10;
	}

	public void setRfrcNum10(String rfrcNum10) {
		this.rfrcNum10 = rfrcNum10;
	}

	public String getRfrcNum11() {
		return this.rfrcNum11;
	}

	public void setRfrcNum11(String rfrcNum11) {
		this.rfrcNum11 = rfrcNum11;
	}

	public String getRfrcNum12() {
		return this.rfrcNum12;
	}

	public void setRfrcNum12(String rfrcNum12) {
		this.rfrcNum12 = rfrcNum12;
	}

	public String getRfrcNum13() {
		return this.rfrcNum13;
	}

	public void setRfrcNum13(String rfrcNum13) {
		this.rfrcNum13 = rfrcNum13;
	}

	public String getRfrcNum14() {
		return this.rfrcNum14;
	}

	public void setRfrcNum14(String rfrcNum14) {
		this.rfrcNum14 = rfrcNum14;
	}

	public String getRfrcNum15() {
		return this.rfrcNum15;
	}

	public void setRfrcNum15(String rfrcNum15) {
		this.rfrcNum15 = rfrcNum15;
	}

	public String getRfrcNum16() {
		return this.rfrcNum16;
	}

	public void setRfrcNum16(String rfrcNum16) {
		this.rfrcNum16 = rfrcNum16;
	}

	public String getRfrcNum17() {
		return this.rfrcNum17;
	}

	public void setRfrcNum17(String rfrcNum17) {
		this.rfrcNum17 = rfrcNum17;
	}

	public String getRfrcNum18() {
		return this.rfrcNum18;
	}

	public void setRfrcNum18(String rfrcNum18) {
		this.rfrcNum18 = rfrcNum18;
	}

	public String getRfrcNum19() {
		return this.rfrcNum19;
	}

	public void setRfrcNum19(String rfrcNum19) {
		this.rfrcNum19 = rfrcNum19;
	}

	public String getRfrcNum2() {
		return this.rfrcNum2;
	}

	public void setRfrcNum2(String rfrcNum2) {
		this.rfrcNum2 = rfrcNum2;
	}

	public String getRfrcNum20() {
		return this.rfrcNum20;
	}

	public void setRfrcNum20(String rfrcNum20) {
		this.rfrcNum20 = rfrcNum20;
	}

	public String getRfrcNum21() {
		return this.rfrcNum21;
	}

	public void setRfrcNum21(String rfrcNum21) {
		this.rfrcNum21 = rfrcNum21;
	}

	public String getRfrcNum22() {
		return this.rfrcNum22;
	}

	public void setRfrcNum22(String rfrcNum22) {
		this.rfrcNum22 = rfrcNum22;
	}

	public String getRfrcNum23() {
		return this.rfrcNum23;
	}

	public void setRfrcNum23(String rfrcNum23) {
		this.rfrcNum23 = rfrcNum23;
	}

	public String getRfrcNum24() {
		return this.rfrcNum24;
	}

	public void setRfrcNum24(String rfrcNum24) {
		this.rfrcNum24 = rfrcNum24;
	}

	public String getRfrcNum25() {
		return this.rfrcNum25;
	}

	public void setRfrcNum25(String rfrcNum25) {
		this.rfrcNum25 = rfrcNum25;
	}

	public String getRfrcNum26() {
		return this.rfrcNum26;
	}

	public void setRfrcNum26(String rfrcNum26) {
		this.rfrcNum26 = rfrcNum26;
	}

	public String getRfrcNum27() {
		return this.rfrcNum27;
	}

	public void setRfrcNum27(String rfrcNum27) {
		this.rfrcNum27 = rfrcNum27;
	}

	public String getRfrcNum28() {
		return this.rfrcNum28;
	}

	public void setRfrcNum28(String rfrcNum28) {
		this.rfrcNum28 = rfrcNum28;
	}

	public String getRfrcNum29() {
		return this.rfrcNum29;
	}

	public void setRfrcNum29(String rfrcNum29) {
		this.rfrcNum29 = rfrcNum29;
	}

	public String getRfrcNum3() {
		return this.rfrcNum3;
	}

	public void setRfrcNum3(String rfrcNum3) {
		this.rfrcNum3 = rfrcNum3;
	}

	public String getRfrcNum30() {
		return this.rfrcNum30;
	}

	public void setRfrcNum30(String rfrcNum30) {
		this.rfrcNum30 = rfrcNum30;
	}

	public String getRfrcNum4() {
		return this.rfrcNum4;
	}

	public void setRfrcNum4(String rfrcNum4) {
		this.rfrcNum4 = rfrcNum4;
	}

	public String getRfrcNum5() {
		return this.rfrcNum5;
	}

	public void setRfrcNum5(String rfrcNum5) {
		this.rfrcNum5 = rfrcNum5;
	}

	public String getRfrcNum6() {
		return this.rfrcNum6;
	}

	public void setRfrcNum6(String rfrcNum6) {
		this.rfrcNum6 = rfrcNum6;
	}

	public String getRfrcNum7() {
		return this.rfrcNum7;
	}

	public void setRfrcNum7(String rfrcNum7) {
		this.rfrcNum7 = rfrcNum7;
	}

	public String getRfrcNum8() {
		return this.rfrcNum8;
	}

	public void setRfrcNum8(String rfrcNum8) {
		this.rfrcNum8 = rfrcNum8;
	}

	public String getRfrcNum9() {
		return this.rfrcNum9;
	}

	public void setRfrcNum9(String rfrcNum9) {
		this.rfrcNum9 = rfrcNum9;
	}

	public BigDecimal getRoutLaneId() {
		return this.routLaneId;
	}

	public void setRoutLaneId(BigDecimal routLaneId) {
		this.routLaneId = routLaneId;
	}

	public String getRqrdEqmtTyp() {
		return this.rqrdEqmtTyp;
	}

	public void setRqrdEqmtTyp(String rqrdEqmtTyp) {
		this.rqrdEqmtTyp = rqrdEqmtTyp;
	}

	public String getRqrdEqmtTypTrctr() {
		return this.rqrdEqmtTypTrctr;
	}

	public void setRqrdEqmtTypTrctr(String rqrdEqmtTypTrctr) {
		this.rqrdEqmtTypTrctr = rqrdEqmtTypTrctr;
	}

	public BigDecimal getRshpRsnCdTyp() {
		return this.rshpRsnCdTyp;
	}

	public void setRshpRsnCdTyp(BigDecimal rshpRsnCdTyp) {
		this.rshpRsnCdTyp = rshpRsnCdTyp;
	}

	public String getRutdDestZnCd() {
		return this.rutdDestZnCd;
	}

	public void setRutdDestZnCd(String rutdDestZnCd) {
		this.rutdDestZnCd = rutdDestZnCd;
	}

	public String getRutdOriZnCd() {
		return this.rutdOriZnCd;
	}

	public void setRutdOriZnCd(String rutdOriZnCd) {
		this.rutdOriZnCd = rutdOriZnCd;
	}

	public String getRvnuTrptOdrYn() {
		return this.rvnuTrptOdrYn;
	}

	public void setRvnuTrptOdrYn(String rvnuTrptOdrYn) {
		this.rvnuTrptOdrYn = rvnuTrptOdrYn;
	}

	public String getSalePersCd() {
		return this.salePersCd;
	}

	public void setSalePersCd(String salePersCd) {
		this.salePersCd = salePersCd;
	}

	public BigDecimal getScldWgt() {
		return this.scldWgt;
	}

	public void setScldWgt(BigDecimal scldWgt) {
		this.scldWgt = scldWgt;
	}

	public BigDecimal getShftSeq() {
		return this.shftSeq;
	}

	public void setShftSeq(BigDecimal shftSeq) {
		this.shftSeq = shftSeq;
	}

	public String getShpmDesc() {
		return this.shpmDesc;
	}

	public void setShpmDesc(String shpmDesc) {
		this.shpmDesc = shpmDesc;
	}

	public String getShpmNum() {
		return this.shpmNum;
	}

	public void setShpmNum(String shpmNum) {
		this.shpmNum = shpmNum;
	}

	public String getSpfmAptRqrdYn() {
		return this.spfmAptRqrdYn;
	}

	public void setSpfmAptRqrdYn(String spfmAptRqrdYn) {
		this.spfmAptRqrdYn = spfmAptRqrdYn;
	}

	public BigDecimal getSplitMthdEnu() {
		return this.splitMthdEnu;
	}

	public void setSplitMthdEnu(BigDecimal splitMthdEnu) {
		this.splitMthdEnu = splitMthdEnu;
	}

	public BigDecimal getSplitReviewEnu() {
		return this.splitReviewEnu;
	}

	public void setSplitReviewEnu(BigDecimal splitReviewEnu) {
		this.splitReviewEnu = splitReviewEnu;
	}

	public String getSplitShpmNum() {
		return this.splitShpmNum;
	}

	public void setSplitShpmNum(String splitShpmNum) {
		this.splitShpmNum = splitShpmNum;
	}

	public String getSpotRateYn() {
		return this.spotRateYn;
	}

	public void setSpotRateYn(String spotRateYn) {
		this.spotRateYn = spotRateYn;
	}

	public String getSptoAptRqrdYn() {
		return this.sptoAptRqrdYn;
	}

	public void setSptoAptRqrdYn(String sptoAptRqrdYn) {
		this.sptoAptRqrdYn = sptoAptRqrdYn;
	}

	public BigDecimal getStaTaxAmtDlr() {
		return this.staTaxAmtDlr;
	}

	public void setStaTaxAmtDlr(BigDecimal staTaxAmtDlr) {
		this.staTaxAmtDlr = staTaxAmtDlr;
	}

	public BigDecimal getSysCalcAmtDlr() {
		return this.sysCalcAmtDlr;
	}

	public void setSysCalcAmtDlr(BigDecimal sysCalcAmtDlr) {
		this.sysCalcAmtDlr = sysCalcAmtDlr;
	}

	public BigDecimal getTdracptCount() {
		return this.tdracptCount;
	}

	public void setTdracptCount(BigDecimal tdracptCount) {
		this.tdracptCount = tdracptCount;
	}

	public BigDecimal getTenderCount() {
		return this.tenderCount;
	}

	public void setTenderCount(BigDecimal tenderCount) {
		this.tenderCount = tenderCount;
	}

	public BigDecimal getTffId() {
		return this.tffId;
	}

	public void setTffId(BigDecimal tffId) {
		this.tffId = tffId;
	}

	public BigDecimal getTffTotDist() {
		return this.tffTotDist;
	}

	public void setTffTotDist(BigDecimal tffTotDist) {
		this.tffTotDist = tffTotDist;
	}

	public String getTnstMdCmtdYn() {
		return this.tnstMdCmtdYn;
	}

	public void setTnstMdCmtdYn(String tnstMdCmtdYn) {
		this.tnstMdCmtdYn = tnstMdCmtdYn;
	}

	public BigDecimal getTnstMdEnu() {
		return this.tnstMdEnu;
	}

	public void setTnstMdEnu(BigDecimal tnstMdEnu) {
		this.tnstMdEnu = tnstMdEnu;
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

	public BigDecimal getToShpgAddrId() {
		return this.toShpgAddrId;
	}

	public void setToShpgAddrId(BigDecimal toShpgAddrId) {
		this.toShpgAddrId = toShpgAddrId;
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

	public BigDecimal getTotMileDist() {
		return this.totMileDist;
	}

	public void setTotMileDist(BigDecimal totMileDist) {
		this.totMileDist = totMileDist;
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

	public String getTrptOdrCd() {
		return this.trptOdrCd;
	}

	public void setTrptOdrCd(String trptOdrCd) {
		this.trptOdrCd = trptOdrCd;
	}

	public BigDecimal getUmsrdistEnu() {
		return this.umsrdistEnu;
	}

	public void setUmsrdistEnu(BigDecimal umsrdistEnu) {
		this.umsrdistEnu = umsrdistEnu;
	}

	public BigDecimal getUmsrlenEnu() {
		return this.umsrlenEnu;
	}

	public void setUmsrlenEnu(BigDecimal umsrlenEnu) {
		this.umsrlenEnu = umsrlenEnu;
	}

	public BigDecimal getUmsrsysEnu() {
		return this.umsrsysEnu;
	}

	public void setUmsrsysEnu(BigDecimal umsrsysEnu) {
		this.umsrsysEnu = umsrsysEnu;
	}

	public BigDecimal getUmsrwgtEnu() {
		return this.umsrwgtEnu;
	}

	public void setUmsrwgtEnu(BigDecimal umsrwgtEnu) {
		this.umsrwgtEnu = umsrwgtEnu;
	}

	public String getUnitsRqrdYn() {
		return this.unitsRqrdYn;
	}

	public void setUnitsRqrdYn(String unitsRqrdYn) {
		this.unitsRqrdYn = unitsRqrdYn;
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

	public BigDecimal getVchrRunExcpId() {
		return this.vchrRunExcpId;
	}

	public void setVchrRunExcpId(BigDecimal vchrRunExcpId) {
		this.vchrRunExcpId = vchrRunExcpId;
	}

	public BigDecimal getVldtItm() {
		return this.vldtItm;
	}

	public void setVldtItm(BigDecimal vldtItm) {
		this.vldtItm = vldtItm;
	}

	public BigDecimal getVol() {
		return this.vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

	public String getVolRqrdYn() {
		return this.volRqrdYn;
	}

	public void setVolRqrdYn(String volRqrdYn) {
		this.volRqrdYn = volRqrdYn;
	}

}
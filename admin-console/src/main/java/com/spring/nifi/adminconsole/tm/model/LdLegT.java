package com.spring.nifi.adminconsole.tm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LD_LEG_T database table.
 * 
 */
@Entity
@Table(name="LD_LEG_T")
@NamedQuery(name="LdLegT.findAll", query="SELECT l FROM LdLegT l")
public class LdLegT implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LD_LEG_ID")
	private long ldLegId;

	@Column(name="ACC_NUM")
	private String accNum;

	@Column(name="ACTL_CARRSRVC")
	private String actlCarrsrvc;

	@Column(name="ACTL_CHGD_AMT_DLR")
	private BigDecimal actlChgdAmtDlr;

	@Column(name="ACTL_CNCY_TYP")
	private BigDecimal actlCncyTyp;

	@Column(name="ADTN_CHRG_DLR")
	private BigDecimal adtnChrgDlr;

	@Column(name="APLY_RSRC_CSTR_YN")
	private String aplyRsrcCstrYn;

	@Column(name="ARVL_SHPG_LOC_CD")
	private String arvlShpgLocCd;

	@Column(name="ARVL_SHPGPNT_ENU")
	private BigDecimal arvlShpgpntEnu;

	@Column(name="AUTO_TDR_STAT_ENU")
	private BigDecimal autoTdrStatEnu;

	@Column(name="BILL_TO_CUST_CD")
	private String billToCustCd;

	@Column(name="BKG_RVI_BYP_RRS_YN")
	private String bkgRviBypRrsYn;

	@Column(name="BKG_RVI_PROC_YN")
	private String bkgRviProcYn;

	@Column(name="BKG_SRVC_TYP_ENU")
	private BigDecimal bkgSrvcTypEnu;

	@Column(name="CARR_CD")
	private String carrCd;

	@Column(name="CARR_CMTD_YN")
	private String carrCmtdYn;

	@Temporal(TemporalType.DATE)
	@Column(name="CARR_ETA_LAST_STOP_DTT")
	private Date carrEtaLastStopDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="CARR_ETA_NEXT_LOC_DTT")
	private Date carrEtaNextLocDtt;

	@Column(name="CARR_SOFT_CMTD_YN")
	private String carrSoftCmtdYn;

	@Column(name="CARRLDTDR_CNTC_ID")
	private BigDecimal carrldtdrCntcId;

	@Column(name="CARRLDTDRCNTC_NAME")
	private String carrldtdrcntcName;

	@Column(name="CDTY_CD")
	private String cdtyCd;

	@Column(name="CDTY_CMTD_YN")
	private String cdtyCmtdYn;

	@Column(name="CFMG_USR_CD")
	private String cfmgUsrCd;

	@Column(name="CHGD_AMT_DLR")
	private BigDecimal chgdAmtDlr;

	@Column(name="CMPR_LD_RATG_ID")
	private BigDecimal cmprLdRatgId;

	@Column(name="CNCY_TYP")
	private BigDecimal cncyTyp;

	@Temporal(TemporalType.DATE)
	@Column(name="CNTR_YARD_DTT")
	private Date cntrYardDtt;

	@Column(name="COST_CTR_TYP")
	private BigDecimal costCtrTyp;

	@Temporal(TemporalType.DATE)
	@Column(name="CPLD_DTT")
	private Date cpldDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="CRTD_DTT")
	private Date crtdDtt;

	@Column(name="CRTD_USR_CD")
	private String crtdUsrCd;

	@Column(name="CSLD_CLS")
	private String csldCls;

	@Column(name="CSTR_OVRD_YN")
	private String cstrOvrdYn;

	@Column(name="CUR_FNCLSTAT_ID")
	private BigDecimal curFnclstatId;

	@Column(name="CUR_OPTLSTAT_ID")
	private BigDecimal curOptlstatId;

	@Column(name="CUST_CD")
	private String custCd;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="DCLD_VAL_DLR")
	private BigDecimal dcldValDlr;

	@Column(name="DETL_RETD_YN")
	private String detlRetdYn;

	@Column(name="DISPLAY_STATUS")
	private BigDecimal displayStatus;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="DMCL_CD")
	private String dmclCd;

	@Column(name="DMCL_CD_TRLR")
	private String dmclCdTrlr;

	@Column(name="DMCL_TRCTR_CMTD_YN")
	private String dmclTrctrCmtdYn;

	@Column(name="DMCL_TRLR_CMTD_YN")
	private String dmclTrlrCmtdYn;

	@Column(name="DPTR_SHPG_LOC_CD")
	private String dptrShpgLocCd;

	@Column(name="DPTR_SHPGPNT_ENU")
	private BigDecimal dptrShpgpntEnu;

	@Column(name="DRCT_DIST")
	private BigDecimal drctDist;

	private String drvr;

	@Column(name="DRVR_CD")
	private String drvrCd;

	@Column(name="DRVR_LIC_NUM")
	private String drvrLicNum;

	@Column(name="DSCT_AMT_DLR")
	private BigDecimal dsctAmtDlr;

	@Column(name="ECHG_RATE_PRCE")
	private BigDecimal echgRatePrce;

	@Column(name="EDI_204_ISUD_YN")
	private String edi204IsudYn;

	@Temporal(TemporalType.DATE)
	@Column(name="EFCT_RATG_DT")
	private Date efctRatgDt;

	@Column(name="ELGB_CNTS_MV_ENU")
	private BigDecimal elgbCntsMvEnu;

	@Column(name="ELGB_CNTS_MV_YN")
	private String elgbCntsMvYn;

	@Column(name="ELPD_HRS")
	private BigDecimal elpdHrs;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DTT")
	private Date endDtt;

	@Column(name="EQMT_SOFT_CMTD_YN")
	private String eqmtSoftCmtdYn;

	@Column(name="EQMT_TRCTR_CMTD_YN")
	private String eqmtTrctrCmtdYn;

	@Column(name="EQMT_TYP")
	private String eqmtTyp;

	@Column(name="EQMT_TYP_CD_TRCTR")
	private String eqmtTypCdTrctr;

	@Column(name="EQMT_TYP_CMTD_YN")
	private String eqmtTypCmtdYn;

	@Column(name="EQMT_TYP_RQRD_NUM")
	private BigDecimal eqmtTypRqrdNum;

	@Column(name="EQMT_TYP_TRCTR_RQRD_NUM")
	private BigDecimal eqmtTypTrctrRqrdNum;

	@Column(name="ETA_NEXT_LOC_CD")
	private String etaNextLocCd;

	@Column(name="ETA_NEXT_LOC_ENU")
	private BigDecimal etaNextLocEnu;

	@Column(name="ETMD_GRSMRGN_PCT")
	private BigDecimal etmdGrsmrgnPct;

	@Column(name="EXEC_ELPD_HRS")
	private BigDecimal execElpdHrs;

	@Column(name="EXEC_MCEXCSWATSTP_HRS")
	private BigDecimal execMcexcswatstpHrs;

	@Column(name="EXEC_SCHD_OVRD_YN")
	private String execSchdOvrdYn;

	@Column(name="EXEC_SCHD_STAT_ENU")
	private BigDecimal execSchdStatEnu;

	@Column(name="EXEC_TOT_DRIVING_HRS")
	private BigDecimal execTotDrivingHrs;

	@Column(name="EXEC_TOT_LOADING_HRS")
	private BigDecimal execTotLoadingHrs;

	@Column(name="EXEC_TOT_OFF_DUTY_HRS")
	private BigDecimal execTotOffDutyHrs;

	@Column(name="EXEC_TOT_ON_DUTY_HRS")
	private BigDecimal execTotOnDutyHrs;

	@Column(name="EXEC_TOT_UNLOADING_HRS")
	private BigDecimal execTotUnloadingHrs;

	@Column(name="EXEC_TOTCEXCSWAIT_HRS")
	private BigDecimal execTotcexcswaitHrs;

	@Column(name="EXEC_WKND_HLDY_HRS")
	private BigDecimal execWkndHldyHrs;

	@Column(name="EXTL_EGIN_VER_CD")
	private String extlEginVerCd;

	@Column(name="EXTL_SRVC_TYP_CD")
	private String extlSrvcTypCd;

	@Column(name="FAR_PNT_STOP_ID")
	private BigDecimal farPntStopId;

	@Column(name="FEDL_TAX_AMT_DLR")
	private BigDecimal fedlTaxAmtDlr;

	@Column(name="FEU_RSRC_FCTR")
	private BigDecimal feuRsrcFctr;

	@Column(name="FIXD_ITNR_DIST")
	private BigDecimal fixdItnrDist;

	@Column(name="FRST_ADDR_ID")
	private BigDecimal frstAddrId;

	@Column(name="FRST_CTRY_CD")
	private String frstCtryCd;

	@Column(name="FRST_CTY_NAME")
	private String frstCtyName;

	@Column(name="FRST_PSTL_CD")
	private String frstPstlCd;

	@Column(name="FRST_SHPG_LOC_CD")
	private String frstShpgLocCd;

	@Column(name="FRST_SHPG_LOC_NAME")
	private String frstShpgLocName;

	@Column(name="FRST_SHPGPNT_ENU")
	private BigDecimal frstShpgpntEnu;

	@Column(name="FRST_STA_CD")
	private String frstStaCd;

	@Temporal(TemporalType.DATE)
	@Column(name="FRST_STOP_ELST_TO_PKUP_DTT")
	private Date frstStopElstToPkupDtt;

	@Column(name="FRST_STOP_ID")
	private BigDecimal frstStopId;

	@Temporal(TemporalType.DATE)
	@Column(name="FRST_STOP_LTST_FRM_PKUP_DTT")
	private Date frstStopLtstFrmPkupDtt;

	@Column(name="FRST_TDR_ISUD_YN")
	private String frstTdrIsudYn;

	@Column(name="HD_LD_CNTR")
	private BigDecimal hdLdCntr;

	@Column(name="HIGH_NOTE_IPRS_ENU")
	private BigDecimal highNoteIprsEnu;

	@Column(name="IN_TNST_UNLDD_DIST")
	private BigDecimal inTnstUnlddDist;

	@Column(name="IN_TNST_UNLDD_TOT_DIST")
	private BigDecimal inTnstUnlddTotDist;

	@Column(name="INCL_RSRC_USG_CNT_YN")
	private String inclRsrcUsgCntYn;

	@Temporal(TemporalType.DATE)
	@Column(name="INGT_DTT")
	private Date ingtDtt;

	@Column(name="INIT_REPS_DIST")
	private BigDecimal initRepsDist;

	@Column(name="LANE_ASSC_ID")
	private BigDecimal laneAsscId;

	@Column(name="LAST_ADDR_ID")
	private BigDecimal lastAddrId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_CHNGD_MNGR_OPMR_DTT")
	private Date lastChngdMngrOpmrDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_CHNGD_OPMR_DTT")
	private Date lastChngdOpmrDtt;

	@Column(name="LAST_CTRY_CD")
	private String lastCtryCd;

	@Column(name="LAST_CTY_NAME")
	private String lastCtyName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_EVNT_RPTD_DTT")
	private Date lastEvntRptdDtt;

	@Column(name="LAST_PSTL_CD")
	private String lastPstlCd;

	@Column(name="LAST_RATD_CARR_CD")
	private String lastRatdCarrCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_RATD_DTT")
	private Date lastRatdDtt;

	@Column(name="LAST_RATD_SRVC_CD")
	private String lastRatdSrvcCd;

	@Column(name="LAST_RATD_TFF_ID")
	private BigDecimal lastRatdTffId;

	@Column(name="LAST_SEC_CD")
	private String lastSecCd;

	@Column(name="LAST_SHPG_LOC_CD")
	private String lastShpgLocCd;

	@Column(name="LAST_SHPG_LOC_NAME")
	private String lastShpgLocName;

	@Column(name="LAST_SHPGPNT_ENU")
	private BigDecimal lastShpgpntEnu;

	@Column(name="LAST_STA_CD")
	private String lastStaCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_STOP_ELST_TO_DLVY_DTT")
	private Date lastStopElstToDlvyDtt;

	@Column(name="LAST_STOP_ID")
	private BigDecimal lastStopId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_STOP_LTST_FRM_DLVY_DTT")
	private Date lastStopLtstFrmDlvyDtt;

	@Column(name="LD_CMPS_APRD_YN")
	private String ldCmpsAprdYn;

	@Column(name="LD_DESC")
	private String ldDesc;

	@Column(name="LD_GRP")
	private String ldGrp;

	@Column(name="LD_LEG_CAT_ENU")
	private BigDecimal ldLegCatEnu;

	@Column(name="LD_LEG_SCHD_ITNR_VLID_YN")
	private String ldLegSchdItnrVlidYn;

	@Column(name="LD_PRTY_CALC_ENU")
	private BigDecimal ldPrtyCalcEnu;

	@Column(name="LD_SCHD_CMPD_YN")
	private String ldSchdCmpdYn;

	@Column(name="LD_SRC_ENU")
	private BigDecimal ldSrcEnu;

	@Column(name="LD_TERM_ENU")
	private BigDecimal ldTermEnu;

	@Column(name="LD_TYP_ENU")
	private BigDecimal ldTypEnu;

	@Column(name="LDD_CNFG_TYP_ENU")
	private BigDecimal lddCnfgTypEnu;

	@Column(name="LDD_DIST")
	private BigDecimal lddDist;

	@Column(name="LDN_LEN")
	private BigDecimal ldnLen;

	@Column(name="LDN_LEN_UTLN_PCT")
	private BigDecimal ldnLenUtlnPct;

	@Column(name="LED_TM_USD_SCHD_YN")
	private String ledTmUsdSchdYn;

	@Column(name="LGST_GRP_CD")
	private String lgstGrpCd;

	@Column(name="LLD_CARRCMTD_TMS")
	private BigDecimal lldCarrcmtdTms;

	@Column(name="LLD_SRVCCMTD_TMS")
	private BigDecimal lldSrvccmtdTms;

	@Column(name="LLDHELD_NUM")
	private BigDecimal lldheldNum;

	@Column(name="LOC_TAX_AMT_DLR")
	private BigDecimal locTaxAmtDlr;

	@Column(name="MAX_UTLN_PCT")
	private BigDecimal maxUtlnPct;

	@Column(name="MCEXCSWATSTP_HRS")
	private BigDecimal mcexcswatstpHrs;

	@Column(name="MCLDUNLDSTOP_HRS")
	private BigDecimal mcldunldstopHrs;

	@Column(name="MILE_CMPD_YN")
	private String mileCmpdYn;

	@Column(name="MILE_DIST")
	private BigDecimal mileDist;

	@Column(name="MMO_ID")
	private BigDecimal mmoId;

	@Column(name="MNFT_LD_GRP_CD")
	private String mnftLdGrpCd;

	@Column(name="MNFT_PRTD_TMS")
	private BigDecimal mnftPrtdTms;

	@Column(name="MSTR_BOL_NUM")
	private String mstrBolNum;

	@Column(name="MSTR_BOL_QLFR_ID")
	private BigDecimal mstrBolQlfrId;

	@Column(name="MSTRBOL_PRTD_TMS")
	private BigDecimal mstrbolPrtdTms;

	@Column(name="NMNL_WGT")
	private BigDecimal nmnlWgt;

	@Column(name="NON_LIVE_DRPF_OVRD_ENU")
	private BigDecimal nonLiveDrpfOvrdEnu;

	@Column(name="NON_LIVE_DRPF_YN")
	private String nonLiveDrpfYn;

	@Column(name="NON_LIVE_PKUP_OVRD_ENU")
	private BigDecimal nonLivePkupOvrdEnu;

	@Column(name="NON_LIVE_PKUP_YN")
	private String nonLivePkupYn;

	@Column(name="NUM_BILL_STOP")
	private BigDecimal numBillStop;

	@Column(name="NUM_DRVR_ASSN")
	private BigDecimal numDrvrAssn;

	@Column(name="NUM_DVTD_SHPM")
	private BigDecimal numDvtdShpm;

	@Column(name="NUM_EMTY_STOP")
	private BigDecimal numEmtyStop;

	@Column(name="NUM_PMY_STOP")
	private BigDecimal numPmyStop;

	@Column(name="NUM_SHPM")
	private BigDecimal numShpm;

	@Column(name="NUM_SOFT_VIOL")
	private BigDecimal numSoftViol;

	@Column(name="NUM_STOP")
	private BigDecimal numStop;

	@Column(name="NUM_URGT_LLD")
	private BigDecimal numUrgtLld;

	@Column(name="ODR_VAL_DLR")
	private BigDecimal odrValDlr;

	@Column(name="OP_LST_NON_EMTY_YN")
	private String opLstNonEmtyYn;

	@Column(name="OPT_LCK")
	private BigDecimal optLck;

	@Column(name="OPTM_PLAN_ID")
	private BigDecimal optmPlanId;

	@Temporal(TemporalType.DATE)
	@Column(name="OUT_ERP_CRTD_DTT")
	private Date outErpCrtdDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="OUT_ERP_UPDT_DTT")
	private Date outErpUpdtDtt;

	@Column(name="OUTOFROUT_DIST")
	private BigDecimal outofroutDist;

	@Column(name="PCE_UTLN_PCT")
	private BigDecimal pceUtlnPct;

	@Column(name="PLAN_ID")
	private BigDecimal planId;

	@Column(name="PLNG_STAT_ENU")
	private BigDecimal plngStatEnu;

	@Column(name="PLNG_STAT_OVRD_ENU")
	private BigDecimal plngStatOvrdEnu;

	@Column(name="PMY_SCHD_CMTD_YN")
	private String pmySchdCmtdYn;

	@Temporal(TemporalType.DATE)
	@Column(name="POST_UNLD_END_DTT")
	private Date postUnldEndDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="POST_UNLD_STRD_DTT")
	private Date postUnldStrdDtt;

	@Column(name="PRE_BULT_LD_YN")
	private String preBultLdYn;

	@Temporal(TemporalType.DATE)
	@Column(name="PRE_LDNG_END_DTT")
	private Date preLdngEndDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="PRE_LDNG_STRD_DTT")
	private Date preLdngStrdDtt;

	@Column(name="PRECSLD_AMT_DLR")
	private BigDecimal precsldAmtDlr;

	@Column(name="PRFD_GRSMRGN_PCT")
	private BigDecimal prfdGrsmrgnPct;

	private BigDecimal prty;

	@Column(name="QUE_ID")
	private BigDecimal queId;

	@Temporal(TemporalType.DATE)
	@Column(name="RATD_DTT")
	private Date ratdDtt;

	@Column(name="RATE_CD")
	private String rateCd;

	@Column(name="RATE_CD_TFF_ID")
	private BigDecimal rateCdTffId;

	@Column(name="RATG_VLID_YN")
	private String ratgVlidYn;

	@Column(name="RET_FNCLSTAT_ID")
	private BigDecimal retFnclstatId;

	@Column(name="RET_OPTLSTAT_ID")
	private BigDecimal retOptlstatId;

	@Column(name="RET_TO_ORIG_DIST")
	private BigDecimal retToOrigDist;

	@Column(name="RFRC_NUM")
	private String rfrcNum;

	@Column(name="RFRC_NUM_ID")
	private BigDecimal rfrcNumId;

	@Column(name="RFRC_NUM_TYP")
	private BigDecimal rfrcNumTyp;

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

	@Column(name="RLAT_DPTR_SHPG_LOC_CD")
	private String rlatDptrShpgLocCd;

	@Column(name="RLAT_DPTR_SHPGPNT_ENU")
	private BigDecimal rlatDptrShpgpntEnu;

	@Column(name="RLAT_VESL")
	private String rlatVesl;

	@Temporal(TemporalType.DATE)
	@Column(name="RLAT_VESL_DPTR_DTT")
	private Date rlatVeslDptrDtt;

	@Column(name="RLAT_VOYG_NUM")
	private String rlatVoygNum;

	@Column(name="RSHP_RSN_CD_TYP")
	private BigDecimal rshpRsnCdTyp;

	@Column(name="RSRC_PRJ_TYP")
	private BigDecimal rsrcPrjTyp;

	@Column(name="RUTD_DEST_ZN_CD")
	private String rutdDestZnCd;

	@Column(name="RUTD_ORI_ZN_CD")
	private String rutdOriZnCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SCDD_DTT")
	private Date scddDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="SCHD_ETA_LAST_STOP_DTT")
	private Date schdEtaLastStopDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="SCHD_ETA_NEXT_STOP_DTT")
	private Date schdEtaNextStopDtt;

	@Column(name="SCLD_WGT")
	private BigDecimal scldWgt;

	@Column(name="SEAL_NUM")
	private String sealNum;

	@Column(name="SEQ_NUM")
	private BigDecimal seqNum;

	@Temporal(TemporalType.DATE)
	@Column(name="SHPD_DTT")
	private Date shpdDtt;

	@Column(name="SHPM_CNFM_NUM")
	private BigDecimal shpmCnfmNum;

	@Column(name="SHPM_ID")
	private BigDecimal shpmId;

	@Column(name="SKEL_ROUT_ID")
	private BigDecimal skelRoutId;

	@Column(name="SKID_UTLN_PCT")
	private BigDecimal skidUtlnPct;

	@Column(name="SNDRLDTDR_CNTC_ID")
	private BigDecimal sndrldtdrCntcId;

	@Column(name="SNDRLDTDRCNTC_NAME")
	private String sndrldtdrcntcName;

	@Column(name="SPOT_RATE_YN")
	private String spotRateYn;

	@Column(name="SRVC_CD")
	private String srvcCd;

	@Column(name="SRVC_CMTD_YN")
	private String srvcCmtdYn;

	@Column(name="SRVC_SOFT_CMTD_YN")
	private String srvcSoftCmtdYn;

	@Column(name="STA_TAX_AMT_DLR")
	private BigDecimal staTaxAmtDlr;

	@Column(name="STOP_BULT_YN")
	private String stopBultYn;

	@Temporal(TemporalType.DATE)
	@Column(name="STRD_DTT")
	private Date strdDtt;

	@Column(name="SUS_FUNC_ENU")
	private BigDecimal susFuncEnu;

	@Column(name="SYS_CALC_AMT_DLR")
	private BigDecimal sysCalcAmtDlr;

	@Column(name="TDR_ACPD_BY_NAME")
	private String tdrAcpdByName;

	@Column(name="TDR_REQ_ID")
	private BigDecimal tdrReqId;

	@Temporal(TemporalType.DATE)
	@Column(name="TDR_RSPS_BY_DTT")
	private Date tdrRspsByDtt;

	@Column(name="TDRD_USR_CD")
	private String tdrdUsrCd;

	@Column(name="TEAM_DRVR_YN")
	private String teamDrvrYn;

	@Column(name="TFF_ID")
	private BigDecimal tffId;

	@Column(name="TFF_RSTC_OVRD_YN")
	private String tffRstcOvrdYn;

	@Column(name="TOT_DCLD_VAL_DLR")
	private BigDecimal totDcldValDlr;

	@Column(name="TOT_DRIVING_HRS")
	private BigDecimal totDrivingHrs;

	@Column(name="TOT_EQMT_TARE_WGT")
	private BigDecimal totEqmtTareWgt;

	@Column(name="TOT_FLEX_QNTY1")
	private BigDecimal totFlexQnty1;

	@Column(name="TOT_FLEX_QNTY2")
	private BigDecimal totFlexQnty2;

	@Column(name="TOT_FLEX_QNTY3")
	private BigDecimal totFlexQnty3;

	@Column(name="TOT_FLEX_QNTY4")
	private BigDecimal totFlexQnty4;

	@Column(name="TOT_FLEX_QNTY5")
	private BigDecimal totFlexQnty5;

	@Column(name="TOT_LDN_LEN")
	private BigDecimal totLdnLen;

	@Column(name="TOT_LOADING_HRS")
	private BigDecimal totLoadingHrs;

	@Column(name="TOT_NMNL_WGT")
	private BigDecimal totNmnlWgt;

	@Column(name="TOT_ODR_VAL_DLR")
	private BigDecimal totOdrValDlr;

	@Column(name="TOT_OFF_DUTY_HRS")
	private BigDecimal totOffDutyHrs;

	@Column(name="TOT_ON_DUTY_HRS")
	private BigDecimal totOnDutyHrs;

	@Column(name="TOT_PCE")
	private BigDecimal totPce;

	@Column(name="TOT_SCLD_WGT")
	private BigDecimal totScldWgt;

	@Column(name="TOT_SHPM")
	private BigDecimal totShpm;

	@Column(name="TOT_SKID")
	private BigDecimal totSkid;

	@Column(name="TOT_TARE_WGT")
	private BigDecimal totTareWgt;

	@Column(name="TOT_TOT_FLEX_QNTY1")
	private BigDecimal totTotFlexQnty1;

	@Column(name="TOT_TOT_FLEX_QNTY2")
	private BigDecimal totTotFlexQnty2;

	@Column(name="TOT_TOT_FLEX_QNTY3")
	private BigDecimal totTotFlexQnty3;

	@Column(name="TOT_TOT_FLEX_QNTY4")
	private BigDecimal totTotFlexQnty4;

	@Column(name="TOT_TOT_FLEX_QNTY5")
	private BigDecimal totTotFlexQnty5;

	@Column(name="TOT_TOT_PCE")
	private BigDecimal totTotPce;

	@Column(name="TOT_TOT_SKID")
	private BigDecimal totTotSkid;

	@Column(name="TOT_TOT_TARE_WGT")
	private BigDecimal totTotTareWgt;

	@Column(name="TOT_UNLDD_DIST")
	private BigDecimal totUnlddDist;

	@Column(name="TOT_UNLOADING_HRS")
	private BigDecimal totUnloadingHrs;

	@Column(name="TOT_VOL")
	private BigDecimal totVol;

	@Column(name="TOTCEXCSWAIT_HRS")
	private BigDecimal totcexcswaitHrs;

	@Column(name="TP_ADTN_INFO")
	private String tpAdtnInfo;

	@Column(name="TRCTR_LIC_NUM")
	private String trctrLicNum;

	@Column(name="TRCTR_NUM")
	private String trctrNum;

	@Column(name="TRCTR_ONR")
	private String trctrOnr;

	@Column(name="TRCTR_UNLDD_DIST")
	private BigDecimal trctrUnlddDist;

	@Column(name="TRIP_ID")
	private BigDecimal tripId;

	@Column(name="TRIP_TFF_SAV_BAS_ENU")
	private BigDecimal tripTffSavBasEnu;

	@Column(name="TRLR_LIC_NUM")
	private String trlrLicNum;

	@Column(name="TRLR_NUM")
	private String trlrNum;

	@Column(name="TRLR_ONR")
	private String trlrOnr;

	@Column(name="UMSRDIST_ENU")
	private BigDecimal umsrdistEnu;

	@Column(name="UMSRLEN_ENU")
	private BigDecimal umsrlenEnu;

	@Column(name="UMSRSYS_ENU")
	private BigDecimal umsrsysEnu;

	@Column(name="UMSRWGT_ENU")
	private BigDecimal umsrwgtEnu;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDT_DTT")
	private Date updtDtt;

	@Column(name="UPDT_USR_CD")
	private String updtUsrCd;

	@Column(name="UTLN_FCTR")
	private BigDecimal utlnFctr;

	@Column(name="VCHR_RUN_EXCP_ID")
	private BigDecimal vchrRunExcpId;

	private String vesl;

	@Temporal(TemporalType.DATE)
	@Column(name="VESL_ARVL_DTT")
	private Date veslArvlDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="VESL_DPTR_DTT")
	private Date veslDptrDtt;

	@Column(name="VESL_TRKG_ID_1")
	private String veslTrkgId1;

	@Column(name="VESL_TRKG_ID_2")
	private String veslTrkgId2;

	@Column(name="VGM_ATHZR")
	private String vgmAthzr;

	@Temporal(TemporalType.DATE)
	@Column(name="VGM_VRFC_DTT")
	private Date vgmVrfcDtt;

	@Temporal(TemporalType.DATE)
	@Column(name="VGM_WGH_DTT")
	private Date vgmWghDtt;

	@Column(name="VGM_WGH_MTHD")
	private BigDecimal vgmWghMthd;

	private BigDecimal vol;

	@Column(name="VOL_UTLN_PCT")
	private BigDecimal volUtlnPct;

	@Column(name="VOYG_NUM")
	private String voygNum;

	@Column(name="VRFD_GRS_MASS")
	private BigDecimal vrfdGrsMass;

	@Column(name="WEB_SCHD_RRS_REQD_YN")
	private String webSchdRrsReqdYn;

	@Column(name="WGT_DIST_EXTD")
	private BigDecimal wgtDistExtd;

	@Column(name="WGT_UTLN_PCT")
	private BigDecimal wgtUtlnPct;

	@Column(name="WKND_HLDY_HRS")
	private BigDecimal wkndHldyHrs;

	public LdLegT() {
	}

	public long getLdLegId() {
		return this.ldLegId;
	}

	public void setLdLegId(long ldLegId) {
		this.ldLegId = ldLegId;
	}

	public String getAccNum() {
		return this.accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getActlCarrsrvc() {
		return this.actlCarrsrvc;
	}

	public void setActlCarrsrvc(String actlCarrsrvc) {
		this.actlCarrsrvc = actlCarrsrvc;
	}

	public BigDecimal getActlChgdAmtDlr() {
		return this.actlChgdAmtDlr;
	}

	public void setActlChgdAmtDlr(BigDecimal actlChgdAmtDlr) {
		this.actlChgdAmtDlr = actlChgdAmtDlr;
	}

	public BigDecimal getActlCncyTyp() {
		return this.actlCncyTyp;
	}

	public void setActlCncyTyp(BigDecimal actlCncyTyp) {
		this.actlCncyTyp = actlCncyTyp;
	}

	public BigDecimal getAdtnChrgDlr() {
		return this.adtnChrgDlr;
	}

	public void setAdtnChrgDlr(BigDecimal adtnChrgDlr) {
		this.adtnChrgDlr = adtnChrgDlr;
	}

	public String getAplyRsrcCstrYn() {
		return this.aplyRsrcCstrYn;
	}

	public void setAplyRsrcCstrYn(String aplyRsrcCstrYn) {
		this.aplyRsrcCstrYn = aplyRsrcCstrYn;
	}

	public String getArvlShpgLocCd() {
		return this.arvlShpgLocCd;
	}

	public void setArvlShpgLocCd(String arvlShpgLocCd) {
		this.arvlShpgLocCd = arvlShpgLocCd;
	}

	public BigDecimal getArvlShpgpntEnu() {
		return this.arvlShpgpntEnu;
	}

	public void setArvlShpgpntEnu(BigDecimal arvlShpgpntEnu) {
		this.arvlShpgpntEnu = arvlShpgpntEnu;
	}

	public BigDecimal getAutoTdrStatEnu() {
		return this.autoTdrStatEnu;
	}

	public void setAutoTdrStatEnu(BigDecimal autoTdrStatEnu) {
		this.autoTdrStatEnu = autoTdrStatEnu;
	}

	public String getBillToCustCd() {
		return this.billToCustCd;
	}

	public void setBillToCustCd(String billToCustCd) {
		this.billToCustCd = billToCustCd;
	}

	public String getBkgRviBypRrsYn() {
		return this.bkgRviBypRrsYn;
	}

	public void setBkgRviBypRrsYn(String bkgRviBypRrsYn) {
		this.bkgRviBypRrsYn = bkgRviBypRrsYn;
	}

	public String getBkgRviProcYn() {
		return this.bkgRviProcYn;
	}

	public void setBkgRviProcYn(String bkgRviProcYn) {
		this.bkgRviProcYn = bkgRviProcYn;
	}

	public BigDecimal getBkgSrvcTypEnu() {
		return this.bkgSrvcTypEnu;
	}

	public void setBkgSrvcTypEnu(BigDecimal bkgSrvcTypEnu) {
		this.bkgSrvcTypEnu = bkgSrvcTypEnu;
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

	public Date getCarrEtaLastStopDtt() {
		return this.carrEtaLastStopDtt;
	}

	public void setCarrEtaLastStopDtt(Date carrEtaLastStopDtt) {
		this.carrEtaLastStopDtt = carrEtaLastStopDtt;
	}

	public Date getCarrEtaNextLocDtt() {
		return this.carrEtaNextLocDtt;
	}

	public void setCarrEtaNextLocDtt(Date carrEtaNextLocDtt) {
		this.carrEtaNextLocDtt = carrEtaNextLocDtt;
	}

	public String getCarrSoftCmtdYn() {
		return this.carrSoftCmtdYn;
	}

	public void setCarrSoftCmtdYn(String carrSoftCmtdYn) {
		this.carrSoftCmtdYn = carrSoftCmtdYn;
	}

	public BigDecimal getCarrldtdrCntcId() {
		return this.carrldtdrCntcId;
	}

	public void setCarrldtdrCntcId(BigDecimal carrldtdrCntcId) {
		this.carrldtdrCntcId = carrldtdrCntcId;
	}

	public String getCarrldtdrcntcName() {
		return this.carrldtdrcntcName;
	}

	public void setCarrldtdrcntcName(String carrldtdrcntcName) {
		this.carrldtdrcntcName = carrldtdrcntcName;
	}

	public String getCdtyCd() {
		return this.cdtyCd;
	}

	public void setCdtyCd(String cdtyCd) {
		this.cdtyCd = cdtyCd;
	}

	public String getCdtyCmtdYn() {
		return this.cdtyCmtdYn;
	}

	public void setCdtyCmtdYn(String cdtyCmtdYn) {
		this.cdtyCmtdYn = cdtyCmtdYn;
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

	public BigDecimal getCmprLdRatgId() {
		return this.cmprLdRatgId;
	}

	public void setCmprLdRatgId(BigDecimal cmprLdRatgId) {
		this.cmprLdRatgId = cmprLdRatgId;
	}

	public BigDecimal getCncyTyp() {
		return this.cncyTyp;
	}

	public void setCncyTyp(BigDecimal cncyTyp) {
		this.cncyTyp = cncyTyp;
	}

	public Date getCntrYardDtt() {
		return this.cntrYardDtt;
	}

	public void setCntrYardDtt(Date cntrYardDtt) {
		this.cntrYardDtt = cntrYardDtt;
	}

	public BigDecimal getCostCtrTyp() {
		return this.costCtrTyp;
	}

	public void setCostCtrTyp(BigDecimal costCtrTyp) {
		this.costCtrTyp = costCtrTyp;
	}

	public Date getCpldDtt() {
		return this.cpldDtt;
	}

	public void setCpldDtt(Date cpldDtt) {
		this.cpldDtt = cpldDtt;
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

	public String getCstrOvrdYn() {
		return this.cstrOvrdYn;
	}

	public void setCstrOvrdYn(String cstrOvrdYn) {
		this.cstrOvrdYn = cstrOvrdYn;
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

	public BigDecimal getDcldValDlr() {
		return this.dcldValDlr;
	}

	public void setDcldValDlr(BigDecimal dcldValDlr) {
		this.dcldValDlr = dcldValDlr;
	}

	public String getDetlRetdYn() {
		return this.detlRetdYn;
	}

	public void setDetlRetdYn(String detlRetdYn) {
		this.detlRetdYn = detlRetdYn;
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

	public String getDmclCd() {
		return this.dmclCd;
	}

	public void setDmclCd(String dmclCd) {
		this.dmclCd = dmclCd;
	}

	public String getDmclCdTrlr() {
		return this.dmclCdTrlr;
	}

	public void setDmclCdTrlr(String dmclCdTrlr) {
		this.dmclCdTrlr = dmclCdTrlr;
	}

	public String getDmclTrctrCmtdYn() {
		return this.dmclTrctrCmtdYn;
	}

	public void setDmclTrctrCmtdYn(String dmclTrctrCmtdYn) {
		this.dmclTrctrCmtdYn = dmclTrctrCmtdYn;
	}

	public String getDmclTrlrCmtdYn() {
		return this.dmclTrlrCmtdYn;
	}

	public void setDmclTrlrCmtdYn(String dmclTrlrCmtdYn) {
		this.dmclTrlrCmtdYn = dmclTrlrCmtdYn;
	}

	public String getDptrShpgLocCd() {
		return this.dptrShpgLocCd;
	}

	public void setDptrShpgLocCd(String dptrShpgLocCd) {
		this.dptrShpgLocCd = dptrShpgLocCd;
	}

	public BigDecimal getDptrShpgpntEnu() {
		return this.dptrShpgpntEnu;
	}

	public void setDptrShpgpntEnu(BigDecimal dptrShpgpntEnu) {
		this.dptrShpgpntEnu = dptrShpgpntEnu;
	}

	public BigDecimal getDrctDist() {
		return this.drctDist;
	}

	public void setDrctDist(BigDecimal drctDist) {
		this.drctDist = drctDist;
	}

	public String getDrvr() {
		return this.drvr;
	}

	public void setDrvr(String drvr) {
		this.drvr = drvr;
	}

	public String getDrvrCd() {
		return this.drvrCd;
	}

	public void setDrvrCd(String drvrCd) {
		this.drvrCd = drvrCd;
	}

	public String getDrvrLicNum() {
		return this.drvrLicNum;
	}

	public void setDrvrLicNum(String drvrLicNum) {
		this.drvrLicNum = drvrLicNum;
	}

	public BigDecimal getDsctAmtDlr() {
		return this.dsctAmtDlr;
	}

	public void setDsctAmtDlr(BigDecimal dsctAmtDlr) {
		this.dsctAmtDlr = dsctAmtDlr;
	}

	public BigDecimal getEchgRatePrce() {
		return this.echgRatePrce;
	}

	public void setEchgRatePrce(BigDecimal echgRatePrce) {
		this.echgRatePrce = echgRatePrce;
	}

	public String getEdi204IsudYn() {
		return this.edi204IsudYn;
	}

	public void setEdi204IsudYn(String edi204IsudYn) {
		this.edi204IsudYn = edi204IsudYn;
	}

	public Date getEfctRatgDt() {
		return this.efctRatgDt;
	}

	public void setEfctRatgDt(Date efctRatgDt) {
		this.efctRatgDt = efctRatgDt;
	}

	public BigDecimal getElgbCntsMvEnu() {
		return this.elgbCntsMvEnu;
	}

	public void setElgbCntsMvEnu(BigDecimal elgbCntsMvEnu) {
		this.elgbCntsMvEnu = elgbCntsMvEnu;
	}

	public String getElgbCntsMvYn() {
		return this.elgbCntsMvYn;
	}

	public void setElgbCntsMvYn(String elgbCntsMvYn) {
		this.elgbCntsMvYn = elgbCntsMvYn;
	}

	public BigDecimal getElpdHrs() {
		return this.elpdHrs;
	}

	public void setElpdHrs(BigDecimal elpdHrs) {
		this.elpdHrs = elpdHrs;
	}

	public Date getEndDtt() {
		return this.endDtt;
	}

	public void setEndDtt(Date endDtt) {
		this.endDtt = endDtt;
	}

	public String getEqmtSoftCmtdYn() {
		return this.eqmtSoftCmtdYn;
	}

	public void setEqmtSoftCmtdYn(String eqmtSoftCmtdYn) {
		this.eqmtSoftCmtdYn = eqmtSoftCmtdYn;
	}

	public String getEqmtTrctrCmtdYn() {
		return this.eqmtTrctrCmtdYn;
	}

	public void setEqmtTrctrCmtdYn(String eqmtTrctrCmtdYn) {
		this.eqmtTrctrCmtdYn = eqmtTrctrCmtdYn;
	}

	public String getEqmtTyp() {
		return this.eqmtTyp;
	}

	public void setEqmtTyp(String eqmtTyp) {
		this.eqmtTyp = eqmtTyp;
	}

	public String getEqmtTypCdTrctr() {
		return this.eqmtTypCdTrctr;
	}

	public void setEqmtTypCdTrctr(String eqmtTypCdTrctr) {
		this.eqmtTypCdTrctr = eqmtTypCdTrctr;
	}

	public String getEqmtTypCmtdYn() {
		return this.eqmtTypCmtdYn;
	}

	public void setEqmtTypCmtdYn(String eqmtTypCmtdYn) {
		this.eqmtTypCmtdYn = eqmtTypCmtdYn;
	}

	public BigDecimal getEqmtTypRqrdNum() {
		return this.eqmtTypRqrdNum;
	}

	public void setEqmtTypRqrdNum(BigDecimal eqmtTypRqrdNum) {
		this.eqmtTypRqrdNum = eqmtTypRqrdNum;
	}

	public BigDecimal getEqmtTypTrctrRqrdNum() {
		return this.eqmtTypTrctrRqrdNum;
	}

	public void setEqmtTypTrctrRqrdNum(BigDecimal eqmtTypTrctrRqrdNum) {
		this.eqmtTypTrctrRqrdNum = eqmtTypTrctrRqrdNum;
	}

	public String getEtaNextLocCd() {
		return this.etaNextLocCd;
	}

	public void setEtaNextLocCd(String etaNextLocCd) {
		this.etaNextLocCd = etaNextLocCd;
	}

	public BigDecimal getEtaNextLocEnu() {
		return this.etaNextLocEnu;
	}

	public void setEtaNextLocEnu(BigDecimal etaNextLocEnu) {
		this.etaNextLocEnu = etaNextLocEnu;
	}

	public BigDecimal getEtmdGrsmrgnPct() {
		return this.etmdGrsmrgnPct;
	}

	public void setEtmdGrsmrgnPct(BigDecimal etmdGrsmrgnPct) {
		this.etmdGrsmrgnPct = etmdGrsmrgnPct;
	}

	public BigDecimal getExecElpdHrs() {
		return this.execElpdHrs;
	}

	public void setExecElpdHrs(BigDecimal execElpdHrs) {
		this.execElpdHrs = execElpdHrs;
	}

	public BigDecimal getExecMcexcswatstpHrs() {
		return this.execMcexcswatstpHrs;
	}

	public void setExecMcexcswatstpHrs(BigDecimal execMcexcswatstpHrs) {
		this.execMcexcswatstpHrs = execMcexcswatstpHrs;
	}

	public String getExecSchdOvrdYn() {
		return this.execSchdOvrdYn;
	}

	public void setExecSchdOvrdYn(String execSchdOvrdYn) {
		this.execSchdOvrdYn = execSchdOvrdYn;
	}

	public BigDecimal getExecSchdStatEnu() {
		return this.execSchdStatEnu;
	}

	public void setExecSchdStatEnu(BigDecimal execSchdStatEnu) {
		this.execSchdStatEnu = execSchdStatEnu;
	}

	public BigDecimal getExecTotDrivingHrs() {
		return this.execTotDrivingHrs;
	}

	public void setExecTotDrivingHrs(BigDecimal execTotDrivingHrs) {
		this.execTotDrivingHrs = execTotDrivingHrs;
	}

	public BigDecimal getExecTotLoadingHrs() {
		return this.execTotLoadingHrs;
	}

	public void setExecTotLoadingHrs(BigDecimal execTotLoadingHrs) {
		this.execTotLoadingHrs = execTotLoadingHrs;
	}

	public BigDecimal getExecTotOffDutyHrs() {
		return this.execTotOffDutyHrs;
	}

	public void setExecTotOffDutyHrs(BigDecimal execTotOffDutyHrs) {
		this.execTotOffDutyHrs = execTotOffDutyHrs;
	}

	public BigDecimal getExecTotOnDutyHrs() {
		return this.execTotOnDutyHrs;
	}

	public void setExecTotOnDutyHrs(BigDecimal execTotOnDutyHrs) {
		this.execTotOnDutyHrs = execTotOnDutyHrs;
	}

	public BigDecimal getExecTotUnloadingHrs() {
		return this.execTotUnloadingHrs;
	}

	public void setExecTotUnloadingHrs(BigDecimal execTotUnloadingHrs) {
		this.execTotUnloadingHrs = execTotUnloadingHrs;
	}

	public BigDecimal getExecTotcexcswaitHrs() {
		return this.execTotcexcswaitHrs;
	}

	public void setExecTotcexcswaitHrs(BigDecimal execTotcexcswaitHrs) {
		this.execTotcexcswaitHrs = execTotcexcswaitHrs;
	}

	public BigDecimal getExecWkndHldyHrs() {
		return this.execWkndHldyHrs;
	}

	public void setExecWkndHldyHrs(BigDecimal execWkndHldyHrs) {
		this.execWkndHldyHrs = execWkndHldyHrs;
	}

	public String getExtlEginVerCd() {
		return this.extlEginVerCd;
	}

	public void setExtlEginVerCd(String extlEginVerCd) {
		this.extlEginVerCd = extlEginVerCd;
	}

	public String getExtlSrvcTypCd() {
		return this.extlSrvcTypCd;
	}

	public void setExtlSrvcTypCd(String extlSrvcTypCd) {
		this.extlSrvcTypCd = extlSrvcTypCd;
	}

	public BigDecimal getFarPntStopId() {
		return this.farPntStopId;
	}

	public void setFarPntStopId(BigDecimal farPntStopId) {
		this.farPntStopId = farPntStopId;
	}

	public BigDecimal getFedlTaxAmtDlr() {
		return this.fedlTaxAmtDlr;
	}

	public void setFedlTaxAmtDlr(BigDecimal fedlTaxAmtDlr) {
		this.fedlTaxAmtDlr = fedlTaxAmtDlr;
	}

	public BigDecimal getFeuRsrcFctr() {
		return this.feuRsrcFctr;
	}

	public void setFeuRsrcFctr(BigDecimal feuRsrcFctr) {
		this.feuRsrcFctr = feuRsrcFctr;
	}

	public BigDecimal getFixdItnrDist() {
		return this.fixdItnrDist;
	}

	public void setFixdItnrDist(BigDecimal fixdItnrDist) {
		this.fixdItnrDist = fixdItnrDist;
	}

	public BigDecimal getFrstAddrId() {
		return this.frstAddrId;
	}

	public void setFrstAddrId(BigDecimal frstAddrId) {
		this.frstAddrId = frstAddrId;
	}

	public String getFrstCtryCd() {
		return this.frstCtryCd;
	}

	public void setFrstCtryCd(String frstCtryCd) {
		this.frstCtryCd = frstCtryCd;
	}

	public String getFrstCtyName() {
		return this.frstCtyName;
	}

	public void setFrstCtyName(String frstCtyName) {
		this.frstCtyName = frstCtyName;
	}

	public String getFrstPstlCd() {
		return this.frstPstlCd;
	}

	public void setFrstPstlCd(String frstPstlCd) {
		this.frstPstlCd = frstPstlCd;
	}

	public String getFrstShpgLocCd() {
		return this.frstShpgLocCd;
	}

	public void setFrstShpgLocCd(String frstShpgLocCd) {
		this.frstShpgLocCd = frstShpgLocCd;
	}

	public String getFrstShpgLocName() {
		return this.frstShpgLocName;
	}

	public void setFrstShpgLocName(String frstShpgLocName) {
		this.frstShpgLocName = frstShpgLocName;
	}

	public BigDecimal getFrstShpgpntEnu() {
		return this.frstShpgpntEnu;
	}

	public void setFrstShpgpntEnu(BigDecimal frstShpgpntEnu) {
		this.frstShpgpntEnu = frstShpgpntEnu;
	}

	public String getFrstStaCd() {
		return this.frstStaCd;
	}

	public void setFrstStaCd(String frstStaCd) {
		this.frstStaCd = frstStaCd;
	}

	public Date getFrstStopElstToPkupDtt() {
		return this.frstStopElstToPkupDtt;
	}

	public void setFrstStopElstToPkupDtt(Date frstStopElstToPkupDtt) {
		this.frstStopElstToPkupDtt = frstStopElstToPkupDtt;
	}

	public BigDecimal getFrstStopId() {
		return this.frstStopId;
	}

	public void setFrstStopId(BigDecimal frstStopId) {
		this.frstStopId = frstStopId;
	}

	public Date getFrstStopLtstFrmPkupDtt() {
		return this.frstStopLtstFrmPkupDtt;
	}

	public void setFrstStopLtstFrmPkupDtt(Date frstStopLtstFrmPkupDtt) {
		this.frstStopLtstFrmPkupDtt = frstStopLtstFrmPkupDtt;
	}

	public String getFrstTdrIsudYn() {
		return this.frstTdrIsudYn;
	}

	public void setFrstTdrIsudYn(String frstTdrIsudYn) {
		this.frstTdrIsudYn = frstTdrIsudYn;
	}

	public BigDecimal getHdLdCntr() {
		return this.hdLdCntr;
	}

	public void setHdLdCntr(BigDecimal hdLdCntr) {
		this.hdLdCntr = hdLdCntr;
	}

	public BigDecimal getHighNoteIprsEnu() {
		return this.highNoteIprsEnu;
	}

	public void setHighNoteIprsEnu(BigDecimal highNoteIprsEnu) {
		this.highNoteIprsEnu = highNoteIprsEnu;
	}

	public BigDecimal getInTnstUnlddDist() {
		return this.inTnstUnlddDist;
	}

	public void setInTnstUnlddDist(BigDecimal inTnstUnlddDist) {
		this.inTnstUnlddDist = inTnstUnlddDist;
	}

	public BigDecimal getInTnstUnlddTotDist() {
		return this.inTnstUnlddTotDist;
	}

	public void setInTnstUnlddTotDist(BigDecimal inTnstUnlddTotDist) {
		this.inTnstUnlddTotDist = inTnstUnlddTotDist;
	}

	public String getInclRsrcUsgCntYn() {
		return this.inclRsrcUsgCntYn;
	}

	public void setInclRsrcUsgCntYn(String inclRsrcUsgCntYn) {
		this.inclRsrcUsgCntYn = inclRsrcUsgCntYn;
	}

	public Date getIngtDtt() {
		return this.ingtDtt;
	}

	public void setIngtDtt(Date ingtDtt) {
		this.ingtDtt = ingtDtt;
	}

	public BigDecimal getInitRepsDist() {
		return this.initRepsDist;
	}

	public void setInitRepsDist(BigDecimal initRepsDist) {
		this.initRepsDist = initRepsDist;
	}

	public BigDecimal getLaneAsscId() {
		return this.laneAsscId;
	}

	public void setLaneAsscId(BigDecimal laneAsscId) {
		this.laneAsscId = laneAsscId;
	}

	public BigDecimal getLastAddrId() {
		return this.lastAddrId;
	}

	public void setLastAddrId(BigDecimal lastAddrId) {
		this.lastAddrId = lastAddrId;
	}

	public Date getLastChngdMngrOpmrDtt() {
		return this.lastChngdMngrOpmrDtt;
	}

	public void setLastChngdMngrOpmrDtt(Date lastChngdMngrOpmrDtt) {
		this.lastChngdMngrOpmrDtt = lastChngdMngrOpmrDtt;
	}

	public Date getLastChngdOpmrDtt() {
		return this.lastChngdOpmrDtt;
	}

	public void setLastChngdOpmrDtt(Date lastChngdOpmrDtt) {
		this.lastChngdOpmrDtt = lastChngdOpmrDtt;
	}

	public String getLastCtryCd() {
		return this.lastCtryCd;
	}

	public void setLastCtryCd(String lastCtryCd) {
		this.lastCtryCd = lastCtryCd;
	}

	public String getLastCtyName() {
		return this.lastCtyName;
	}

	public void setLastCtyName(String lastCtyName) {
		this.lastCtyName = lastCtyName;
	}

	public Date getLastEvntRptdDtt() {
		return this.lastEvntRptdDtt;
	}

	public void setLastEvntRptdDtt(Date lastEvntRptdDtt) {
		this.lastEvntRptdDtt = lastEvntRptdDtt;
	}

	public String getLastPstlCd() {
		return this.lastPstlCd;
	}

	public void setLastPstlCd(String lastPstlCd) {
		this.lastPstlCd = lastPstlCd;
	}

	public String getLastRatdCarrCd() {
		return this.lastRatdCarrCd;
	}

	public void setLastRatdCarrCd(String lastRatdCarrCd) {
		this.lastRatdCarrCd = lastRatdCarrCd;
	}

	public Date getLastRatdDtt() {
		return this.lastRatdDtt;
	}

	public void setLastRatdDtt(Date lastRatdDtt) {
		this.lastRatdDtt = lastRatdDtt;
	}

	public String getLastRatdSrvcCd() {
		return this.lastRatdSrvcCd;
	}

	public void setLastRatdSrvcCd(String lastRatdSrvcCd) {
		this.lastRatdSrvcCd = lastRatdSrvcCd;
	}

	public BigDecimal getLastRatdTffId() {
		return this.lastRatdTffId;
	}

	public void setLastRatdTffId(BigDecimal lastRatdTffId) {
		this.lastRatdTffId = lastRatdTffId;
	}

	public String getLastSecCd() {
		return this.lastSecCd;
	}

	public void setLastSecCd(String lastSecCd) {
		this.lastSecCd = lastSecCd;
	}

	public String getLastShpgLocCd() {
		return this.lastShpgLocCd;
	}

	public void setLastShpgLocCd(String lastShpgLocCd) {
		this.lastShpgLocCd = lastShpgLocCd;
	}

	public String getLastShpgLocName() {
		return this.lastShpgLocName;
	}

	public void setLastShpgLocName(String lastShpgLocName) {
		this.lastShpgLocName = lastShpgLocName;
	}

	public BigDecimal getLastShpgpntEnu() {
		return this.lastShpgpntEnu;
	}

	public void setLastShpgpntEnu(BigDecimal lastShpgpntEnu) {
		this.lastShpgpntEnu = lastShpgpntEnu;
	}

	public String getLastStaCd() {
		return this.lastStaCd;
	}

	public void setLastStaCd(String lastStaCd) {
		this.lastStaCd = lastStaCd;
	}

	public Date getLastStopElstToDlvyDtt() {
		return this.lastStopElstToDlvyDtt;
	}

	public void setLastStopElstToDlvyDtt(Date lastStopElstToDlvyDtt) {
		this.lastStopElstToDlvyDtt = lastStopElstToDlvyDtt;
	}

	public BigDecimal getLastStopId() {
		return this.lastStopId;
	}

	public void setLastStopId(BigDecimal lastStopId) {
		this.lastStopId = lastStopId;
	}

	public Date getLastStopLtstFrmDlvyDtt() {
		return this.lastStopLtstFrmDlvyDtt;
	}

	public void setLastStopLtstFrmDlvyDtt(Date lastStopLtstFrmDlvyDtt) {
		this.lastStopLtstFrmDlvyDtt = lastStopLtstFrmDlvyDtt;
	}

	public String getLdCmpsAprdYn() {
		return this.ldCmpsAprdYn;
	}

	public void setLdCmpsAprdYn(String ldCmpsAprdYn) {
		this.ldCmpsAprdYn = ldCmpsAprdYn;
	}

	public String getLdDesc() {
		return this.ldDesc;
	}

	public void setLdDesc(String ldDesc) {
		this.ldDesc = ldDesc;
	}

	public String getLdGrp() {
		return this.ldGrp;
	}

	public void setLdGrp(String ldGrp) {
		this.ldGrp = ldGrp;
	}

	public BigDecimal getLdLegCatEnu() {
		return this.ldLegCatEnu;
	}

	public void setLdLegCatEnu(BigDecimal ldLegCatEnu) {
		this.ldLegCatEnu = ldLegCatEnu;
	}

	public String getLdLegSchdItnrVlidYn() {
		return this.ldLegSchdItnrVlidYn;
	}

	public void setLdLegSchdItnrVlidYn(String ldLegSchdItnrVlidYn) {
		this.ldLegSchdItnrVlidYn = ldLegSchdItnrVlidYn;
	}

	public BigDecimal getLdPrtyCalcEnu() {
		return this.ldPrtyCalcEnu;
	}

	public void setLdPrtyCalcEnu(BigDecimal ldPrtyCalcEnu) {
		this.ldPrtyCalcEnu = ldPrtyCalcEnu;
	}

	public String getLdSchdCmpdYn() {
		return this.ldSchdCmpdYn;
	}

	public void setLdSchdCmpdYn(String ldSchdCmpdYn) {
		this.ldSchdCmpdYn = ldSchdCmpdYn;
	}

	public BigDecimal getLdSrcEnu() {
		return this.ldSrcEnu;
	}

	public void setLdSrcEnu(BigDecimal ldSrcEnu) {
		this.ldSrcEnu = ldSrcEnu;
	}

	public BigDecimal getLdTermEnu() {
		return this.ldTermEnu;
	}

	public void setLdTermEnu(BigDecimal ldTermEnu) {
		this.ldTermEnu = ldTermEnu;
	}

	public BigDecimal getLdTypEnu() {
		return this.ldTypEnu;
	}

	public void setLdTypEnu(BigDecimal ldTypEnu) {
		this.ldTypEnu = ldTypEnu;
	}

	public BigDecimal getLddCnfgTypEnu() {
		return this.lddCnfgTypEnu;
	}

	public void setLddCnfgTypEnu(BigDecimal lddCnfgTypEnu) {
		this.lddCnfgTypEnu = lddCnfgTypEnu;
	}

	public BigDecimal getLddDist() {
		return this.lddDist;
	}

	public void setLddDist(BigDecimal lddDist) {
		this.lddDist = lddDist;
	}

	public BigDecimal getLdnLen() {
		return this.ldnLen;
	}

	public void setLdnLen(BigDecimal ldnLen) {
		this.ldnLen = ldnLen;
	}

	public BigDecimal getLdnLenUtlnPct() {
		return this.ldnLenUtlnPct;
	}

	public void setLdnLenUtlnPct(BigDecimal ldnLenUtlnPct) {
		this.ldnLenUtlnPct = ldnLenUtlnPct;
	}

	public String getLedTmUsdSchdYn() {
		return this.ledTmUsdSchdYn;
	}

	public void setLedTmUsdSchdYn(String ledTmUsdSchdYn) {
		this.ledTmUsdSchdYn = ledTmUsdSchdYn;
	}

	public String getLgstGrpCd() {
		return this.lgstGrpCd;
	}

	public void setLgstGrpCd(String lgstGrpCd) {
		this.lgstGrpCd = lgstGrpCd;
	}

	public BigDecimal getLldCarrcmtdTms() {
		return this.lldCarrcmtdTms;
	}

	public void setLldCarrcmtdTms(BigDecimal lldCarrcmtdTms) {
		this.lldCarrcmtdTms = lldCarrcmtdTms;
	}

	public BigDecimal getLldSrvccmtdTms() {
		return this.lldSrvccmtdTms;
	}

	public void setLldSrvccmtdTms(BigDecimal lldSrvccmtdTms) {
		this.lldSrvccmtdTms = lldSrvccmtdTms;
	}

	public BigDecimal getLldheldNum() {
		return this.lldheldNum;
	}

	public void setLldheldNum(BigDecimal lldheldNum) {
		this.lldheldNum = lldheldNum;
	}

	public BigDecimal getLocTaxAmtDlr() {
		return this.locTaxAmtDlr;
	}

	public void setLocTaxAmtDlr(BigDecimal locTaxAmtDlr) {
		this.locTaxAmtDlr = locTaxAmtDlr;
	}

	public BigDecimal getMaxUtlnPct() {
		return this.maxUtlnPct;
	}

	public void setMaxUtlnPct(BigDecimal maxUtlnPct) {
		this.maxUtlnPct = maxUtlnPct;
	}

	public BigDecimal getMcexcswatstpHrs() {
		return this.mcexcswatstpHrs;
	}

	public void setMcexcswatstpHrs(BigDecimal mcexcswatstpHrs) {
		this.mcexcswatstpHrs = mcexcswatstpHrs;
	}

	public BigDecimal getMcldunldstopHrs() {
		return this.mcldunldstopHrs;
	}

	public void setMcldunldstopHrs(BigDecimal mcldunldstopHrs) {
		this.mcldunldstopHrs = mcldunldstopHrs;
	}

	public String getMileCmpdYn() {
		return this.mileCmpdYn;
	}

	public void setMileCmpdYn(String mileCmpdYn) {
		this.mileCmpdYn = mileCmpdYn;
	}

	public BigDecimal getMileDist() {
		return this.mileDist;
	}

	public void setMileDist(BigDecimal mileDist) {
		this.mileDist = mileDist;
	}

	public BigDecimal getMmoId() {
		return this.mmoId;
	}

	public void setMmoId(BigDecimal mmoId) {
		this.mmoId = mmoId;
	}

	public String getMnftLdGrpCd() {
		return this.mnftLdGrpCd;
	}

	public void setMnftLdGrpCd(String mnftLdGrpCd) {
		this.mnftLdGrpCd = mnftLdGrpCd;
	}

	public BigDecimal getMnftPrtdTms() {
		return this.mnftPrtdTms;
	}

	public void setMnftPrtdTms(BigDecimal mnftPrtdTms) {
		this.mnftPrtdTms = mnftPrtdTms;
	}

	public String getMstrBolNum() {
		return this.mstrBolNum;
	}

	public void setMstrBolNum(String mstrBolNum) {
		this.mstrBolNum = mstrBolNum;
	}

	public BigDecimal getMstrBolQlfrId() {
		return this.mstrBolQlfrId;
	}

	public void setMstrBolQlfrId(BigDecimal mstrBolQlfrId) {
		this.mstrBolQlfrId = mstrBolQlfrId;
	}

	public BigDecimal getMstrbolPrtdTms() {
		return this.mstrbolPrtdTms;
	}

	public void setMstrbolPrtdTms(BigDecimal mstrbolPrtdTms) {
		this.mstrbolPrtdTms = mstrbolPrtdTms;
	}

	public BigDecimal getNmnlWgt() {
		return this.nmnlWgt;
	}

	public void setNmnlWgt(BigDecimal nmnlWgt) {
		this.nmnlWgt = nmnlWgt;
	}

	public BigDecimal getNonLiveDrpfOvrdEnu() {
		return this.nonLiveDrpfOvrdEnu;
	}

	public void setNonLiveDrpfOvrdEnu(BigDecimal nonLiveDrpfOvrdEnu) {
		this.nonLiveDrpfOvrdEnu = nonLiveDrpfOvrdEnu;
	}

	public String getNonLiveDrpfYn() {
		return this.nonLiveDrpfYn;
	}

	public void setNonLiveDrpfYn(String nonLiveDrpfYn) {
		this.nonLiveDrpfYn = nonLiveDrpfYn;
	}

	public BigDecimal getNonLivePkupOvrdEnu() {
		return this.nonLivePkupOvrdEnu;
	}

	public void setNonLivePkupOvrdEnu(BigDecimal nonLivePkupOvrdEnu) {
		this.nonLivePkupOvrdEnu = nonLivePkupOvrdEnu;
	}

	public String getNonLivePkupYn() {
		return this.nonLivePkupYn;
	}

	public void setNonLivePkupYn(String nonLivePkupYn) {
		this.nonLivePkupYn = nonLivePkupYn;
	}

	public BigDecimal getNumBillStop() {
		return this.numBillStop;
	}

	public void setNumBillStop(BigDecimal numBillStop) {
		this.numBillStop = numBillStop;
	}

	public BigDecimal getNumDrvrAssn() {
		return this.numDrvrAssn;
	}

	public void setNumDrvrAssn(BigDecimal numDrvrAssn) {
		this.numDrvrAssn = numDrvrAssn;
	}

	public BigDecimal getNumDvtdShpm() {
		return this.numDvtdShpm;
	}

	public void setNumDvtdShpm(BigDecimal numDvtdShpm) {
		this.numDvtdShpm = numDvtdShpm;
	}

	public BigDecimal getNumEmtyStop() {
		return this.numEmtyStop;
	}

	public void setNumEmtyStop(BigDecimal numEmtyStop) {
		this.numEmtyStop = numEmtyStop;
	}

	public BigDecimal getNumPmyStop() {
		return this.numPmyStop;
	}

	public void setNumPmyStop(BigDecimal numPmyStop) {
		this.numPmyStop = numPmyStop;
	}

	public BigDecimal getNumShpm() {
		return this.numShpm;
	}

	public void setNumShpm(BigDecimal numShpm) {
		this.numShpm = numShpm;
	}

	public BigDecimal getNumSoftViol() {
		return this.numSoftViol;
	}

	public void setNumSoftViol(BigDecimal numSoftViol) {
		this.numSoftViol = numSoftViol;
	}

	public BigDecimal getNumStop() {
		return this.numStop;
	}

	public void setNumStop(BigDecimal numStop) {
		this.numStop = numStop;
	}

	public BigDecimal getNumUrgtLld() {
		return this.numUrgtLld;
	}

	public void setNumUrgtLld(BigDecimal numUrgtLld) {
		this.numUrgtLld = numUrgtLld;
	}

	public BigDecimal getOdrValDlr() {
		return this.odrValDlr;
	}

	public void setOdrValDlr(BigDecimal odrValDlr) {
		this.odrValDlr = odrValDlr;
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

	public BigDecimal getOptmPlanId() {
		return this.optmPlanId;
	}

	public void setOptmPlanId(BigDecimal optmPlanId) {
		this.optmPlanId = optmPlanId;
	}

	public Date getOutErpCrtdDtt() {
		return this.outErpCrtdDtt;
	}

	public void setOutErpCrtdDtt(Date outErpCrtdDtt) {
		this.outErpCrtdDtt = outErpCrtdDtt;
	}

	public Date getOutErpUpdtDtt() {
		return this.outErpUpdtDtt;
	}

	public void setOutErpUpdtDtt(Date outErpUpdtDtt) {
		this.outErpUpdtDtt = outErpUpdtDtt;
	}

	public BigDecimal getOutofroutDist() {
		return this.outofroutDist;
	}

	public void setOutofroutDist(BigDecimal outofroutDist) {
		this.outofroutDist = outofroutDist;
	}

	public BigDecimal getPceUtlnPct() {
		return this.pceUtlnPct;
	}

	public void setPceUtlnPct(BigDecimal pceUtlnPct) {
		this.pceUtlnPct = pceUtlnPct;
	}

	public BigDecimal getPlanId() {
		return this.planId;
	}

	public void setPlanId(BigDecimal planId) {
		this.planId = planId;
	}

	public BigDecimal getPlngStatEnu() {
		return this.plngStatEnu;
	}

	public void setPlngStatEnu(BigDecimal plngStatEnu) {
		this.plngStatEnu = plngStatEnu;
	}

	public BigDecimal getPlngStatOvrdEnu() {
		return this.plngStatOvrdEnu;
	}

	public void setPlngStatOvrdEnu(BigDecimal plngStatOvrdEnu) {
		this.plngStatOvrdEnu = plngStatOvrdEnu;
	}

	public String getPmySchdCmtdYn() {
		return this.pmySchdCmtdYn;
	}

	public void setPmySchdCmtdYn(String pmySchdCmtdYn) {
		this.pmySchdCmtdYn = pmySchdCmtdYn;
	}

	public Date getPostUnldEndDtt() {
		return this.postUnldEndDtt;
	}

	public void setPostUnldEndDtt(Date postUnldEndDtt) {
		this.postUnldEndDtt = postUnldEndDtt;
	}

	public Date getPostUnldStrdDtt() {
		return this.postUnldStrdDtt;
	}

	public void setPostUnldStrdDtt(Date postUnldStrdDtt) {
		this.postUnldStrdDtt = postUnldStrdDtt;
	}

	public String getPreBultLdYn() {
		return this.preBultLdYn;
	}

	public void setPreBultLdYn(String preBultLdYn) {
		this.preBultLdYn = preBultLdYn;
	}

	public Date getPreLdngEndDtt() {
		return this.preLdngEndDtt;
	}

	public void setPreLdngEndDtt(Date preLdngEndDtt) {
		this.preLdngEndDtt = preLdngEndDtt;
	}

	public Date getPreLdngStrdDtt() {
		return this.preLdngStrdDtt;
	}

	public void setPreLdngStrdDtt(Date preLdngStrdDtt) {
		this.preLdngStrdDtt = preLdngStrdDtt;
	}

	public BigDecimal getPrecsldAmtDlr() {
		return this.precsldAmtDlr;
	}

	public void setPrecsldAmtDlr(BigDecimal precsldAmtDlr) {
		this.precsldAmtDlr = precsldAmtDlr;
	}

	public BigDecimal getPrfdGrsmrgnPct() {
		return this.prfdGrsmrgnPct;
	}

	public void setPrfdGrsmrgnPct(BigDecimal prfdGrsmrgnPct) {
		this.prfdGrsmrgnPct = prfdGrsmrgnPct;
	}

	public BigDecimal getPrty() {
		return this.prty;
	}

	public void setPrty(BigDecimal prty) {
		this.prty = prty;
	}

	public BigDecimal getQueId() {
		return this.queId;
	}

	public void setQueId(BigDecimal queId) {
		this.queId = queId;
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

	public BigDecimal getRetToOrigDist() {
		return this.retToOrigDist;
	}

	public void setRetToOrigDist(BigDecimal retToOrigDist) {
		this.retToOrigDist = retToOrigDist;
	}

	public String getRfrcNum() {
		return this.rfrcNum;
	}

	public void setRfrcNum(String rfrcNum) {
		this.rfrcNum = rfrcNum;
	}

	public BigDecimal getRfrcNumId() {
		return this.rfrcNumId;
	}

	public void setRfrcNumId(BigDecimal rfrcNumId) {
		this.rfrcNumId = rfrcNumId;
	}

	public BigDecimal getRfrcNumTyp() {
		return this.rfrcNumTyp;
	}

	public void setRfrcNumTyp(BigDecimal rfrcNumTyp) {
		this.rfrcNumTyp = rfrcNumTyp;
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

	public String getRlatDptrShpgLocCd() {
		return this.rlatDptrShpgLocCd;
	}

	public void setRlatDptrShpgLocCd(String rlatDptrShpgLocCd) {
		this.rlatDptrShpgLocCd = rlatDptrShpgLocCd;
	}

	public BigDecimal getRlatDptrShpgpntEnu() {
		return this.rlatDptrShpgpntEnu;
	}

	public void setRlatDptrShpgpntEnu(BigDecimal rlatDptrShpgpntEnu) {
		this.rlatDptrShpgpntEnu = rlatDptrShpgpntEnu;
	}

	public String getRlatVesl() {
		return this.rlatVesl;
	}

	public void setRlatVesl(String rlatVesl) {
		this.rlatVesl = rlatVesl;
	}

	public Date getRlatVeslDptrDtt() {
		return this.rlatVeslDptrDtt;
	}

	public void setRlatVeslDptrDtt(Date rlatVeslDptrDtt) {
		this.rlatVeslDptrDtt = rlatVeslDptrDtt;
	}

	public String getRlatVoygNum() {
		return this.rlatVoygNum;
	}

	public void setRlatVoygNum(String rlatVoygNum) {
		this.rlatVoygNum = rlatVoygNum;
	}

	public BigDecimal getRshpRsnCdTyp() {
		return this.rshpRsnCdTyp;
	}

	public void setRshpRsnCdTyp(BigDecimal rshpRsnCdTyp) {
		this.rshpRsnCdTyp = rshpRsnCdTyp;
	}

	public BigDecimal getRsrcPrjTyp() {
		return this.rsrcPrjTyp;
	}

	public void setRsrcPrjTyp(BigDecimal rsrcPrjTyp) {
		this.rsrcPrjTyp = rsrcPrjTyp;
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

	public Date getScddDtt() {
		return this.scddDtt;
	}

	public void setScddDtt(Date scddDtt) {
		this.scddDtt = scddDtt;
	}

	public Date getSchdEtaLastStopDtt() {
		return this.schdEtaLastStopDtt;
	}

	public void setSchdEtaLastStopDtt(Date schdEtaLastStopDtt) {
		this.schdEtaLastStopDtt = schdEtaLastStopDtt;
	}

	public Date getSchdEtaNextStopDtt() {
		return this.schdEtaNextStopDtt;
	}

	public void setSchdEtaNextStopDtt(Date schdEtaNextStopDtt) {
		this.schdEtaNextStopDtt = schdEtaNextStopDtt;
	}

	public BigDecimal getScldWgt() {
		return this.scldWgt;
	}

	public void setScldWgt(BigDecimal scldWgt) {
		this.scldWgt = scldWgt;
	}

	public String getSealNum() {
		return this.sealNum;
	}

	public void setSealNum(String sealNum) {
		this.sealNum = sealNum;
	}

	public BigDecimal getSeqNum() {
		return this.seqNum;
	}

	public void setSeqNum(BigDecimal seqNum) {
		this.seqNum = seqNum;
	}

	public Date getShpdDtt() {
		return this.shpdDtt;
	}

	public void setShpdDtt(Date shpdDtt) {
		this.shpdDtt = shpdDtt;
	}

	public BigDecimal getShpmCnfmNum() {
		return this.shpmCnfmNum;
	}

	public void setShpmCnfmNum(BigDecimal shpmCnfmNum) {
		this.shpmCnfmNum = shpmCnfmNum;
	}

	public BigDecimal getShpmId() {
		return this.shpmId;
	}

	public void setShpmId(BigDecimal shpmId) {
		this.shpmId = shpmId;
	}

	public BigDecimal getSkelRoutId() {
		return this.skelRoutId;
	}

	public void setSkelRoutId(BigDecimal skelRoutId) {
		this.skelRoutId = skelRoutId;
	}

	public BigDecimal getSkidUtlnPct() {
		return this.skidUtlnPct;
	}

	public void setSkidUtlnPct(BigDecimal skidUtlnPct) {
		this.skidUtlnPct = skidUtlnPct;
	}

	public BigDecimal getSndrldtdrCntcId() {
		return this.sndrldtdrCntcId;
	}

	public void setSndrldtdrCntcId(BigDecimal sndrldtdrCntcId) {
		this.sndrldtdrCntcId = sndrldtdrCntcId;
	}

	public String getSndrldtdrcntcName() {
		return this.sndrldtdrcntcName;
	}

	public void setSndrldtdrcntcName(String sndrldtdrcntcName) {
		this.sndrldtdrcntcName = sndrldtdrcntcName;
	}

	public String getSpotRateYn() {
		return this.spotRateYn;
	}

	public void setSpotRateYn(String spotRateYn) {
		this.spotRateYn = spotRateYn;
	}

	public String getSrvcCd() {
		return this.srvcCd;
	}

	public void setSrvcCd(String srvcCd) {
		this.srvcCd = srvcCd;
	}

	public String getSrvcCmtdYn() {
		return this.srvcCmtdYn;
	}

	public void setSrvcCmtdYn(String srvcCmtdYn) {
		this.srvcCmtdYn = srvcCmtdYn;
	}

	public String getSrvcSoftCmtdYn() {
		return this.srvcSoftCmtdYn;
	}

	public void setSrvcSoftCmtdYn(String srvcSoftCmtdYn) {
		this.srvcSoftCmtdYn = srvcSoftCmtdYn;
	}

	public BigDecimal getStaTaxAmtDlr() {
		return this.staTaxAmtDlr;
	}

	public void setStaTaxAmtDlr(BigDecimal staTaxAmtDlr) {
		this.staTaxAmtDlr = staTaxAmtDlr;
	}

	public String getStopBultYn() {
		return this.stopBultYn;
	}

	public void setStopBultYn(String stopBultYn) {
		this.stopBultYn = stopBultYn;
	}

	public Date getStrdDtt() {
		return this.strdDtt;
	}

	public void setStrdDtt(Date strdDtt) {
		this.strdDtt = strdDtt;
	}

	public BigDecimal getSusFuncEnu() {
		return this.susFuncEnu;
	}

	public void setSusFuncEnu(BigDecimal susFuncEnu) {
		this.susFuncEnu = susFuncEnu;
	}

	public BigDecimal getSysCalcAmtDlr() {
		return this.sysCalcAmtDlr;
	}

	public void setSysCalcAmtDlr(BigDecimal sysCalcAmtDlr) {
		this.sysCalcAmtDlr = sysCalcAmtDlr;
	}

	public String getTdrAcpdByName() {
		return this.tdrAcpdByName;
	}

	public void setTdrAcpdByName(String tdrAcpdByName) {
		this.tdrAcpdByName = tdrAcpdByName;
	}

	public BigDecimal getTdrReqId() {
		return this.tdrReqId;
	}

	public void setTdrReqId(BigDecimal tdrReqId) {
		this.tdrReqId = tdrReqId;
	}

	public Date getTdrRspsByDtt() {
		return this.tdrRspsByDtt;
	}

	public void setTdrRspsByDtt(Date tdrRspsByDtt) {
		this.tdrRspsByDtt = tdrRspsByDtt;
	}

	public String getTdrdUsrCd() {
		return this.tdrdUsrCd;
	}

	public void setTdrdUsrCd(String tdrdUsrCd) {
		this.tdrdUsrCd = tdrdUsrCd;
	}

	public String getTeamDrvrYn() {
		return this.teamDrvrYn;
	}

	public void setTeamDrvrYn(String teamDrvrYn) {
		this.teamDrvrYn = teamDrvrYn;
	}

	public BigDecimal getTffId() {
		return this.tffId;
	}

	public void setTffId(BigDecimal tffId) {
		this.tffId = tffId;
	}

	public String getTffRstcOvrdYn() {
		return this.tffRstcOvrdYn;
	}

	public void setTffRstcOvrdYn(String tffRstcOvrdYn) {
		this.tffRstcOvrdYn = tffRstcOvrdYn;
	}

	public BigDecimal getTotDcldValDlr() {
		return this.totDcldValDlr;
	}

	public void setTotDcldValDlr(BigDecimal totDcldValDlr) {
		this.totDcldValDlr = totDcldValDlr;
	}

	public BigDecimal getTotDrivingHrs() {
		return this.totDrivingHrs;
	}

	public void setTotDrivingHrs(BigDecimal totDrivingHrs) {
		this.totDrivingHrs = totDrivingHrs;
	}

	public BigDecimal getTotEqmtTareWgt() {
		return this.totEqmtTareWgt;
	}

	public void setTotEqmtTareWgt(BigDecimal totEqmtTareWgt) {
		this.totEqmtTareWgt = totEqmtTareWgt;
	}

	public BigDecimal getTotFlexQnty1() {
		return this.totFlexQnty1;
	}

	public void setTotFlexQnty1(BigDecimal totFlexQnty1) {
		this.totFlexQnty1 = totFlexQnty1;
	}

	public BigDecimal getTotFlexQnty2() {
		return this.totFlexQnty2;
	}

	public void setTotFlexQnty2(BigDecimal totFlexQnty2) {
		this.totFlexQnty2 = totFlexQnty2;
	}

	public BigDecimal getTotFlexQnty3() {
		return this.totFlexQnty3;
	}

	public void setTotFlexQnty3(BigDecimal totFlexQnty3) {
		this.totFlexQnty3 = totFlexQnty3;
	}

	public BigDecimal getTotFlexQnty4() {
		return this.totFlexQnty4;
	}

	public void setTotFlexQnty4(BigDecimal totFlexQnty4) {
		this.totFlexQnty4 = totFlexQnty4;
	}

	public BigDecimal getTotFlexQnty5() {
		return this.totFlexQnty5;
	}

	public void setTotFlexQnty5(BigDecimal totFlexQnty5) {
		this.totFlexQnty5 = totFlexQnty5;
	}

	public BigDecimal getTotLdnLen() {
		return this.totLdnLen;
	}

	public void setTotLdnLen(BigDecimal totLdnLen) {
		this.totLdnLen = totLdnLen;
	}

	public BigDecimal getTotLoadingHrs() {
		return this.totLoadingHrs;
	}

	public void setTotLoadingHrs(BigDecimal totLoadingHrs) {
		this.totLoadingHrs = totLoadingHrs;
	}

	public BigDecimal getTotNmnlWgt() {
		return this.totNmnlWgt;
	}

	public void setTotNmnlWgt(BigDecimal totNmnlWgt) {
		this.totNmnlWgt = totNmnlWgt;
	}

	public BigDecimal getTotOdrValDlr() {
		return this.totOdrValDlr;
	}

	public void setTotOdrValDlr(BigDecimal totOdrValDlr) {
		this.totOdrValDlr = totOdrValDlr;
	}

	public BigDecimal getTotOffDutyHrs() {
		return this.totOffDutyHrs;
	}

	public void setTotOffDutyHrs(BigDecimal totOffDutyHrs) {
		this.totOffDutyHrs = totOffDutyHrs;
	}

	public BigDecimal getTotOnDutyHrs() {
		return this.totOnDutyHrs;
	}

	public void setTotOnDutyHrs(BigDecimal totOnDutyHrs) {
		this.totOnDutyHrs = totOnDutyHrs;
	}

	public BigDecimal getTotPce() {
		return this.totPce;
	}

	public void setTotPce(BigDecimal totPce) {
		this.totPce = totPce;
	}

	public BigDecimal getTotScldWgt() {
		return this.totScldWgt;
	}

	public void setTotScldWgt(BigDecimal totScldWgt) {
		this.totScldWgt = totScldWgt;
	}

	public BigDecimal getTotShpm() {
		return this.totShpm;
	}

	public void setTotShpm(BigDecimal totShpm) {
		this.totShpm = totShpm;
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

	public BigDecimal getTotTotFlexQnty1() {
		return this.totTotFlexQnty1;
	}

	public void setTotTotFlexQnty1(BigDecimal totTotFlexQnty1) {
		this.totTotFlexQnty1 = totTotFlexQnty1;
	}

	public BigDecimal getTotTotFlexQnty2() {
		return this.totTotFlexQnty2;
	}

	public void setTotTotFlexQnty2(BigDecimal totTotFlexQnty2) {
		this.totTotFlexQnty2 = totTotFlexQnty2;
	}

	public BigDecimal getTotTotFlexQnty3() {
		return this.totTotFlexQnty3;
	}

	public void setTotTotFlexQnty3(BigDecimal totTotFlexQnty3) {
		this.totTotFlexQnty3 = totTotFlexQnty3;
	}

	public BigDecimal getTotTotFlexQnty4() {
		return this.totTotFlexQnty4;
	}

	public void setTotTotFlexQnty4(BigDecimal totTotFlexQnty4) {
		this.totTotFlexQnty4 = totTotFlexQnty4;
	}

	public BigDecimal getTotTotFlexQnty5() {
		return this.totTotFlexQnty5;
	}

	public void setTotTotFlexQnty5(BigDecimal totTotFlexQnty5) {
		this.totTotFlexQnty5 = totTotFlexQnty5;
	}

	public BigDecimal getTotTotPce() {
		return this.totTotPce;
	}

	public void setTotTotPce(BigDecimal totTotPce) {
		this.totTotPce = totTotPce;
	}

	public BigDecimal getTotTotSkid() {
		return this.totTotSkid;
	}

	public void setTotTotSkid(BigDecimal totTotSkid) {
		this.totTotSkid = totTotSkid;
	}

	public BigDecimal getTotTotTareWgt() {
		return this.totTotTareWgt;
	}

	public void setTotTotTareWgt(BigDecimal totTotTareWgt) {
		this.totTotTareWgt = totTotTareWgt;
	}

	public BigDecimal getTotUnlddDist() {
		return this.totUnlddDist;
	}

	public void setTotUnlddDist(BigDecimal totUnlddDist) {
		this.totUnlddDist = totUnlddDist;
	}

	public BigDecimal getTotUnloadingHrs() {
		return this.totUnloadingHrs;
	}

	public void setTotUnloadingHrs(BigDecimal totUnloadingHrs) {
		this.totUnloadingHrs = totUnloadingHrs;
	}

	public BigDecimal getTotVol() {
		return this.totVol;
	}

	public void setTotVol(BigDecimal totVol) {
		this.totVol = totVol;
	}

	public BigDecimal getTotcexcswaitHrs() {
		return this.totcexcswaitHrs;
	}

	public void setTotcexcswaitHrs(BigDecimal totcexcswaitHrs) {
		this.totcexcswaitHrs = totcexcswaitHrs;
	}

	public String getTpAdtnInfo() {
		return this.tpAdtnInfo;
	}

	public void setTpAdtnInfo(String tpAdtnInfo) {
		this.tpAdtnInfo = tpAdtnInfo;
	}

	public String getTrctrLicNum() {
		return this.trctrLicNum;
	}

	public void setTrctrLicNum(String trctrLicNum) {
		this.trctrLicNum = trctrLicNum;
	}

	public String getTrctrNum() {
		return this.trctrNum;
	}

	public void setTrctrNum(String trctrNum) {
		this.trctrNum = trctrNum;
	}

	public String getTrctrOnr() {
		return this.trctrOnr;
	}

	public void setTrctrOnr(String trctrOnr) {
		this.trctrOnr = trctrOnr;
	}

	public BigDecimal getTrctrUnlddDist() {
		return this.trctrUnlddDist;
	}

	public void setTrctrUnlddDist(BigDecimal trctrUnlddDist) {
		this.trctrUnlddDist = trctrUnlddDist;
	}

	public BigDecimal getTripId() {
		return this.tripId;
	}

	public void setTripId(BigDecimal tripId) {
		this.tripId = tripId;
	}

	public BigDecimal getTripTffSavBasEnu() {
		return this.tripTffSavBasEnu;
	}

	public void setTripTffSavBasEnu(BigDecimal tripTffSavBasEnu) {
		this.tripTffSavBasEnu = tripTffSavBasEnu;
	}

	public String getTrlrLicNum() {
		return this.trlrLicNum;
	}

	public void setTrlrLicNum(String trlrLicNum) {
		this.trlrLicNum = trlrLicNum;
	}

	public String getTrlrNum() {
		return this.trlrNum;
	}

	public void setTrlrNum(String trlrNum) {
		this.trlrNum = trlrNum;
	}

	public String getTrlrOnr() {
		return this.trlrOnr;
	}

	public void setTrlrOnr(String trlrOnr) {
		this.trlrOnr = trlrOnr;
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

	public BigDecimal getUtlnFctr() {
		return this.utlnFctr;
	}

	public void setUtlnFctr(BigDecimal utlnFctr) {
		this.utlnFctr = utlnFctr;
	}

	public BigDecimal getVchrRunExcpId() {
		return this.vchrRunExcpId;
	}

	public void setVchrRunExcpId(BigDecimal vchrRunExcpId) {
		this.vchrRunExcpId = vchrRunExcpId;
	}

	public String getVesl() {
		return this.vesl;
	}

	public void setVesl(String vesl) {
		this.vesl = vesl;
	}

	public Date getVeslArvlDtt() {
		return this.veslArvlDtt;
	}

	public void setVeslArvlDtt(Date veslArvlDtt) {
		this.veslArvlDtt = veslArvlDtt;
	}

	public Date getVeslDptrDtt() {
		return this.veslDptrDtt;
	}

	public void setVeslDptrDtt(Date veslDptrDtt) {
		this.veslDptrDtt = veslDptrDtt;
	}

	public String getVeslTrkgId1() {
		return this.veslTrkgId1;
	}

	public void setVeslTrkgId1(String veslTrkgId1) {
		this.veslTrkgId1 = veslTrkgId1;
	}

	public String getVeslTrkgId2() {
		return this.veslTrkgId2;
	}

	public void setVeslTrkgId2(String veslTrkgId2) {
		this.veslTrkgId2 = veslTrkgId2;
	}

	public String getVgmAthzr() {
		return this.vgmAthzr;
	}

	public void setVgmAthzr(String vgmAthzr) {
		this.vgmAthzr = vgmAthzr;
	}

	public Date getVgmVrfcDtt() {
		return this.vgmVrfcDtt;
	}

	public void setVgmVrfcDtt(Date vgmVrfcDtt) {
		this.vgmVrfcDtt = vgmVrfcDtt;
	}

	public Date getVgmWghDtt() {
		return this.vgmWghDtt;
	}

	public void setVgmWghDtt(Date vgmWghDtt) {
		this.vgmWghDtt = vgmWghDtt;
	}

	public BigDecimal getVgmWghMthd() {
		return this.vgmWghMthd;
	}

	public void setVgmWghMthd(BigDecimal vgmWghMthd) {
		this.vgmWghMthd = vgmWghMthd;
	}

	public BigDecimal getVol() {
		return this.vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

	public BigDecimal getVolUtlnPct() {
		return this.volUtlnPct;
	}

	public void setVolUtlnPct(BigDecimal volUtlnPct) {
		this.volUtlnPct = volUtlnPct;
	}

	public String getVoygNum() {
		return this.voygNum;
	}

	public void setVoygNum(String voygNum) {
		this.voygNum = voygNum;
	}

	public BigDecimal getVrfdGrsMass() {
		return this.vrfdGrsMass;
	}

	public void setVrfdGrsMass(BigDecimal vrfdGrsMass) {
		this.vrfdGrsMass = vrfdGrsMass;
	}

	public String getWebSchdRrsReqdYn() {
		return this.webSchdRrsReqdYn;
	}

	public void setWebSchdRrsReqdYn(String webSchdRrsReqdYn) {
		this.webSchdRrsReqdYn = webSchdRrsReqdYn;
	}

	public BigDecimal getWgtDistExtd() {
		return this.wgtDistExtd;
	}

	public void setWgtDistExtd(BigDecimal wgtDistExtd) {
		this.wgtDistExtd = wgtDistExtd;
	}

	public BigDecimal getWgtUtlnPct() {
		return this.wgtUtlnPct;
	}

	public void setWgtUtlnPct(BigDecimal wgtUtlnPct) {
		this.wgtUtlnPct = wgtUtlnPct;
	}

	public BigDecimal getWkndHldyHrs() {
		return this.wkndHldyHrs;
	}

	public void setWkndHldyHrs(BigDecimal wkndHldyHrs) {
		this.wkndHldyHrs = wkndHldyHrs;
	}

}
package com.cafe24.chas0301.vo;

public class Contract {
	private String fescon_man_cd; //모든축제계약관리코드
	private String areacity_admin_cd; //모든 행정기관코드
	private String concod_man_cd; //계약코드관리
	private String cat_acc_cd; //거래처코드
	private String catapp_acc_cd; // 거래처별 승인 업종 코드
	private String fesrev_bud_cd; //모든축제세입세출예산관리코드
	private String fest_cd; //축제코드
	private String area_city_cd; //모든 지역 시군코드
	private String area_cd; //전국지역코드
	private String contract_nm; //계약코드명
	private String con_details; //계약내용
	private String con_att_fil; //계약서첨부파일
	private String adm_age_nm; //행정기관명
	private String fes_nm; //축제명
	private String con_ann_nm; //계약공고명
	private String cat_acc_nm1; //거래처명
	private String cat_acc_nm2; //거래처대표자
	private int con_amo; //계약금액(원)
	private String con_com_dt; //계약서작성일
	private String con_sta_dt; //계약시작일자
	private String con_exp_dt; //계약만료일자
	private String con_nor_com; //계약정상완료일자
	private String con_pre_per; //계약서작성한담당자
	private String belong; //소속
	private String con_sta1; //계약상태1
	private String con_sta2; //계약상태2
	
	public String getFescon_man_cd() {
		return fescon_man_cd;
	}
	public void setFescon_man_cd(String fescon_man_cd) {
		System.out.println(fescon_man_cd +" <- setFescon_man_cd Contract.java");
		this.fescon_man_cd = fescon_man_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		System.out.println(areacity_admin_cd +" <- setAreacity_admin_cd Contract.java");
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getConcod_man_cd() {
		return concod_man_cd;
	}
	public void setConcod_man_cd(String concod_man_cd) {
		System.out.println(concod_man_cd +" <- setConcod_man_cd Contract.java");
		this.concod_man_cd = concod_man_cd;
	}
	public String getCat_acc_cd() {
		return cat_acc_cd;
	}
	public void setCat_acc_cd(String cat_acc_cd) {
		System.out.println(cat_acc_cd +" <- setCat_acc_cd Contract.java");
		this.cat_acc_cd = cat_acc_cd;
	}
	public String getCatapp_acc_cd() {
		return catapp_acc_cd;
	}
	public void setCatapp_acc_cd(String catapp_acc_cd) {
		System.out.println(catapp_acc_cd +" <- setCatapp_acc_cd Contract.java");
		this.catapp_acc_cd = catapp_acc_cd;
	}
	public String getFesrev_bud_cd() {
		return fesrev_bud_cd;
	}
	public void setFesrev_bud_cd(String fesrev_bud_cd) {
		System.out.println(fesrev_bud_cd +" <- setFesrev_bud_cd Contract.java");
		this.fesrev_bud_cd = fesrev_bud_cd;
	}
	public String getFest_cd() {
		return fest_cd;
	}
	public void setFest_cd(String fest_cd) {
		System.out.println(fest_cd +" <- setFest_cd Contract.java");
		this.fest_cd = fest_cd;
	}
	public String getArea_city_cd() {
		return area_city_cd;
	}
	public void setArea_city_cd(String area_city_cd) {
		System.out.println(area_city_cd +" <- setArea_city_cd Contract.java");
		this.area_city_cd = area_city_cd;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		System.out.println(area_cd +" <- setArea_cd Contract.java");
		this.area_cd = area_cd;
	}
	public String getContract_nm() {
		return contract_nm;
	}
	public void setContract_nm(String contract_nm) {
		System.out.println(contract_nm +" <- setContract_nm Contract.java");
		this.contract_nm = contract_nm;
	}
	public String getCon_details() {
		return con_details;
	}
	public void setCon_details(String con_details) {
		System.out.println(con_details +" <- setCon_details Contract.java");
		this.con_details = con_details;
	}
	public String getCon_att_fil() {
		return con_att_fil;
	}
	public void setCon_att_fil(String con_att_fil) {
		System.out.println(con_att_fil +" <- setCon_att_fil Contract.java");
		this.con_att_fil = con_att_fil;
	}
	public String getAdm_age_nm() {
		return adm_age_nm;
	}
	public void setAdm_age_nm(String adm_age_nm) {
		System.out.println(adm_age_nm +" <- setAdm_age_nm Contract.java");
		this.adm_age_nm = adm_age_nm;
	}
	public String getFes_nm() {
		return fes_nm;
	}
	public void setFes_nm(String fes_nm) {
		System.out.println(fes_nm +" <- setFes_nm Contract.java");
		this.fes_nm = fes_nm;
	}
	public String getCon_ann_nm() {
		return con_ann_nm;
	}
	public void setCon_ann_nm(String con_ann_nm) {
		System.out.println(con_ann_nm +" <- setCon_ann_nm Contract.java");
		this.con_ann_nm = con_ann_nm;
	}
	public String getCat_acc_nm1() {
		return cat_acc_nm1;
	}
	public void setCat_acc_nm1(String cat_acc_nm1) {
		System.out.println(cat_acc_nm1 +" <- setCat_acc_nm1 Contract.java");
		this.cat_acc_nm1 = cat_acc_nm1;
	}
	public String getCat_acc_nm2() {
		return cat_acc_nm2;
	}
	public void setCat_acc_nm2(String cat_acc_nm2) {
		System.out.println(cat_acc_nm2 +" <- setCat_acc_nm2 Contract.java");
		this.cat_acc_nm2 = cat_acc_nm2;
	}
	public int getCon_amo() {
		return con_amo;
	}
	public void setCon_amo(int con_amo) {
		System.out.println(con_amo +" <- setCon_amo Contract.java");
		this.con_amo = con_amo;
	}
	public String getCon_com_dt() {
		return con_com_dt;
	}
	public void setCon_com_dt(String con_com_dt) {
		System.out.println(con_com_dt +" <- setCon_com_dt Contract.java");
		this.con_com_dt = con_com_dt;
	}
	public String getCon_sta_dt() {
		return con_sta_dt;
	}
	public void setCon_sta_dt(String con_sta_dt) {
		System.out.println(con_sta_dt +" <- setCon_sta_dt Contract.java");
		this.con_sta_dt = con_sta_dt;
	}
	public String getCon_exp_dt() {
		return con_exp_dt;
	}
	public void setCon_exp_dt(String con_exp_dt) {
		System.out.println(con_exp_dt +" <- setCon_exp_dt Contract.java");
		this.con_exp_dt = con_exp_dt;
	}
	public String getCon_nor_com() {
		return con_nor_com;
	}
	public void setCon_nor_com(String con_nor_com) {
		System.out.println(con_nor_com +" <- setCon_nor_com Contract.java");
		this.con_nor_com = con_nor_com;
	}
	public String getCon_pre_per() {
		return con_pre_per;
	}
	public void setCon_pre_per(String con_pre_per) {
		System.out.println(con_pre_per +" <- setCon_pre_per Contract.java");
		this.con_pre_per = con_pre_per;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		System.out.println(belong +" <- setBelong Contract.java");
		this.belong = belong;
	}
	public String getCon_sta1() {
		return con_sta1;
	}
	public void setCon_sta1(String con_sta1) {
		System.out.println(con_sta1 +" <- setCon_sta1 Contract.java");
		this.con_sta1 = con_sta1;
	}
	public String getCon_sta2() {
		return con_sta2;
	}
	public void setCon_sta2(String con_sta2) {
		System.out.println(con_sta2 +" <- setCon_sta2 Contract.java");
		this.con_sta2 = con_sta2;
	}
	
	@Override
	public String toString() {
		return "Contract [fescon_man_cd=" + fescon_man_cd + ", areacity_admin_cd=" + areacity_admin_cd
				+ ", concod_man_cd=" + concod_man_cd + ", cat_acc_cd=" + cat_acc_cd + ", catapp_acc_cd=" + catapp_acc_cd
				+ ", fesrev_bud_cd=" + fesrev_bud_cd + ", fest_cd=" + fest_cd + ", area_city_cd=" + area_city_cd
				+ ", area_cd=" + area_cd + ", contract_nm=" + contract_nm + ", con_details=" + con_details
				+ ", con_att_fil=" + con_att_fil + ", adm_age_nm=" + adm_age_nm + ", fes_nm=" + fes_nm + ", con_ann_nm="
				+ con_ann_nm + ", cat_acc_nm1=" + cat_acc_nm1 + ", cat_acc_nm2=" + cat_acc_nm2 + ", con_amo=" + con_amo
				+ ", con_com_dt=" + con_com_dt + ", con_sta_dt=" + con_sta_dt + ", con_exp_dt=" + con_exp_dt
				+ ", con_nor_com=" + con_nor_com + ", con_pre_per=" + con_pre_per + ", belong=" + belong + ", con_sta1="
				+ con_sta1 + ", con_sta2=" + con_sta2 + "]";
	}
	
	
	
	

}

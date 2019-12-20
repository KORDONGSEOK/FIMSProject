package com.cafe24.chas0301.vo;

public class RevExpBudget {
	private String fesrev_bud_cd; //모든축제세입세출예산관리코드
	private String areacity_admin_cd; //모든 행정기관코드
	private String fesrev_sub_cd; //모든축제세입세출 소계및합계 예산관리코드
	private String accsub_man_cd; //모든계정과목코드
	private String man_com_cd; //위원회코드
	private String fest_cd; //축제코드
	private String area_city_cd; //모든 지역 시군코드
	private String area_cd; //전국지역코드
	private String adm_age_nm; //행정기관명
	private String fes_nm; //축제명
	private String com_nm; //위원회명
	private String accsub_large_nm; //대분류명
	private String accsub_medium_nm; //중분류명
	private String budget_cla; //예산구분
	private String accsub_nm; //모든계정과목명
	private String budget_details; //세부내용
	private String fes_year; //년도
	private int budget; //예산액
	
	public String getFesrev_bud_cd() {
		return fesrev_bud_cd;
	}
	public void setFesrev_bud_cd(String fesrev_bud_cd) {
		System.out.println(fesrev_bud_cd +" <- setFesrev_bud_cd RevExpBudget.java");
		this.fesrev_bud_cd = fesrev_bud_cd;
	}
	public String getAreacity_admin_cd() {
		return areacity_admin_cd;
	}
	public void setAreacity_admin_cd(String areacity_admin_cd) {
		System.out.println(areacity_admin_cd +" <- setAreacity_admin_cd RevExpBudget.java");
		this.areacity_admin_cd = areacity_admin_cd;
	}
	public String getFesrev_sub_cd() {
		return fesrev_sub_cd;
	}
	public void setFesrev_sub_cd(String fesrev_sub_cd) {
		System.out.println(fesrev_sub_cd +" <- setFesrev_sub_cd RevExpBudget.java");
		this.fesrev_sub_cd = fesrev_sub_cd;
	}
	public String getAccsub_man_cd() {
		return accsub_man_cd;
	}
	public void setAccsub_man_cd(String accsub_man_cd) {
		System.out.println(accsub_man_cd +" <- setAccsub_man_cd RevExpBudget.java");
		this.accsub_man_cd = accsub_man_cd;
	}
	public String getMan_com_cd() {
		return man_com_cd;
	}
	public void setMan_com_cd(String man_com_cd) {
		System.out.println(man_com_cd +" <- setMan_com_cd RevExpBudget.java");
		this.man_com_cd = man_com_cd;
	}
	public String getFest_cd() {
		return fest_cd;
	}
	public void setFest_cd(String fest_cd) {
		System.out.println(fest_cd +" <- setFest_cd RevExpBudget.java");
		this.fest_cd = fest_cd;
	}
	public String getArea_city_cd() {
		return area_city_cd;
	}
	public void setArea_city_cd(String area_city_cd) {
		System.out.println(area_city_cd +" <- setArea_city_cd RevExpBudget.java");
		this.area_city_cd = area_city_cd;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		System.out.println(area_cd +" <- setArea_cd RevExpBudget.java");
		this.area_cd = area_cd;
	}
	public String getAdm_age_nm() {
		return adm_age_nm;
	}
	public void setAdm_age_nm(String adm_age_nm) {
		System.out.println(adm_age_nm +" <- setAdm_age_nm RevExpBudget.java");
		this.adm_age_nm = adm_age_nm;
	}
	public String getFes_nm() {
		return fes_nm;
	}
	public void setFes_nm(String fes_nm) {
		System.out.println(fes_nm +" <- setFes_nm RevExpBudget.java");
		this.fes_nm = fes_nm;
	}
	public String getCom_nm() {
		return com_nm;
	}
	public void setCom_nm(String com_nm) {
		System.out.println(com_nm +" <- setCom_nm RevExpBudget.java");
		this.com_nm = com_nm;
	}
	public String getAccsub_large_nm() {
		return accsub_large_nm;
	}
	public void setAccsub_large_nm(String accsub_large_nm) {
		System.out.println(accsub_large_nm +" <- setAccsub_large_nm RevExpBudget.java");
		this.accsub_large_nm = accsub_large_nm;
	}
	public String getAccsub_medium_nm() {
		return accsub_medium_nm;
	}
	public void setAccsub_medium_nm(String accsub_medium_nm) {
		System.out.println(accsub_medium_nm +" <- setAccsub_medium_nm RevExpBudget.java");
		this.accsub_medium_nm = accsub_medium_nm;
	}
	public String getBudget_cla() {
		return budget_cla;
	}
	public void setBudget_cla(String budget_cla) {
		System.out.println(budget_cla +" <- setBudget_cla RevExpBudget.java");
		this.budget_cla = budget_cla;
	}
	public String getAccsub_nm() {
		return accsub_nm;
	}
	public void setAccsub_nm(String accsub_nm) {
		System.out.println(accsub_nm +" <- setAccsub_nm RevExpBudget.java");
		this.accsub_nm = accsub_nm;
	}
	public String getBudget_details() {
		return budget_details;
	}
	public void setBudget_details(String budget_details) {
		System.out.println(budget_details +" <- setBudget_details RevExpBudget.java");
		this.budget_details = budget_details;
	}
	public String getFes_year() {
		return fes_year;
	}
	public void setFes_year(String fes_year) {
		System.out.println(fes_year +" <- setFes_year RevExpBudget.java");
		this.fes_year = fes_year;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		System.out.println(budget +" <- setBudget RevExpBudget.java");
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return "RevExpBudget [fesrev_bud_cd=" + fesrev_bud_cd + ", areacity_admin_cd=" + areacity_admin_cd
				+ ", fesrev_sub_cd=" + fesrev_sub_cd + ", accsub_man_cd=" + accsub_man_cd + ", man_com_cd=" + man_com_cd
				+ ", fest_cd=" + fest_cd + ", area_city_cd=" + area_city_cd + ", area_cd=" + area_cd + ", adm_age_nm="
				+ adm_age_nm + ", fes_nm=" + fes_nm + ", com_nm=" + com_nm + ", accsub_large_nm=" + accsub_large_nm
				+ ", accsub_medium_nm=" + accsub_medium_nm + ", budget_cla=" + budget_cla + ", accsub_nm=" + accsub_nm
				+ ", budget_details=" + budget_details + ", fes_year=" + fes_year + ", budget=" + budget + "]";
	}
	
	



}

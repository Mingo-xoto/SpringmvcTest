package com.yhq.sqlserver.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "website_payment")
public class Payment1 {
    @Id
    private Integer id;

    private Integer wdid;

    @Column(name = "accountNo")
    private String accountno;

    @Column(name = "isCredit")
    private Boolean iscredit;

    @Column(name = "jaccountStatus")
    private Integer jaccountstatus;

    @Column(name = "paymentLimit")
    private Double paymentlimit;

    @Column(name = "paymentLimitStartDate")
    private Date paymentlimitstartdate;

    @Column(name = "paymentLimitEndDate")
    private Date paymentlimitenddate;

    @Column(name = "repaymentRound")
    private Integer repaymentround;

    @Column(name = "outMiniMoney")
    private Double outminimoney;

    @Column(name = "outTranAccountMoney")
    private Double outtranaccountmoney;

    @Column(name = "billRound")
    private String billround;

    @Column(name = "billDay")
    private String billday;

    @Column(name = "isSpanMonth")
    private Boolean isspanmonth;

    @Column(name = "miniPaymentCal")
    private String minipaymentcal;

    @Column(name = "absolutNum")
    private Double absolutnum;

    @Column(name = "miniAcivity")
    private Double miniacivity;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return wdid
     */
    public Integer getWdid() {
        return wdid;
    }

    /**
     * @param wdid
     */
    public void setWdid(Integer wdid) {
        this.wdid = wdid;
    }

    /**
     * @return accountNo
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * @param accountno
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    /**
     * @return isCredit
     */
    public Boolean getIscredit() {
        return iscredit;
    }

    /**
     * @param iscredit
     */
    public void setIscredit(Boolean iscredit) {
        this.iscredit = iscredit;
    }

    /**
     * @return jaccountStatus
     */
    public Integer getJaccountstatus() {
        return jaccountstatus;
    }

    /**
     * @param jaccountstatus
     */
    public void setJaccountstatus(Integer jaccountstatus) {
        this.jaccountstatus = jaccountstatus;
    }

    /**
     * @return paymentLimit
     */
    public Double getPaymentlimit() {
        return paymentlimit;
    }

    /**
     * @param paymentlimit
     */
    public void setPaymentlimit(Double paymentlimit) {
        this.paymentlimit = paymentlimit;
    }

    /**
     * @return paymentLimitStartDate
     */
    public Date getPaymentlimitstartdate() {
        return paymentlimitstartdate;
    }

    /**
     * @param paymentlimitstartdate
     */
    public void setPaymentlimitstartdate(Date paymentlimitstartdate) {
        this.paymentlimitstartdate = paymentlimitstartdate;
    }

    /**
     * @return paymentLimitEndDate
     */
    public Date getPaymentlimitenddate() {
        return paymentlimitenddate;
    }

    /**
     * @param paymentlimitenddate
     */
    public void setPaymentlimitenddate(Date paymentlimitenddate) {
        this.paymentlimitenddate = paymentlimitenddate;
    }

    /**
     * @return repaymentRound
     */
    public Integer getRepaymentround() {
        return repaymentround;
    }

    /**
     * @param repaymentround
     */
    public void setRepaymentround(Integer repaymentround) {
        this.repaymentround = repaymentround;
    }

    /**
     * @return outMiniMoney
     */
    public Double getOutminimoney() {
        return outminimoney;
    }

    /**
     * @param outminimoney
     */
    public void setOutminimoney(Double outminimoney) {
        this.outminimoney = outminimoney;
    }

    /**
     * @return outTranAccountMoney
     */
    public Double getOuttranaccountmoney() {
        return outtranaccountmoney;
    }

    /**
     * @param outtranaccountmoney
     */
    public void setOuttranaccountmoney(Double outtranaccountmoney) {
        this.outtranaccountmoney = outtranaccountmoney;
    }

    /**
     * @return billRound
     */
    public String getBillround() {
        return billround;
    }

    /**
     * @param billround
     */
    public void setBillround(String billround) {
        this.billround = billround == null ? null : billround.trim();
    }

    /**
     * @return billDay
     */
    public String getBillday() {
        return billday;
    }

    /**
     * @param billday
     */
    public void setBillday(String billday) {
        this.billday = billday == null ? null : billday.trim();
    }

    /**
     * @return isSpanMonth
     */
    public Boolean getIsspanmonth() {
        return isspanmonth;
    }

    /**
     * @param isspanmonth
     */
    public void setIsspanmonth(Boolean isspanmonth) {
        this.isspanmonth = isspanmonth;
    }

    /**
     * @return miniPaymentCal
     */
    public String getMinipaymentcal() {
        return minipaymentcal;
    }

    /**
     * @param minipaymentcal
     */
    public void setMinipaymentcal(String minipaymentcal) {
        this.minipaymentcal = minipaymentcal == null ? null : minipaymentcal.trim();
    }

    /**
     * @return absolutNum
     */
    public Double getAbsolutnum() {
        return absolutnum;
    }

    /**
     * @param absolutnum
     */
    public void setAbsolutnum(Double absolutnum) {
        this.absolutnum = absolutnum;
    }

    /**
     * @return miniAcivity
     */
    public Double getMiniacivity() {
        return miniacivity;
    }

    /**
     * @param miniacivity
     */
    public void setMiniacivity(Double miniacivity) {
        this.miniacivity = miniacivity;
    }
}
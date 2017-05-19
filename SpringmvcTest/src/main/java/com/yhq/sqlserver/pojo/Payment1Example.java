package com.yhq.sqlserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Payment1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Payment1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWdidIsNull() {
            addCriterion("wdid is null");
            return (Criteria) this;
        }

        public Criteria andWdidIsNotNull() {
            addCriterion("wdid is not null");
            return (Criteria) this;
        }

        public Criteria andWdidEqualTo(Integer value) {
            addCriterion("wdid =", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidNotEqualTo(Integer value) {
            addCriterion("wdid <>", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidGreaterThan(Integer value) {
            addCriterion("wdid >", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wdid >=", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidLessThan(Integer value) {
            addCriterion("wdid <", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidLessThanOrEqualTo(Integer value) {
            addCriterion("wdid <=", value, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidIn(List<Integer> values) {
            addCriterion("wdid in", values, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidNotIn(List<Integer> values) {
            addCriterion("wdid not in", values, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidBetween(Integer value1, Integer value2) {
            addCriterion("wdid between", value1, value2, "wdid");
            return (Criteria) this;
        }

        public Criteria andWdidNotBetween(Integer value1, Integer value2) {
            addCriterion("wdid not between", value1, value2, "wdid");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("accountNo is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountNo is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountNo =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountNo <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountNo >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountNo >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountNo <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountNo <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountNo like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountNo not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountNo in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountNo not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountNo between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountNo not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andIscreditIsNull() {
            addCriterion("isCredit is null");
            return (Criteria) this;
        }

        public Criteria andIscreditIsNotNull() {
            addCriterion("isCredit is not null");
            return (Criteria) this;
        }

        public Criteria andIscreditEqualTo(Boolean value) {
            addCriterion("isCredit =", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditNotEqualTo(Boolean value) {
            addCriterion("isCredit <>", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditGreaterThan(Boolean value) {
            addCriterion("isCredit >", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCredit >=", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditLessThan(Boolean value) {
            addCriterion("isCredit <", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditLessThanOrEqualTo(Boolean value) {
            addCriterion("isCredit <=", value, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditIn(List<Boolean> values) {
            addCriterion("isCredit in", values, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditNotIn(List<Boolean> values) {
            addCriterion("isCredit not in", values, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditBetween(Boolean value1, Boolean value2) {
            addCriterion("isCredit between", value1, value2, "iscredit");
            return (Criteria) this;
        }

        public Criteria andIscreditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCredit not between", value1, value2, "iscredit");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusIsNull() {
            addCriterion("jaccountStatus is null");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusIsNotNull() {
            addCriterion("jaccountStatus is not null");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusEqualTo(Integer value) {
            addCriterion("jaccountStatus =", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusNotEqualTo(Integer value) {
            addCriterion("jaccountStatus <>", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusGreaterThan(Integer value) {
            addCriterion("jaccountStatus >", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("jaccountStatus >=", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusLessThan(Integer value) {
            addCriterion("jaccountStatus <", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusLessThanOrEqualTo(Integer value) {
            addCriterion("jaccountStatus <=", value, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusIn(List<Integer> values) {
            addCriterion("jaccountStatus in", values, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusNotIn(List<Integer> values) {
            addCriterion("jaccountStatus not in", values, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusBetween(Integer value1, Integer value2) {
            addCriterion("jaccountStatus between", value1, value2, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andJaccountstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("jaccountStatus not between", value1, value2, "jaccountstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitIsNull() {
            addCriterion("paymentLimit is null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitIsNotNull() {
            addCriterion("paymentLimit is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitEqualTo(Double value) {
            addCriterion("paymentLimit =", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitNotEqualTo(Double value) {
            addCriterion("paymentLimit <>", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitGreaterThan(Double value) {
            addCriterion("paymentLimit >", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitGreaterThanOrEqualTo(Double value) {
            addCriterion("paymentLimit >=", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitLessThan(Double value) {
            addCriterion("paymentLimit <", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitLessThanOrEqualTo(Double value) {
            addCriterion("paymentLimit <=", value, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitIn(List<Double> values) {
            addCriterion("paymentLimit in", values, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitNotIn(List<Double> values) {
            addCriterion("paymentLimit not in", values, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitBetween(Double value1, Double value2) {
            addCriterion("paymentLimit between", value1, value2, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitNotBetween(Double value1, Double value2) {
            addCriterion("paymentLimit not between", value1, value2, "paymentlimit");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateIsNull() {
            addCriterion("paymentLimitStartDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateIsNotNull() {
            addCriterion("paymentLimitStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateEqualTo(Date value) {
            addCriterion("paymentLimitStartDate =", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateNotEqualTo(Date value) {
            addCriterion("paymentLimitStartDate <>", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateGreaterThan(Date value) {
            addCriterion("paymentLimitStartDate >", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentLimitStartDate >=", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateLessThan(Date value) {
            addCriterion("paymentLimitStartDate <", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateLessThanOrEqualTo(Date value) {
            addCriterion("paymentLimitStartDate <=", value, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateIn(List<Date> values) {
            addCriterion("paymentLimitStartDate in", values, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateNotIn(List<Date> values) {
            addCriterion("paymentLimitStartDate not in", values, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateBetween(Date value1, Date value2) {
            addCriterion("paymentLimitStartDate between", value1, value2, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitstartdateNotBetween(Date value1, Date value2) {
            addCriterion("paymentLimitStartDate not between", value1, value2, "paymentlimitstartdate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateIsNull() {
            addCriterion("paymentLimitEndDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateIsNotNull() {
            addCriterion("paymentLimitEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateEqualTo(Date value) {
            addCriterion("paymentLimitEndDate =", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateNotEqualTo(Date value) {
            addCriterion("paymentLimitEndDate <>", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateGreaterThan(Date value) {
            addCriterion("paymentLimitEndDate >", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentLimitEndDate >=", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateLessThan(Date value) {
            addCriterion("paymentLimitEndDate <", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateLessThanOrEqualTo(Date value) {
            addCriterion("paymentLimitEndDate <=", value, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateIn(List<Date> values) {
            addCriterion("paymentLimitEndDate in", values, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateNotIn(List<Date> values) {
            addCriterion("paymentLimitEndDate not in", values, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateBetween(Date value1, Date value2) {
            addCriterion("paymentLimitEndDate between", value1, value2, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentlimitenddateNotBetween(Date value1, Date value2) {
            addCriterion("paymentLimitEndDate not between", value1, value2, "paymentlimitenddate");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundIsNull() {
            addCriterion("repaymentRound is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundIsNotNull() {
            addCriterion("repaymentRound is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundEqualTo(Integer value) {
            addCriterion("repaymentRound =", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundNotEqualTo(Integer value) {
            addCriterion("repaymentRound <>", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundGreaterThan(Integer value) {
            addCriterion("repaymentRound >", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundGreaterThanOrEqualTo(Integer value) {
            addCriterion("repaymentRound >=", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundLessThan(Integer value) {
            addCriterion("repaymentRound <", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundLessThanOrEqualTo(Integer value) {
            addCriterion("repaymentRound <=", value, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundIn(List<Integer> values) {
            addCriterion("repaymentRound in", values, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundNotIn(List<Integer> values) {
            addCriterion("repaymentRound not in", values, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundBetween(Integer value1, Integer value2) {
            addCriterion("repaymentRound between", value1, value2, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andRepaymentroundNotBetween(Integer value1, Integer value2) {
            addCriterion("repaymentRound not between", value1, value2, "repaymentround");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyIsNull() {
            addCriterion("outMiniMoney is null");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyIsNotNull() {
            addCriterion("outMiniMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyEqualTo(Double value) {
            addCriterion("outMiniMoney =", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyNotEqualTo(Double value) {
            addCriterion("outMiniMoney <>", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyGreaterThan(Double value) {
            addCriterion("outMiniMoney >", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("outMiniMoney >=", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyLessThan(Double value) {
            addCriterion("outMiniMoney <", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyLessThanOrEqualTo(Double value) {
            addCriterion("outMiniMoney <=", value, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyIn(List<Double> values) {
            addCriterion("outMiniMoney in", values, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyNotIn(List<Double> values) {
            addCriterion("outMiniMoney not in", values, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyBetween(Double value1, Double value2) {
            addCriterion("outMiniMoney between", value1, value2, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOutminimoneyNotBetween(Double value1, Double value2) {
            addCriterion("outMiniMoney not between", value1, value2, "outminimoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyIsNull() {
            addCriterion("outTranAccountMoney is null");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyIsNotNull() {
            addCriterion("outTranAccountMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyEqualTo(Double value) {
            addCriterion("outTranAccountMoney =", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyNotEqualTo(Double value) {
            addCriterion("outTranAccountMoney <>", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyGreaterThan(Double value) {
            addCriterion("outTranAccountMoney >", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("outTranAccountMoney >=", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyLessThan(Double value) {
            addCriterion("outTranAccountMoney <", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyLessThanOrEqualTo(Double value) {
            addCriterion("outTranAccountMoney <=", value, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyIn(List<Double> values) {
            addCriterion("outTranAccountMoney in", values, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyNotIn(List<Double> values) {
            addCriterion("outTranAccountMoney not in", values, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyBetween(Double value1, Double value2) {
            addCriterion("outTranAccountMoney between", value1, value2, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andOuttranaccountmoneyNotBetween(Double value1, Double value2) {
            addCriterion("outTranAccountMoney not between", value1, value2, "outtranaccountmoney");
            return (Criteria) this;
        }

        public Criteria andBillroundIsNull() {
            addCriterion("billRound is null");
            return (Criteria) this;
        }

        public Criteria andBillroundIsNotNull() {
            addCriterion("billRound is not null");
            return (Criteria) this;
        }

        public Criteria andBillroundEqualTo(String value) {
            addCriterion("billRound =", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundNotEqualTo(String value) {
            addCriterion("billRound <>", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundGreaterThan(String value) {
            addCriterion("billRound >", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundGreaterThanOrEqualTo(String value) {
            addCriterion("billRound >=", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundLessThan(String value) {
            addCriterion("billRound <", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundLessThanOrEqualTo(String value) {
            addCriterion("billRound <=", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundLike(String value) {
            addCriterion("billRound like", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundNotLike(String value) {
            addCriterion("billRound not like", value, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundIn(List<String> values) {
            addCriterion("billRound in", values, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundNotIn(List<String> values) {
            addCriterion("billRound not in", values, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundBetween(String value1, String value2) {
            addCriterion("billRound between", value1, value2, "billround");
            return (Criteria) this;
        }

        public Criteria andBillroundNotBetween(String value1, String value2) {
            addCriterion("billRound not between", value1, value2, "billround");
            return (Criteria) this;
        }

        public Criteria andBilldayIsNull() {
            addCriterion("billDay is null");
            return (Criteria) this;
        }

        public Criteria andBilldayIsNotNull() {
            addCriterion("billDay is not null");
            return (Criteria) this;
        }

        public Criteria andBilldayEqualTo(String value) {
            addCriterion("billDay =", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayNotEqualTo(String value) {
            addCriterion("billDay <>", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayGreaterThan(String value) {
            addCriterion("billDay >", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayGreaterThanOrEqualTo(String value) {
            addCriterion("billDay >=", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayLessThan(String value) {
            addCriterion("billDay <", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayLessThanOrEqualTo(String value) {
            addCriterion("billDay <=", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayLike(String value) {
            addCriterion("billDay like", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayNotLike(String value) {
            addCriterion("billDay not like", value, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayIn(List<String> values) {
            addCriterion("billDay in", values, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayNotIn(List<String> values) {
            addCriterion("billDay not in", values, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayBetween(String value1, String value2) {
            addCriterion("billDay between", value1, value2, "billday");
            return (Criteria) this;
        }

        public Criteria andBilldayNotBetween(String value1, String value2) {
            addCriterion("billDay not between", value1, value2, "billday");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthIsNull() {
            addCriterion("isSpanMonth is null");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthIsNotNull() {
            addCriterion("isSpanMonth is not null");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthEqualTo(Boolean value) {
            addCriterion("isSpanMonth =", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthNotEqualTo(Boolean value) {
            addCriterion("isSpanMonth <>", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthGreaterThan(Boolean value) {
            addCriterion("isSpanMonth >", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSpanMonth >=", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthLessThan(Boolean value) {
            addCriterion("isSpanMonth <", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthLessThanOrEqualTo(Boolean value) {
            addCriterion("isSpanMonth <=", value, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthIn(List<Boolean> values) {
            addCriterion("isSpanMonth in", values, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthNotIn(List<Boolean> values) {
            addCriterion("isSpanMonth not in", values, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthBetween(Boolean value1, Boolean value2) {
            addCriterion("isSpanMonth between", value1, value2, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andIsspanmonthNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSpanMonth not between", value1, value2, "isspanmonth");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalIsNull() {
            addCriterion("miniPaymentCal is null");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalIsNotNull() {
            addCriterion("miniPaymentCal is not null");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalEqualTo(String value) {
            addCriterion("miniPaymentCal =", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalNotEqualTo(String value) {
            addCriterion("miniPaymentCal <>", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalGreaterThan(String value) {
            addCriterion("miniPaymentCal >", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalGreaterThanOrEqualTo(String value) {
            addCriterion("miniPaymentCal >=", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalLessThan(String value) {
            addCriterion("miniPaymentCal <", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalLessThanOrEqualTo(String value) {
            addCriterion("miniPaymentCal <=", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalLike(String value) {
            addCriterion("miniPaymentCal like", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalNotLike(String value) {
            addCriterion("miniPaymentCal not like", value, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalIn(List<String> values) {
            addCriterion("miniPaymentCal in", values, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalNotIn(List<String> values) {
            addCriterion("miniPaymentCal not in", values, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalBetween(String value1, String value2) {
            addCriterion("miniPaymentCal between", value1, value2, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andMinipaymentcalNotBetween(String value1, String value2) {
            addCriterion("miniPaymentCal not between", value1, value2, "minipaymentcal");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumIsNull() {
            addCriterion("absolutNum is null");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumIsNotNull() {
            addCriterion("absolutNum is not null");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumEqualTo(Double value) {
            addCriterion("absolutNum =", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumNotEqualTo(Double value) {
            addCriterion("absolutNum <>", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumGreaterThan(Double value) {
            addCriterion("absolutNum >", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumGreaterThanOrEqualTo(Double value) {
            addCriterion("absolutNum >=", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumLessThan(Double value) {
            addCriterion("absolutNum <", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumLessThanOrEqualTo(Double value) {
            addCriterion("absolutNum <=", value, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumIn(List<Double> values) {
            addCriterion("absolutNum in", values, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumNotIn(List<Double> values) {
            addCriterion("absolutNum not in", values, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumBetween(Double value1, Double value2) {
            addCriterion("absolutNum between", value1, value2, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andAbsolutnumNotBetween(Double value1, Double value2) {
            addCriterion("absolutNum not between", value1, value2, "absolutnum");
            return (Criteria) this;
        }

        public Criteria andMiniacivityIsNull() {
            addCriterion("miniAcivity is null");
            return (Criteria) this;
        }

        public Criteria andMiniacivityIsNotNull() {
            addCriterion("miniAcivity is not null");
            return (Criteria) this;
        }

        public Criteria andMiniacivityEqualTo(Double value) {
            addCriterion("miniAcivity =", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityNotEqualTo(Double value) {
            addCriterion("miniAcivity <>", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityGreaterThan(Double value) {
            addCriterion("miniAcivity >", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityGreaterThanOrEqualTo(Double value) {
            addCriterion("miniAcivity >=", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityLessThan(Double value) {
            addCriterion("miniAcivity <", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityLessThanOrEqualTo(Double value) {
            addCriterion("miniAcivity <=", value, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityIn(List<Double> values) {
            addCriterion("miniAcivity in", values, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityNotIn(List<Double> values) {
            addCriterion("miniAcivity not in", values, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityBetween(Double value1, Double value2) {
            addCriterion("miniAcivity between", value1, value2, "miniacivity");
            return (Criteria) this;
        }

        public Criteria andMiniacivityNotBetween(Double value1, Double value2) {
            addCriterion("miniAcivity not between", value1, value2, "miniacivity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
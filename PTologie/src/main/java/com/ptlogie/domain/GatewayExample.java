package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GatewayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GatewayExample() {
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

        public Criteria andGatewayidIsNull() {
            addCriterion("gatewayId is null");
            return (Criteria) this;
        }

        public Criteria andGatewayidIsNotNull() {
            addCriterion("gatewayId is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayidEqualTo(Integer value) {
            addCriterion("gatewayId =", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotEqualTo(Integer value) {
            addCriterion("gatewayId <>", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidGreaterThan(Integer value) {
            addCriterion("gatewayId >", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gatewayId >=", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidLessThan(Integer value) {
            addCriterion("gatewayId <", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidLessThanOrEqualTo(Integer value) {
            addCriterion("gatewayId <=", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidIn(List<Integer> values) {
            addCriterion("gatewayId in", values, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotIn(List<Integer> values) {
            addCriterion("gatewayId not in", values, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidBetween(Integer value1, Integer value2) {
            addCriterion("gatewayId between", value1, value2, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotBetween(Integer value1, Integer value2) {
            addCriterion("gatewayId not between", value1, value2, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIsNull() {
            addCriterion("identifying is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIsNotNull() {
            addCriterion("identifying is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyingEqualTo(String value) {
            addCriterion("identifying =", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotEqualTo(String value) {
            addCriterion("identifying <>", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingGreaterThan(String value) {
            addCriterion("identifying >", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingGreaterThanOrEqualTo(String value) {
            addCriterion("identifying >=", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLessThan(String value) {
            addCriterion("identifying <", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLessThanOrEqualTo(String value) {
            addCriterion("identifying <=", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLike(String value) {
            addCriterion("identifying like", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotLike(String value) {
            addCriterion("identifying not like", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIn(List<String> values) {
            addCriterion("identifying in", values, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotIn(List<String> values) {
            addCriterion("identifying not in", values, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingBetween(String value1, String value2) {
            addCriterion("identifying between", value1, value2, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotBetween(String value1, String value2) {
            addCriterion("identifying not between", value1, value2, "identifying");
            return (Criteria) this;
        }

        public Criteria andGatenameIsNull() {
            addCriterion("gateName is null");
            return (Criteria) this;
        }

        public Criteria andGatenameIsNotNull() {
            addCriterion("gateName is not null");
            return (Criteria) this;
        }

        public Criteria andGatenameEqualTo(String value) {
            addCriterion("gateName =", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameNotEqualTo(String value) {
            addCriterion("gateName <>", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameGreaterThan(String value) {
            addCriterion("gateName >", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameGreaterThanOrEqualTo(String value) {
            addCriterion("gateName >=", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameLessThan(String value) {
            addCriterion("gateName <", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameLessThanOrEqualTo(String value) {
            addCriterion("gateName <=", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameLike(String value) {
            addCriterion("gateName like", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameNotLike(String value) {
            addCriterion("gateName not like", value, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameIn(List<String> values) {
            addCriterion("gateName in", values, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameNotIn(List<String> values) {
            addCriterion("gateName not in", values, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameBetween(String value1, String value2) {
            addCriterion("gateName between", value1, value2, "gatename");
            return (Criteria) this;
        }

        public Criteria andGatenameNotBetween(String value1, String value2) {
            addCriterion("gateName not between", value1, value2, "gatename");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostName is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostName is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostName =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostName <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostName >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostName >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostName <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostName <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostName like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostName not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostName in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostName not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostName between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostName not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andChainIsNull() {
            addCriterion("chain is null");
            return (Criteria) this;
        }

        public Criteria andChainIsNotNull() {
            addCriterion("chain is not null");
            return (Criteria) this;
        }

        public Criteria andChainEqualTo(String value) {
            addCriterion("chain =", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainNotEqualTo(String value) {
            addCriterion("chain <>", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainGreaterThan(String value) {
            addCriterion("chain >", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainGreaterThanOrEqualTo(String value) {
            addCriterion("chain >=", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainLessThan(String value) {
            addCriterion("chain <", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainLessThanOrEqualTo(String value) {
            addCriterion("chain <=", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainLike(String value) {
            addCriterion("chain like", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainNotLike(String value) {
            addCriterion("chain not like", value, "chain");
            return (Criteria) this;
        }

        public Criteria andChainIn(List<String> values) {
            addCriterion("chain in", values, "chain");
            return (Criteria) this;
        }

        public Criteria andChainNotIn(List<String> values) {
            addCriterion("chain not in", values, "chain");
            return (Criteria) this;
        }

        public Criteria andChainBetween(String value1, String value2) {
            addCriterion("chain between", value1, value2, "chain");
            return (Criteria) this;
        }

        public Criteria andChainNotBetween(String value1, String value2) {
            addCriterion("chain not between", value1, value2, "chain");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("period not between", value1, value2, "period");
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
package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.List;

public class RelayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelayExample() {
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

        public Criteria andRelayidIsNull() {
            addCriterion("relayId is null");
            return (Criteria) this;
        }

        public Criteria andRelayidIsNotNull() {
            addCriterion("relayId is not null");
            return (Criteria) this;
        }

        public Criteria andRelayidEqualTo(Integer value) {
            addCriterion("relayId =", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidNotEqualTo(Integer value) {
            addCriterion("relayId <>", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidGreaterThan(Integer value) {
            addCriterion("relayId >", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("relayId >=", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidLessThan(Integer value) {
            addCriterion("relayId <", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidLessThanOrEqualTo(Integer value) {
            addCriterion("relayId <=", value, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidIn(List<Integer> values) {
            addCriterion("relayId in", values, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidNotIn(List<Integer> values) {
            addCriterion("relayId not in", values, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidBetween(Integer value1, Integer value2) {
            addCriterion("relayId between", value1, value2, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelayidNotBetween(Integer value1, Integer value2) {
            addCriterion("relayId not between", value1, value2, "relayid");
            return (Criteria) this;
        }

        public Criteria andRelaynameIsNull() {
            addCriterion("relayName is null");
            return (Criteria) this;
        }

        public Criteria andRelaynameIsNotNull() {
            addCriterion("relayName is not null");
            return (Criteria) this;
        }

        public Criteria andRelaynameEqualTo(String value) {
            addCriterion("relayName =", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameNotEqualTo(String value) {
            addCriterion("relayName <>", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameGreaterThan(String value) {
            addCriterion("relayName >", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameGreaterThanOrEqualTo(String value) {
            addCriterion("relayName >=", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameLessThan(String value) {
            addCriterion("relayName <", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameLessThanOrEqualTo(String value) {
            addCriterion("relayName <=", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameLike(String value) {
            addCriterion("relayName like", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameNotLike(String value) {
            addCriterion("relayName not like", value, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameIn(List<String> values) {
            addCriterion("relayName in", values, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameNotIn(List<String> values) {
            addCriterion("relayName not in", values, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameBetween(String value1, String value2) {
            addCriterion("relayName between", value1, value2, "relayname");
            return (Criteria) this;
        }

        public Criteria andRelaynameNotBetween(String value1, String value2) {
            addCriterion("relayName not between", value1, value2, "relayname");
            return (Criteria) this;
        }

        public Criteria andMacnoIsNull() {
            addCriterion("macNo is null");
            return (Criteria) this;
        }

        public Criteria andMacnoIsNotNull() {
            addCriterion("macNo is not null");
            return (Criteria) this;
        }

        public Criteria andMacnoEqualTo(String value) {
            addCriterion("macNo =", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotEqualTo(String value) {
            addCriterion("macNo <>", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoGreaterThan(String value) {
            addCriterion("macNo >", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoGreaterThanOrEqualTo(String value) {
            addCriterion("macNo >=", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLessThan(String value) {
            addCriterion("macNo <", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLessThanOrEqualTo(String value) {
            addCriterion("macNo <=", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLike(String value) {
            addCriterion("macNo like", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotLike(String value) {
            addCriterion("macNo not like", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoIn(List<String> values) {
            addCriterion("macNo in", values, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotIn(List<String> values) {
            addCriterion("macNo not in", values, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoBetween(String value1, String value2) {
            addCriterion("macNo between", value1, value2, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotBetween(String value1, String value2) {
            addCriterion("macNo not between", value1, value2, "macno");
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
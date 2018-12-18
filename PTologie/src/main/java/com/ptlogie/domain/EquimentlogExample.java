package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquimentlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquimentlogExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNull() {
            addCriterion("equipmentId is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("equipmentId is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(Integer value) {
            addCriterion("equipmentId =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(Integer value) {
            addCriterion("equipmentId <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(Integer value) {
            addCriterion("equipmentId >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipmentId >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(Integer value) {
            addCriterion("equipmentId <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(Integer value) {
            addCriterion("equipmentId <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<Integer> values) {
            addCriterion("equipmentId in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<Integer> values) {
            addCriterion("equipmentId not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(Integer value1, Integer value2) {
            addCriterion("equipmentId between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("equipmentId not between", value1, value2, "equipmentid");
            return (Criteria) this;
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

        public Criteria andOperationnameIsNull() {
            addCriterion("operationname is null");
            return (Criteria) this;
        }

        public Criteria andOperationnameIsNotNull() {
            addCriterion("operationname is not null");
            return (Criteria) this;
        }

        public Criteria andOperationnameEqualTo(String value) {
            addCriterion("operationname =", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotEqualTo(String value) {
            addCriterion("operationname <>", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThan(String value) {
            addCriterion("operationname >", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameGreaterThanOrEqualTo(String value) {
            addCriterion("operationname >=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThan(String value) {
            addCriterion("operationname <", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLessThanOrEqualTo(String value) {
            addCriterion("operationname <=", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameLike(String value) {
            addCriterion("operationname like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotLike(String value) {
            addCriterion("operationname not like", value, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameIn(List<String> values) {
            addCriterion("operationname in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotIn(List<String> values) {
            addCriterion("operationname not in", values, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameBetween(String value1, String value2) {
            addCriterion("operationname between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andOperationnameNotBetween(String value1, String value2) {
            addCriterion("operationname not between", value1, value2, "operationname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameIsNull() {
            addCriterion("equimentname is null");
            return (Criteria) this;
        }

        public Criteria andEquimentnameIsNotNull() {
            addCriterion("equimentname is not null");
            return (Criteria) this;
        }

        public Criteria andEquimentnameEqualTo(String value) {
            addCriterion("equimentname =", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameNotEqualTo(String value) {
            addCriterion("equimentname <>", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameGreaterThan(String value) {
            addCriterion("equimentname >", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameGreaterThanOrEqualTo(String value) {
            addCriterion("equimentname >=", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameLessThan(String value) {
            addCriterion("equimentname <", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameLessThanOrEqualTo(String value) {
            addCriterion("equimentname <=", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameLike(String value) {
            addCriterion("equimentname like", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameNotLike(String value) {
            addCriterion("equimentname not like", value, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameIn(List<String> values) {
            addCriterion("equimentname in", values, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameNotIn(List<String> values) {
            addCriterion("equimentname not in", values, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameBetween(String value1, String value2) {
            addCriterion("equimentname between", value1, value2, "equimentname");
            return (Criteria) this;
        }

        public Criteria andEquimentnameNotBetween(String value1, String value2) {
            addCriterion("equimentname not between", value1, value2, "equimentname");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNull() {
            addCriterion("operationtime is null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNotNull() {
            addCriterion("operationtime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeEqualTo(Date value) {
            addCriterion("operationtime =", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotEqualTo(Date value) {
            addCriterion("operationtime <>", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThan(Date value) {
            addCriterion("operationtime >", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operationtime >=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThan(Date value) {
            addCriterion("operationtime <", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThanOrEqualTo(Date value) {
            addCriterion("operationtime <=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIn(List<Date> values) {
            addCriterion("operationtime in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotIn(List<Date> values) {
            addCriterion("operationtime not in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeBetween(Date value1, Date value2) {
            addCriterion("operationtime between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotBetween(Date value1, Date value2) {
            addCriterion("operationtime not between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
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
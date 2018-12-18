package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorExample() {
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

        public Criteria andScenenameIsNull() {
            addCriterion("scenename is null");
            return (Criteria) this;
        }

        public Criteria andScenenameIsNotNull() {
            addCriterion("scenename is not null");
            return (Criteria) this;
        }

        public Criteria andScenenameEqualTo(String value) {
            addCriterion("scenename =", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotEqualTo(String value) {
            addCriterion("scenename <>", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameGreaterThan(String value) {
            addCriterion("scenename >", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameGreaterThanOrEqualTo(String value) {
            addCriterion("scenename >=", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLessThan(String value) {
            addCriterion("scenename <", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLessThanOrEqualTo(String value) {
            addCriterion("scenename <=", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameLike(String value) {
            addCriterion("scenename like", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotLike(String value) {
            addCriterion("scenename not like", value, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameIn(List<String> values) {
            addCriterion("scenename in", values, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotIn(List<String> values) {
            addCriterion("scenename not in", values, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameBetween(String value1, String value2) {
            addCriterion("scenename between", value1, value2, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenenameNotBetween(String value1, String value2) {
            addCriterion("scenename not between", value1, value2, "scenename");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNull() {
            addCriterion("scenetype is null");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNotNull() {
            addCriterion("scenetype is not null");
            return (Criteria) this;
        }

        public Criteria andScenetypeEqualTo(Integer value) {
            addCriterion("scenetype =", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotEqualTo(Integer value) {
            addCriterion("scenetype <>", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThan(Integer value) {
            addCriterion("scenetype >", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenetype >=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThan(Integer value) {
            addCriterion("scenetype <", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThanOrEqualTo(Integer value) {
            addCriterion("scenetype <=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeIn(List<Integer> values) {
            addCriterion("scenetype in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotIn(List<Integer> values) {
            addCriterion("scenetype not in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeBetween(Integer value1, Integer value2) {
            addCriterion("scenetype between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("scenetype not between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIsNull() {
            addCriterion("alarmtime is null");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIsNotNull() {
            addCriterion("alarmtime is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeEqualTo(Date value) {
            addCriterion("alarmtime =", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotEqualTo(Date value) {
            addCriterion("alarmtime <>", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeGreaterThan(Date value) {
            addCriterion("alarmtime >", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarmtime >=", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeLessThan(Date value) {
            addCriterion("alarmtime <", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeLessThanOrEqualTo(Date value) {
            addCriterion("alarmtime <=", value, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeIn(List<Date> values) {
            addCriterion("alarmtime in", values, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotIn(List<Date> values) {
            addCriterion("alarmtime not in", values, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeBetween(Date value1, Date value2) {
            addCriterion("alarmtime between", value1, value2, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmtimeNotBetween(Date value1, Date value2) {
            addCriterion("alarmtime not between", value1, value2, "alarmtime");
            return (Criteria) this;
        }

        public Criteria andAlarmdataIsNull() {
            addCriterion("alarmdata is null");
            return (Criteria) this;
        }

        public Criteria andAlarmdataIsNotNull() {
            addCriterion("alarmdata is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmdataEqualTo(String value) {
            addCriterion("alarmdata =", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataNotEqualTo(String value) {
            addCriterion("alarmdata <>", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataGreaterThan(String value) {
            addCriterion("alarmdata >", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataGreaterThanOrEqualTo(String value) {
            addCriterion("alarmdata >=", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataLessThan(String value) {
            addCriterion("alarmdata <", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataLessThanOrEqualTo(String value) {
            addCriterion("alarmdata <=", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataLike(String value) {
            addCriterion("alarmdata like", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataNotLike(String value) {
            addCriterion("alarmdata not like", value, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataIn(List<String> values) {
            addCriterion("alarmdata in", values, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataNotIn(List<String> values) {
            addCriterion("alarmdata not in", values, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataBetween(String value1, String value2) {
            addCriterion("alarmdata between", value1, value2, "alarmdata");
            return (Criteria) this;
        }

        public Criteria andAlarmdataNotBetween(String value1, String value2) {
            addCriterion("alarmdata not between", value1, value2, "alarmdata");
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
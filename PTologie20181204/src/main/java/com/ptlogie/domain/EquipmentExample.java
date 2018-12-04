package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andSceneidIsNull() {
            addCriterion("sceneId is null");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNotNull() {
            addCriterion("sceneId is not null");
            return (Criteria) this;
        }

        public Criteria andSceneidEqualTo(Integer value) {
            addCriterion("sceneId =", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotEqualTo(Integer value) {
            addCriterion("sceneId <>", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThan(Integer value) {
            addCriterion("sceneId >", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sceneId >=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThan(Integer value) {
            addCriterion("sceneId <", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThanOrEqualTo(Integer value) {
            addCriterion("sceneId <=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidIn(List<Integer> values) {
            addCriterion("sceneId in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotIn(List<Integer> values) {
            addCriterion("sceneId not in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidBetween(Integer value1, Integer value2) {
            addCriterion("sceneId between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotBetween(Integer value1, Integer value2) {
            addCriterion("sceneId not between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andErroridIsNull() {
            addCriterion("errorId is null");
            return (Criteria) this;
        }

        public Criteria andErroridIsNotNull() {
            addCriterion("errorId is not null");
            return (Criteria) this;
        }

        public Criteria andErroridEqualTo(Integer value) {
            addCriterion("errorId =", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotEqualTo(Integer value) {
            addCriterion("errorId <>", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThan(Integer value) {
            addCriterion("errorId >", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridGreaterThanOrEqualTo(Integer value) {
            addCriterion("errorId >=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThan(Integer value) {
            addCriterion("errorId <", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridLessThanOrEqualTo(Integer value) {
            addCriterion("errorId <=", value, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridIn(List<Integer> values) {
            addCriterion("errorId in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotIn(List<Integer> values) {
            addCriterion("errorId not in", values, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridBetween(Integer value1, Integer value2) {
            addCriterion("errorId between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andErroridNotBetween(Integer value1, Integer value2) {
            addCriterion("errorId not between", value1, value2, "errorid");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIsNull() {
            addCriterion("equipmentType is null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIsNotNull() {
            addCriterion("equipmentType is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeEqualTo(Integer value) {
            addCriterion("equipmentType =", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotEqualTo(Integer value) {
            addCriterion("equipmentType <>", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeGreaterThan(Integer value) {
            addCriterion("equipmentType >", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipmentType >=", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeLessThan(Integer value) {
            addCriterion("equipmentType <", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("equipmentType <=", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIn(List<Integer> values) {
            addCriterion("equipmentType in", values, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotIn(List<Integer> values) {
            addCriterion("equipmentType not in", values, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeBetween(Integer value1, Integer value2) {
            addCriterion("equipmentType between", value1, value2, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equipmentType not between", value1, value2, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameIsNull() {
            addCriterion("equipmentName is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameIsNotNull() {
            addCriterion("equipmentName is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameEqualTo(String value) {
            addCriterion("equipmentName =", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameNotEqualTo(String value) {
            addCriterion("equipmentName <>", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameGreaterThan(String value) {
            addCriterion("equipmentName >", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("equipmentName >=", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameLessThan(String value) {
            addCriterion("equipmentName <", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameLessThanOrEqualTo(String value) {
            addCriterion("equipmentName <=", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameLike(String value) {
            addCriterion("equipmentName like", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameNotLike(String value) {
            addCriterion("equipmentName not like", value, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameIn(List<String> values) {
            addCriterion("equipmentName in", values, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameNotIn(List<String> values) {
            addCriterion("equipmentName not in", values, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameBetween(String value1, String value2) {
            addCriterion("equipmentName between", value1, value2, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andEquipmentnameNotBetween(String value1, String value2) {
            addCriterion("equipmentName not between", value1, value2, "equipmentname");
            return (Criteria) this;
        }

        public Criteria andSnnoIsNull() {
            addCriterion("snno is null");
            return (Criteria) this;
        }

        public Criteria andSnnoIsNotNull() {
            addCriterion("snno is not null");
            return (Criteria) this;
        }

        public Criteria andSnnoEqualTo(String value) {
            addCriterion("snno =", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoNotEqualTo(String value) {
            addCriterion("snno <>", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoGreaterThan(String value) {
            addCriterion("snno >", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoGreaterThanOrEqualTo(String value) {
            addCriterion("snno >=", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoLessThan(String value) {
            addCriterion("snno <", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoLessThanOrEqualTo(String value) {
            addCriterion("snno <=", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoLike(String value) {
            addCriterion("snno like", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoNotLike(String value) {
            addCriterion("snno not like", value, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoIn(List<String> values) {
            addCriterion("snno in", values, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoNotIn(List<String> values) {
            addCriterion("snno not in", values, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoBetween(String value1, String value2) {
            addCriterion("snno between", value1, value2, "snno");
            return (Criteria) this;
        }

        public Criteria andSnnoNotBetween(String value1, String value2) {
            addCriterion("snno not between", value1, value2, "snno");
            return (Criteria) this;
        }

        public Criteria andMacnoIsNull() {
            addCriterion("macno is null");
            return (Criteria) this;
        }

        public Criteria andMacnoIsNotNull() {
            addCriterion("macno is not null");
            return (Criteria) this;
        }

        public Criteria andMacnoEqualTo(String value) {
            addCriterion("macno =", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotEqualTo(String value) {
            addCriterion("macno <>", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoGreaterThan(String value) {
            addCriterion("macno >", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoGreaterThanOrEqualTo(String value) {
            addCriterion("macno >=", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLessThan(String value) {
            addCriterion("macno <", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLessThanOrEqualTo(String value) {
            addCriterion("macno <=", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoLike(String value) {
            addCriterion("macno like", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotLike(String value) {
            addCriterion("macno not like", value, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoIn(List<String> values) {
            addCriterion("macno in", values, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotIn(List<String> values) {
            addCriterion("macno not in", values, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoBetween(String value1, String value2) {
            addCriterion("macno between", value1, value2, "macno");
            return (Criteria) this;
        }

        public Criteria andMacnoNotBetween(String value1, String value2) {
            addCriterion("macno not between", value1, value2, "macno");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNull() {
            addCriterion("workStatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("workStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(Integer value) {
            addCriterion("workStatus =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(Integer value) {
            addCriterion("workStatus <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(Integer value) {
            addCriterion("workStatus >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("workStatus >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(Integer value) {
            addCriterion("workStatus <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(Integer value) {
            addCriterion("workStatus <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<Integer> values) {
            addCriterion("workStatus in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<Integer> values) {
            addCriterion("workStatus not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(Integer value1, Integer value2) {
            addCriterion("workStatus between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("workStatus not between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andEletricIsNull() {
            addCriterion("eletric is null");
            return (Criteria) this;
        }

        public Criteria andEletricIsNotNull() {
            addCriterion("eletric is not null");
            return (Criteria) this;
        }

        public Criteria andEletricEqualTo(Float value) {
            addCriterion("eletric =", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotEqualTo(Float value) {
            addCriterion("eletric <>", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricGreaterThan(Float value) {
            addCriterion("eletric >", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricGreaterThanOrEqualTo(Float value) {
            addCriterion("eletric >=", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricLessThan(Float value) {
            addCriterion("eletric <", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricLessThanOrEqualTo(Float value) {
            addCriterion("eletric <=", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricIn(List<Float> values) {
            addCriterion("eletric in", values, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotIn(List<Float> values) {
            addCriterion("eletric not in", values, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricBetween(Float value1, Float value2) {
            addCriterion("eletric between", value1, value2, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotBetween(Float value1, Float value2) {
            addCriterion("eletric not between", value1, value2, "eletric");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIsNull() {
            addCriterion("alarmStatus is null");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIsNotNull() {
            addCriterion("alarmStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusEqualTo(Integer value) {
            addCriterion("alarmStatus =", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotEqualTo(Integer value) {
            addCriterion("alarmStatus <>", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusGreaterThan(Integer value) {
            addCriterion("alarmStatus >", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarmStatus >=", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusLessThan(Integer value) {
            addCriterion("alarmStatus <", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusLessThanOrEqualTo(Integer value) {
            addCriterion("alarmStatus <=", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIn(List<Integer> values) {
            addCriterion("alarmStatus in", values, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotIn(List<Integer> values) {
            addCriterion("alarmStatus not in", values, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusBetween(Integer value1, Integer value2) {
            addCriterion("alarmStatus between", value1, value2, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("alarmStatus not between", value1, value2, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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
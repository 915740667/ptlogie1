package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RuleExample() {
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

        public Criteria andHightemperatureIsNull() {
            addCriterion("highTemperature is null");
            return (Criteria) this;
        }

        public Criteria andHightemperatureIsNotNull() {
            addCriterion("highTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andHightemperatureEqualTo(Float value) {
            addCriterion("highTemperature =", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureNotEqualTo(Float value) {
            addCriterion("highTemperature <>", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureGreaterThan(Float value) {
            addCriterion("highTemperature >", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("highTemperature >=", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureLessThan(Float value) {
            addCriterion("highTemperature <", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureLessThanOrEqualTo(Float value) {
            addCriterion("highTemperature <=", value, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureIn(List<Float> values) {
            addCriterion("highTemperature in", values, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureNotIn(List<Float> values) {
            addCriterion("highTemperature not in", values, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureBetween(Float value1, Float value2) {
            addCriterion("highTemperature between", value1, value2, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andHightemperatureNotBetween(Float value1, Float value2) {
            addCriterion("highTemperature not between", value1, value2, "hightemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureIsNull() {
            addCriterion("lowTemperature is null");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureIsNotNull() {
            addCriterion("lowTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureEqualTo(Float value) {
            addCriterion("lowTemperature =", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureNotEqualTo(Float value) {
            addCriterion("lowTemperature <>", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureGreaterThan(Float value) {
            addCriterion("lowTemperature >", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("lowTemperature >=", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureLessThan(Float value) {
            addCriterion("lowTemperature <", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureLessThanOrEqualTo(Float value) {
            addCriterion("lowTemperature <=", value, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureIn(List<Float> values) {
            addCriterion("lowTemperature in", values, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureNotIn(List<Float> values) {
            addCriterion("lowTemperature not in", values, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureBetween(Float value1, Float value2) {
            addCriterion("lowTemperature between", value1, value2, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andLowtemperatureNotBetween(Float value1, Float value2) {
            addCriterion("lowTemperature not between", value1, value2, "lowtemperature");
            return (Criteria) this;
        }

        public Criteria andHighhumidityIsNull() {
            addCriterion("highHumidity is null");
            return (Criteria) this;
        }

        public Criteria andHighhumidityIsNotNull() {
            addCriterion("highHumidity is not null");
            return (Criteria) this;
        }

        public Criteria andHighhumidityEqualTo(Float value) {
            addCriterion("highHumidity =", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityNotEqualTo(Float value) {
            addCriterion("highHumidity <>", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityGreaterThan(Float value) {
            addCriterion("highHumidity >", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("highHumidity >=", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityLessThan(Float value) {
            addCriterion("highHumidity <", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityLessThanOrEqualTo(Float value) {
            addCriterion("highHumidity <=", value, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityIn(List<Float> values) {
            addCriterion("highHumidity in", values, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityNotIn(List<Float> values) {
            addCriterion("highHumidity not in", values, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityBetween(Float value1, Float value2) {
            addCriterion("highHumidity between", value1, value2, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andHighhumidityNotBetween(Float value1, Float value2) {
            addCriterion("highHumidity not between", value1, value2, "highhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityIsNull() {
            addCriterion("lowHumidity is null");
            return (Criteria) this;
        }

        public Criteria andLowhumidityIsNotNull() {
            addCriterion("lowHumidity is not null");
            return (Criteria) this;
        }

        public Criteria andLowhumidityEqualTo(Float value) {
            addCriterion("lowHumidity =", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityNotEqualTo(Float value) {
            addCriterion("lowHumidity <>", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityGreaterThan(Float value) {
            addCriterion("lowHumidity >", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("lowHumidity >=", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityLessThan(Float value) {
            addCriterion("lowHumidity <", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityLessThanOrEqualTo(Float value) {
            addCriterion("lowHumidity <=", value, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityIn(List<Float> values) {
            addCriterion("lowHumidity in", values, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityNotIn(List<Float> values) {
            addCriterion("lowHumidity not in", values, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityBetween(Float value1, Float value2) {
            addCriterion("lowHumidity between", value1, value2, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andLowhumidityNotBetween(Float value1, Float value2) {
            addCriterion("lowHumidity not between", value1, value2, "lowhumidity");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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

        public Criteria andAlarmlowtempIsNull() {
            addCriterion("alarmLowtemp is null");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempIsNotNull() {
            addCriterion("alarmLowtemp is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempEqualTo(Float value) {
            addCriterion("alarmLowtemp =", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempNotEqualTo(Float value) {
            addCriterion("alarmLowtemp <>", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempGreaterThan(Float value) {
            addCriterion("alarmLowtemp >", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempGreaterThanOrEqualTo(Float value) {
            addCriterion("alarmLowtemp >=", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempLessThan(Float value) {
            addCriterion("alarmLowtemp <", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempLessThanOrEqualTo(Float value) {
            addCriterion("alarmLowtemp <=", value, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempIn(List<Float> values) {
            addCriterion("alarmLowtemp in", values, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempNotIn(List<Float> values) {
            addCriterion("alarmLowtemp not in", values, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempBetween(Float value1, Float value2) {
            addCriterion("alarmLowtemp between", value1, value2, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowtempNotBetween(Float value1, Float value2) {
            addCriterion("alarmLowtemp not between", value1, value2, "alarmlowtemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempIsNull() {
            addCriterion("alarmHighTemp is null");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempIsNotNull() {
            addCriterion("alarmHighTemp is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempEqualTo(Float value) {
            addCriterion("alarmHighTemp =", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempNotEqualTo(Float value) {
            addCriterion("alarmHighTemp <>", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempGreaterThan(Float value) {
            addCriterion("alarmHighTemp >", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempGreaterThanOrEqualTo(Float value) {
            addCriterion("alarmHighTemp >=", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempLessThan(Float value) {
            addCriterion("alarmHighTemp <", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempLessThanOrEqualTo(Float value) {
            addCriterion("alarmHighTemp <=", value, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempIn(List<Float> values) {
            addCriterion("alarmHighTemp in", values, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempNotIn(List<Float> values) {
            addCriterion("alarmHighTemp not in", values, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempBetween(Float value1, Float value2) {
            addCriterion("alarmHighTemp between", value1, value2, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmhightempNotBetween(Float value1, Float value2) {
            addCriterion("alarmHighTemp not between", value1, value2, "alarmhightemp");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiIsNull() {
            addCriterion("alarmLowhumi is null");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiIsNotNull() {
            addCriterion("alarmLowhumi is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiEqualTo(Float value) {
            addCriterion("alarmLowhumi =", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiNotEqualTo(Float value) {
            addCriterion("alarmLowhumi <>", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiGreaterThan(Float value) {
            addCriterion("alarmLowhumi >", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiGreaterThanOrEqualTo(Float value) {
            addCriterion("alarmLowhumi >=", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiLessThan(Float value) {
            addCriterion("alarmLowhumi <", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiLessThanOrEqualTo(Float value) {
            addCriterion("alarmLowhumi <=", value, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiIn(List<Float> values) {
            addCriterion("alarmLowhumi in", values, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiNotIn(List<Float> values) {
            addCriterion("alarmLowhumi not in", values, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiBetween(Float value1, Float value2) {
            addCriterion("alarmLowhumi between", value1, value2, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmlowhumiNotBetween(Float value1, Float value2) {
            addCriterion("alarmLowhumi not between", value1, value2, "alarmlowhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiIsNull() {
            addCriterion("alarmHighhumi is null");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiIsNotNull() {
            addCriterion("alarmHighhumi is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiEqualTo(Float value) {
            addCriterion("alarmHighhumi =", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiNotEqualTo(Float value) {
            addCriterion("alarmHighhumi <>", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiGreaterThan(Float value) {
            addCriterion("alarmHighhumi >", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiGreaterThanOrEqualTo(Float value) {
            addCriterion("alarmHighhumi >=", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiLessThan(Float value) {
            addCriterion("alarmHighhumi <", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiLessThanOrEqualTo(Float value) {
            addCriterion("alarmHighhumi <=", value, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiIn(List<Float> values) {
            addCriterion("alarmHighhumi in", values, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiNotIn(List<Float> values) {
            addCriterion("alarmHighhumi not in", values, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiBetween(Float value1, Float value2) {
            addCriterion("alarmHighhumi between", value1, value2, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andAlarmhighhumiNotBetween(Float value1, Float value2) {
            addCriterion("alarmHighhumi not between", value1, value2, "alarmhighhumi");
            return (Criteria) this;
        }

        public Criteria andLinkmannameIsNull() {
            addCriterion("linkManName is null");
            return (Criteria) this;
        }

        public Criteria andLinkmannameIsNotNull() {
            addCriterion("linkManName is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmannameEqualTo(String value) {
            addCriterion("linkManName =", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameNotEqualTo(String value) {
            addCriterion("linkManName <>", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameGreaterThan(String value) {
            addCriterion("linkManName >", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameGreaterThanOrEqualTo(String value) {
            addCriterion("linkManName >=", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameLessThan(String value) {
            addCriterion("linkManName <", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameLessThanOrEqualTo(String value) {
            addCriterion("linkManName <=", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameLike(String value) {
            addCriterion("linkManName like", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameNotLike(String value) {
            addCriterion("linkManName not like", value, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameIn(List<String> values) {
            addCriterion("linkManName in", values, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameNotIn(List<String> values) {
            addCriterion("linkManName not in", values, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameBetween(String value1, String value2) {
            addCriterion("linkManName between", value1, value2, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andLinkmannameNotBetween(String value1, String value2) {
            addCriterion("linkManName not between", value1, value2, "linkmanname");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmIsNull() {
            addCriterion("agressiveAlarm is null");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmIsNotNull() {
            addCriterion("agressiveAlarm is not null");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmEqualTo(Integer value) {
            addCriterion("agressiveAlarm =", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmNotEqualTo(Integer value) {
            addCriterion("agressiveAlarm <>", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmGreaterThan(Integer value) {
            addCriterion("agressiveAlarm >", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("agressiveAlarm >=", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmLessThan(Integer value) {
            addCriterion("agressiveAlarm <", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmLessThanOrEqualTo(Integer value) {
            addCriterion("agressiveAlarm <=", value, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmIn(List<Integer> values) {
            addCriterion("agressiveAlarm in", values, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmNotIn(List<Integer> values) {
            addCriterion("agressiveAlarm not in", values, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmBetween(Integer value1, Integer value2) {
            addCriterion("agressiveAlarm between", value1, value2, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andAgressivealarmNotBetween(Integer value1, Integer value2) {
            addCriterion("agressiveAlarm not between", value1, value2, "agressivealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmIsNull() {
            addCriterion("fireAlarm is null");
            return (Criteria) this;
        }

        public Criteria andFirealarmIsNotNull() {
            addCriterion("fireAlarm is not null");
            return (Criteria) this;
        }

        public Criteria andFirealarmEqualTo(Integer value) {
            addCriterion("fireAlarm =", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmNotEqualTo(Integer value) {
            addCriterion("fireAlarm <>", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmGreaterThan(Integer value) {
            addCriterion("fireAlarm >", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("fireAlarm >=", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmLessThan(Integer value) {
            addCriterion("fireAlarm <", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmLessThanOrEqualTo(Integer value) {
            addCriterion("fireAlarm <=", value, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmIn(List<Integer> values) {
            addCriterion("fireAlarm in", values, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmNotIn(List<Integer> values) {
            addCriterion("fireAlarm not in", values, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmBetween(Integer value1, Integer value2) {
            addCriterion("fireAlarm between", value1, value2, "firealarm");
            return (Criteria) this;
        }

        public Criteria andFirealarmNotBetween(Integer value1, Integer value2) {
            addCriterion("fireAlarm not between", value1, value2, "firealarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmIsNull() {
            addCriterion("waterAlarm is null");
            return (Criteria) this;
        }

        public Criteria andWateralarmIsNotNull() {
            addCriterion("waterAlarm is not null");
            return (Criteria) this;
        }

        public Criteria andWateralarmEqualTo(Integer value) {
            addCriterion("waterAlarm =", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmNotEqualTo(Integer value) {
            addCriterion("waterAlarm <>", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmGreaterThan(Integer value) {
            addCriterion("waterAlarm >", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterAlarm >=", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmLessThan(Integer value) {
            addCriterion("waterAlarm <", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmLessThanOrEqualTo(Integer value) {
            addCriterion("waterAlarm <=", value, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmIn(List<Integer> values) {
            addCriterion("waterAlarm in", values, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmNotIn(List<Integer> values) {
            addCriterion("waterAlarm not in", values, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmBetween(Integer value1, Integer value2) {
            addCriterion("waterAlarm between", value1, value2, "wateralarm");
            return (Criteria) this;
        }

        public Criteria andWateralarmNotBetween(Integer value1, Integer value2) {
            addCriterion("waterAlarm not between", value1, value2, "wateralarm");
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
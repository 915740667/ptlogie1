package com.ptlogie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SceneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneExample() {
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

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNull() {
            addCriterion("scene_name is null");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNotNull() {
            addCriterion("scene_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceneNameEqualTo(String value) {
            addCriterion("scene_name =", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotEqualTo(String value) {
            addCriterion("scene_name <>", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThan(String value) {
            addCriterion("scene_name >", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThanOrEqualTo(String value) {
            addCriterion("scene_name >=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThan(String value) {
            addCriterion("scene_name <", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThanOrEqualTo(String value) {
            addCriterion("scene_name <=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLike(String value) {
            addCriterion("scene_name like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotLike(String value) {
            addCriterion("scene_name not like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameIn(List<String> values) {
            addCriterion("scene_name in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotIn(List<String> values) {
            addCriterion("scene_name not in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameBetween(String value1, String value2) {
            addCriterion("scene_name between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotBetween(String value1, String value2) {
            addCriterion("scene_name not between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdIsNull() {
            addCriterion("workshop_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdIsNotNull() {
            addCriterion("workshop_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdEqualTo(Integer value) {
            addCriterion("workshop_id =", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdNotEqualTo(Integer value) {
            addCriterion("workshop_id <>", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdGreaterThan(Integer value) {
            addCriterion("workshop_id >", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workshop_id >=", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdLessThan(Integer value) {
            addCriterion("workshop_id <", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdLessThanOrEqualTo(Integer value) {
            addCriterion("workshop_id <=", value, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdIn(List<Integer> values) {
            addCriterion("workshop_id in", values, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdNotIn(List<Integer> values) {
            addCriterion("workshop_id not in", values, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdBetween(Integer value1, Integer value2) {
            addCriterion("workshop_id between", value1, value2, "workshopId");
            return (Criteria) this;
        }

        public Criteria andWorkshopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workshop_id not between", value1, value2, "workshopId");
            return (Criteria) this;
        }

        public Criteria andScenelocationIsNull() {
            addCriterion("SceneLocation is null");
            return (Criteria) this;
        }

        public Criteria andScenelocationIsNotNull() {
            addCriterion("SceneLocation is not null");
            return (Criteria) this;
        }

        public Criteria andScenelocationEqualTo(String value) {
            addCriterion("SceneLocation =", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationNotEqualTo(String value) {
            addCriterion("SceneLocation <>", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationGreaterThan(String value) {
            addCriterion("SceneLocation >", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationGreaterThanOrEqualTo(String value) {
            addCriterion("SceneLocation >=", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationLessThan(String value) {
            addCriterion("SceneLocation <", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationLessThanOrEqualTo(String value) {
            addCriterion("SceneLocation <=", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationLike(String value) {
            addCriterion("SceneLocation like", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationNotLike(String value) {
            addCriterion("SceneLocation not like", value, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationIn(List<String> values) {
            addCriterion("SceneLocation in", values, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationNotIn(List<String> values) {
            addCriterion("SceneLocation not in", values, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationBetween(String value1, String value2) {
            addCriterion("SceneLocation between", value1, value2, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andScenelocationNotBetween(String value1, String value2) {
            addCriterion("SceneLocation not between", value1, value2, "scenelocation");
            return (Criteria) this;
        }

        public Criteria andSceneremarkIsNull() {
            addCriterion("SceneRemark is null");
            return (Criteria) this;
        }

        public Criteria andSceneremarkIsNotNull() {
            addCriterion("SceneRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSceneremarkEqualTo(String value) {
            addCriterion("SceneRemark =", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkNotEqualTo(String value) {
            addCriterion("SceneRemark <>", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkGreaterThan(String value) {
            addCriterion("SceneRemark >", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkGreaterThanOrEqualTo(String value) {
            addCriterion("SceneRemark >=", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkLessThan(String value) {
            addCriterion("SceneRemark <", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkLessThanOrEqualTo(String value) {
            addCriterion("SceneRemark <=", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkLike(String value) {
            addCriterion("SceneRemark like", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkNotLike(String value) {
            addCriterion("SceneRemark not like", value, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkIn(List<String> values) {
            addCriterion("SceneRemark in", values, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkNotIn(List<String> values) {
            addCriterion("SceneRemark not in", values, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkBetween(String value1, String value2) {
            addCriterion("SceneRemark between", value1, value2, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andSceneremarkNotBetween(String value1, String value2) {
            addCriterion("SceneRemark not between", value1, value2, "sceneremark");
            return (Criteria) this;
        }

        public Criteria andParentsceneidIsNull() {
            addCriterion("ParentSceneId is null");
            return (Criteria) this;
        }

        public Criteria andParentsceneidIsNotNull() {
            addCriterion("ParentSceneId is not null");
            return (Criteria) this;
        }

        public Criteria andParentsceneidEqualTo(Integer value) {
            addCriterion("ParentSceneId =", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidNotEqualTo(Integer value) {
            addCriterion("ParentSceneId <>", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidGreaterThan(Integer value) {
            addCriterion("ParentSceneId >", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentSceneId >=", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidLessThan(Integer value) {
            addCriterion("ParentSceneId <", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentSceneId <=", value, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidIn(List<Integer> values) {
            addCriterion("ParentSceneId in", values, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidNotIn(List<Integer> values) {
            addCriterion("ParentSceneId not in", values, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidBetween(Integer value1, Integer value2) {
            addCriterion("ParentSceneId between", value1, value2, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andParentsceneidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentSceneId not between", value1, value2, "parentsceneid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNull() {
            addCriterion("SceneType is null");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNotNull() {
            addCriterion("SceneType is not null");
            return (Criteria) this;
        }

        public Criteria andScenetypeEqualTo(String value) {
            addCriterion("SceneType =", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotEqualTo(String value) {
            addCriterion("SceneType <>", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThan(String value) {
            addCriterion("SceneType >", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SceneType >=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThan(String value) {
            addCriterion("SceneType <", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThanOrEqualTo(String value) {
            addCriterion("SceneType <=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLike(String value) {
            addCriterion("SceneType like", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotLike(String value) {
            addCriterion("SceneType not like", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeIn(List<String> values) {
            addCriterion("SceneType in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotIn(List<String> values) {
            addCriterion("SceneType not in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeBetween(String value1, String value2) {
            addCriterion("SceneType between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotBetween(String value1, String value2) {
            addCriterion("SceneType not between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNull() {
            addCriterion("DeviceStatus is null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNotNull() {
            addCriterion("DeviceStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusEqualTo(String value) {
            addCriterion("DeviceStatus =", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotEqualTo(String value) {
            addCriterion("DeviceStatus <>", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThan(String value) {
            addCriterion("DeviceStatus >", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceStatus >=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThan(String value) {
            addCriterion("DeviceStatus <", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThanOrEqualTo(String value) {
            addCriterion("DeviceStatus <=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLike(String value) {
            addCriterion("DeviceStatus like", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotLike(String value) {
            addCriterion("DeviceStatus not like", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIn(List<String> values) {
            addCriterion("DeviceStatus in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotIn(List<String> values) {
            addCriterion("DeviceStatus not in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusBetween(String value1, String value2) {
            addCriterion("DeviceStatus between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotBetween(String value1, String value2) {
            addCriterion("DeviceStatus not between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeIsNull() {
            addCriterion("SceneUseType is null");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeIsNotNull() {
            addCriterion("SceneUseType is not null");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeEqualTo(Integer value) {
            addCriterion("SceneUseType =", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeNotEqualTo(Integer value) {
            addCriterion("SceneUseType <>", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeGreaterThan(Integer value) {
            addCriterion("SceneUseType >", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SceneUseType >=", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeLessThan(Integer value) {
            addCriterion("SceneUseType <", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeLessThanOrEqualTo(Integer value) {
            addCriterion("SceneUseType <=", value, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeIn(List<Integer> values) {
            addCriterion("SceneUseType in", values, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeNotIn(List<Integer> values) {
            addCriterion("SceneUseType not in", values, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeBetween(Integer value1, Integer value2) {
            addCriterion("SceneUseType between", value1, value2, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andSceneusetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SceneUseType not between", value1, value2, "sceneusetype");
            return (Criteria) this;
        }

        public Criteria andGateidIsNull() {
            addCriterion("GateId is null");
            return (Criteria) this;
        }

        public Criteria andGateidIsNotNull() {
            addCriterion("GateId is not null");
            return (Criteria) this;
        }

        public Criteria andGateidEqualTo(String value) {
            addCriterion("GateId =", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidNotEqualTo(String value) {
            addCriterion("GateId <>", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidGreaterThan(String value) {
            addCriterion("GateId >", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidGreaterThanOrEqualTo(String value) {
            addCriterion("GateId >=", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidLessThan(String value) {
            addCriterion("GateId <", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidLessThanOrEqualTo(String value) {
            addCriterion("GateId <=", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidLike(String value) {
            addCriterion("GateId like", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidNotLike(String value) {
            addCriterion("GateId not like", value, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidIn(List<String> values) {
            addCriterion("GateId in", values, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidNotIn(List<String> values) {
            addCriterion("GateId not in", values, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidBetween(String value1, String value2) {
            addCriterion("GateId between", value1, value2, "gateid");
            return (Criteria) this;
        }

        public Criteria andGateidNotBetween(String value1, String value2) {
            addCriterion("GateId not between", value1, value2, "gateid");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("InsertTime is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("InsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("InsertTime =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("InsertTime <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("InsertTime >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InsertTime >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("InsertTime <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("InsertTime <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("InsertTime in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("InsertTime not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("InsertTime between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("InsertTime not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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
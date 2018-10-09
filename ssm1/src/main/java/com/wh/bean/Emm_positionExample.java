package com.wh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emm_positionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Emm_positionExample() {
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

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("POSITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("POSITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("POSITION_NAME =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("POSITION_NAME <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("POSITION_NAME >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("POSITION_NAME <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("POSITION_NAME like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("POSITION_NAME not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("POSITION_NAME in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("POSITION_NAME not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("POSITION_NAME between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("POSITION_NAME not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNull() {
            addCriterion("POSITION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNotNull() {
            addCriterion("POSITION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelEqualTo(String value) {
            addCriterion("POSITION_LEVEL =", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotEqualTo(String value) {
            addCriterion("POSITION_LEVEL <>", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThan(String value) {
            addCriterion("POSITION_LEVEL >", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_LEVEL >=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThan(String value) {
            addCriterion("POSITION_LEVEL <", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThanOrEqualTo(String value) {
            addCriterion("POSITION_LEVEL <=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLike(String value) {
            addCriterion("POSITION_LEVEL like", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotLike(String value) {
            addCriterion("POSITION_LEVEL not like", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIn(List<String> values) {
            addCriterion("POSITION_LEVEL in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotIn(List<String> values) {
            addCriterion("POSITION_LEVEL not in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelBetween(String value1, String value2) {
            addCriterion("POSITION_LEVEL between", value1, value2, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotBetween(String value1, String value2) {
            addCriterion("POSITION_LEVEL not between", value1, value2, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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
package com.wh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andPicturesIsNull() {
            addCriterion("PICTURES is null");
            return (Criteria) this;
        }

        public Criteria andPicturesIsNotNull() {
            addCriterion("PICTURES is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesEqualTo(String value) {
            addCriterion("PICTURES =", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotEqualTo(String value) {
            addCriterion("PICTURES <>", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesGreaterThan(String value) {
            addCriterion("PICTURES >", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURES >=", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLessThan(String value) {
            addCriterion("PICTURES <", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLessThanOrEqualTo(String value) {
            addCriterion("PICTURES <=", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesLike(String value) {
            addCriterion("PICTURES like", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotLike(String value) {
            addCriterion("PICTURES not like", value, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesIn(List<String> values) {
            addCriterion("PICTURES in", values, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotIn(List<String> values) {
            addCriterion("PICTURES not in", values, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesBetween(String value1, String value2) {
            addCriterion("PICTURES between", value1, value2, "pictures");
            return (Criteria) this;
        }

        public Criteria andPicturesNotBetween(String value1, String value2) {
            addCriterion("PICTURES not between", value1, value2, "pictures");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andParentMenuIdIsNull() {
            addCriterion("PARENT_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("PARENT_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(Integer value) {
            addCriterion("PARENT_MENU_ID =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(Integer value) {
            addCriterion("PARENT_MENU_ID <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(Integer value) {
            addCriterion("PARENT_MENU_ID >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_MENU_ID >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(Integer value) {
            addCriterion("PARENT_MENU_ID <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_MENU_ID <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<Integer> values) {
            addCriterion("PARENT_MENU_ID in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<Integer> values) {
            addCriterion("PARENT_MENU_ID not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_MENU_ID between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_MENU_ID not between", value1, value2, "parentMenuId");
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
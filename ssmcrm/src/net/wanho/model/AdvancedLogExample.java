package net.wanho.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvancedLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvancedLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("BUSINESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("BUSINESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("BUSINESS_ID =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_ID >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("BUSINESS_ID <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("BUSINESS_ID in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_ID not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentIsNull() {
            addCriterion("ADVANCE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentIsNotNull() {
            addCriterion("ADVANCE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentEqualTo(String value) {
            addCriterion("ADVANCE_CONTENT =", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentNotEqualTo(String value) {
            addCriterion("ADVANCE_CONTENT <>", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentGreaterThan(String value) {
            addCriterion("ADVANCE_CONTENT >", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCE_CONTENT >=", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentLessThan(String value) {
            addCriterion("ADVANCE_CONTENT <", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentLessThanOrEqualTo(String value) {
            addCriterion("ADVANCE_CONTENT <=", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentLike(String value) {
            addCriterion("ADVANCE_CONTENT like", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentNotLike(String value) {
            addCriterion("ADVANCE_CONTENT not like", value, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentIn(List<String> values) {
            addCriterion("ADVANCE_CONTENT in", values, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentNotIn(List<String> values) {
            addCriterion("ADVANCE_CONTENT not in", values, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentBetween(String value1, String value2) {
            addCriterion("ADVANCE_CONTENT between", value1, value2, "advanceContent");
            return (Criteria) this;
        }

        public Criteria andAdvanceContentNotBetween(String value1, String value2) {
            addCriterion("ADVANCE_CONTENT not between", value1, value2, "advanceContent");
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

        public Criteria andAdvanceStatusIsNull() {
            addCriterion("ADVANCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusIsNotNull() {
            addCriterion("ADVANCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusEqualTo(String value) {
            addCriterion("ADVANCE_STATUS =", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusNotEqualTo(String value) {
            addCriterion("ADVANCE_STATUS <>", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusGreaterThan(String value) {
            addCriterion("ADVANCE_STATUS >", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCE_STATUS >=", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusLessThan(String value) {
            addCriterion("ADVANCE_STATUS <", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusLessThanOrEqualTo(String value) {
            addCriterion("ADVANCE_STATUS <=", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusLike(String value) {
            addCriterion("ADVANCE_STATUS like", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusNotLike(String value) {
            addCriterion("ADVANCE_STATUS not like", value, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusIn(List<String> values) {
            addCriterion("ADVANCE_STATUS in", values, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusNotIn(List<String> values) {
            addCriterion("ADVANCE_STATUS not in", values, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusBetween(String value1, String value2) {
            addCriterion("ADVANCE_STATUS between", value1, value2, "advanceStatus");
            return (Criteria) this;
        }

        public Criteria andAdvanceStatusNotBetween(String value1, String value2) {
            addCriterion("ADVANCE_STATUS not between", value1, value2, "advanceStatus");
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
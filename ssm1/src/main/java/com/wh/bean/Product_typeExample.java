package com.wh.bean;

import java.util.ArrayList;
import java.util.List;

public class Product_typeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Product_typeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionIsNull() {
            addCriterion("TYPE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionIsNotNull() {
            addCriterion("TYPE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionEqualTo(String value) {
            addCriterion("TYPE_DESCRIPTION =", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionNotEqualTo(String value) {
            addCriterion("TYPE_DESCRIPTION <>", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionGreaterThan(String value) {
            addCriterion("TYPE_DESCRIPTION >", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_DESCRIPTION >=", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionLessThan(String value) {
            addCriterion("TYPE_DESCRIPTION <", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("TYPE_DESCRIPTION <=", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionLike(String value) {
            addCriterion("TYPE_DESCRIPTION like", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionNotLike(String value) {
            addCriterion("TYPE_DESCRIPTION not like", value, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionIn(List<String> values) {
            addCriterion("TYPE_DESCRIPTION in", values, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionNotIn(List<String> values) {
            addCriterion("TYPE_DESCRIPTION not in", values, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionBetween(String value1, String value2) {
            addCriterion("TYPE_DESCRIPTION between", value1, value2, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andTypeDescriptionNotBetween(String value1, String value2) {
            addCriterion("TYPE_DESCRIPTION not between", value1, value2, "typeDescription");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNull() {
            addCriterion("PARENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIsNotNull() {
            addCriterion("PARENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdEqualTo(Integer value) {
            addCriterion("PARENT_TYPE_ID =", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotEqualTo(Integer value) {
            addCriterion("PARENT_TYPE_ID <>", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThan(Integer value) {
            addCriterion("PARENT_TYPE_ID >", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_TYPE_ID >=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThan(Integer value) {
            addCriterion("PARENT_TYPE_ID <", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_TYPE_ID <=", value, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdIn(List<Integer> values) {
            addCriterion("PARENT_TYPE_ID in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotIn(List<Integer> values) {
            addCriterion("PARENT_TYPE_ID not in", values, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_TYPE_ID between", value1, value2, "parentTypeId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_TYPE_ID not between", value1, value2, "parentTypeId");
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
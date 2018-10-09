package com.wh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdIsNull() {
            addCriterion("LINK_MAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdIsNotNull() {
            addCriterion("LINK_MAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdEqualTo(Integer value) {
            addCriterion("LINK_MAIN_ID =", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdNotEqualTo(Integer value) {
            addCriterion("LINK_MAIN_ID <>", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdGreaterThan(Integer value) {
            addCriterion("LINK_MAIN_ID >", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINK_MAIN_ID >=", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdLessThan(Integer value) {
            addCriterion("LINK_MAIN_ID <", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("LINK_MAIN_ID <=", value, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdIn(List<Integer> values) {
            addCriterion("LINK_MAIN_ID in", values, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdNotIn(List<Integer> values) {
            addCriterion("LINK_MAIN_ID not in", values, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdBetween(Integer value1, Integer value2) {
            addCriterion("LINK_MAIN_ID between", value1, value2, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andLinkMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LINK_MAIN_ID not between", value1, value2, "linkMainId");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNull() {
            addCriterion("BUSINESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("BUSINESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("BUSINESS_NAME =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("BUSINESS_NAME <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("BUSINESS_NAME >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NAME >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("BUSINESS_NAME <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_NAME <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("BUSINESS_NAME like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("BUSINESS_NAME not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("BUSINESS_NAME in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("BUSINESS_NAME not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_NAME between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_NAME not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdIsNull() {
            addCriterion("BUSINESS_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdIsNotNull() {
            addCriterion("BUSINESS_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdEqualTo(Integer value) {
            addCriterion("BUSINESS_TYPE_ID =", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_TYPE_ID <>", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_TYPE_ID >", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_TYPE_ID >=", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdLessThan(Integer value) {
            addCriterion("BUSINESS_TYPE_ID <", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_TYPE_ID <=", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdIn(List<Integer> values) {
            addCriterion("BUSINESS_TYPE_ID in", values, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_TYPE_ID not in", values, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_TYPE_ID between", value1, value2, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_TYPE_ID not between", value1, value2, "businessTypeId");
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

        public Criteria andBusinessSourceIdIsNull() {
            addCriterion("BUSINESS_SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdIsNotNull() {
            addCriterion("BUSINESS_SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdEqualTo(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID =", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID <>", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID >", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID >=", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdLessThan(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID <", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_SOURCE_ID <=", value, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdIn(List<Integer> values) {
            addCriterion("BUSINESS_SOURCE_ID in", values, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_SOURCE_ID not in", values, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_SOURCE_ID between", value1, value2, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andBusinessSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_SOURCE_ID not between", value1, value2, "businessSourceId");
            return (Criteria) this;
        }

        public Criteria andPersalePriceIsNull() {
            addCriterion("PERSALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPersalePriceIsNotNull() {
            addCriterion("PERSALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPersalePriceEqualTo(Long value) {
            addCriterion("PERSALE_PRICE =", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceNotEqualTo(Long value) {
            addCriterion("PERSALE_PRICE <>", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceGreaterThan(Long value) {
            addCriterion("PERSALE_PRICE >", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("PERSALE_PRICE >=", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceLessThan(Long value) {
            addCriterion("PERSALE_PRICE <", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceLessThanOrEqualTo(Long value) {
            addCriterion("PERSALE_PRICE <=", value, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceIn(List<Long> values) {
            addCriterion("PERSALE_PRICE in", values, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceNotIn(List<Long> values) {
            addCriterion("PERSALE_PRICE not in", values, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceBetween(Long value1, Long value2) {
            addCriterion("PERSALE_PRICE between", value1, value2, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andPersalePriceNotBetween(Long value1, Long value2) {
            addCriterion("PERSALE_PRICE not between", value1, value2, "persalePrice");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNull() {
            addCriterion("PROBABILITY is null");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNotNull() {
            addCriterion("PROBABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andProbabilityEqualTo(Short value) {
            addCriterion("PROBABILITY =", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotEqualTo(Short value) {
            addCriterion("PROBABILITY <>", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThan(Short value) {
            addCriterion("PROBABILITY >", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThanOrEqualTo(Short value) {
            addCriterion("PROBABILITY >=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThan(Short value) {
            addCriterion("PROBABILITY <", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThanOrEqualTo(Short value) {
            addCriterion("PROBABILITY <=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityIn(List<Short> values) {
            addCriterion("PROBABILITY in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotIn(List<Short> values) {
            addCriterion("PROBABILITY not in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityBetween(Short value1, Short value2) {
            addCriterion("PROBABILITY between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotBetween(Short value1, Short value2) {
            addCriterion("PROBABILITY not between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("VISIT_TIME =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("VISIT_TIME <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("VISIT_TIME >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("VISIT_TIME <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("VISIT_TIME in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("VISIT_TIME not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitContentIsNull() {
            addCriterion("VISIT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andVisitContentIsNotNull() {
            addCriterion("VISIT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitContentEqualTo(String value) {
            addCriterion("VISIT_CONTENT =", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentNotEqualTo(String value) {
            addCriterion("VISIT_CONTENT <>", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentGreaterThan(String value) {
            addCriterion("VISIT_CONTENT >", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_CONTENT >=", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentLessThan(String value) {
            addCriterion("VISIT_CONTENT <", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentLessThanOrEqualTo(String value) {
            addCriterion("VISIT_CONTENT <=", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentLike(String value) {
            addCriterion("VISIT_CONTENT like", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentNotLike(String value) {
            addCriterion("VISIT_CONTENT not like", value, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentIn(List<String> values) {
            addCriterion("VISIT_CONTENT in", values, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentNotIn(List<String> values) {
            addCriterion("VISIT_CONTENT not in", values, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentBetween(String value1, String value2) {
            addCriterion("VISIT_CONTENT between", value1, value2, "visitContent");
            return (Criteria) this;
        }

        public Criteria andVisitContentNotBetween(String value1, String value2) {
            addCriterion("VISIT_CONTENT not between", value1, value2, "visitContent");
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
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
package com.wh.bean;

import java.util.ArrayList;
import java.util.List;

public class Orders_detailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Orders_detailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andBuyNumsIsNull() {
            addCriterion("BUY_NUMS is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumsIsNotNull() {
            addCriterion("BUY_NUMS is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumsEqualTo(Integer value) {
            addCriterion("BUY_NUMS =", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsNotEqualTo(Integer value) {
            addCriterion("BUY_NUMS <>", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsGreaterThan(Integer value) {
            addCriterion("BUY_NUMS >", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUY_NUMS >=", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsLessThan(Integer value) {
            addCriterion("BUY_NUMS <", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsLessThanOrEqualTo(Integer value) {
            addCriterion("BUY_NUMS <=", value, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsIn(List<Integer> values) {
            addCriterion("BUY_NUMS in", values, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsNotIn(List<Integer> values) {
            addCriterion("BUY_NUMS not in", values, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsBetween(Integer value1, Integer value2) {
            addCriterion("BUY_NUMS between", value1, value2, "buyNums");
            return (Criteria) this;
        }

        public Criteria andBuyNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("BUY_NUMS not between", value1, value2, "buyNums");
            return (Criteria) this;
        }

        public Criteria andRealPricesIsNull() {
            addCriterion("REAL_PRICES is null");
            return (Criteria) this;
        }

        public Criteria andRealPricesIsNotNull() {
            addCriterion("REAL_PRICES is not null");
            return (Criteria) this;
        }

        public Criteria andRealPricesEqualTo(Long value) {
            addCriterion("REAL_PRICES =", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesNotEqualTo(Long value) {
            addCriterion("REAL_PRICES <>", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesGreaterThan(Long value) {
            addCriterion("REAL_PRICES >", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesGreaterThanOrEqualTo(Long value) {
            addCriterion("REAL_PRICES >=", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesLessThan(Long value) {
            addCriterion("REAL_PRICES <", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesLessThanOrEqualTo(Long value) {
            addCriterion("REAL_PRICES <=", value, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesIn(List<Long> values) {
            addCriterion("REAL_PRICES in", values, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesNotIn(List<Long> values) {
            addCriterion("REAL_PRICES not in", values, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesBetween(Long value1, Long value2) {
            addCriterion("REAL_PRICES between", value1, value2, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealPricesNotBetween(Long value1, Long value2) {
            addCriterion("REAL_PRICES not between", value1, value2, "realPrices");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceIsNull() {
            addCriterion("REAL_TOTALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceIsNotNull() {
            addCriterion("REAL_TOTALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceEqualTo(Long value) {
            addCriterion("REAL_TOTALPRICE =", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceNotEqualTo(Long value) {
            addCriterion("REAL_TOTALPRICE <>", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceGreaterThan(Long value) {
            addCriterion("REAL_TOTALPRICE >", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("REAL_TOTALPRICE >=", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceLessThan(Long value) {
            addCriterion("REAL_TOTALPRICE <", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceLessThanOrEqualTo(Long value) {
            addCriterion("REAL_TOTALPRICE <=", value, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceIn(List<Long> values) {
            addCriterion("REAL_TOTALPRICE in", values, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceNotIn(List<Long> values) {
            addCriterion("REAL_TOTALPRICE not in", values, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceBetween(Long value1, Long value2) {
            addCriterion("REAL_TOTALPRICE between", value1, value2, "realTotalprice");
            return (Criteria) this;
        }

        public Criteria andRealTotalpriceNotBetween(Long value1, Long value2) {
            addCriterion("REAL_TOTALPRICE not between", value1, value2, "realTotalprice");
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
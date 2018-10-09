package com.wh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Individual_taskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Individual_taskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("TOPIC is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("TOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("TOPIC =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("TOPIC <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("TOPIC >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("TOPIC <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("TOPIC <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("TOPIC like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("TOPIC not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("TOPIC in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("TOPIC not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("TOPIC between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("TOPIC not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNull() {
            addCriterion("RESPONSIBLE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIsNotNull() {
            addCriterion("RESPONSIBLE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonEqualTo(Integer value) {
            addCriterion("RESPONSIBLE_PERSON =", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotEqualTo(Integer value) {
            addCriterion("RESPONSIBLE_PERSON <>", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThan(Integer value) {
            addCriterion("RESPONSIBLE_PERSON >", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESPONSIBLE_PERSON >=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThan(Integer value) {
            addCriterion("RESPONSIBLE_PERSON <", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonLessThanOrEqualTo(Integer value) {
            addCriterion("RESPONSIBLE_PERSON <=", value, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonIn(List<Integer> values) {
            addCriterion("RESPONSIBLE_PERSON in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotIn(List<Integer> values) {
            addCriterion("RESPONSIBLE_PERSON not in", values, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonBetween(Integer value1, Integer value2) {
            addCriterion("RESPONSIBLE_PERSON between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("RESPONSIBLE_PERSON not between", value1, value2, "responsiblePerson");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
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

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("LINK_URL is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("LINK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("LINK_URL =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("LINK_URL <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("LINK_URL >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_URL >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("LINK_URL <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("LINK_URL <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("LINK_URL like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("LINK_URL not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("LINK_URL in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("LINK_URL not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("LINK_URL between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("LINK_URL not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
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
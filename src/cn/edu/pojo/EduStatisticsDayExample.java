package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduStatisticsDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduStatisticsDayExample() {
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

        public Criteria andStatisticstimeIsNull() {
            addCriterion("statisticsTime is null");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeIsNotNull() {
            addCriterion("statisticsTime is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeEqualTo(Date value) {
            addCriterion("statisticsTime =", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotEqualTo(Date value) {
            addCriterion("statisticsTime <>", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeGreaterThan(Date value) {
            addCriterion("statisticsTime >", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("statisticsTime >=", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeLessThan(Date value) {
            addCriterion("statisticsTime <", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeLessThanOrEqualTo(Date value) {
            addCriterion("statisticsTime <=", value, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeIn(List<Date> values) {
            addCriterion("statisticsTime in", values, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotIn(List<Date> values) {
            addCriterion("statisticsTime not in", values, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeBetween(Date value1, Date value2) {
            addCriterion("statisticsTime between", value1, value2, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andStatisticstimeNotBetween(Date value1, Date value2) {
            addCriterion("statisticsTime not between", value1, value2, "statisticstime");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNull() {
            addCriterion("loginNum is null");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNotNull() {
            addCriterion("loginNum is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnumEqualTo(Integer value) {
            addCriterion("loginNum =", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotEqualTo(Integer value) {
            addCriterion("loginNum <>", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThan(Integer value) {
            addCriterion("loginNum >", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginNum >=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThan(Integer value) {
            addCriterion("loginNum <", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThanOrEqualTo(Integer value) {
            addCriterion("loginNum <=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumIn(List<Integer> values) {
            addCriterion("loginNum in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotIn(List<Integer> values) {
            addCriterion("loginNum not in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumBetween(Integer value1, Integer value2) {
            addCriterion("loginNum between", value1, value2, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotBetween(Integer value1, Integer value2) {
            addCriterion("loginNum not between", value1, value2, "loginnum");
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

        public Criteria andRegisterednumIsNull() {
            addCriterion("registeredNum is null");
            return (Criteria) this;
        }

        public Criteria andRegisterednumIsNotNull() {
            addCriterion("registeredNum is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterednumEqualTo(Integer value) {
            addCriterion("registeredNum =", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumNotEqualTo(Integer value) {
            addCriterion("registeredNum <>", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumGreaterThan(Integer value) {
            addCriterion("registeredNum >", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("registeredNum >=", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumLessThan(Integer value) {
            addCriterion("registeredNum <", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumLessThanOrEqualTo(Integer value) {
            addCriterion("registeredNum <=", value, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumIn(List<Integer> values) {
            addCriterion("registeredNum in", values, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumNotIn(List<Integer> values) {
            addCriterion("registeredNum not in", values, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumBetween(Integer value1, Integer value2) {
            addCriterion("registeredNum between", value1, value2, "registerednum");
            return (Criteria) this;
        }

        public Criteria andRegisterednumNotBetween(Integer value1, Integer value2) {
            addCriterion("registeredNum not between", value1, value2, "registerednum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumIsNull() {
            addCriterion("videoViewingNum is null");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumIsNotNull() {
            addCriterion("videoViewingNum is not null");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumEqualTo(Integer value) {
            addCriterion("videoViewingNum =", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumNotEqualTo(Integer value) {
            addCriterion("videoViewingNum <>", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumGreaterThan(Integer value) {
            addCriterion("videoViewingNum >", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoViewingNum >=", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumLessThan(Integer value) {
            addCriterion("videoViewingNum <", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumLessThanOrEqualTo(Integer value) {
            addCriterion("videoViewingNum <=", value, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumIn(List<Integer> values) {
            addCriterion("videoViewingNum in", values, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumNotIn(List<Integer> values) {
            addCriterion("videoViewingNum not in", values, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumBetween(Integer value1, Integer value2) {
            addCriterion("videoViewingNum between", value1, value2, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andVideoviewingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("videoViewingNum not between", value1, value2, "videoviewingnum");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberIsNull() {
            addCriterion("dailyUserNumber is null");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberIsNotNull() {
            addCriterion("dailyUserNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberEqualTo(Integer value) {
            addCriterion("dailyUserNumber =", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberNotEqualTo(Integer value) {
            addCriterion("dailyUserNumber <>", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberGreaterThan(Integer value) {
            addCriterion("dailyUserNumber >", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dailyUserNumber >=", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberLessThan(Integer value) {
            addCriterion("dailyUserNumber <", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberLessThanOrEqualTo(Integer value) {
            addCriterion("dailyUserNumber <=", value, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberIn(List<Integer> values) {
            addCriterion("dailyUserNumber in", values, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberNotIn(List<Integer> values) {
            addCriterion("dailyUserNumber not in", values, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberBetween(Integer value1, Integer value2) {
            addCriterion("dailyUserNumber between", value1, value2, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailyusernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dailyUserNumber not between", value1, value2, "dailyusernumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberIsNull() {
            addCriterion("dailyCourseNumber is null");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberIsNotNull() {
            addCriterion("dailyCourseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberEqualTo(Integer value) {
            addCriterion("dailyCourseNumber =", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberNotEqualTo(Integer value) {
            addCriterion("dailyCourseNumber <>", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberGreaterThan(Integer value) {
            addCriterion("dailyCourseNumber >", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dailyCourseNumber >=", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberLessThan(Integer value) {
            addCriterion("dailyCourseNumber <", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberLessThanOrEqualTo(Integer value) {
            addCriterion("dailyCourseNumber <=", value, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberIn(List<Integer> values) {
            addCriterion("dailyCourseNumber in", values, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberNotIn(List<Integer> values) {
            addCriterion("dailyCourseNumber not in", values, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberBetween(Integer value1, Integer value2) {
            addCriterion("dailyCourseNumber between", value1, value2, "dailycoursenumber");
            return (Criteria) this;
        }

        public Criteria andDailycoursenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dailyCourseNumber not between", value1, value2, "dailycoursenumber");
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

    @Override
    public String toString() {
        return "EduStatisticsDayExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
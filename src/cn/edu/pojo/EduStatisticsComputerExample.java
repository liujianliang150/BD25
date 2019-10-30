package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduStatisticsComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduStatisticsComputerExample() {
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

        public Criteria andCpuusageIsNull() {
            addCriterion("cpuUsage is null");
            return (Criteria) this;
        }

        public Criteria andCpuusageIsNotNull() {
            addCriterion("cpuUsage is not null");
            return (Criteria) this;
        }

        public Criteria andCpuusageEqualTo(String value) {
            addCriterion("cpuUsage =", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotEqualTo(String value) {
            addCriterion("cpuUsage <>", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageGreaterThan(String value) {
            addCriterion("cpuUsage >", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageGreaterThanOrEqualTo(String value) {
            addCriterion("cpuUsage >=", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLessThan(String value) {
            addCriterion("cpuUsage <", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLessThanOrEqualTo(String value) {
            addCriterion("cpuUsage <=", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLike(String value) {
            addCriterion("cpuUsage like", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotLike(String value) {
            addCriterion("cpuUsage not like", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageIn(List<String> values) {
            addCriterion("cpuUsage in", values, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotIn(List<String> values) {
            addCriterion("cpuUsage not in", values, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageBetween(String value1, String value2) {
            addCriterion("cpuUsage between", value1, value2, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotBetween(String value1, String value2) {
            addCriterion("cpuUsage not between", value1, value2, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageIsNull() {
            addCriterion("memoryUsage is null");
            return (Criteria) this;
        }

        public Criteria andMemoryusageIsNotNull() {
            addCriterion("memoryUsage is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryusageEqualTo(String value) {
            addCriterion("memoryUsage =", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageNotEqualTo(String value) {
            addCriterion("memoryUsage <>", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageGreaterThan(String value) {
            addCriterion("memoryUsage >", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageGreaterThanOrEqualTo(String value) {
            addCriterion("memoryUsage >=", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageLessThan(String value) {
            addCriterion("memoryUsage <", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageLessThanOrEqualTo(String value) {
            addCriterion("memoryUsage <=", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageLike(String value) {
            addCriterion("memoryUsage like", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageNotLike(String value) {
            addCriterion("memoryUsage not like", value, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageIn(List<String> values) {
            addCriterion("memoryUsage in", values, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageNotIn(List<String> values) {
            addCriterion("memoryUsage not in", values, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageBetween(String value1, String value2) {
            addCriterion("memoryUsage between", value1, value2, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andMemoryusageNotBetween(String value1, String value2) {
            addCriterion("memoryUsage not between", value1, value2, "memoryusage");
            return (Criteria) this;
        }

        public Criteria andNetusageIsNull() {
            addCriterion("netUsage is null");
            return (Criteria) this;
        }

        public Criteria andNetusageIsNotNull() {
            addCriterion("netUsage is not null");
            return (Criteria) this;
        }

        public Criteria andNetusageEqualTo(String value) {
            addCriterion("netUsage =", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageNotEqualTo(String value) {
            addCriterion("netUsage <>", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageGreaterThan(String value) {
            addCriterion("netUsage >", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageGreaterThanOrEqualTo(String value) {
            addCriterion("netUsage >=", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageLessThan(String value) {
            addCriterion("netUsage <", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageLessThanOrEqualTo(String value) {
            addCriterion("netUsage <=", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageLike(String value) {
            addCriterion("netUsage like", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageNotLike(String value) {
            addCriterion("netUsage not like", value, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageIn(List<String> values) {
            addCriterion("netUsage in", values, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageNotIn(List<String> values) {
            addCriterion("netUsage not in", values, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageBetween(String value1, String value2) {
            addCriterion("netUsage between", value1, value2, "netusage");
            return (Criteria) this;
        }

        public Criteria andNetusageNotBetween(String value1, String value2) {
            addCriterion("netUsage not between", value1, value2, "netusage");
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
        return "EduStatisticsComputerExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLoginLogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logId is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logId is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logId =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logId <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logId >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logId >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logId <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logId <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logId in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logId not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logId between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logId not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNull() {
            addCriterion("osName is null");
            return (Criteria) this;
        }

        public Criteria andOsnameIsNotNull() {
            addCriterion("osName is not null");
            return (Criteria) this;
        }

        public Criteria andOsnameEqualTo(String value) {
            addCriterion("osName =", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotEqualTo(String value) {
            addCriterion("osName <>", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThan(String value) {
            addCriterion("osName >", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameGreaterThanOrEqualTo(String value) {
            addCriterion("osName >=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThan(String value) {
            addCriterion("osName <", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLessThanOrEqualTo(String value) {
            addCriterion("osName <=", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameLike(String value) {
            addCriterion("osName like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotLike(String value) {
            addCriterion("osName not like", value, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameIn(List<String> values) {
            addCriterion("osName in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotIn(List<String> values) {
            addCriterion("osName not in", values, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameBetween(String value1, String value2) {
            addCriterion("osName between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andOsnameNotBetween(String value1, String value2) {
            addCriterion("osName not between", value1, value2, "osname");
            return (Criteria) this;
        }

        public Criteria andUserbrowserIsNull() {
            addCriterion("userBrowser is null");
            return (Criteria) this;
        }

        public Criteria andUserbrowserIsNotNull() {
            addCriterion("userBrowser is not null");
            return (Criteria) this;
        }

        public Criteria andUserbrowserEqualTo(String value) {
            addCriterion("userBrowser =", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserNotEqualTo(String value) {
            addCriterion("userBrowser <>", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserGreaterThan(String value) {
            addCriterion("userBrowser >", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserGreaterThanOrEqualTo(String value) {
            addCriterion("userBrowser >=", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserLessThan(String value) {
            addCriterion("userBrowser <", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserLessThanOrEqualTo(String value) {
            addCriterion("userBrowser <=", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserLike(String value) {
            addCriterion("userBrowser like", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserNotLike(String value) {
            addCriterion("userBrowser not like", value, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserIn(List<String> values) {
            addCriterion("userBrowser in", values, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserNotIn(List<String> values) {
            addCriterion("userBrowser not in", values, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserBetween(String value1, String value2) {
            addCriterion("userBrowser between", value1, value2, "userbrowser");
            return (Criteria) this;
        }

        public Criteria andUserbrowserNotBetween(String value1, String value2) {
            addCriterion("userBrowser not between", value1, value2, "userbrowser");
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
        return "SysLoginLogExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
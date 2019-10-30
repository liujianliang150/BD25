package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFunctionExample() {
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

        public Criteria andFunctionidIsNull() {
            addCriterion("functionId is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("functionId is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(Integer value) {
            addCriterion("functionId =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(Integer value) {
            addCriterion("functionId <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(Integer value) {
            addCriterion("functionId >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("functionId >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(Integer value) {
            addCriterion("functionId <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(Integer value) {
            addCriterion("functionId <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<Integer> values) {
            addCriterion("functionId in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<Integer> values) {
            addCriterion("functionId not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(Integer value1, Integer value2) {
            addCriterion("functionId between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(Integer value1, Integer value2) {
            addCriterion("functionId not between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNull() {
            addCriterion("functionName is null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNotNull() {
            addCriterion("functionName is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameEqualTo(String value) {
            addCriterion("functionName =", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotEqualTo(String value) {
            addCriterion("functionName <>", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThan(String value) {
            addCriterion("functionName >", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("functionName >=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThan(String value) {
            addCriterion("functionName <", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThanOrEqualTo(String value) {
            addCriterion("functionName <=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLike(String value) {
            addCriterion("functionName like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotLike(String value) {
            addCriterion("functionName not like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIn(List<String> values) {
            addCriterion("functionName in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotIn(List<String> values) {
            addCriterion("functionName not in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameBetween(String value1, String value2) {
            addCriterion("functionName between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotBetween(String value1, String value2) {
            addCriterion("functionName not between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionurlIsNull() {
            addCriterion("functionUrl is null");
            return (Criteria) this;
        }

        public Criteria andFunctionurlIsNotNull() {
            addCriterion("functionUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionurlEqualTo(String value) {
            addCriterion("functionUrl =", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlNotEqualTo(String value) {
            addCriterion("functionUrl <>", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlGreaterThan(String value) {
            addCriterion("functionUrl >", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlGreaterThanOrEqualTo(String value) {
            addCriterion("functionUrl >=", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlLessThan(String value) {
            addCriterion("functionUrl <", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlLessThanOrEqualTo(String value) {
            addCriterion("functionUrl <=", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlLike(String value) {
            addCriterion("functionUrl like", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlNotLike(String value) {
            addCriterion("functionUrl not like", value, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlIn(List<String> values) {
            addCriterion("functionUrl in", values, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlNotIn(List<String> values) {
            addCriterion("functionUrl not in", values, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlBetween(String value1, String value2) {
            addCriterion("functionUrl between", value1, value2, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctionurlNotBetween(String value1, String value2) {
            addCriterion("functionUrl not between", value1, value2, "functionurl");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIsNull() {
            addCriterion("functionType is null");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIsNotNull() {
            addCriterion("functionType is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeEqualTo(Boolean value) {
            addCriterion("functionType =", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotEqualTo(Boolean value) {
            addCriterion("functionType <>", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeGreaterThan(Boolean value) {
            addCriterion("functionType >", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("functionType >=", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeLessThan(Boolean value) {
            addCriterion("functionType <", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeLessThanOrEqualTo(Boolean value) {
            addCriterion("functionType <=", value, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeIn(List<Boolean> values) {
            addCriterion("functionType in", values, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotIn(List<Boolean> values) {
            addCriterion("functionType not in", values, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeBetween(Boolean value1, Boolean value2) {
            addCriterion("functionType between", value1, value2, "functiontype");
            return (Criteria) this;
        }

        public Criteria andFunctiontypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("functionType not between", value1, value2, "functiontype");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("imageUrl is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("imageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("imageUrl =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("imageUrl <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("imageUrl >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("imageUrl >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("imageUrl <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("imageUrl <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("imageUrl like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("imageUrl not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("imageUrl in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("imageUrl not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("imageUrl between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("imageUrl not between", value1, value2, "imageurl");
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
        return "SysFunctionExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduQuestionsTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduQuestionsTagExample() {
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

        public Criteria andQuestionstagidIsNull() {
            addCriterion("questionsTagId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidIsNotNull() {
            addCriterion("questionsTagId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidEqualTo(Integer value) {
            addCriterion("questionsTagId =", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidNotEqualTo(Integer value) {
            addCriterion("questionsTagId <>", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidGreaterThan(Integer value) {
            addCriterion("questionsTagId >", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionsTagId >=", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidLessThan(Integer value) {
            addCriterion("questionsTagId <", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidLessThanOrEqualTo(Integer value) {
            addCriterion("questionsTagId <=", value, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidIn(List<Integer> values) {
            addCriterion("questionsTagId in", values, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidNotIn(List<Integer> values) {
            addCriterion("questionsTagId not in", values, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidBetween(Integer value1, Integer value2) {
            addCriterion("questionsTagId between", value1, value2, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuestionstagidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionsTagId not between", value1, value2, "questionstagid");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameIsNull() {
            addCriterion("quesetionTagName is null");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameIsNotNull() {
            addCriterion("quesetionTagName is not null");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameEqualTo(String value) {
            addCriterion("quesetionTagName =", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameNotEqualTo(String value) {
            addCriterion("quesetionTagName <>", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameGreaterThan(String value) {
            addCriterion("quesetionTagName >", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameGreaterThanOrEqualTo(String value) {
            addCriterion("quesetionTagName >=", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameLessThan(String value) {
            addCriterion("quesetionTagName <", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameLessThanOrEqualTo(String value) {
            addCriterion("quesetionTagName <=", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameLike(String value) {
            addCriterion("quesetionTagName like", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameNotLike(String value) {
            addCriterion("quesetionTagName not like", value, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameIn(List<String> values) {
            addCriterion("quesetionTagName in", values, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameNotIn(List<String> values) {
            addCriterion("quesetionTagName not in", values, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameBetween(String value1, String value2) {
            addCriterion("quesetionTagName between", value1, value2, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andQuesetiontagnameNotBetween(String value1, String value2) {
            addCriterion("quesetionTagName not between", value1, value2, "quesetiontagname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
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
        return "EduQuestionsTagExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
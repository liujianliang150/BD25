package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduquestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduquestionsExample() {
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

        public Criteria andCusidIsNull() {
            addCriterion("cusId is null");
            return (Criteria) this;
        }

        public Criteria andCusidIsNotNull() {
            addCriterion("cusId is not null");
            return (Criteria) this;
        }

        public Criteria andCusidEqualTo(Integer value) {
            addCriterion("cusId =", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotEqualTo(Integer value) {
            addCriterion("cusId <>", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThan(Integer value) {
            addCriterion("cusId >", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cusId >=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThan(Integer value) {
            addCriterion("cusId <", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThanOrEqualTo(Integer value) {
            addCriterion("cusId <=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidIn(List<Integer> values) {
            addCriterion("cusId in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotIn(List<Integer> values) {
            addCriterion("cusId not in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidBetween(Integer value1, Integer value2) {
            addCriterion("cusId between", value1, value2, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotBetween(Integer value1, Integer value2) {
            addCriterion("cusId not between", value1, value2, "cusid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andReplycontIsNull() {
            addCriterion("replyCont is null");
            return (Criteria) this;
        }

        public Criteria andReplycontIsNotNull() {
            addCriterion("replyCont is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontEqualTo(Integer value) {
            addCriterion("replyCont =", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontNotEqualTo(Integer value) {
            addCriterion("replyCont <>", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontGreaterThan(Integer value) {
            addCriterion("replyCont >", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyCont >=", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontLessThan(Integer value) {
            addCriterion("replyCont <", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontLessThanOrEqualTo(Integer value) {
            addCriterion("replyCont <=", value, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontIn(List<Integer> values) {
            addCriterion("replyCont in", values, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontNotIn(List<Integer> values) {
            addCriterion("replyCont not in", values, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontBetween(Integer value1, Integer value2) {
            addCriterion("replyCont between", value1, value2, "replycont");
            return (Criteria) this;
        }

        public Criteria andReplycontNotBetween(Integer value1, Integer value2) {
            addCriterion("replyCont not between", value1, value2, "replycont");
            return (Criteria) this;
        }

        public Criteria andBrowsecountIsNull() {
            addCriterion("browseCount is null");
            return (Criteria) this;
        }

        public Criteria andBrowsecountIsNotNull() {
            addCriterion("browseCount is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsecountEqualTo(Integer value) {
            addCriterion("browseCount =", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotEqualTo(Integer value) {
            addCriterion("browseCount <>", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountGreaterThan(Integer value) {
            addCriterion("browseCount >", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("browseCount >=", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountLessThan(Integer value) {
            addCriterion("browseCount <", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountLessThanOrEqualTo(Integer value) {
            addCriterion("browseCount <=", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountIn(List<Integer> values) {
            addCriterion("browseCount in", values, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotIn(List<Integer> values) {
            addCriterion("browseCount not in", values, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountBetween(Integer value1, Integer value2) {
            addCriterion("browseCount between", value1, value2, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotBetween(Integer value1, Integer value2) {
            addCriterion("browseCount not between", value1, value2, "browsecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountIsNull() {
            addCriterion("praiseCount is null");
            return (Criteria) this;
        }

        public Criteria andPraisecountIsNotNull() {
            addCriterion("praiseCount is not null");
            return (Criteria) this;
        }

        public Criteria andPraisecountEqualTo(Integer value) {
            addCriterion("praiseCount =", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotEqualTo(Integer value) {
            addCriterion("praiseCount <>", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountGreaterThan(Integer value) {
            addCriterion("praiseCount >", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("praiseCount >=", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountLessThan(Integer value) {
            addCriterion("praiseCount <", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountLessThanOrEqualTo(Integer value) {
            addCriterion("praiseCount <=", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountIn(List<Integer> values) {
            addCriterion("praiseCount in", values, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotIn(List<Integer> values) {
            addCriterion("praiseCount not in", values, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountBetween(Integer value1, Integer value2) {
            addCriterion("praiseCount between", value1, value2, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotBetween(Integer value1, Integer value2) {
            addCriterion("praiseCount not between", value1, value2, "praisecount");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
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
        return "EduquestionsExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
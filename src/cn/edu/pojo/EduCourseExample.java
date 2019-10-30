package cn.edu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    @Override
    public String toString() {
        return "EduCourseExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected List<Criteria> oredCriteria;

    public EduCourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andIsavaliableIsNull() {
            addCriterion("isAvaliable is null");
            return (Criteria) this;
        }

        public Criteria andIsavaliableIsNotNull() {
            addCriterion("isAvaliable is not null");
            return (Criteria) this;
        }

        public Criteria andIsavaliableEqualTo(Integer value) {
            addCriterion("isAvaliable =", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableNotEqualTo(Integer value) {
            addCriterion("isAvaliable <>", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableGreaterThan(Integer value) {
            addCriterion("isAvaliable >", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAvaliable >=", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableLessThan(Integer value) {
            addCriterion("isAvaliable <", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableLessThanOrEqualTo(Integer value) {
            addCriterion("isAvaliable <=", value, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableIn(List<Integer> values) {
            addCriterion("isAvaliable in", values, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableNotIn(List<Integer> values) {
            addCriterion("isAvaliable not in", values, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableBetween(Integer value1, Integer value2) {
            addCriterion("isAvaliable between", value1, value2, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andIsavaliableNotBetween(Integer value1, Integer value2) {
            addCriterion("isAvaliable not between", value1, value2, "isavaliable");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectId is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("subjectId =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("subjectId <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("subjectId >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectId >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("subjectId <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("subjectId <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("subjectId in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("subjectId not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("subjectId between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectId not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkIsNull() {
            addCriterion("subjectLink is null");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkIsNotNull() {
            addCriterion("subjectLink is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkEqualTo(String value) {
            addCriterion("subjectLink =", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkNotEqualTo(String value) {
            addCriterion("subjectLink <>", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkGreaterThan(String value) {
            addCriterion("subjectLink >", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkGreaterThanOrEqualTo(String value) {
            addCriterion("subjectLink >=", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkLessThan(String value) {
            addCriterion("subjectLink <", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkLessThanOrEqualTo(String value) {
            addCriterion("subjectLink <=", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkLike(String value) {
            addCriterion("subjectLink like", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkNotLike(String value) {
            addCriterion("subjectLink not like", value, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkIn(List<String> values) {
            addCriterion("subjectLink in", values, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkNotIn(List<String> values) {
            addCriterion("subjectLink not in", values, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkBetween(String value1, String value2) {
            addCriterion("subjectLink between", value1, value2, "subjectlink");
            return (Criteria) this;
        }

        public Criteria andSubjectlinkNotBetween(String value1, String value2) {
            addCriterion("subjectLink not between", value1, value2, "subjectlink");
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

        public Criteria andSourcepriceIsNull() {
            addCriterion("sourcePrice is null");
            return (Criteria) this;
        }

        public Criteria andSourcepriceIsNotNull() {
            addCriterion("sourcePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSourcepriceEqualTo(BigDecimal value) {
            addCriterion("sourcePrice =", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotEqualTo(BigDecimal value) {
            addCriterion("sourcePrice <>", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceGreaterThan(BigDecimal value) {
            addCriterion("sourcePrice >", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sourcePrice >=", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceLessThan(BigDecimal value) {
            addCriterion("sourcePrice <", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sourcePrice <=", value, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceIn(List<BigDecimal> values) {
            addCriterion("sourcePrice in", values, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotIn(List<BigDecimal> values) {
            addCriterion("sourcePrice not in", values, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sourcePrice between", value1, value2, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andSourcepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sourcePrice not between", value1, value2, "sourceprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIsNull() {
            addCriterion("currentPrice is null");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIsNotNull() {
            addCriterion("currentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceEqualTo(BigDecimal value) {
            addCriterion("currentPrice =", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotEqualTo(BigDecimal value) {
            addCriterion("currentPrice <>", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceGreaterThan(BigDecimal value) {
            addCriterion("currentPrice >", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPrice >=", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceLessThan(BigDecimal value) {
            addCriterion("currentPrice <", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currentPrice <=", value, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceIn(List<BigDecimal> values) {
            addCriterion("currentPrice in", values, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotIn(List<BigDecimal> values) {
            addCriterion("currentPrice not in", values, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPrice between", value1, value2, "currentprice");
            return (Criteria) this;
        }

        public Criteria andCurrentpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentPrice not between", value1, value2, "currentprice");
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

        public Criteria andLessionnumIsNull() {
            addCriterion("lessionNum is null");
            return (Criteria) this;
        }

        public Criteria andLessionnumIsNotNull() {
            addCriterion("lessionNum is not null");
            return (Criteria) this;
        }

        public Criteria andLessionnumEqualTo(Integer value) {
            addCriterion("lessionNum =", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumNotEqualTo(Integer value) {
            addCriterion("lessionNum <>", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumGreaterThan(Integer value) {
            addCriterion("lessionNum >", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessionNum >=", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumLessThan(Integer value) {
            addCriterion("lessionNum <", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumLessThanOrEqualTo(Integer value) {
            addCriterion("lessionNum <=", value, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumIn(List<Integer> values) {
            addCriterion("lessionNum in", values, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumNotIn(List<Integer> values) {
            addCriterion("lessionNum not in", values, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumBetween(Integer value1, Integer value2) {
            addCriterion("lessionNum between", value1, value2, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLessionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("lessionNum not between", value1, value2, "lessionnum");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andPagebuycountIsNull() {
            addCriterion("pageBuyCount is null");
            return (Criteria) this;
        }

        public Criteria andPagebuycountIsNotNull() {
            addCriterion("pageBuyCount is not null");
            return (Criteria) this;
        }

        public Criteria andPagebuycountEqualTo(Integer value) {
            addCriterion("pageBuyCount =", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountNotEqualTo(Integer value) {
            addCriterion("pageBuyCount <>", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountGreaterThan(Integer value) {
            addCriterion("pageBuyCount >", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageBuyCount >=", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountLessThan(Integer value) {
            addCriterion("pageBuyCount <", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountLessThanOrEqualTo(Integer value) {
            addCriterion("pageBuyCount <=", value, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountIn(List<Integer> values) {
            addCriterion("pageBuyCount in", values, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountNotIn(List<Integer> values) {
            addCriterion("pageBuyCount not in", values, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountBetween(Integer value1, Integer value2) {
            addCriterion("pageBuyCount between", value1, value2, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPagebuycountNotBetween(Integer value1, Integer value2) {
            addCriterion("pageBuyCount not between", value1, value2, "pagebuycount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountIsNull() {
            addCriterion("pageViewCount is null");
            return (Criteria) this;
        }

        public Criteria andPageviewcountIsNotNull() {
            addCriterion("pageViewCount is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewcountEqualTo(Integer value) {
            addCriterion("pageViewCount =", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountNotEqualTo(Integer value) {
            addCriterion("pageViewCount <>", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountGreaterThan(Integer value) {
            addCriterion("pageViewCount >", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageViewCount >=", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountLessThan(Integer value) {
            addCriterion("pageViewCount <", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountLessThanOrEqualTo(Integer value) {
            addCriterion("pageViewCount <=", value, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountIn(List<Integer> values) {
            addCriterion("pageViewCount in", values, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountNotIn(List<Integer> values) {
            addCriterion("pageViewCount not in", values, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountBetween(Integer value1, Integer value2) {
            addCriterion("pageViewCount between", value1, value2, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andPageviewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("pageViewCount not between", value1, value2, "pageviewcount");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andLosetypeIsNull() {
            addCriterion("loseType is null");
            return (Criteria) this;
        }

        public Criteria andLosetypeIsNotNull() {
            addCriterion("loseType is not null");
            return (Criteria) this;
        }

        public Criteria andLosetypeEqualTo(Integer value) {
            addCriterion("loseType =", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeNotEqualTo(Integer value) {
            addCriterion("loseType <>", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeGreaterThan(Integer value) {
            addCriterion("loseType >", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loseType >=", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeLessThan(Integer value) {
            addCriterion("loseType <", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeLessThanOrEqualTo(Integer value) {
            addCriterion("loseType <=", value, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeIn(List<Integer> values) {
            addCriterion("loseType in", values, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeNotIn(List<Integer> values) {
            addCriterion("loseType not in", values, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeBetween(Integer value1, Integer value2) {
            addCriterion("loseType between", value1, value2, "losetype");
            return (Criteria) this;
        }

        public Criteria andLosetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("loseType not between", value1, value2, "losetype");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIsNull() {
            addCriterion("LOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIsNotNull() {
            addCriterion("LOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoseTimeEqualTo(String value) {
            addCriterion("LOSE_TIME =", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotEqualTo(String value) {
            addCriterion("LOSE_TIME <>", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeGreaterThan(String value) {
            addCriterion("LOSE_TIME >", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOSE_TIME >=", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeLessThan(String value) {
            addCriterion("LOSE_TIME <", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeLessThanOrEqualTo(String value) {
            addCriterion("LOSE_TIME <=", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeLike(String value) {
            addCriterion("LOSE_TIME like", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotLike(String value) {
            addCriterion("LOSE_TIME not like", value, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeIn(List<String> values) {
            addCriterion("LOSE_TIME in", values, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotIn(List<String> values) {
            addCriterion("LOSE_TIME not in", values, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeBetween(String value1, String value2) {
            addCriterion("LOSE_TIME between", value1, value2, "loseTime");
            return (Criteria) this;
        }

        public Criteria andLoseTimeNotBetween(String value1, String value2) {
            addCriterion("LOSE_TIME not between", value1, value2, "loseTime");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("SEQUENCE =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("SEQUENCE <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("SEQUENCE >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("SEQUENCE <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("SEQUENCE in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("SEQUENCE not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeIsNull() {
            addCriterion("COURSE_GROSS_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeIsNotNull() {
            addCriterion("COURSE_GROSS_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeEqualTo(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME =", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeNotEqualTo(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME <>", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeGreaterThan(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME >", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME >=", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeLessThan(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME <", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_GROSS_INCOME <=", value, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeIn(List<BigDecimal> values) {
            addCriterion("COURSE_GROSS_INCOME in", values, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeNotIn(List<BigDecimal> values) {
            addCriterion("COURSE_GROSS_INCOME not in", values, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_GROSS_INCOME between", value1, value2, "courseGrossIncome");
            return (Criteria) this;
        }

        public Criteria andCourseGrossIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_GROSS_INCOME not between", value1, value2, "courseGrossIncome");
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
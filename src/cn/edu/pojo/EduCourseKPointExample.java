package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduCourseKPointExample {
    protected String orderByClause;

    @Override
    public String toString() {
        return "EduCourseKPointExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduCourseKPointExample() {
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

        public Criteria andKpointidIsNull() {
            addCriterion("kpointId is null");
            return (Criteria) this;
        }

        public Criteria andKpointidIsNotNull() {
            addCriterion("kpointId is not null");
            return (Criteria) this;
        }

        public Criteria andKpointidEqualTo(Integer value) {
            addCriterion("kpointId =", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidNotEqualTo(Integer value) {
            addCriterion("kpointId <>", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidGreaterThan(Integer value) {
            addCriterion("kpointId >", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kpointId >=", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidLessThan(Integer value) {
            addCriterion("kpointId <", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidLessThanOrEqualTo(Integer value) {
            addCriterion("kpointId <=", value, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidIn(List<Integer> values) {
            addCriterion("kpointId in", values, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidNotIn(List<Integer> values) {
            addCriterion("kpointId not in", values, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidBetween(Integer value1, Integer value2) {
            addCriterion("kpointId between", value1, value2, "kpointid");
            return (Criteria) this;
        }

        public Criteria andKpointidNotBetween(Integer value1, Integer value2) {
            addCriterion("kpointId not between", value1, value2, "kpointid");
            return (Criteria) this;
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andPlaycountIsNull() {
            addCriterion("playCount is null");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNotNull() {
            addCriterion("playCount is not null");
            return (Criteria) this;
        }

        public Criteria andPlaycountEqualTo(Integer value) {
            addCriterion("playCount =", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotEqualTo(Integer value) {
            addCriterion("playCount <>", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThan(Integer value) {
            addCriterion("playCount >", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("playCount >=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThan(Integer value) {
            addCriterion("playCount <", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThanOrEqualTo(Integer value) {
            addCriterion("playCount <=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountIn(List<Integer> values) {
            addCriterion("playCount in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotIn(List<Integer> values) {
            addCriterion("playCount not in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountBetween(Integer value1, Integer value2) {
            addCriterion("playCount between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("playCount not between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNull() {
            addCriterion("isFree is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNotNull() {
            addCriterion("isFree is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeEqualTo(Boolean value) {
            addCriterion("isFree =", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotEqualTo(Boolean value) {
            addCriterion("isFree <>", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThan(Boolean value) {
            addCriterion("isFree >", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isFree >=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThan(Boolean value) {
            addCriterion("isFree <", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThanOrEqualTo(Boolean value) {
            addCriterion("isFree <=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeIn(List<Boolean> values) {
            addCriterion("isFree in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotIn(List<Boolean> values) {
            addCriterion("isFree not in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeBetween(Boolean value1, Boolean value2) {
            addCriterion("isFree between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isFree not between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videoUrl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videoUrl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videoUrl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videoUrl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videoUrl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videoUrl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videoUrl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videoUrl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videoUrl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videoUrl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videoUrl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videoUrl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andTeachearidIsNull() {
            addCriterion("teachearId is null");
            return (Criteria) this;
        }

        public Criteria andTeachearidIsNotNull() {
            addCriterion("teachearId is not null");
            return (Criteria) this;
        }

        public Criteria andTeachearidEqualTo(Integer value) {
            addCriterion("teachearId =", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidNotEqualTo(Integer value) {
            addCriterion("teachearId <>", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidGreaterThan(Integer value) {
            addCriterion("teachearId >", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachearId >=", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidLessThan(Integer value) {
            addCriterion("teachearId <", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidLessThanOrEqualTo(Integer value) {
            addCriterion("teachearId <=", value, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidIn(List<Integer> values) {
            addCriterion("teachearId in", values, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidNotIn(List<Integer> values) {
            addCriterion("teachearId not in", values, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidBetween(Integer value1, Integer value2) {
            addCriterion("teachearId between", value1, value2, "teachearid");
            return (Criteria) this;
        }

        public Criteria andTeachearidNotBetween(Integer value1, Integer value2) {
            addCriterion("teachearId not between", value1, value2, "teachearid");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNull() {
            addCriterion("playTime is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNotNull() {
            addCriterion("playTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeEqualTo(String value) {
            addCriterion("playTime =", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotEqualTo(String value) {
            addCriterion("playTime <>", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThan(String value) {
            addCriterion("playTime >", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("playTime >=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThan(String value) {
            addCriterion("playTime <", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThanOrEqualTo(String value) {
            addCriterion("playTime <=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLike(String value) {
            addCriterion("playTime like", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotLike(String value) {
            addCriterion("playTime not like", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIn(List<String> values) {
            addCriterion("playTime in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotIn(List<String> values) {
            addCriterion("playTime not in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeBetween(String value1, String value2) {
            addCriterion("playTime between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotBetween(String value1, String value2) {
            addCriterion("playTime not between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andKpointtypeIsNull() {
            addCriterion("kpointType is null");
            return (Criteria) this;
        }

        public Criteria andKpointtypeIsNotNull() {
            addCriterion("kpointType is not null");
            return (Criteria) this;
        }

        public Criteria andKpointtypeEqualTo(Integer value) {
            addCriterion("kpointType =", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeNotEqualTo(Integer value) {
            addCriterion("kpointType <>", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeGreaterThan(Integer value) {
            addCriterion("kpointType >", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("kpointType >=", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeLessThan(Integer value) {
            addCriterion("kpointType <", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeLessThanOrEqualTo(Integer value) {
            addCriterion("kpointType <=", value, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeIn(List<Integer> values) {
            addCriterion("kpointType in", values, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeNotIn(List<Integer> values) {
            addCriterion("kpointType not in", values, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeBetween(Integer value1, Integer value2) {
            addCriterion("kpointType between", value1, value2, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andKpointtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("kpointType not between", value1, value2, "kpointtype");
            return (Criteria) this;
        }

        public Criteria andVideotypeIsNull() {
            addCriterion("videoType is null");
            return (Criteria) this;
        }

        public Criteria andVideotypeIsNotNull() {
            addCriterion("videoType is not null");
            return (Criteria) this;
        }

        public Criteria andVideotypeEqualTo(String value) {
            addCriterion("videoType =", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotEqualTo(String value) {
            addCriterion("videoType <>", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeGreaterThan(String value) {
            addCriterion("videoType >", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeGreaterThanOrEqualTo(String value) {
            addCriterion("videoType >=", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeLessThan(String value) {
            addCriterion("videoType <", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeLessThanOrEqualTo(String value) {
            addCriterion("videoType <=", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeLike(String value) {
            addCriterion("videoType like", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotLike(String value) {
            addCriterion("videoType not like", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeIn(List<String> values) {
            addCriterion("videoType in", values, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotIn(List<String> values) {
            addCriterion("videoType not in", values, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeBetween(String value1, String value2) {
            addCriterion("videoType between", value1, value2, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotBetween(String value1, String value2) {
            addCriterion("videoType not between", value1, value2, "videotype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("fileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("fileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("fileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("fileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("fileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("fileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("fileType like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("fileType not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("fileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("fileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("fileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("fileType not between", value1, value2, "filetype");
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
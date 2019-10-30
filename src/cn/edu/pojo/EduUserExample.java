package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduUserExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("passWord is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("passWord is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("passWord =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("passWord <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("passWord >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("passWord >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("passWord <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("passWord <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("passWord like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("passWord not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("passWord in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("passWord not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("passWord between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("passWord not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andShownameIsNull() {
            addCriterion("showName is null");
            return (Criteria) this;
        }

        public Criteria andShownameIsNotNull() {
            addCriterion("showName is not null");
            return (Criteria) this;
        }

        public Criteria andShownameEqualTo(String value) {
            addCriterion("showName =", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotEqualTo(String value) {
            addCriterion("showName <>", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThan(String value) {
            addCriterion("showName >", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThanOrEqualTo(String value) {
            addCriterion("showName >=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThan(String value) {
            addCriterion("showName <", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThanOrEqualTo(String value) {
            addCriterion("showName <=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLike(String value) {
            addCriterion("showName like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotLike(String value) {
            addCriterion("showName not like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameIn(List<String> values) {
            addCriterion("showName in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotIn(List<String> values) {
            addCriterion("showName not in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameBetween(String value1, String value2) {
            addCriterion("showName between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotBetween(String value1, String value2) {
            addCriterion("showName not between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andIsavalibleIsNull() {
            addCriterion("isAvalible is null");
            return (Criteria) this;
        }

        public Criteria andIsavalibleIsNotNull() {
            addCriterion("isAvalible is not null");
            return (Criteria) this;
        }

        public Criteria andIsavalibleEqualTo(Boolean value) {
            addCriterion("isAvalible =", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleNotEqualTo(Boolean value) {
            addCriterion("isAvalible <>", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleGreaterThan(Boolean value) {
            addCriterion("isAvalible >", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAvalible >=", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleLessThan(Boolean value) {
            addCriterion("isAvalible <", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleLessThanOrEqualTo(Boolean value) {
            addCriterion("isAvalible <=", value, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleIn(List<Boolean> values) {
            addCriterion("isAvalible in", values, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleNotIn(List<Boolean> values) {
            addCriterion("isAvalible not in", values, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleBetween(Boolean value1, Boolean value2) {
            addCriterion("isAvalible between", value1, value2, "isavalible");
            return (Criteria) this;
        }

        public Criteria andIsavalibleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAvalible not between", value1, value2, "isavalible");
            return (Criteria) this;
        }

        public Criteria andPicimgIsNull() {
            addCriterion("picImg is null");
            return (Criteria) this;
        }

        public Criteria andPicimgIsNotNull() {
            addCriterion("picImg is not null");
            return (Criteria) this;
        }

        public Criteria andPicimgEqualTo(String value) {
            addCriterion("picImg =", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgNotEqualTo(String value) {
            addCriterion("picImg <>", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgGreaterThan(String value) {
            addCriterion("picImg >", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgGreaterThanOrEqualTo(String value) {
            addCriterion("picImg >=", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgLessThan(String value) {
            addCriterion("picImg <", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgLessThanOrEqualTo(String value) {
            addCriterion("picImg <=", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgLike(String value) {
            addCriterion("picImg like", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgNotLike(String value) {
            addCriterion("picImg not like", value, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgIn(List<String> values) {
            addCriterion("picImg in", values, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgNotIn(List<String> values) {
            addCriterion("picImg not in", values, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgBetween(String value1, String value2) {
            addCriterion("picImg between", value1, value2, "picimg");
            return (Criteria) this;
        }

        public Criteria andPicimgNotBetween(String value1, String value2) {
            addCriterion("picImg not between", value1, value2, "picimg");
            return (Criteria) this;
        }

        public Criteria andBannerurlIsNull() {
            addCriterion("bannerUrl is null");
            return (Criteria) this;
        }

        public Criteria andBannerurlIsNotNull() {
            addCriterion("bannerUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBannerurlEqualTo(String value) {
            addCriterion("bannerUrl =", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotEqualTo(String value) {
            addCriterion("bannerUrl <>", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThan(String value) {
            addCriterion("bannerUrl >", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlGreaterThanOrEqualTo(String value) {
            addCriterion("bannerUrl >=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThan(String value) {
            addCriterion("bannerUrl <", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLessThanOrEqualTo(String value) {
            addCriterion("bannerUrl <=", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlLike(String value) {
            addCriterion("bannerUrl like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotLike(String value) {
            addCriterion("bannerUrl not like", value, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlIn(List<String> values) {
            addCriterion("bannerUrl in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotIn(List<String> values) {
            addCriterion("bannerUrl not in", values, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlBetween(String value1, String value2) {
            addCriterion("bannerUrl between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andBannerurlNotBetween(String value1, String value2) {
            addCriterion("bannerUrl not between", value1, value2, "bannerurl");
            return (Criteria) this;
        }

        public Criteria andMsgnumIsNull() {
            addCriterion("msgNum is null");
            return (Criteria) this;
        }

        public Criteria andMsgnumIsNotNull() {
            addCriterion("msgNum is not null");
            return (Criteria) this;
        }

        public Criteria andMsgnumEqualTo(Integer value) {
            addCriterion("msgNum =", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotEqualTo(Integer value) {
            addCriterion("msgNum <>", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumGreaterThan(Integer value) {
            addCriterion("msgNum >", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgNum >=", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumLessThan(Integer value) {
            addCriterion("msgNum <", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumLessThanOrEqualTo(Integer value) {
            addCriterion("msgNum <=", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumIn(List<Integer> values) {
            addCriterion("msgNum in", values, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotIn(List<Integer> values) {
            addCriterion("msgNum not in", values, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumBetween(Integer value1, Integer value2) {
            addCriterion("msgNum between", value1, value2, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotBetween(Integer value1, Integer value2) {
            addCriterion("msgNum not between", value1, value2, "msgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumIsNull() {
            addCriterion("sysMsgNum is null");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumIsNotNull() {
            addCriterion("sysMsgNum is not null");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumEqualTo(Integer value) {
            addCriterion("sysMsgNum =", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumNotEqualTo(Integer value) {
            addCriterion("sysMsgNum <>", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumGreaterThan(Integer value) {
            addCriterion("sysMsgNum >", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysMsgNum >=", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumLessThan(Integer value) {
            addCriterion("sysMsgNum <", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumLessThanOrEqualTo(Integer value) {
            addCriterion("sysMsgNum <=", value, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumIn(List<Integer> values) {
            addCriterion("sysMsgNum in", values, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumNotIn(List<Integer> values) {
            addCriterion("sysMsgNum not in", values, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumBetween(Integer value1, Integer value2) {
            addCriterion("sysMsgNum between", value1, value2, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andSysmsgnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sysMsgNum not between", value1, value2, "sysmsgnum");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeIsNull() {
            addCriterion("lastSystemTime is null");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeIsNotNull() {
            addCriterion("lastSystemTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeEqualTo(Date value) {
            addCriterion("lastSystemTime =", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeNotEqualTo(Date value) {
            addCriterion("lastSystemTime <>", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeGreaterThan(Date value) {
            addCriterion("lastSystemTime >", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastSystemTime >=", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeLessThan(Date value) {
            addCriterion("lastSystemTime <", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastSystemTime <=", value, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeIn(List<Date> values) {
            addCriterion("lastSystemTime in", values, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeNotIn(List<Date> values) {
            addCriterion("lastSystemTime not in", values, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeBetween(Date value1, Date value2) {
            addCriterion("lastSystemTime between", value1, value2, "lastsystemtime");
            return (Criteria) this;
        }

        public Criteria andLastsystemtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastSystemTime not between", value1, value2, "lastsystemtime");
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
        return "EduUserExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
package cn.edu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    @Override
    public String toString() {
        return "EduArticleExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    public EduArticleExample() {
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

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Integer value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Integer value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Integer value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Integer value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Integer> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Integer> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Integer value1, Integer value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
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

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyWord is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyWord is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyWord =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyWord <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyWord >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyWord >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyWord <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyWord <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyWord like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyWord not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyWord in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyWord not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyWord between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyWord not between", value1, value2, "keyword");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNull() {
            addCriterion("articleType is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNotNull() {
            addCriterion("articleType is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeEqualTo(Byte value) {
            addCriterion("articleType =", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotEqualTo(Byte value) {
            addCriterion("articleType <>", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThan(Byte value) {
            addCriterion("articleType >", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("articleType >=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThan(Byte value) {
            addCriterion("articleType <", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThanOrEqualTo(Byte value) {
            addCriterion("articleType <=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeIn(List<Byte> values) {
            addCriterion("articleType in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotIn(List<Byte> values) {
            addCriterion("articleType not in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeBetween(Byte value1, Byte value2) {
            addCriterion("articleType between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotBetween(Byte value1, Byte value2) {
            addCriterion("articleType not between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("clickNum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clickNum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clickNum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clickNum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clickNum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickNum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clickNum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clickNum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clickNum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clickNum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clickNum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clickNum not between", value1, value2, "clicknum");
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

        public Criteria andCommentnumIsNull() {
            addCriterion("commentNum is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Integer value) {
            addCriterion("commentNum =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Integer value) {
            addCriterion("commentNum <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Integer value) {
            addCriterion("commentNum >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNum >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Integer value) {
            addCriterion("commentNum <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("commentNum <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Integer> values) {
            addCriterion("commentNum in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Integer> values) {
            addCriterion("commentNum not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("commentNum between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNum not between", value1, value2, "commentnum");
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

        public Criteria andFavoritnumIsNull() {
            addCriterion("favoritNum is null");
            return (Criteria) this;
        }

        public Criteria andFavoritnumIsNotNull() {
            addCriterion("favoritNum is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritnumEqualTo(Integer value) {
            addCriterion("favoritNum =", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumNotEqualTo(Integer value) {
            addCriterion("favoritNum <>", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumGreaterThan(Integer value) {
            addCriterion("favoritNum >", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("favoritNum >=", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumLessThan(Integer value) {
            addCriterion("favoritNum <", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumLessThanOrEqualTo(Integer value) {
            addCriterion("favoritNum <=", value, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumIn(List<Integer> values) {
            addCriterion("favoritNum in", values, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumNotIn(List<Integer> values) {
            addCriterion("favoritNum not in", values, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumBetween(Integer value1, Integer value2) {
            addCriterion("favoritNum between", value1, value2, "favoritnum");
            return (Criteria) this;
        }

        public Criteria andFavoritnumNotBetween(Integer value1, Integer value2) {
            addCriterion("favoritNum not between", value1, value2, "favoritnum");
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
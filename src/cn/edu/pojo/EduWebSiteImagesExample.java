package cn.edu.pojo;

import java.util.ArrayList;
import java.util.List;

public class EduWebSiteImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduWebSiteImagesExample() {
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

        public Criteria andImageidIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Integer value) {
            addCriterion("imageId =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Integer value) {
            addCriterion("imageId <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Integer value) {
            addCriterion("imageId >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageId >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Integer value) {
            addCriterion("imageId <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Integer value) {
            addCriterion("imageId <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Integer> values) {
            addCriterion("imageId in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Integer> values) {
            addCriterion("imageId not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Integer value1, Integer value2) {
            addCriterion("imageId between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Integer value1, Integer value2) {
            addCriterion("imageId not between", value1, value2, "imageid");
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

        public Criteria andLinkaddressIsNull() {
            addCriterion("linkAddress is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNotNull() {
            addCriterion("linkAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressEqualTo(String value) {
            addCriterion("linkAddress =", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotEqualTo(String value) {
            addCriterion("linkAddress <>", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThan(String value) {
            addCriterion("linkAddress >", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("linkAddress >=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThan(String value) {
            addCriterion("linkAddress <", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThanOrEqualTo(String value) {
            addCriterion("linkAddress <=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLike(String value) {
            addCriterion("linkAddress like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotLike(String value) {
            addCriterion("linkAddress not like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIn(List<String> values) {
            addCriterion("linkAddress in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotIn(List<String> values) {
            addCriterion("linkAddress not in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressBetween(String value1, String value2) {
            addCriterion("linkAddress between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotBetween(String value1, String value2) {
            addCriterion("linkAddress not between", value1, value2, "linkaddress");
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberIsNull() {
            addCriterion("seriesNumber is null");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberIsNotNull() {
            addCriterion("seriesNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberEqualTo(Integer value) {
            addCriterion("seriesNumber =", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberNotEqualTo(Integer value) {
            addCriterion("seriesNumber <>", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberGreaterThan(Integer value) {
            addCriterion("seriesNumber >", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriesNumber >=", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberLessThan(Integer value) {
            addCriterion("seriesNumber <", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberLessThanOrEqualTo(Integer value) {
            addCriterion("seriesNumber <=", value, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberIn(List<Integer> values) {
            addCriterion("seriesNumber in", values, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberNotIn(List<Integer> values) {
            addCriterion("seriesNumber not in", values, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberBetween(Integer value1, Integer value2) {
            addCriterion("seriesNumber between", value1, value2, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andSeriesnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seriesNumber not between", value1, value2, "seriesnumber");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIsNull() {
            addCriterion("previewUrl is null");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIsNotNull() {
            addCriterion("previewUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewurlEqualTo(String value) {
            addCriterion("previewUrl =", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotEqualTo(String value) {
            addCriterion("previewUrl <>", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlGreaterThan(String value) {
            addCriterion("previewUrl >", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlGreaterThanOrEqualTo(String value) {
            addCriterion("previewUrl >=", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLessThan(String value) {
            addCriterion("previewUrl <", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLessThanOrEqualTo(String value) {
            addCriterion("previewUrl <=", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLike(String value) {
            addCriterion("previewUrl like", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotLike(String value) {
            addCriterion("previewUrl not like", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIn(List<String> values) {
            addCriterion("previewUrl in", values, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotIn(List<String> values) {
            addCriterion("previewUrl not in", values, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlBetween(String value1, String value2) {
            addCriterion("previewUrl between", value1, value2, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotBetween(String value1, String value2) {
            addCriterion("previewUrl not between", value1, value2, "previewurl");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
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
        return "EduWebSiteImagesExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }
}
package com.hn.dls.entity;

public class ArticleCategory {
    private Integer id;

    private Integer fkChannelId;

    private String title;

    private String seoTitle;

    private String seoKeywords;

    private String seoDescription;

    private Integer parentId;

    private String classList;

    private Integer classLayer;

    private Integer sortId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkChannelId() {
        return fkChannelId;
    }

    public void setFkChannelId(Integer fkChannelId) {
        this.fkChannelId = fkChannelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList == null ? null : classList.trim();
    }

    public Integer getClassLayer() {
        return classLayer;
    }

    public void setClassLayer(Integer classLayer) {
        this.classLayer = classLayer;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
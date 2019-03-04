package com.hucheng.beauty.entity;


/**
 * 图片实体
 */
@SuppressWarnings("all")
public class Image {
    private String id;
    private String author;
    private String type;
    private String title;
    private String name;
    private String url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image(String id, String author, String type, String title, String name, String url) {
        this.id = id;
        this.author = author;
        this.type = type;
        this.title = title;
        this.name = name;
        this.url = url;
    }
}

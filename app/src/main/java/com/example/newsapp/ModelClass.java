package com.example.newsapp;

public class ModelClass {
    private String author, title, description, url, urlToImage, publishedAt;

    public ModelClass() {
    }

    public ModelClass(String author, String title, String description, String urlToImage, String publishedAt) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.description = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { url = url; }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

}

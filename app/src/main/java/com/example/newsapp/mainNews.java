package com.example.newsapp;

import java.util.ArrayList;

public class mainNews {
    private String status;
    private String tableResults;
    private ArrayList<ModelClass> articles;

    public mainNews(String status, String tableResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.tableResults = tableResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTableResults() {
        return tableResults;
    }

    public void setTableResults(String tableResults) {
        this.tableResults = tableResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}

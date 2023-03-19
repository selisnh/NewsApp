package com.example.newsapp;

import com.example.newsapp.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchdata(List<NewsHeadlines> list, String message);
    void onError(String message);

}

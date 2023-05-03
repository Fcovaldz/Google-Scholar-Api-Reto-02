package com.google.scholar.api.model;

import java.util.List;

public class ScholarResponse {

    private List<ScholarResult> results;

    public List<ScholarResult> getResults() {
        return results;
    }

    public void setResults(List<ScholarResult> results) {
        this.results = results;
    }

    public static class ScholarResult {

        private String title;
        private String url;
        private String snippet;

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

        public String getSnippet() {
            return snippet;
        }

        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }
    }
}


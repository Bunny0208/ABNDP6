    package com.example.android.abndp6;

    public class News {

        private String mSectionName;
        private String mWebTitle;
        private String mDate;
        private String mUrl;
        private String mAuthor;

        public News(String sectionName, String webTitle, String date, String url, String author) {
            mSectionName = sectionName;
            mWebTitle = webTitle;
            mDate = date;
            mUrl = url;
            mAuthor = author;

        }

        public String getName(){return mSectionName;}

        public String getWebTitle() {
            return mWebTitle;
        }

        public String getDate() {
            return mDate;
        }

        public String getUrl() {
            return mUrl;
        }

        public String getAuthor(){ return mAuthor; }

    }
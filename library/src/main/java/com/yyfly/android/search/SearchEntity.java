package com.yyfly.android.search;

/**
 * @author : mingweigao / mwgao@vip.qq.com
 * @version : 1.0
 * @date : 2017/8/6
 */
public class SearchEntity {

    private String keyWord;

    private boolean isHistory;

    public SearchEntity(String keyWord, boolean isHistory) {
        this.keyWord = keyWord;
        this.isHistory = isHistory;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public boolean isHistory() {
        return isHistory;
    }

    public void setHistory(boolean history) {
        isHistory = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchEntity that = (SearchEntity) o;

        return keyWord.equals(that.keyWord);

    }

    @Override
    public int hashCode() {
        return keyWord.hashCode();
    }
}

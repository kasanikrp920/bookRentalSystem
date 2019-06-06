package com.trimindtech.training.day08BookRental;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Book  {
    private String authorName;
    private String title;
    private int ISBN;
    private boolean isAcademic;
    private int totalCount;

    public Book() {
    }

    public Book(String  authorName, String title, int ISBN,boolean isAcademic, int totalCount) {
        this.authorName = authorName;
        this.title = title;
        this.ISBN = ISBN;
        this.isAcademic = isAcademic;
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorNameName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsAcademic() {
        return isAcademic;
    }

    public void setIsAcademic(boolean isAcademic) {
        this.isAcademic = isAcademic;
    }

    public void setAuthorName(String name) {
        this.authorName = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", ISBN=" + ISBN +
                ", isAcademic=" + isAcademic +
                ", totalCount=" + totalCount +
                '}';
    }


}

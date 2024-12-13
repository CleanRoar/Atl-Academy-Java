package NewsGeneric;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News<T,U extends Category,K extends Author>  {
    private T newsName;
    private U category;
    private K author;
    private LocalDate newsTime;

    public News(T newsName, U category, K author, LocalDate newsTime) {
        this.newsName = newsName;
        this.category = category;
        this.author = author;
        this.newsTime = newsTime;
    }

    public T getNewsName() {
        return newsName;
    }

    public void setNewsName(T newsName) {
        this.newsName = newsName;
    }

    public U getCategory() {
        return category;
    }

    public void setCategory(U category) {
        this.category = category;
    }

    public K getAuthor() {
        return author;
    }

    public void setAuthor(K author) {
        this.author = author;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }


    public String formatVaxt(){
        return newsTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void xeberInfo(){
        System.out.println("News{" +
                "newsName=" + newsName +
                ", category=" + category +
                ", author=" + author +
                ", newsTime=" + newsTime +
                '}');
    }


}

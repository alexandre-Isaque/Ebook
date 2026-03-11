package services.user;

public class ebook {
    protected String name;
    protected int pages;

    public ebook(String name, int pages) {
        this.name =  name;
        this.pages = pages;
    }

    // return name
    public String getName(){
        return this.name;
    }

    // return pages
    public int getPages(){
        return this.pages;
    }
}
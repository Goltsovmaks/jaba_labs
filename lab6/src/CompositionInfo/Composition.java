package CompositionInfo;


public  class Composition implements ShowDescription{
    public String title;
    public String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription(){
        return "Title of composition: " + title + "\nAuthor: " + author;
    }
}



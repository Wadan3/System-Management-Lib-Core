import java.util.Arrays;

class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;
    private String gen;
    private int timesOfBorrow;

    public Book(String id, String title, String author, String gen) {
        if (id.length() != 5) {
            System.out.println("id must be d5 characters long");
        }
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.gen = gen;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getTimesOfBorrow() {
        return timesOfBorrow;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTimesOfBorrow() {
        timesOfBorrow++;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is not available");
        }
    }

    enum Genre {
        FICTION,
        FICTION_NON,
        SCIENCE,
        HISTORY,
        FANTASY
    }

    public void capitalizeTitle(Book obj) {
        String title = obj.getTitle();
        String[] str = title.split(" ");
        for (int i = 0; i < str.length; i++) {
            String st = str[i];
            char s = Character.toUpperCase(st.charAt(0));
            String result = s + st.substring(1,st.length());
            str[i] = result;
        }
        obj.setTitle(Arrays.toString(str));
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void printBookInfo() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable +
                "\nGenre: " + gen + "Times of borrow: " + timesOfBorrow);
    }
}
/*
Declare a class called book having author_name as private data member. Extend
book class to have two sub classes called book_publication &
paper_publication. Each of these classes have private member called title.
Write a complete program to show usage of dynamic method dispatch (dynamic
polymorphism) to display book or paper publications of given author.Use
command line arguments for inputting data.
*/

class book {
    protected String author_name;

    public void get_aname(String k) {
        this.author_name = k;
    }

    public void display() {
    }

    public void get_title(String k) {
    }
}

class book_publication extends book {
    protected String title;

    public void get_title(String k) {
        this.title = k;
    }

    public void display() {
        System.out.println("The book's author name is : " + author_name + " and the book title is : " + this.title);
    }
}

class paper_publication extends book {
    protected String title;

    public void get_title(String k) {
        this.title = k;
    }

    public void display() {
        System.out.println("The paper's author name is : " + author_name + " and the paper title is : " + this.title);
    }
}

class BookDetails {
    public static void main(String args[]) {
        book r = null;
        book_publication b1 = new book_publication();
        paper_publication p1 = new paper_publication();
        r = b1;
        r.get_aname(args[0]);
        r.get_title(args[1]);
        r.display();
        r = p1;
        r.get_aname(args[2]);
        r.get_title(args[3]);
        r.display();
    }
}
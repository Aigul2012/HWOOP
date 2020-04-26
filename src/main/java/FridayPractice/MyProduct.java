package FridayPractice;

import lesson.AbstractProduct;

public class MyProduct extends AbstractProduct {
    private int numberOfPages;
    private int ratingNumberOfStars;

    public MyProduct(String name, double price, int numberOfPages, int ratingNumberOfStars ) {
        super(name, price);
        this.numberOfPages=numberOfPages;
        this.ratingNumberOfStars=ratingNumberOfStars;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getRatingNumberOfStars() {
        return ratingNumberOfStars;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setRatingNumberOfStars(int ratingNumberOfStars) {
        this.ratingNumberOfStars = ratingNumberOfStars;
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "numberOfPages=" + numberOfPages +
                ", ratingNumberOfStars=" + ratingNumberOfStars +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    public void showRating(){
        System.out.println("Рейтинг книги: " + ratingNumberOfStars );
    }

}

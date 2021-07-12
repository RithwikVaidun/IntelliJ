package ApCSA;

import java.util.ArrayList;

public class ProductReview {
    private String name;
    private String review;

    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }


    public static void main(String[] args) {
        String prod = new String ("Apple");
        ProductReview rev1 = new ProductReview(prod,"Best");
        ProductReview rev2 = new ProductReview(prod,"best");

        ReviewCollector review = new ReviewCollector();
        review.addReview(rev1);
        review.addReview(rev2);

        ArrayList<ProductReview> goodRev = review.getBestReviewsByProduct("Apple");

        for(ProductReview r : goodRev) {
            System.out.println(r.name + " " + r.review);
        }
        String p = new String("Apple");
        System.out.println("Count of Good Reviews:" + review.getNumGoodReviews(p));
    }
}

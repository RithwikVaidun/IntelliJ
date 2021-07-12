package ApCSA;

import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if (!productList.contains(prodReview.getName())) {
            productList.add(prodReview.getName());
        }
    }


    public int getNumGoodReviews(String prodName) {
        int counter = 0;
        for (int i = 0; i < reviewList.size(); i++) {
            if(reviewList.get(i).getName().equals(prodName) && reviewList.get(i).getReview().toLowerCase().contains("best")) {
                counter++;
            }
        }
        return counter;
    }

    public ArrayList<ProductReview> getBestReviewsByProduct(String prodName) {
        ArrayList<ProductReview> bestRev = new ArrayList<>();
        for (int i = 0; i < reviewList.size(); i++) {
            if(reviewList.get(i).getName().equals(prodName) && reviewList.get(i).getReview().toLowerCase().contains("best")) {
                bestRev.add(reviewList.get(i));
            }
        }
        return bestRev;
    }
}
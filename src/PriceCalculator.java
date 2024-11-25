public class PriceCalculator {
    public void x(double initialPrice, double discountPercentage) {
        double discount = discountPercentage / 100;
        double discountedPrice = initialPrice - (initialPrice * discount);
        System.out.println("ფასდაკლებული ფასი: " + discountedPrice);
    }
}

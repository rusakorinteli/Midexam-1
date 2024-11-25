class DiscountedPrice extends PriceCalculator {

    public static void main(String[] args) {
        DiscountedPrice discp = new DiscountedPrice();
        System.out.print("1. ");
        discp.x(100, 5);
        System.out.print("2. ");
        discp.x(200, 10);
    }
}

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double[] doublePrices = Arrays.stream(prices).asDoubleStream().toArray();
        int dif= prices.length-discounts.length;
        if(dif>=0){
            for(int i=discounts.length-1;i>=0;i--){
                doublePrices[i+dif]=(doublePrices[i+dif]*(100-discounts[i]))/100;
            }
        }else{
            for(int i=prices.length-1;i>=0;i--){
                doublePrices[i]=(doublePrices[i]*(100-discounts[i-dif]))/100;
            }
        }

        double result=0;
        for(int i=0;i<doublePrices.length;i++){
            result+=doublePrices[i];
        }

        return result;
    }
}
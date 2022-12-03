public class Gifts {
    public static void main(String[] args) {
        int b = 27984;
        int w = 1402;
        int bc = 619246;
        int wc = 615589;
        int z = 247954;

        long blackPrice = b * bc;
        long blackConversion = (long)b*z;
        long blackConvertedPrice = ((b * wc) + blackConversion);
        long whitePrice = w * wc;
        long whiteConvertedPrice = (w * bc + w * z);

        int total = 0;
        System.out.println(b * z);
        if (blackPrice < blackConvertedPrice) {
            total += blackPrice;
        } else {
            total += blackConvertedPrice;
        }

        if (whitePrice < whiteConvertedPrice) {
            total += whitePrice;
        } else {
            total += whiteConvertedPrice;
        }

        System.out.println(total);
    }
}
//
//27984 1402
//        619246 615589 247954
//        95677 39394
//        86983 311224 588538
//        68406 12718
//        532909 315341 201009
//        15242 95521
//        712721 628729 396706
//        21988 67781
//        645748 353796 333199
//        22952 80129
//        502975 175136 340236
//        38577 3120
//        541637 657823 735060
//        5943 69851
//        674453 392925 381074
//        62990 61330
//        310144 312251 93023
//        11152 43844{-truncated-}
//
//        Download to view the full testcase
//        Expected Output
//
//        Download
//        18192035842
//        20582630747
//        39331944938
//        70920116291
//        38179353700
//        25577754744
//        22947138309
//        31454478354
//        38686324390
//        18609275504

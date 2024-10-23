package gss;

import org.apache.commons.io.FilenameUtils;

public class TestExtension {

    private static String assumedFormat = ".zip";
    public static void main(String[] args) {
        String product1 = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.SAFE";
        String product11 = replaceCDSEProductsExtension(product1, assumedFormat);
        System.out.println("product11: " + product11);

        String product2 = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.SAFE.zip";
        String product22 = replaceCDSEProductsExtension(product2, assumedFormat);
        System.out.println("");
        System.out.println("product22: " + product22);

        String product3 = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.zip";
        String product33 = replaceCDSEProductsExtension(product3, assumedFormat);
        System.out.println("");
        System.out.println("product33: " + product33);

        String product4 = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751";
        String product44 = replaceCDSEProductsExtension(product4, assumedFormat);
        System.out.println("");
        System.out.println("product44: " + product44);

        String product5 = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751";
        assumedFormat = "";
        String product55 = replaceCDSEProductsExtension(product5, assumedFormat);
        System.out.println("");
        System.out.println("product55: " + product55);

    }

    public static String replaceCDSEProductsExtension(String productName, String assumedFormat)
    {
        if ((!FilenameUtils.getExtension(productName).isEmpty()))
        {
            // In case of products with double extension
            String[] split = productName.split("\\.", 2);
            productName = split[0] + assumedFormat;
            return productName;
        }
        return productName + assumedFormat;
    }

}

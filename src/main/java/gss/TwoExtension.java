package gss;

import java.io.File;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
public class TwoExtension
{
   static String assumedFormat = ".zip";

   public static void main(String[] args)
   {
      //      String productSafe = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.SAFE";

      //SAFE
      //      int lastDot = productSafe.lastIndexOf(".");
      //
      //      String extension = productSafe.substring(lastDot + 1);
      //      System.out.println("extension: " + extension);
      //
      //      String replaceExtension = productSafe.replace("." + extension, ".zip");
      //      System.out.println("replaceExtension: " + replaceExtension);
      //
      //      //SEN3
      //      System.out.println("");
      //      System.out.println("SEN-3");
      //      String productSen3 =
      //            "S3A_OL_1_EFR____20160426T183407_20160426T183502_20180205T153047_0055_003_255_3960_LR2_R_NT_002.SEN3";
      //      int lastDotSen3 = productSen3.lastIndexOf(".");
      //
      //      String extensionSen3 = productSen3.substring(lastDotSen3 + 1);
      //      System.out.println("extensionSen3: " + extensionSen3);
      //
      //      String replaceExtensionSen3 = productSen3.replace("." + extensionSen3, ".zip");
      //      System.out.println("replaceExtensionSen3: " + replaceExtensionSen3);
      //
      //      System.out.println("");
      //      System.out.println("EOF");
      //      String productEof = "S3A_REP1_AUX_POEORB_POD__20161216T083833_V20160226T215943_20160227T235943_DGNS.EOF";
      //      int lastDotEom = productEof.lastIndexOf(".");
      //
      //      String extensionEof = productEof.substring(productEof.lastIndexOf(".") + 1);
      //      System.out.println("extensionEof: " + extensionEof);
      //
      //      String replaceExtensionEof = productEof.replace("." + extensionEof, ".zip");
      //      System.out.println("replaceExtensionEof: " + replaceExtensionEof);

      //METHOD
      System.out.println();

      String result = null;

      String productName = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.SAFE";
      String productEof = "S3A_REP1_AUX_POEORB_POD__20161216T083833_V20160226T215943_20160227T235943_DGNS.EOF";
      String productSen3 = "S3A_OL_1_EFR____20160426T183407_20160426T183502_20180205T153047_0055_003_255_3960_LR2_R_NT_002.SEN3";
      String productDoubleExtension = "S2A_MSIL2A_20190714T230541_N0500_R044_T03WWT_20230528T162751.SAFE.zip";

      // ASSUMED FORMAT
      if (assumedFormat != null || !assumedFormat.isEmpty())
      {
         result = getAndReplaceExtension(productDoubleExtension, assumedFormat);

//         productName = result + assumedFormat.toLowerCase();
         //         System.out.println("productName: " + productName);
      }

      System.out.println("RESULT: " + result);

   }

   public static String getAndReplaceExtension(String filename, String assumedFormat)
   {
      // FILE NAME HAS AN EXTENSION
      if ((!FilenameUtils.getExtension(filename).isEmpty()))
      {
         // FILE NAME
         //         System.out.println("filename: " + filename);

         // EXTRACTING EXTENSION
         //         String extension = filename.substring(filename.lastIndexOf("."));
         //         System.out.println("extension: " + extension);

         // REPLACE EXTENSION
         //         if (!extension.isEmpty() && extension != null)
         //         {
         //            extension = extension.replace(extension, assumedFormat);
         //            System.out.println("replaceExtension: " + extension);
         //
         //            extension.lastIndexOf((".") + extension);

         // DOES IT HAVE A DOUBLE EXTENSION
//         if (hasDoubleExtension(filename))
//         {
//            System.out.println("");
//            System.out.println("DOUBLE extension: " + filename);
//         }

         StringBuffer sb = new StringBuffer();
         StringBuilder s = new StringBuilder();
         String[] split = filename.split("\\.", 2);
         System.out.println("split[0]: " + split[0]);
         System.out.println("split[1]: " + split[1]);

         sb.append(split[0]);
         sb.append(assumedFormat);

         System.out.println("sb: " + sb);

         return sb.toString();
         //         }
      }
      else
      {
         return filename + assumedFormat;
      }

      //      return filename.substring(filename.lastIndexOf("."));
      //      return null;
   }

   //   public String getExtension(String filename) {
   //      return Files.getFileExtension(filename);
   //   }

   // DETECT A DOUBLE EXTENSION
   public static boolean hasDoubleExtension(String fileName) {
      // Check if the file name contains two or more consecutive periods
      for (int i = 0; i < fileName.length() - 1; i++) {
         if (fileName.charAt(i) == '.' && fileName.charAt(i + 1) == '.') {
            return true;
         }
      }
      return false;
   }

}

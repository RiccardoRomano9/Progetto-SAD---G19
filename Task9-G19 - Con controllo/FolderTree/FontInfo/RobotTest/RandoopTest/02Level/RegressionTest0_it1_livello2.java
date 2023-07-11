
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_ITALIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isItalic"+ "'", str0.equals("isItalic"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.lang.String str0 = FontInfo.IPropertyNames.FAMILY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "family"+ "'", str0.equals("family"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    int i17 = fontInfo4.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 12);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_BOLD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isBold"+ "'", str0.equals("isBold"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.lang.String str0 = FontInfo.IPropertyNames.SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "size"+ "'", str0.equals("size"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo4.doesFontMatch(font7);
    FontInfo fontInfo11 = new FontInfo(font7);
    fontInfo11.setIsItalic(true);
    java.lang.String str14 = fontInfo11.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    java.lang.String str5 = fontInfo4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 12"+ "'", str5.equals("Monospaced, 12"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    int i2 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    int i5 = fontInfo4.generateStyle();
    java.lang.String str6 = fontInfo4.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    FontInfo fontInfo17 = new FontInfo();
    java.awt.Font font18 = fontInfo17.createFont();
    FontInfo fontInfo19 = new FontInfo();
    FontInfo fontInfo20 = new FontInfo();
    java.awt.Font font21 = fontInfo20.createFont();
    boolean b22 = fontInfo19.doesFontMatch(font21);
    FontInfo fontInfo23 = new FontInfo(font21);
    FontInfo fontInfo24 = new FontInfo();
    FontInfo fontInfo25 = new FontInfo();
    java.awt.Font font26 = fontInfo25.createFont();
    boolean b27 = fontInfo24.doesFontMatch(font26);
    FontInfo fontInfo28 = new FontInfo(font26);
    FontInfo fontInfo29 = new FontInfo();
    FontInfo fontInfo30 = new FontInfo();
    java.awt.Font font31 = fontInfo30.createFont();
    boolean b32 = fontInfo29.doesFontMatch(font31);
    FontInfo fontInfo33 = new FontInfo(font31);
    boolean b34 = fontInfo28.doesFontMatch(font31);
    fontInfo23.setFont(font31);
    boolean b36 = fontInfo17.doesFontMatch(font31);
    fontInfo4.setFont(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    fontInfo4.setFamily("Monospaced");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    boolean b2 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    java.awt.Font font17 = fontInfo4.createFont();
    fontInfo4.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo4.doesFontMatch(font7);
    fontInfo4.setFamily("isBold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    FontInfo fontInfo17 = new FontInfo();
    FontInfo fontInfo18 = new FontInfo();
    java.awt.Font font19 = fontInfo18.createFont();
    boolean b20 = fontInfo17.doesFontMatch(font19);
    java.awt.Font font21 = fontInfo17.createFont();
    FontInfo fontInfo22 = new FontInfo(font21);
    boolean b23 = fontInfo4.doesFontMatch(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo();
    FontInfo fontInfo3 = new FontInfo();
    java.awt.Font font4 = fontInfo3.createFont();
    boolean b5 = fontInfo2.doesFontMatch(font4);
    fontInfo2.setIsBold(false);
    boolean b8 = fontInfo0.equals((java.lang.Object)fontInfo2);
    fontInfo2.setSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.Object obj6 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    java.lang.Object obj5 = fontInfo0.clone();
    java.awt.Font font6 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo();
    FontInfo fontInfo3 = new FontInfo();
    java.awt.Font font4 = fontInfo3.createFont();
    boolean b5 = fontInfo2.doesFontMatch(font4);
    fontInfo2.setIsBold(false);
    boolean b8 = fontInfo0.equals((java.lang.Object)fontInfo2);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    java.awt.Font font17 = fontInfo4.createFont();
    boolean b18 = fontInfo4.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo();
    FontInfo fontInfo3 = new FontInfo();
    java.awt.Font font4 = fontInfo3.createFont();
    boolean b5 = fontInfo2.doesFontMatch(font4);
    fontInfo2.setIsBold(false);
    boolean b8 = fontInfo0.equals((java.lang.Object)fontInfo2);
    fontInfo0.setFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo();
    FontInfo fontInfo3 = new FontInfo();
    java.awt.Font font4 = fontInfo3.createFont();
    boolean b5 = fontInfo2.doesFontMatch(font4);
    FontInfo fontInfo6 = new FontInfo(font4);
    FontInfo fontInfo7 = new FontInfo();
    FontInfo fontInfo8 = new FontInfo();
    java.awt.Font font9 = fontInfo8.createFont();
    boolean b10 = fontInfo7.doesFontMatch(font9);
    FontInfo fontInfo11 = new FontInfo(font9);
    FontInfo fontInfo12 = new FontInfo();
    FontInfo fontInfo13 = new FontInfo();
    java.awt.Font font14 = fontInfo13.createFont();
    boolean b15 = fontInfo12.doesFontMatch(font14);
    FontInfo fontInfo16 = new FontInfo(font14);
    boolean b17 = fontInfo11.doesFontMatch(font14);
    fontInfo6.setFont(font14);
    boolean b19 = fontInfo0.doesFontMatch(font14);
    fontInfo0.setFamily("size");
    java.lang.String str22 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "size"+ "'", str22.equals("size"));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo(font4);
    FontInfo fontInfo6 = new FontInfo(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    FontInfo fontInfo17 = new FontInfo();
    java.awt.Font font18 = fontInfo17.createFont();
    FontInfo fontInfo19 = new FontInfo(font18);
    java.awt.Font font20 = fontInfo19.createFont();
    fontInfo4.setFont(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    fontInfo0.setSize(12);
    FontInfo fontInfo6 = new FontInfo();
    FontInfo fontInfo7 = new FontInfo();
    java.awt.Font font8 = fontInfo7.createFont();
    boolean b9 = fontInfo6.doesFontMatch(font8);
    java.awt.Font font10 = fontInfo6.createFont();
    FontInfo fontInfo11 = new FontInfo();
    FontInfo fontInfo12 = new FontInfo();
    java.awt.Font font13 = fontInfo12.createFont();
    boolean b14 = fontInfo11.doesFontMatch(font13);
    FontInfo fontInfo15 = new FontInfo(font13);
    boolean b16 = fontInfo6.doesFontMatch(font13);
    boolean b17 = fontInfo0.equals((java.lang.Object)b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    FontInfo fontInfo16 = new FontInfo(font12);
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo(font4);
    java.awt.Font font6 = null;
    boolean b7 = fontInfo5.doesFontMatch(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo(font1);
    java.awt.Font font3 = fontInfo2.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    FontInfo fontInfo5 = new FontInfo(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    java.lang.String str7 = fontInfo6.getFamily();
    java.lang.String str8 = fontInfo6.getFamily();
    boolean b9 = fontInfo6.isBold();
    java.awt.Font font10 = fontInfo6.createFont();
    boolean b11 = fontInfo0.doesFontMatch(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    fontInfo0.setIsBold(false);
    boolean b7 = fontInfo0.equals((java.lang.Object)0L);
    java.awt.Font font8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("Monospaced, 12");
    java.lang.String str6 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12, 12"+ "'", str6.equals("Monospaced, 12, 12"));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo0.doesFontMatch(font7);
    FontInfo fontInfo11 = new FontInfo(font7);
    FontInfo fontInfo12 = new FontInfo();
    java.awt.Font font13 = fontInfo12.createFont();
    FontInfo fontInfo14 = new FontInfo(font13);
    java.awt.Font font15 = fontInfo14.createFont();
    boolean b16 = fontInfo11.equals((java.lang.Object)font15);
    java.lang.Object obj17 = fontInfo11.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo();
    FontInfo fontInfo3 = new FontInfo();
    java.awt.Font font4 = fontInfo3.createFont();
    boolean b5 = fontInfo2.doesFontMatch(font4);
    fontInfo2.setIsBold(false);
    boolean b8 = fontInfo0.equals((java.lang.Object)fontInfo2);
    java.lang.String str9 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setSize(12);
    java.awt.Font font7 = fontInfo0.createFont();
    fontInfo0.setSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo(font1);
    java.awt.Font font3 = fontInfo2.createFont();
    int i4 = fontInfo2.getSize();
    boolean b5 = fontInfo2.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isItalic();
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    java.lang.Object obj6 = fontInfo0.clone();
    fontInfo0.setIsBold(true);
    FontInfo fontInfo9 = new FontInfo();
    FontInfo fontInfo10 = new FontInfo();
    java.awt.Font font11 = fontInfo10.createFont();
    boolean b12 = fontInfo9.doesFontMatch(font11);
    FontInfo fontInfo13 = new FontInfo(font11);
    FontInfo fontInfo14 = new FontInfo();
    FontInfo fontInfo15 = new FontInfo();
    java.awt.Font font16 = fontInfo15.createFont();
    boolean b17 = fontInfo14.doesFontMatch(font16);
    FontInfo fontInfo18 = new FontInfo(font16);
    boolean b19 = fontInfo13.doesFontMatch(font16);
    FontInfo fontInfo20 = new FontInfo(font16);
    fontInfo0.setFont(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    fontInfo0.setSize(12);
    FontInfo fontInfo6 = new FontInfo();
    FontInfo fontInfo7 = new FontInfo();
    java.awt.Font font8 = fontInfo7.createFont();
    boolean b9 = fontInfo6.doesFontMatch(font8);
    java.lang.Object obj10 = fontInfo6.clone();
    boolean b11 = fontInfo6.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    FontInfo fontInfo13 = new FontInfo();
    java.awt.Font font14 = fontInfo13.createFont();
    boolean b15 = fontInfo12.doesFontMatch(font14);
    java.awt.Font font16 = fontInfo12.createFont();
    FontInfo fontInfo17 = new FontInfo();
    FontInfo fontInfo18 = new FontInfo();
    java.awt.Font font19 = fontInfo18.createFont();
    boolean b20 = fontInfo17.doesFontMatch(font19);
    FontInfo fontInfo21 = new FontInfo(font19);
    boolean b22 = fontInfo12.doesFontMatch(font19);
    boolean b23 = fontInfo6.equals((java.lang.Object)font19);
    fontInfo0.setFont(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("");
    java.lang.String str8 = fontInfo0.toString();
    boolean b9 = fontInfo0.isBold();
    java.lang.Object obj10 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ", 12"+ "'", str8.equals(", 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo0.doesFontMatch(font7);
    java.lang.String str11 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    FontInfo fontInfo2 = new FontInfo(font1);
    java.awt.Font font3 = fontInfo2.createFont();
    fontInfo2.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    FontInfo fontInfo5 = new FontInfo();
    java.awt.Font font6 = fontInfo5.createFont();
    java.awt.Font font7 = fontInfo5.createFont();
    boolean b8 = fontInfo0.doesFontMatch(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    fontInfo0.setFamily("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo(font4);
    boolean b7 = fontInfo5.equals((java.lang.Object)(short)0);
    int i8 = fontInfo5.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    FontInfo fontInfo14 = new FontInfo(font12);
    boolean b15 = fontInfo9.doesFontMatch(font12);
    fontInfo4.setFont(font12);
    FontInfo fontInfo17 = new FontInfo(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo(font4);
    boolean b6 = fontInfo5.isItalic();
    java.awt.Font font7 = fontInfo5.createFont();
    java.lang.String str8 = fontInfo5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    FontInfo fontInfo0 = new FontInfo();
    java.awt.Font font1 = fontInfo0.createFont();
    fontInfo0.setFamily("Monospaced");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(false);
    java.lang.String str10 = fontInfo0.getFamily();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family"+ "'", str10.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo0.doesFontMatch(font7);
    FontInfo fontInfo11 = new FontInfo(font7);
    FontInfo fontInfo12 = new FontInfo();
    java.awt.Font font13 = fontInfo12.createFont();
    FontInfo fontInfo14 = new FontInfo(font13);
    java.awt.Font font15 = fontInfo14.createFont();
    boolean b16 = fontInfo11.equals((java.lang.Object)font15);
    java.lang.String str17 = fontInfo11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced, 12"+ "'", str17.equals("Monospaced, 12"));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    FontInfo fontInfo4 = new FontInfo(font2);
    FontInfo fontInfo5 = new FontInfo();
    FontInfo fontInfo6 = new FontInfo();
    java.awt.Font font7 = fontInfo6.createFont();
    boolean b8 = fontInfo5.doesFontMatch(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    boolean b10 = fontInfo4.doesFontMatch(font7);
    FontInfo fontInfo11 = new FontInfo(font7);
    fontInfo11.setIsItalic(true);
    int i14 = fontInfo11.getSize();
    fontInfo11.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.awt.Font font4 = fontInfo0.createFont();
    FontInfo fontInfo5 = new FontInfo(font4);
    boolean b7 = fontInfo5.equals((java.lang.Object)(short)0);
    boolean b8 = fontInfo5.isItalic();
    fontInfo5.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(false);
    java.awt.Font font10 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isItalic();
    int i6 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    FontInfo fontInfo0 = new FontInfo();
    FontInfo fontInfo1 = new FontInfo();
    java.awt.Font font2 = fontInfo1.createFont();
    boolean b3 = fontInfo0.doesFontMatch(font2);
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    java.lang.Object obj6 = fontInfo0.clone();
    fontInfo0.setIsBold(true);
    int i9 = fontInfo0.getSize();
    FontInfo fontInfo10 = new FontInfo();
    FontInfo fontInfo11 = new FontInfo();
    java.awt.Font font12 = fontInfo11.createFont();
    boolean b13 = fontInfo10.doesFontMatch(font12);
    java.awt.Font font14 = fontInfo10.createFont();
    FontInfo fontInfo15 = new FontInfo();
    FontInfo fontInfo16 = new FontInfo();
    java.awt.Font font17 = fontInfo16.createFont();
    boolean b18 = fontInfo15.doesFontMatch(font17);
    FontInfo fontInfo19 = new FontInfo(font17);
    boolean b20 = fontInfo10.doesFontMatch(font17);
    FontInfo fontInfo21 = new FontInfo(font17);
    FontInfo fontInfo22 = new FontInfo();
    java.awt.Font font23 = fontInfo22.createFont();
    FontInfo fontInfo24 = new FontInfo(font23);
    java.awt.Font font25 = fontInfo24.createFont();
    boolean b26 = fontInfo21.equals((java.lang.Object)font25);
    boolean b27 = fontInfo0.doesFontMatch(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

}

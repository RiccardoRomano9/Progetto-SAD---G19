
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.lang.String str0 = FontInfo.IPropertyNames.FAMILY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "family"+ "'", str0.equals("family"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.awt.Font font0 = null;
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo1 = new FontInfo(font0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_BOLD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isBold"+ "'", str0.equals("isBold"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_ITALIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isItalic"+ "'", str0.equals("isItalic"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.lang.String str0 = FontInfo.IPropertyNames.SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "size"+ "'", str0.equals("size"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.toString();
    java.lang.Object obj11 = fontInfo0.clone();
    java.lang.String str12 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12"+ "'", str10.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    boolean b3 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("");
    java.lang.Object obj16 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.getFamily();
    java.awt.Font font11 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.toString();
    java.lang.Object obj11 = fontInfo0.clone();
    boolean b12 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12"+ "'", str10.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setFamily("");
    java.lang.String str8 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    int i5 = fontInfo4.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setSize((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.lang.String str2 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("");
    fontInfo0.setSize(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("isItalic");
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isItalic();
    boolean b18 = fontInfo16.isItalic();
    fontInfo16.setIsItalic(false);
    FontInfo fontInfo21 = new FontInfo();
    boolean b22 = fontInfo21.isItalic();
    boolean b23 = fontInfo21.isItalic();
    java.awt.Font font24 = fontInfo21.createFont();
    boolean b25 = fontInfo16.doesFontMatch(font24);
    fontInfo16.setIsItalic(true);
    java.lang.Object obj28 = fontInfo16.clone();
    FontInfo fontInfo29 = new FontInfo();
    boolean b30 = fontInfo29.isItalic();
    boolean b31 = fontInfo29.isItalic();
    fontInfo29.setIsItalic(false);
    FontInfo fontInfo34 = new FontInfo();
    boolean b35 = fontInfo34.isItalic();
    boolean b36 = fontInfo34.isItalic();
    java.awt.Font font37 = fontInfo34.createFont();
    boolean b38 = fontInfo29.doesFontMatch(font37);
    fontInfo29.setIsItalic(true);
    FontInfo fontInfo41 = new FontInfo();
    boolean b42 = fontInfo41.isItalic();
    boolean b43 = fontInfo41.isItalic();
    fontInfo41.setIsItalic(false);
    FontInfo fontInfo46 = new FontInfo();
    boolean b47 = fontInfo46.isItalic();
    boolean b48 = fontInfo46.isItalic();
    java.awt.Font font49 = fontInfo46.createFont();
    boolean b50 = fontInfo41.doesFontMatch(font49);
    boolean b51 = fontInfo29.doesFontMatch(font49);
    fontInfo16.setFont(font49);
    fontInfo0.setFont(font49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    FontInfo fontInfo2 = new FontInfo();
    boolean b3 = fontInfo2.isItalic();
    boolean b4 = fontInfo2.isItalic();
    java.awt.Font font5 = fontInfo2.createFont();
    FontInfo fontInfo6 = new FontInfo(font5);
    fontInfo6.setSize(100);
    java.awt.Font font9 = fontInfo6.createFont();
    fontInfo6.setFamily("size");
    java.lang.Object obj12 = fontInfo6.clone();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isItalic();
    boolean b15 = fontInfo13.isItalic();
    fontInfo13.setIsItalic(false);
    java.awt.Font font18 = fontInfo13.createFont();
    boolean b19 = fontInfo6.doesFontMatch(font18);
    boolean b20 = fontInfo0.doesFontMatch(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isItalic();
    boolean b14 = fontInfo12.isItalic();
    fontInfo12.setIsItalic(false);
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isItalic();
    boolean b19 = fontInfo17.isItalic();
    java.awt.Font font20 = fontInfo17.createFont();
    boolean b21 = fontInfo12.doesFontMatch(font20);
    boolean b22 = fontInfo0.doesFontMatch(font20);
    int i23 = fontInfo0.generateStyle();
    java.lang.String str24 = fontInfo0.getFamily();
    java.lang.Object obj25 = fontInfo0.clone();
    boolean b26 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    java.awt.Font font8 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj12 = fontInfo0.clone();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isItalic();
    boolean b15 = fontInfo13.isItalic();
    fontInfo13.setIsItalic(false);
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isItalic();
    boolean b20 = fontInfo18.isItalic();
    java.awt.Font font21 = fontInfo18.createFont();
    boolean b22 = fontInfo13.doesFontMatch(font21);
    fontInfo13.setIsItalic(true);
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isItalic();
    boolean b27 = fontInfo25.isItalic();
    fontInfo25.setIsItalic(false);
    FontInfo fontInfo30 = new FontInfo();
    boolean b31 = fontInfo30.isItalic();
    boolean b32 = fontInfo30.isItalic();
    java.awt.Font font33 = fontInfo30.createFont();
    boolean b34 = fontInfo25.doesFontMatch(font33);
    boolean b35 = fontInfo13.doesFontMatch(font33);
    fontInfo0.setFont(font33);
    FontInfo fontInfo37 = new FontInfo(font33);
    int i38 = fontInfo37.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    fontInfo4.setSize(100);
    java.awt.Font font7 = fontInfo4.createFont();
    FontInfo fontInfo8 = new FontInfo(font7);
    FontInfo fontInfo9 = new FontInfo(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.String str5 = fontInfo0.toString();
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 12"+ "'", str5.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    java.lang.String str4 = fontInfo0.getFamily();
    java.lang.String str5 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.toString();
    java.lang.Object obj11 = fontInfo0.clone();
    java.lang.String str12 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12"+ "'", str10.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 12"+ "'", str12.equals("Monospaced, 12"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isItalic();
    boolean b14 = fontInfo12.isItalic();
    fontInfo12.setIsItalic(false);
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isItalic();
    boolean b19 = fontInfo17.isItalic();
    java.awt.Font font20 = fontInfo17.createFont();
    boolean b21 = fontInfo12.doesFontMatch(font20);
    boolean b22 = fontInfo0.doesFontMatch(font20);
    int i23 = fontInfo0.generateStyle();
    java.lang.String str24 = fontInfo0.getFamily();
    java.lang.Object obj25 = fontInfo0.clone();
    boolean b26 = fontInfo0.isBold();
    java.lang.String str27 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Monospaced, 12, italic"+ "'", str27.equals("Monospaced, 12, italic"));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("");
    java.awt.Font font16 = fontInfo0.createFont();
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isItalic();
    boolean b19 = fontInfo17.isItalic();
    fontInfo17.setIsItalic(false);
    java.awt.Font font22 = fontInfo17.createFont();
    fontInfo0.setFont(font22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(byte)10);
    fontInfo0.setFamily("hi!");
    fontInfo0.setSize((int)(byte)100);
    int i7 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    boolean b4 = fontInfo0.isBold();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    boolean b5 = fontInfo0.isItalic();
    java.awt.Font font6 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj12 = fontInfo0.clone();
    int i13 = fontInfo0.generateStyle();
    boolean b14 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.toString();
    java.lang.Object obj11 = fontInfo0.clone();
    boolean b12 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12"+ "'", str10.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo();
    boolean b5 = fontInfo4.isItalic();
    boolean b6 = fontInfo4.isItalic();
    fontInfo4.setIsItalic(false);
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isItalic();
    boolean b11 = fontInfo9.isItalic();
    java.awt.Font font12 = fontInfo9.createFont();
    boolean b13 = fontInfo4.doesFontMatch(font12);
    fontInfo4.setIsItalic(true);
    boolean b17 = fontInfo4.equals((java.lang.Object)100.0d);
    fontInfo4.setFamily("isItalic");
    boolean b20 = fontInfo4.isBold();
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo4);
    fontInfo0.setSize((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    fontInfo4.setSize(100);
    int i7 = fontInfo4.getSize();
    fontInfo4.setSize((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.lang.String str3 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced, 12"+ "'", str3.equals("Monospaced, 12"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.getFamily();
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    fontInfo4.setSize(100);
    java.awt.Font font7 = fontInfo4.createFont();
    FontInfo fontInfo8 = new FontInfo(font7);
    fontInfo8.setFamily("");
    int i11 = fontInfo8.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("");
    java.awt.Font font16 = fontInfo0.createFont();
    FontInfo fontInfo17 = new FontInfo(font16);
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isItalic();
    boolean b20 = fontInfo18.isItalic();
    fontInfo18.setIsItalic(false);
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isItalic();
    boolean b25 = fontInfo23.isItalic();
    java.awt.Font font26 = fontInfo23.createFont();
    boolean b27 = fontInfo18.doesFontMatch(font26);
    fontInfo18.setIsItalic(true);
    java.lang.Object obj30 = fontInfo18.clone();
    FontInfo fontInfo31 = new FontInfo();
    boolean b32 = fontInfo31.isItalic();
    boolean b33 = fontInfo31.isItalic();
    fontInfo31.setIsItalic(false);
    FontInfo fontInfo36 = new FontInfo();
    boolean b37 = fontInfo36.isItalic();
    boolean b38 = fontInfo36.isItalic();
    java.awt.Font font39 = fontInfo36.createFont();
    boolean b40 = fontInfo31.doesFontMatch(font39);
    fontInfo31.setIsItalic(true);
    FontInfo fontInfo43 = new FontInfo();
    boolean b44 = fontInfo43.isItalic();
    boolean b45 = fontInfo43.isItalic();
    fontInfo43.setIsItalic(false);
    FontInfo fontInfo48 = new FontInfo();
    boolean b49 = fontInfo48.isItalic();
    boolean b50 = fontInfo48.isItalic();
    java.awt.Font font51 = fontInfo48.createFont();
    boolean b52 = fontInfo43.doesFontMatch(font51);
    boolean b53 = fontInfo31.doesFontMatch(font51);
    fontInfo18.setFont(font51);
    FontInfo fontInfo55 = new FontInfo(font51);
    fontInfo17.setFont(font51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.String str10 = fontInfo0.toString();
    java.lang.Object obj11 = fontInfo0.clone();
    int i12 = fontInfo0.generateStyle();
    java.awt.Font font13 = fontInfo0.createFont();
    FontInfo fontInfo14 = new FontInfo(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12"+ "'", str10.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("family");
    java.lang.Object obj10 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("family");
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isItalic();
    boolean b12 = fontInfo10.isItalic();
    fontInfo10.setIsItalic(false);
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isItalic();
    boolean b17 = fontInfo15.isItalic();
    java.awt.Font font18 = fontInfo15.createFont();
    boolean b19 = fontInfo10.doesFontMatch(font18);
    fontInfo10.setIsItalic(true);
    java.lang.Object obj22 = fontInfo10.clone();
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isItalic();
    boolean b25 = fontInfo23.isItalic();
    fontInfo23.setIsItalic(false);
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isItalic();
    boolean b30 = fontInfo28.isItalic();
    java.awt.Font font31 = fontInfo28.createFont();
    boolean b32 = fontInfo23.doesFontMatch(font31);
    fontInfo23.setIsItalic(true);
    FontInfo fontInfo35 = new FontInfo();
    boolean b36 = fontInfo35.isItalic();
    boolean b37 = fontInfo35.isItalic();
    fontInfo35.setIsItalic(false);
    FontInfo fontInfo40 = new FontInfo();
    boolean b41 = fontInfo40.isItalic();
    boolean b42 = fontInfo40.isItalic();
    java.awt.Font font43 = fontInfo40.createFont();
    boolean b44 = fontInfo35.doesFontMatch(font43);
    boolean b45 = fontInfo23.doesFontMatch(font43);
    fontInfo10.setFont(font43);
    FontInfo fontInfo47 = new FontInfo(font43);
    fontInfo0.setFont(font43);
    java.lang.String str49 = fontInfo0.getFamily();
    FontInfo fontInfo50 = new FontInfo();
    boolean b51 = fontInfo50.isItalic();
    boolean b52 = fontInfo50.isItalic();
    fontInfo50.setIsItalic(false);
    FontInfo fontInfo55 = new FontInfo();
    boolean b56 = fontInfo55.isItalic();
    boolean b57 = fontInfo55.isItalic();
    java.awt.Font font58 = fontInfo55.createFont();
    boolean b59 = fontInfo50.doesFontMatch(font58);
    fontInfo50.setIsItalic(true);
    boolean b63 = fontInfo50.equals((java.lang.Object)100.0d);
    fontInfo50.setFamily("");
    java.awt.Font font66 = fontInfo50.createFont();
    FontInfo fontInfo67 = new FontInfo(font66);
    fontInfo0.setFont(font66);
    java.lang.String str69 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Monospaced"+ "'", str49.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Dialog"+ "'", str69.equals("Dialog"));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setFamily("");
    boolean b8 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    int i5 = fontInfo4.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo(font3);
    fontInfo4.setSize(100);
    java.awt.Font font7 = fontInfo4.createFont();
    fontInfo4.setFamily("size");
    java.lang.Object obj10 = fontInfo4.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isItalic();
    boolean b13 = fontInfo11.isItalic();
    fontInfo11.setIsItalic(false);
    java.awt.Font font16 = fontInfo11.createFont();
    boolean b17 = fontInfo4.doesFontMatch(font16);
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isItalic();
    boolean b20 = fontInfo18.isItalic();
    java.awt.Font font21 = fontInfo18.createFont();
    int i22 = fontInfo18.getSize();
    java.lang.Object obj23 = fontInfo18.clone();
    fontInfo18.setSize((int)(byte)0);
    java.awt.Font font26 = fontInfo18.createFont();
    fontInfo4.setFont(font26);
    java.awt.Font font28 = fontInfo4.createFont();
    int i29 = fontInfo4.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setIsItalic(false);
    java.lang.String str16 = fontInfo0.getFamily();
    java.lang.String str17 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced"+ "'", str17.equals("Monospaced"));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setFamily("size");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    boolean b5 = fontInfo0.isItalic();
    java.lang.Object obj6 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    FontInfo fontInfo2 = new FontInfo();
    boolean b4 = fontInfo2.equals((java.lang.Object)(byte)10);
    fontInfo2.setFamily("hi!");
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isItalic();
    boolean b9 = fontInfo7.isItalic();
    fontInfo7.setIsItalic(false);
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isItalic();
    boolean b14 = fontInfo12.isItalic();
    java.awt.Font font15 = fontInfo12.createFont();
    boolean b16 = fontInfo7.doesFontMatch(font15);
    fontInfo7.setIsItalic(true);
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isItalic();
    boolean b21 = fontInfo19.isItalic();
    fontInfo19.setIsItalic(false);
    FontInfo fontInfo24 = new FontInfo();
    boolean b25 = fontInfo24.isItalic();
    boolean b26 = fontInfo24.isItalic();
    java.awt.Font font27 = fontInfo24.createFont();
    boolean b28 = fontInfo19.doesFontMatch(font27);
    fontInfo19.setIsItalic(true);
    java.lang.Object obj31 = fontInfo19.clone();
    int i32 = fontInfo19.generateStyle();
    boolean b33 = fontInfo7.equals((java.lang.Object)fontInfo19);
    FontInfo fontInfo34 = new FontInfo();
    boolean b35 = fontInfo34.isItalic();
    boolean b36 = fontInfo34.isItalic();
    fontInfo34.setIsItalic(false);
    FontInfo fontInfo39 = new FontInfo();
    boolean b40 = fontInfo39.isItalic();
    boolean b41 = fontInfo39.isItalic();
    java.awt.Font font42 = fontInfo39.createFont();
    boolean b43 = fontInfo34.doesFontMatch(font42);
    fontInfo34.setIsItalic(true);
    boolean b47 = fontInfo34.equals((java.lang.Object)100.0d);
    fontInfo34.setFamily("");
    java.awt.Font font50 = fontInfo34.createFont();
    FontInfo fontInfo51 = new FontInfo(font50);
    boolean b52 = fontInfo7.equals((java.lang.Object)font50);
    boolean b53 = fontInfo2.doesFontMatch(font50);
    boolean b54 = fontInfo0.doesFontMatch(font50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    FontInfo fontInfo2 = new FontInfo();
    boolean b3 = fontInfo2.isItalic();
    boolean b4 = fontInfo2.isItalic();
    fontInfo2.setIsItalic(false);
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isItalic();
    boolean b9 = fontInfo7.isItalic();
    java.awt.Font font10 = fontInfo7.createFont();
    boolean b11 = fontInfo2.doesFontMatch(font10);
    fontInfo2.setIsItalic(true);
    java.lang.Object obj14 = fontInfo2.clone();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isItalic();
    boolean b17 = fontInfo15.isItalic();
    fontInfo15.setIsItalic(false);
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isItalic();
    boolean b22 = fontInfo20.isItalic();
    java.awt.Font font23 = fontInfo20.createFont();
    boolean b24 = fontInfo15.doesFontMatch(font23);
    fontInfo15.setIsItalic(true);
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isItalic();
    boolean b29 = fontInfo27.isItalic();
    fontInfo27.setIsItalic(false);
    FontInfo fontInfo32 = new FontInfo();
    boolean b33 = fontInfo32.isItalic();
    boolean b34 = fontInfo32.isItalic();
    java.awt.Font font35 = fontInfo32.createFont();
    boolean b36 = fontInfo27.doesFontMatch(font35);
    boolean b37 = fontInfo15.doesFontMatch(font35);
    fontInfo2.setFont(font35);
    fontInfo0.setFont(font35);
    java.awt.Font font40 = null;
    boolean b41 = fontInfo0.doesFontMatch(font40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    java.lang.String str4 = fontInfo0.toString();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    int i9 = fontInfo5.getSize();
    boolean b10 = fontInfo0.equals((java.lang.Object)fontInfo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    fontInfo5.setSize((int)(byte)0);
    fontInfo5.setFamily("Monospaced");
    fontInfo5.setFamily("");
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isItalic();
    boolean b15 = fontInfo13.isItalic();
    fontInfo13.setIsItalic(false);
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isItalic();
    boolean b20 = fontInfo18.isItalic();
    java.awt.Font font21 = fontInfo18.createFont();
    boolean b22 = fontInfo13.doesFontMatch(font21);
    fontInfo13.setIsItalic(true);
    boolean b26 = fontInfo13.equals((java.lang.Object)100.0d);
    fontInfo13.setFamily("");
    java.awt.Font font29 = fontInfo13.createFont();
    fontInfo5.setFont(font29);
    boolean b31 = fontInfo0.doesFontMatch(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj12 = fontInfo0.clone();
    int i13 = fontInfo0.generateStyle();
    java.lang.Object obj14 = fontInfo0.clone();
    boolean b15 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setFamily("isItalic");
    fontInfo0.setFamily("Dialog");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(byte)10);
    fontInfo0.setFamily("hi!");
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    int i9 = fontInfo5.getSize();
    java.lang.Object obj10 = fontInfo5.clone();
    fontInfo5.setIsItalic(false);
    fontInfo5.setFamily("family");
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isItalic();
    boolean b17 = fontInfo15.isItalic();
    fontInfo15.setIsItalic(false);
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isItalic();
    boolean b22 = fontInfo20.isItalic();
    java.awt.Font font23 = fontInfo20.createFont();
    boolean b24 = fontInfo15.doesFontMatch(font23);
    fontInfo15.setIsItalic(true);
    java.lang.Object obj27 = fontInfo15.clone();
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isItalic();
    boolean b30 = fontInfo28.isItalic();
    fontInfo28.setIsItalic(false);
    FontInfo fontInfo33 = new FontInfo();
    boolean b34 = fontInfo33.isItalic();
    boolean b35 = fontInfo33.isItalic();
    java.awt.Font font36 = fontInfo33.createFont();
    boolean b37 = fontInfo28.doesFontMatch(font36);
    fontInfo28.setIsItalic(true);
    FontInfo fontInfo40 = new FontInfo();
    boolean b41 = fontInfo40.isItalic();
    boolean b42 = fontInfo40.isItalic();
    fontInfo40.setIsItalic(false);
    FontInfo fontInfo45 = new FontInfo();
    boolean b46 = fontInfo45.isItalic();
    boolean b47 = fontInfo45.isItalic();
    java.awt.Font font48 = fontInfo45.createFont();
    boolean b49 = fontInfo40.doesFontMatch(font48);
    boolean b50 = fontInfo28.doesFontMatch(font48);
    fontInfo15.setFont(font48);
    FontInfo fontInfo52 = new FontInfo(font48);
    fontInfo5.setFont(font48);
    boolean b54 = fontInfo0.doesFontMatch(font48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj12 = fontInfo0.clone();
    java.lang.Object obj13 = fontInfo0.clone();
    boolean b14 = fontInfo0.isItalic();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isItalic();
    boolean b17 = fontInfo15.isItalic();
    boolean b18 = fontInfo15.isBold();
    int i19 = fontInfo15.generateStyle();
    boolean b20 = fontInfo15.isBold();
    java.lang.String str21 = fontInfo15.toString();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isItalic();
    boolean b24 = fontInfo22.isItalic();
    java.awt.Font font25 = fontInfo22.createFont();
    int i26 = fontInfo22.getSize();
    java.lang.Object obj27 = fontInfo22.clone();
    fontInfo22.setIsItalic(false);
    fontInfo22.setFamily("family");
    FontInfo fontInfo32 = new FontInfo();
    boolean b33 = fontInfo32.isItalic();
    boolean b34 = fontInfo32.isItalic();
    fontInfo32.setIsItalic(false);
    FontInfo fontInfo37 = new FontInfo();
    boolean b38 = fontInfo37.isItalic();
    boolean b39 = fontInfo37.isItalic();
    java.awt.Font font40 = fontInfo37.createFont();
    boolean b41 = fontInfo32.doesFontMatch(font40);
    fontInfo32.setIsItalic(true);
    java.lang.Object obj44 = fontInfo32.clone();
    FontInfo fontInfo45 = new FontInfo();
    boolean b46 = fontInfo45.isItalic();
    boolean b47 = fontInfo45.isItalic();
    fontInfo45.setIsItalic(false);
    FontInfo fontInfo50 = new FontInfo();
    boolean b51 = fontInfo50.isItalic();
    boolean b52 = fontInfo50.isItalic();
    java.awt.Font font53 = fontInfo50.createFont();
    boolean b54 = fontInfo45.doesFontMatch(font53);
    fontInfo45.setIsItalic(true);
    FontInfo fontInfo57 = new FontInfo();
    boolean b58 = fontInfo57.isItalic();
    boolean b59 = fontInfo57.isItalic();
    fontInfo57.setIsItalic(false);
    FontInfo fontInfo62 = new FontInfo();
    boolean b63 = fontInfo62.isItalic();
    boolean b64 = fontInfo62.isItalic();
    java.awt.Font font65 = fontInfo62.createFont();
    boolean b66 = fontInfo57.doesFontMatch(font65);
    boolean b67 = fontInfo45.doesFontMatch(font65);
    fontInfo32.setFont(font65);
    FontInfo fontInfo69 = new FontInfo(font65);
    fontInfo22.setFont(font65);
    fontInfo15.setFont(font65);
    boolean b72 = fontInfo0.doesFontMatch(font65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced, 12"+ "'", str21.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setFamily("");
    fontInfo0.setSize((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)0);
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isItalic();
    boolean b10 = fontInfo8.isItalic();
    fontInfo8.setIsItalic(false);
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isItalic();
    boolean b15 = fontInfo13.isItalic();
    java.awt.Font font16 = fontInfo13.createFont();
    boolean b17 = fontInfo8.doesFontMatch(font16);
    java.lang.String str18 = fontInfo8.toString();
    java.lang.Object obj19 = fontInfo8.clone();
    boolean b20 = fontInfo8.isItalic();
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo8);
    java.awt.Font font22 = fontInfo8.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isItalic();
    boolean b7 = fontInfo5.isItalic();
    java.awt.Font font8 = fontInfo5.createFont();
    boolean b9 = fontInfo0.doesFontMatch(font8);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj12 = fontInfo0.clone();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isItalic();
    boolean b15 = fontInfo13.isItalic();
    fontInfo13.setIsItalic(false);
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isItalic();
    boolean b20 = fontInfo18.isItalic();
    java.awt.Font font21 = fontInfo18.createFont();
    boolean b22 = fontInfo13.doesFontMatch(font21);
    fontInfo13.setIsItalic(true);
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isItalic();
    boolean b27 = fontInfo25.isItalic();
    fontInfo25.setIsItalic(false);
    FontInfo fontInfo30 = new FontInfo();
    boolean b31 = fontInfo30.isItalic();
    boolean b32 = fontInfo30.isItalic();
    java.awt.Font font33 = fontInfo30.createFont();
    boolean b34 = fontInfo25.doesFontMatch(font33);
    boolean b35 = fontInfo13.doesFontMatch(font33);
    fontInfo0.setFont(font33);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo();
    boolean b5 = fontInfo4.isItalic();
    boolean b6 = fontInfo4.isItalic();
    fontInfo4.setIsItalic(false);
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isItalic();
    boolean b11 = fontInfo9.isItalic();
    java.awt.Font font12 = fontInfo9.createFont();
    boolean b13 = fontInfo4.doesFontMatch(font12);
    fontInfo4.setIsItalic(true);
    boolean b17 = fontInfo4.equals((java.lang.Object)100.0d);
    fontInfo4.setFamily("isItalic");
    boolean b20 = fontInfo4.isBold();
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo4);
    java.lang.String str22 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(byte)10);
    fontInfo0.setFamily("hi!");
    fontInfo0.setSize((int)(byte)100);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isItalic();
    boolean b2 = fontInfo0.isItalic();
    java.awt.Font font3 = fontInfo0.createFont();
    int i4 = fontInfo0.getSize();
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("family");
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isItalic();
    boolean b12 = fontInfo10.isItalic();
    fontInfo10.setIsItalic(false);
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isItalic();
    boolean b17 = fontInfo15.isItalic();
    java.awt.Font font18 = fontInfo15.createFont();
    boolean b19 = fontInfo10.doesFontMatch(font18);
    fontInfo10.setIsItalic(true);
    java.lang.Object obj22 = fontInfo10.clone();
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isItalic();
    boolean b25 = fontInfo23.isItalic();
    fontInfo23.setIsItalic(false);
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isItalic();
    boolean b30 = fontInfo28.isItalic();
    java.awt.Font font31 = fontInfo28.createFont();
    boolean b32 = fontInfo23.doesFontMatch(font31);
    fontInfo23.setIsItalic(true);
    FontInfo fontInfo35 = new FontInfo();
    boolean b36 = fontInfo35.isItalic();
    boolean b37 = fontInfo35.isItalic();
    fontInfo35.setIsItalic(false);
    FontInfo fontInfo40 = new FontInfo();
    boolean b41 = fontInfo40.isItalic();
    boolean b42 = fontInfo40.isItalic();
    java.awt.Font font43 = fontInfo40.createFont();
    boolean b44 = fontInfo35.doesFontMatch(font43);
    boolean b45 = fontInfo23.doesFontMatch(font43);
    fontInfo10.setFont(font43);
    FontInfo fontInfo47 = new FontInfo(font43);
    fontInfo0.setFont(font43);
    java.lang.String str49 = fontInfo0.getFamily();
    java.lang.String str50 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Monospaced"+ "'", str49.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Monospaced, 12"+ "'", str50.equals("Monospaced, 12"));

  }

}

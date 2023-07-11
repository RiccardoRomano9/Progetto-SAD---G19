
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.lang.String str0 = FontInfo.IPropertyNames.SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "size"+ "'", str0.equals("size"));

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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_BOLD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isBold"+ "'", str0.equals("isBold"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    int i5 = fontInfo0.generateStyle();
    java.lang.String str6 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    java.lang.String str6 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12, bold"+ "'", str6.equals("Monospaced, 12, bold"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_ITALIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isItalic"+ "'", str0.equals("isItalic"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    FontInfo fontInfo4 = new FontInfo();
    boolean b5 = fontInfo0.equals((java.lang.Object)fontInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    boolean b5 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    int i5 = fontInfo0.generateStyle();
    java.awt.Font font6 = null;
    boolean b7 = fontInfo0.doesFontMatch(font6);
    fontInfo0.setSize((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    java.awt.Font font5 = null;
    boolean b6 = fontInfo0.doesFontMatch(font5);
    fontInfo0.setFamily("isItalic");
    boolean b9 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)' ');
    fontInfo0.setFamily("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    java.awt.Font font5 = fontInfo0.createFont();
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    java.awt.Font font5 = null;
    boolean b6 = fontInfo0.doesFontMatch(font5);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    int i6 = fontInfo0.getSize();
    boolean b7 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    int i6 = fontInfo0.generateStyle();
    FontInfo fontInfo7 = new FontInfo();
    boolean b9 = fontInfo7.equals((java.lang.Object)(short)100);
    fontInfo7.setFamily("size");
    java.awt.Font font12 = null;
    boolean b13 = fontInfo7.doesFontMatch(font12);
    fontInfo7.setFamily("isItalic");
    boolean b16 = fontInfo0.equals((java.lang.Object)fontInfo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    java.awt.Font font5 = null;
    boolean b6 = fontInfo0.doesFontMatch(font5);
    boolean b8 = fontInfo0.equals((java.lang.Object)(byte)100);
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    boolean b2 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    java.awt.Font font5 = fontInfo0.createFont();
    FontInfo fontInfo6 = new FontInfo(font5);
    java.awt.Font font7 = fontInfo6.createFont();
    fontInfo6.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)10);
    int i8 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)0);
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.isItalic();
    java.lang.String str14 = fontInfo0.toString();
    FontInfo fontInfo15 = new FontInfo();
    boolean b17 = fontInfo15.equals((java.lang.Object)(short)100);
    int i18 = fontInfo15.getSize();
    java.lang.Object obj19 = fontInfo15.clone();
    java.awt.Font font20 = fontInfo15.createFont();
    FontInfo fontInfo21 = new FontInfo(font20);
    fontInfo0.setFont(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 0, italic"+ "'", str14.equals("Monospaced, 0, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    fontInfo0.setIsItalic(false);
    boolean b7 = fontInfo0.isItalic();
    int i8 = fontInfo0.getSize();
    java.awt.Font font9 = fontInfo0.createFont();
    FontInfo fontInfo10 = new FontInfo(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    java.awt.Font font6 = null;
    boolean b7 = fontInfo0.doesFontMatch(font6);
    java.lang.Object obj8 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    FontInfo fontInfo7 = new FontInfo();
    boolean b9 = fontInfo7.equals((java.lang.Object)(short)100);
    int i10 = fontInfo7.getSize();
    java.lang.Object obj11 = fontInfo7.clone();
    java.awt.Font font12 = fontInfo7.createFont();
    FontInfo fontInfo13 = new FontInfo(font12);
    boolean b14 = fontInfo0.doesFontMatch(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)10);
    int i8 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)0);
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    fontInfo0.setSize((int)(short)0);
    int i9 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("hi!");
    FontInfo fontInfo5 = new FontInfo();
    boolean b7 = fontInfo5.equals((java.lang.Object)(short)100);
    FontInfo fontInfo8 = new FontInfo();
    boolean b10 = fontInfo8.equals((java.lang.Object)(short)100);
    int i11 = fontInfo8.getSize();
    java.lang.Object obj12 = fontInfo8.clone();
    java.awt.Font font13 = fontInfo8.createFont();
    FontInfo fontInfo14 = new FontInfo(font13);
    fontInfo5.setFont(font13);
    boolean b16 = fontInfo0.doesFontMatch(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    java.awt.Font font5 = null;
    boolean b6 = fontInfo0.doesFontMatch(font5);
    boolean b8 = fontInfo0.equals((java.lang.Object)(byte)100);
    java.lang.Object obj9 = fontInfo0.clone();
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "size"+ "'", str10.equals("size"));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    java.awt.Font font6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    java.awt.Font font6 = null;
    boolean b7 = fontInfo0.doesFontMatch(font6);
    java.lang.Object obj8 = fontInfo0.clone();
    boolean b9 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    java.lang.String str3 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    java.lang.Object obj6 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("isBold");

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)10);
    int i8 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)0);
    fontInfo0.setIsItalic(true);
    int i13 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    java.lang.String str3 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    boolean b6 = fontInfo0.isBold();
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("");

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    java.lang.String str3 = fontInfo0.getFamily();
    java.awt.Font font4 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    fontInfo0.setFamily("");
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("hi!");
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    boolean b9 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    java.awt.Font font6 = null;
    boolean b7 = fontInfo0.doesFontMatch(font6);
    int i8 = fontInfo0.generateStyle();
    fontInfo0.setSize(10);
    fontInfo0.setIsBold(false);
    java.lang.String str13 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    fontInfo0.setIsItalic(false);
    fontInfo0.setIsBold(true);
    FontInfo fontInfo9 = new FontInfo();
    boolean b11 = fontInfo9.equals((java.lang.Object)(short)100);
    boolean b13 = fontInfo9.equals((java.lang.Object)12);
    java.lang.Object obj14 = fontInfo9.clone();
    java.awt.Font font15 = null;
    boolean b16 = fontInfo9.doesFontMatch(font15);
    int i17 = fontInfo9.generateStyle();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)(byte)10);
    int i8 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)0);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    FontInfo fontInfo3 = new FontInfo();
    boolean b5 = fontInfo3.equals((java.lang.Object)(short)100);
    int i6 = fontInfo3.getSize();
    java.lang.Object obj7 = fontInfo3.clone();
    java.awt.Font font8 = fontInfo3.createFont();
    FontInfo fontInfo9 = new FontInfo(font8);
    fontInfo0.setFont(font8);
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    int i4 = fontInfo0.getSize();
    java.awt.Font font5 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    boolean b4 = fontInfo0.equals((java.lang.Object)12);
    java.lang.Object obj5 = fontInfo0.clone();
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isBold();
    int i9 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    fontInfo0.setFamily("size");
    int i5 = fontInfo0.generateStyle();
    java.awt.Font font6 = null;
    boolean b7 = fontInfo0.doesFontMatch(font6);
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo11 = new FontInfo();
    boolean b13 = fontInfo11.equals((java.lang.Object)(short)100);
    boolean b15 = fontInfo11.equals((java.lang.Object)12);
    java.lang.Object obj16 = fontInfo11.clone();
    java.lang.String str17 = fontInfo11.toString();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "size, 12"+ "'", str8.equals("size, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced, 12"+ "'", str17.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    java.lang.String str3 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    boolean b6 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b2 = fontInfo0.equals((java.lang.Object)(short)100);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    java.awt.Font font5 = fontInfo0.createFont();
    FontInfo fontInfo6 = new FontInfo(font5);
    java.awt.Font font7 = fontInfo6.createFont();
    FontInfo fontInfo8 = new FontInfo(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

}

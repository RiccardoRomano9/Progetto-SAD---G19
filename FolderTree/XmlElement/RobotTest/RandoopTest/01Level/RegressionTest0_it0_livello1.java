
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    XmlElement xmlElement1 = new XmlElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement1.removeElement((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.notifyObservers();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    XmlElement xmlElement1 = new XmlElement("");
    java.util.Observer observer2 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement1.addObserver(observer2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    XmlElement xmlElement12 = xmlElement9.addSubElement("hi!", "");
    boolean b14 = xmlElement9.equals((java.lang.Object)100L);
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = xmlElement6.addElement(xmlElement9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    java.util.Observer observer5 = null;
    xmlElement1.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    xmlElement1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    java.util.Observer observer8 = null;
    xmlElement7.deleteObserver(observer8);
    xmlElement2.append(xmlElement7);
    boolean b11 = xmlElement7.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj4 = xmlElement2.clone();
    XmlElement xmlElement6 = xmlElement2.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = xmlElement6.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.util.List list4 = xmlElement2.getElements();
    xmlElement2.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    boolean b7 = xmlElement2.equals((java.lang.Object)100L);
    java.lang.Object obj8 = xmlElement2.clone();
    java.util.Enumeration enumeration9 = xmlElement2.getAttributeNames();
    XmlElement xmlElement11 = new XmlElement("");
    XmlElement xmlElement14 = xmlElement11.addSubElement("", "");
    XmlElement xmlElement17 = xmlElement11.addSubElement("", "hi!");
    xmlElement2.notifyObservers((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    java.util.Observer observer5 = null;
    xmlElement1.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement(xmlElement6);
    java.util.List list11 = xmlElement10.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    XmlElement xmlElement11 = xmlElement8.getParent();
    xmlElement11.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    int i12 = xmlElement1.countObservers();
    xmlElement1.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "");
    XmlElement xmlElement20 = new XmlElement("");
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "");
    XmlElement xmlElement24 = xmlElement18.addSubElement(xmlElement20);
    xmlElement1.insertElement(xmlElement24, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement28 = xmlElement24.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    boolean b7 = xmlElement2.equals((java.lang.Object)100L);
    XmlElement xmlElement9 = new XmlElement("");
    XmlElement xmlElement12 = xmlElement9.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement9.getElement("hi!");
    xmlElement9.removeFromParent();
    java.util.Enumeration enumeration16 = xmlElement9.getAttributeNames();
    boolean b17 = xmlElement2.addElement(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.lang.String str6 = xmlElement2.getName();
    java.lang.String str8 = xmlElement2.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.notifyObservers((java.lang.Object)(-1.0d));
    java.lang.Object obj4 = xmlElement1.clone();
    java.lang.Object obj5 = xmlElement1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.removeAllElements();
    xmlElement1.setData("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement1.getElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.util.List list4 = xmlElement2.getElements();
    XmlElement xmlElement6 = xmlElement2.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement6.setData("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    xmlElement8.notifyObservers();
    java.util.Enumeration enumeration12 = xmlElement8.getAttributeNames();
    java.util.Observer observer13 = null;
    xmlElement8.deleteObserver(observer13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    int i5 = xmlElement1.count();
    XmlElement.printNode(xmlElement1, "");
    xmlElement1.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = new XmlElement("hi!");
    java.lang.String str6 = xmlElement4.getAttribute("hi!");
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    boolean b12 = xmlElement4.addElement(xmlElement11);
    java.lang.String str13 = xmlElement11.getData();
    xmlElement11.notifyObservers();
    java.util.Enumeration enumeration15 = xmlElement11.getAttributeNames();
    xmlElement2.append(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    boolean b16 = xmlElement6.addElement(xmlElement15);
    xmlElement1.append(xmlElement6);
    java.lang.Object obj20 = xmlElement6.addAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement5.getAttribute("hi!");
    xmlElement5.removeAllElements();
    XmlElement xmlElement9 = xmlElement1.removeElement(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement("", "hi!");
    xmlElement5.append(xmlElement8);
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement20 = xmlElement17.addSubElement("", "");
    XmlElement xmlElement23 = xmlElement17.addSubElement("", "hi!");
    XmlElement xmlElement26 = xmlElement17.addSubElement("hi!", "");
    XmlElement xmlElement27 = xmlElement5.addSubElement(xmlElement26);
    XmlElement xmlElement29 = new XmlElement("");
    XmlElement xmlElement32 = xmlElement29.addSubElement("", "");
    XmlElement xmlElement35 = new XmlElement("hi!", "");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    boolean b39 = xmlElement29.addElement(xmlElement38);
    XmlElement xmlElement41 = new XmlElement("");
    XmlElement xmlElement44 = xmlElement41.addSubElement("", "");
    XmlElement xmlElement47 = xmlElement41.addSubElement("", "hi!");
    boolean b48 = xmlElement38.addElement(xmlElement41);
    boolean b49 = xmlElement26.equals((java.lang.Object)xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    int i12 = xmlElement1.countObservers();
    xmlElement1.deleteObservers();
    xmlElement1.notifyObservers();
    xmlElement1.setData("");
    java.util.Enumeration enumeration17 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XmlElement xmlElement0 = null;
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement0, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement13 = xmlElement1.addSubElement("", "");
    java.lang.Object obj14 = xmlElement1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.util.List list4 = xmlElement2.getElements();
    XmlElement xmlElement6 = xmlElement2.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj4 = xmlElement2.clone();
    xmlElement2.setName("hi!");
    java.lang.Object obj7 = xmlElement2.clone();
    XmlElement xmlElement9 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement9);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.util.List list11 = xmlElement9.getElements();
    xmlElement2.append(xmlElement9);
    java.lang.Object obj13 = xmlElement9.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement(xmlElement10);
    XmlElement xmlElement17 = xmlElement10.addSubElement("hi!", "");
    xmlElement17.removeAllElements();
    boolean b19 = xmlElement2.addElement(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement2.getElement(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement3 = new XmlElement("hi!");
    java.lang.String str5 = xmlElement3.getAttribute("hi!");
    XmlElement xmlElement7 = new XmlElement("");
    XmlElement xmlElement10 = xmlElement7.addSubElement("", "");
    boolean b11 = xmlElement3.addElement(xmlElement10);
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    XmlElement xmlElement17 = xmlElement14.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement20 = new XmlElement("");
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "");
    XmlElement xmlElement26 = xmlElement20.addSubElement("", "hi!");
    xmlElement17.append(xmlElement20);
    XmlElement xmlElement29 = new XmlElement("");
    XmlElement xmlElement32 = xmlElement29.addSubElement("", "");
    XmlElement xmlElement35 = xmlElement29.addSubElement("", "hi!");
    XmlElement xmlElement38 = xmlElement29.addSubElement("hi!", "");
    XmlElement xmlElement39 = xmlElement17.addSubElement(xmlElement38);
    xmlElement3.notifyObservers((java.lang.Object)xmlElement17);
    XmlElement xmlElement41 = xmlElement1.removeElement(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement41);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    xmlElement13.notifyObservers();
    int i17 = xmlElement13.count();
    xmlElement8.setParent(xmlElement13);
    boolean b19 = xmlElement5.addElement(xmlElement13);
    java.util.List list20 = xmlElement13.getElements();
    xmlElement13.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement13 = xmlElement1.addSubElement("", "");
    java.util.Enumeration enumeration14 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = xmlElement7.addSubElement("hi!", "");
    boolean b11 = xmlElement1.addElement(xmlElement10);
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("", "");
    XmlElement xmlElement19 = xmlElement13.addSubElement("", "hi!");
    boolean b20 = xmlElement10.addElement(xmlElement13);
    java.lang.String str21 = xmlElement13.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    boolean b16 = xmlElement6.addElement(xmlElement15);
    xmlElement1.append(xmlElement6);
    java.lang.Object obj18 = null;
    xmlElement6.notifyObservers(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = xmlElement7.addSubElement("hi!", "");
    boolean b11 = xmlElement1.addElement(xmlElement10);
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("", "");
    XmlElement xmlElement19 = xmlElement13.addSubElement("", "hi!");
    boolean b20 = xmlElement10.addElement(xmlElement13);
    XmlElement xmlElement22 = new XmlElement("");
    XmlElement xmlElement25 = xmlElement22.addSubElement("", "");
    XmlElement xmlElement28 = xmlElement22.addSubElement("", "hi!");
    xmlElement13.notifyObservers((java.lang.Object)"");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement31 = xmlElement13.getElement((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.notifyObservers((java.lang.Object)(-1.0d));
    java.lang.Object obj4 = xmlElement1.clone();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement1.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    java.util.Observer observer8 = null;
    xmlElement7.deleteObserver(observer8);
    xmlElement2.append(xmlElement7);
    java.lang.String str11 = xmlElement2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement13 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement15 = xmlElement1.addSubElement("");
    java.lang.String str16 = xmlElement15.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement("", "hi!");
    xmlElement5.append(xmlElement8);
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement20 = xmlElement17.addSubElement("", "");
    XmlElement xmlElement23 = xmlElement17.addSubElement("", "hi!");
    XmlElement xmlElement26 = xmlElement17.addSubElement("hi!", "");
    XmlElement xmlElement27 = xmlElement5.addSubElement(xmlElement26);
    int i28 = xmlElement27.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement13 = new XmlElement("hi!");
    java.lang.String str15 = xmlElement13.getAttribute("hi!");
    xmlElement13.notifyObservers();
    int i17 = xmlElement13.count();
    xmlElement8.setParent(xmlElement13);
    boolean b19 = xmlElement5.addElement(xmlElement13);
    int i20 = xmlElement5.count();
    java.lang.String str22 = xmlElement5.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XmlElement xmlElement2 = new XmlElement("");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "");
    xmlElement5.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("", hashtable_str_str7);
    java.lang.String str9 = xmlElement8.getData();
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    XmlElement xmlElement19 = new XmlElement("hi!", "");
    java.util.Observer observer20 = null;
    xmlElement19.deleteObserver(observer20);
    xmlElement19.setName("");
    XmlElement xmlElement26 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement26.getAttributes();
    java.util.List list28 = xmlElement26.getElements();
    xmlElement19.append(xmlElement26);
    XmlElement xmlElement30 = xmlElement15.addSubElement(xmlElement26);
    java.util.List list31 = xmlElement30.getElements();
    xmlElement8.setParent(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    java.util.Enumeration enumeration4 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement9 = xmlElement1.addSubElement("");
    java.util.Enumeration enumeration10 = xmlElement9.getAttributeNames();
    XmlElement xmlElement12 = new XmlElement("");
    XmlElement xmlElement15 = xmlElement12.addSubElement("", "");
    XmlElement xmlElement17 = new XmlElement("hi!");
    java.lang.String str19 = xmlElement17.getAttribute("hi!");
    xmlElement17.notifyObservers();
    int i21 = xmlElement17.count();
    xmlElement12.setParent(xmlElement17);
    java.util.Enumeration enumeration23 = xmlElement12.getAttributeNames();
    XmlElement xmlElement26 = new XmlElement("");
    XmlElement xmlElement29 = xmlElement26.addSubElement("", "");
    xmlElement29.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement29.getAttributes();
    XmlElement xmlElement32 = new XmlElement("", hashtable_str_str31);
    xmlElement12.setAttributes(hashtable_str_str31);
    xmlElement9.setAttributes(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    xmlElement1.notifyObservers();
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    boolean b16 = xmlElement6.addElement(xmlElement15);
    xmlElement1.append(xmlElement6);
    xmlElement6.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.util.List list4 = xmlElement2.getElements();
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = xmlElement7.addSubElement("hi!", "");
    boolean b12 = xmlElement7.equals((java.lang.Object)100L);
    XmlElement.printNode(xmlElement7, "");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement7, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XmlElement xmlElement2 = new XmlElement("");
    XmlElement xmlElement5 = xmlElement2.addSubElement("", "");
    xmlElement5.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("", hashtable_str_str7);
    java.util.Observer observer9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement8.addObserver(observer9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str7);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj4 = xmlElement2.clone();
    XmlElement xmlElement6 = xmlElement2.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = xmlElement2.getAttributes();
    java.util.Enumeration enumeration8 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement(xmlElement6);
    XmlElement xmlElement13 = xmlElement6.addSubElement("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement13.removeElement((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    boolean b7 = xmlElement2.equals((java.lang.Object)100L);
    java.util.Observer observer8 = null;
    xmlElement2.deleteObserver(observer8);
    boolean b10 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement3.getAttributes();
    XmlElement xmlElement5 = new XmlElement("hi!", hashtable_str_str4);
    xmlElement5.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    java.util.Enumeration enumeration12 = xmlElement1.getAttributeNames();
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "");
    xmlElement18.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement18.getAttributes();
    XmlElement xmlElement21 = new XmlElement("", hashtable_str_str20);
    xmlElement1.setAttributes(hashtable_str_str20);
    XmlElement xmlElement25 = new XmlElement("hi!", "");
    XmlElement xmlElement28 = xmlElement25.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement28.getAttributes();
    XmlElement xmlElement31 = new XmlElement("");
    XmlElement xmlElement34 = xmlElement31.addSubElement("", "");
    XmlElement xmlElement37 = xmlElement31.addSubElement("", "hi!");
    xmlElement28.append(xmlElement31);
    XmlElement xmlElement40 = new XmlElement("");
    XmlElement xmlElement43 = xmlElement40.addSubElement("", "");
    XmlElement xmlElement46 = xmlElement40.addSubElement("", "hi!");
    XmlElement xmlElement49 = xmlElement40.addSubElement("hi!", "");
    XmlElement xmlElement50 = xmlElement28.addSubElement(xmlElement49);
    boolean b51 = xmlElement1.addElement(xmlElement50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    xmlElement4.deleteObservers();
    java.lang.String str6 = xmlElement4.getName();
    java.util.Observer observer7 = null;
    xmlElement4.deleteObserver(observer7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    java.util.Observer observer11 = null;
    xmlElement10.deleteObserver(observer11);
    xmlElement10.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.util.List list11 = xmlElement9.getElements();
    xmlElement2.append(xmlElement9);
    xmlElement9.removeFromParent();
    xmlElement9.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement5 = xmlElement4.getParent();
    java.lang.Object obj6 = xmlElement4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement(xmlElement10);
    XmlElement xmlElement17 = xmlElement10.addSubElement("hi!", "");
    xmlElement10.setData("");
    xmlElement2.setParent(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    java.util.Observer observer8 = null;
    xmlElement7.deleteObserver(observer8);
    xmlElement2.append(xmlElement7);
    java.lang.Object obj11 = xmlElement2.clone();
    XmlElement xmlElement14 = xmlElement2.addSubElement("", "");
    boolean b15 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement(xmlElement6);
    XmlElement xmlElement13 = xmlElement6.addSubElement("hi!", "");
    xmlElement6.setData("");
    java.lang.String str16 = xmlElement6.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = xmlElement5.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement8.getAttributes();
    XmlElement xmlElement10 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement11 = new XmlElement("hi!", hashtable_str_str9);
    XmlElement xmlElement12 = new XmlElement("", hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    boolean b7 = xmlElement2.equals((java.lang.Object)100L);
    XmlElement.printNode(xmlElement2, "");
    xmlElement2.removeFromParent();
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    XmlElement xmlElement16 = new XmlElement("hi!", hashtable_str_str15);
    xmlElement2.setAttributes(hashtable_str_str15);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement2.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = xmlElement7.addSubElement("hi!", "");
    boolean b11 = xmlElement1.addElement(xmlElement10);
    java.lang.String str13 = xmlElement1.getAttribute("");
    java.util.Observer observer14 = null;
    xmlElement1.deleteObserver(observer14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    java.util.Observer observer8 = null;
    xmlElement7.deleteObserver(observer8);
    xmlElement2.append(xmlElement7);
    java.lang.String str11 = xmlElement7.getData();
    XmlElement xmlElement14 = xmlElement7.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.util.List list11 = xmlElement9.getElements();
    xmlElement2.append(xmlElement9);
    XmlElement xmlElement13 = null;
    xmlElement9.setParent(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    boolean b11 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");
    java.util.Enumeration enumeration7 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.Observer observer3 = null;
    xmlElement2.deleteObserver(observer3);
    xmlElement2.setName("");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.util.List list11 = xmlElement9.getElements();
    xmlElement2.append(xmlElement9);
    xmlElement9.removeFromParent();
    xmlElement9.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    boolean b7 = xmlElement2.equals((java.lang.Object)100L);
    XmlElement.printNode(xmlElement2, "");
    xmlElement2.removeFromParent();
    xmlElement2.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Observer observer10 = null;
    xmlElement9.deleteObserver(observer10);
    xmlElement9.setName("");
    XmlElement xmlElement16 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    java.util.List list18 = xmlElement16.getElements();
    xmlElement9.append(xmlElement16);
    XmlElement xmlElement20 = xmlElement5.addSubElement(xmlElement16);
    java.util.List list21 = xmlElement20.getElements();
    xmlElement20.removeAllElements();
    XmlElement xmlElement25 = new XmlElement("hi!", "");
    XmlElement xmlElement28 = xmlElement25.addSubElement("hi!", "");
    java.lang.String str29 = xmlElement25.getName();
    boolean b30 = xmlElement20.equals((java.lang.Object)str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement3 = xmlElement2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = xmlElement3.countObservers();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement3);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    xmlElement8.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    xmlElement1.removeFromParent();
    java.util.Enumeration enumeration8 = xmlElement1.getAttributeNames();
    xmlElement1.setData("");
    java.util.Enumeration enumeration11 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.notifyObservers((java.lang.Object)(-1.0d));
    java.util.Enumeration enumeration4 = xmlElement1.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement5 = xmlElement4.getParent();
    xmlElement4.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    XmlElement xmlElement14 = new XmlElement("hi!", "");
    XmlElement xmlElement17 = xmlElement14.addSubElement("hi!", "");
    boolean b19 = xmlElement14.equals((java.lang.Object)100L);
    XmlElement xmlElement21 = new XmlElement("hi!");
    java.lang.String str23 = xmlElement21.getAttribute("hi!");
    XmlElement xmlElement25 = new XmlElement("");
    XmlElement xmlElement28 = xmlElement25.addSubElement("", "");
    boolean b29 = xmlElement21.addElement(xmlElement28);
    boolean b30 = xmlElement14.addElement(xmlElement21);
    boolean b31 = xmlElement1.equals((java.lang.Object)xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement(xmlElement6);
    XmlElement xmlElement12 = xmlElement4.getElement("");
    xmlElement12.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement("", "hi!");
    XmlElement xmlElement11 = xmlElement2.removeElement(xmlElement4);
    int i12 = xmlElement4.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement9 = xmlElement1.addSubElement("");
    XmlElement.printNode(xmlElement9, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement("", "hi!");
    xmlElement5.append(xmlElement8);
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement20 = xmlElement17.addSubElement("", "");
    XmlElement xmlElement23 = xmlElement17.addSubElement("", "hi!");
    XmlElement xmlElement26 = xmlElement17.addSubElement("hi!", "");
    XmlElement xmlElement27 = xmlElement5.addSubElement(xmlElement26);
    xmlElement5.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    XmlElement xmlElement9 = new XmlElement("", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement6.removeElement(xmlElement9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement1.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement6 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement9 = new XmlElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.lang.Object obj11 = xmlElement9.clone();
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XmlElement xmlElement0 = new XmlElement();
    xmlElement0.notifyObservers();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    boolean b10 = xmlElement1.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement4 = new XmlElement("");
    XmlElement xmlElement7 = xmlElement4.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement("", "hi!");
    XmlElement xmlElement11 = xmlElement2.removeElement(xmlElement4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = xmlElement11.getAttribute("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement11);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    XmlElement xmlElement5 = xmlElement2.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    XmlElement xmlElement8 = new XmlElement("");
    XmlElement xmlElement11 = xmlElement8.addSubElement("", "");
    XmlElement xmlElement14 = xmlElement8.addSubElement("", "hi!");
    xmlElement5.append(xmlElement8);
    XmlElement xmlElement17 = new XmlElement("");
    XmlElement xmlElement20 = xmlElement17.addSubElement("", "");
    XmlElement xmlElement23 = xmlElement17.addSubElement("", "hi!");
    XmlElement xmlElement26 = xmlElement17.addSubElement("hi!", "");
    XmlElement xmlElement27 = xmlElement5.addSubElement(xmlElement26);
    XmlElement.printNode(xmlElement5, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    java.lang.Object obj5 = xmlElement4.clone();
    java.util.Observer observer6 = null;
    xmlElement4.deleteObserver(observer6);
    java.util.Enumeration enumeration8 = xmlElement4.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    XmlElement xmlElement11 = xmlElement8.getParent();
    java.lang.Object obj14 = xmlElement11.addAttribute("", "");
    java.lang.String str15 = xmlElement11.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement13 = xmlElement1.addSubElement("", "");
    java.util.List list14 = xmlElement1.getElements();
    java.lang.String str15 = xmlElement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    XmlElement xmlElement18 = new XmlElement("");
    XmlElement xmlElement21 = xmlElement18.addSubElement("", "");
    XmlElement xmlElement24 = xmlElement18.addSubElement("", "hi!");
    xmlElement15.append(xmlElement18);
    XmlElement xmlElement27 = new XmlElement("");
    XmlElement xmlElement30 = xmlElement27.addSubElement("", "");
    XmlElement xmlElement33 = xmlElement27.addSubElement("", "hi!");
    XmlElement xmlElement36 = xmlElement27.addSubElement("hi!", "");
    XmlElement xmlElement37 = xmlElement15.addSubElement(xmlElement36);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement15);
    xmlElement1.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("");
    XmlElement xmlElement9 = xmlElement6.addSubElement("", "");
    XmlElement xmlElement10 = xmlElement4.addSubElement(xmlElement6);
    XmlElement xmlElement12 = xmlElement4.getElement("");
    XmlElement xmlElement15 = new XmlElement("");
    XmlElement xmlElement18 = xmlElement15.addSubElement("", "");
    xmlElement18.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement18.getAttributes();
    XmlElement xmlElement21 = new XmlElement("", hashtable_str_str20);
    boolean b22 = xmlElement4.addElement(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = xmlElement1.getElement("hi!");
    xmlElement1.removeFromParent();
    XmlElement xmlElement9 = xmlElement1.addSubElement("");
    XmlElement xmlElement10 = xmlElement9.getParent();
    java.lang.String str13 = xmlElement10.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XmlElement xmlElement1 = new XmlElement("");
    xmlElement1.notifyObservers((java.lang.Object)(-1.0d));
    XmlElement xmlElement5 = new XmlElement("hi!");
    java.lang.String str7 = xmlElement5.getAttribute("hi!");
    xmlElement5.notifyObservers();
    XmlElement xmlElement10 = new XmlElement("");
    XmlElement xmlElement13 = xmlElement10.addSubElement("", "");
    XmlElement xmlElement16 = new XmlElement("hi!", "");
    XmlElement xmlElement19 = xmlElement16.addSubElement("hi!", "");
    boolean b20 = xmlElement10.addElement(xmlElement19);
    xmlElement5.append(xmlElement10);
    xmlElement1.append(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    XmlElement xmlElement12 = new XmlElement("hi!", "");
    XmlElement xmlElement15 = xmlElement12.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    XmlElement xmlElement18 = new XmlElement("");
    XmlElement xmlElement21 = xmlElement18.addSubElement("", "");
    XmlElement xmlElement24 = xmlElement18.addSubElement("", "hi!");
    xmlElement15.append(xmlElement18);
    XmlElement xmlElement27 = new XmlElement("");
    XmlElement xmlElement30 = xmlElement27.addSubElement("", "");
    XmlElement xmlElement33 = xmlElement27.addSubElement("", "hi!");
    XmlElement xmlElement36 = xmlElement27.addSubElement("hi!", "");
    XmlElement xmlElement37 = xmlElement15.addSubElement(xmlElement36);
    xmlElement1.notifyObservers((java.lang.Object)xmlElement15);
    int i39 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = new XmlElement("hi!", "");
    XmlElement xmlElement10 = xmlElement7.addSubElement("hi!", "");
    boolean b11 = xmlElement1.addElement(xmlElement10);
    XmlElement xmlElement13 = new XmlElement("");
    XmlElement xmlElement16 = xmlElement13.addSubElement("", "");
    XmlElement xmlElement19 = xmlElement13.addSubElement("", "hi!");
    boolean b20 = xmlElement10.addElement(xmlElement13);
    XmlElement.printNode(xmlElement13, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.lang.String str10 = xmlElement8.getData();
    boolean b11 = xmlElement8.hasChanged();
    XmlElement xmlElement13 = xmlElement8.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement6 = new XmlElement("hi!");
    java.lang.String str8 = xmlElement6.getAttribute("hi!");
    xmlElement6.notifyObservers();
    int i10 = xmlElement6.count();
    xmlElement1.setParent(xmlElement6);
    int i12 = xmlElement1.countObservers();
    XmlElement.printNode(xmlElement1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    java.lang.Object obj5 = xmlElement4.clone();
    java.util.Observer observer6 = null;
    xmlElement4.deleteObserver(observer6);
    java.util.Observer observer8 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.addObserver(observer8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement4 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement7 = xmlElement1.addSubElement("", "hi!");
    XmlElement xmlElement10 = xmlElement1.addSubElement("hi!", "");
    XmlElement xmlElement13 = xmlElement1.addSubElement("", "");
    XmlElement xmlElement15 = xmlElement1.addSubElement("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XmlElement xmlElement1 = new XmlElement("hi!");
    java.lang.String str3 = xmlElement1.getAttribute("hi!");
    XmlElement xmlElement5 = new XmlElement("");
    XmlElement xmlElement8 = xmlElement5.addSubElement("", "");
    boolean b9 = xmlElement1.addElement(xmlElement8);
    java.util.Enumeration enumeration10 = xmlElement8.getAttributeNames();
    xmlElement8.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XmlElement xmlElement1 = new XmlElement("");
    int i2 = xmlElement1.count();
    XmlElement xmlElement5 = new XmlElement("hi!", "");
    XmlElement xmlElement8 = xmlElement5.addSubElement("hi!", "");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement8.getAttributes();
    XmlElement xmlElement11 = new XmlElement("");
    XmlElement xmlElement14 = xmlElement11.addSubElement("", "");
    XmlElement xmlElement17 = xmlElement11.addSubElement("", "hi!");
    xmlElement8.append(xmlElement11);
    XmlElement xmlElement20 = new XmlElement("");
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "");
    XmlElement xmlElement26 = xmlElement20.addSubElement("", "hi!");
    XmlElement xmlElement29 = xmlElement20.addSubElement("hi!", "");
    XmlElement xmlElement30 = xmlElement8.addSubElement(xmlElement29);
    boolean b31 = xmlElement1.equals((java.lang.Object)xmlElement30);
    int i32 = xmlElement1.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

}

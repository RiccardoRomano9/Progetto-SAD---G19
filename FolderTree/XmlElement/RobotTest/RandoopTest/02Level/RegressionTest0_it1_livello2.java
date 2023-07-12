
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    java.lang.Object obj2 = xmlElement0.clone();
    java.util.Observer observer3 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.addObserver(observer3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement0.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement2.removeElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement0.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    java.lang.Object obj12 = xmlElement10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    boolean b2 = xmlElement0.hasChanged();
    XmlElement xmlElement3 = new XmlElement();
    java.lang.Object obj4 = xmlElement3.clone();
    boolean b5 = xmlElement3.hasChanged();
    boolean b6 = xmlElement0.addElement(xmlElement3);
    xmlElement3.deleteObservers();
    boolean b8 = xmlElement3.hasChanged();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement3.getElement(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement4 = xmlElement3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.lang.Object obj15 = xmlElement14.clone();
    XmlElement xmlElement16 = new XmlElement();
    XmlElement xmlElement17 = xmlElement14.addSubElement(xmlElement16);
    xmlElement16.setName("hi!");
    xmlElement2.append(xmlElement16);
    XmlElement xmlElement21 = null;
    xmlElement16.setParent(xmlElement21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement15 = xmlElement2.getElement((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.Object obj4 = null;
    boolean b5 = xmlElement0.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    int i12 = xmlElement10.countObservers();
    java.lang.String str13 = xmlElement10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj3 = xmlElement0.addAttribute("hi!", "hi!");
    java.lang.Object obj6 = xmlElement0.addAttribute("", "");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    java.lang.String str13 = xmlElement9.getAttribute("", "hi!");
    java.lang.String str14 = xmlElement9.getName();
    XmlElement xmlElement15 = xmlElement0.addSubElement(xmlElement9);
    xmlElement15.removeFromParent();
    XmlElement.printNode(xmlElement15, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    java.lang.Object obj14 = xmlElement12.clone();
    xmlElement12.removeFromParent();
    XmlElement xmlElement16 = xmlElement10.removeElement(xmlElement12);
    XmlElement xmlElement17 = new XmlElement();
    java.lang.Object obj18 = xmlElement17.clone();
    XmlElement xmlElement19 = new XmlElement();
    XmlElement xmlElement20 = xmlElement17.addSubElement(xmlElement19);
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "hi!");
    java.util.Enumeration enumeration24 = xmlElement23.getAttributeNames();
    boolean b25 = xmlElement10.addElement(xmlElement23);
    int i26 = xmlElement23.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    int i7 = xmlElement2.count();
    java.lang.String str8 = xmlElement2.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement4 = new XmlElement();
    java.lang.Object obj5 = xmlElement4.clone();
    XmlElement xmlElement6 = new XmlElement();
    XmlElement xmlElement7 = xmlElement4.addSubElement(xmlElement6);
    java.lang.String str10 = xmlElement6.getAttribute("", "hi!");
    java.lang.String str11 = xmlElement6.getName();
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    boolean b14 = xmlElement12.hasChanged();
    java.util.List list15 = xmlElement12.getElements();
    XmlElement xmlElement16 = new XmlElement();
    java.lang.Object obj17 = xmlElement16.clone();
    boolean b18 = xmlElement16.hasChanged();
    XmlElement xmlElement19 = new XmlElement();
    java.lang.Object obj20 = xmlElement19.clone();
    boolean b21 = xmlElement19.hasChanged();
    boolean b22 = xmlElement16.addElement(xmlElement19);
    xmlElement19.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement19.getAttributes();
    xmlElement12.setAttributes(hashtable_str_str24);
    xmlElement6.setAttributes(hashtable_str_str24);
    boolean b27 = xmlElement0.equals((java.lang.Object)hashtable_str_str24);
    XmlElement xmlElement28 = new XmlElement();
    java.lang.Object obj29 = xmlElement28.clone();
    boolean b30 = xmlElement28.hasChanged();
    java.util.List list31 = xmlElement28.getElements();
    XmlElement xmlElement32 = new XmlElement();
    java.lang.Object obj33 = xmlElement32.clone();
    boolean b34 = xmlElement32.hasChanged();
    XmlElement xmlElement35 = new XmlElement();
    java.lang.Object obj36 = xmlElement35.clone();
    boolean b37 = xmlElement35.hasChanged();
    boolean b38 = xmlElement32.addElement(xmlElement35);
    xmlElement35.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str40 = xmlElement35.getAttributes();
    xmlElement28.setAttributes(hashtable_str_str40);
    xmlElement0.append(xmlElement28);
    XmlElement xmlElement43 = new XmlElement();
    java.lang.Object obj44 = xmlElement43.clone();
    boolean b45 = xmlElement43.hasChanged();
    XmlElement xmlElement46 = new XmlElement();
    java.lang.Object obj47 = xmlElement46.clone();
    boolean b48 = xmlElement46.hasChanged();
    boolean b49 = xmlElement43.addElement(xmlElement46);
    XmlElement xmlElement51 = xmlElement46.addSubElement("");
    java.lang.String str53 = xmlElement46.getAttribute("hi!");
    xmlElement28.setParent(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    java.lang.String str12 = xmlElement10.getName();
    java.lang.Object obj15 = xmlElement10.addAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement6 = xmlElement3.addSubElement("", "hi!");
    xmlElement6.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    java.lang.String str7 = xmlElement2.getName();
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    XmlElement xmlElement16 = xmlElement2.addSubElement("", "hi!");
    java.lang.String str18 = xmlElement16.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.lang.Object obj15 = xmlElement14.clone();
    XmlElement xmlElement16 = new XmlElement();
    XmlElement xmlElement17 = xmlElement14.addSubElement(xmlElement16);
    xmlElement16.setName("hi!");
    xmlElement2.append(xmlElement16);
    java.util.Observer observer21 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.addObserver(observer21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    boolean b2 = xmlElement0.hasChanged();
    XmlElement xmlElement3 = new XmlElement();
    java.lang.Object obj4 = xmlElement3.clone();
    boolean b5 = xmlElement3.hasChanged();
    boolean b6 = xmlElement0.addElement(xmlElement3);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement3.removeElement(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    java.lang.String str12 = xmlElement10.getName();
    java.util.Observer observer13 = null;
    xmlElement10.deleteObserver(observer13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.lang.Object obj15 = xmlElement14.clone();
    XmlElement xmlElement16 = new XmlElement();
    XmlElement xmlElement17 = xmlElement14.addSubElement(xmlElement16);
    xmlElement16.setName("hi!");
    xmlElement2.append(xmlElement16);
    xmlElement16.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XmlElement xmlElement1 = new XmlElement();
    java.lang.Object obj2 = xmlElement1.clone();
    boolean b3 = xmlElement1.hasChanged();
    XmlElement xmlElement4 = new XmlElement();
    java.lang.Object obj5 = xmlElement4.clone();
    boolean b6 = xmlElement4.hasChanged();
    boolean b7 = xmlElement1.addElement(xmlElement4);
    xmlElement4.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement4.getAttributes();
    XmlElement xmlElement10 = new XmlElement("", hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement4 = new XmlElement();
    java.lang.Object obj5 = xmlElement4.clone();
    XmlElement xmlElement6 = new XmlElement();
    XmlElement xmlElement7 = xmlElement4.addSubElement(xmlElement6);
    java.lang.String str10 = xmlElement6.getAttribute("", "hi!");
    java.lang.String str11 = xmlElement6.getName();
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    boolean b14 = xmlElement12.hasChanged();
    java.util.List list15 = xmlElement12.getElements();
    XmlElement xmlElement16 = new XmlElement();
    java.lang.Object obj17 = xmlElement16.clone();
    boolean b18 = xmlElement16.hasChanged();
    XmlElement xmlElement19 = new XmlElement();
    java.lang.Object obj20 = xmlElement19.clone();
    boolean b21 = xmlElement19.hasChanged();
    boolean b22 = xmlElement16.addElement(xmlElement19);
    xmlElement19.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement19.getAttributes();
    xmlElement12.setAttributes(hashtable_str_str24);
    xmlElement6.setAttributes(hashtable_str_str24);
    boolean b27 = xmlElement0.equals((java.lang.Object)hashtable_str_str24);
    xmlElement0.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    boolean b2 = xmlElement0.hasChanged();
    boolean b3 = xmlElement0.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement4 = new XmlElement();
    java.lang.Object obj5 = xmlElement4.clone();
    boolean b6 = xmlElement4.hasChanged();
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    boolean b9 = xmlElement7.hasChanged();
    boolean b10 = xmlElement4.addElement(xmlElement7);
    xmlElement7.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement7.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement3 = xmlElement0.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement3);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement1 = new XmlElement();
    java.lang.Object obj2 = xmlElement1.clone();
    XmlElement xmlElement3 = new XmlElement();
    XmlElement xmlElement4 = xmlElement1.addSubElement(xmlElement3);
    xmlElement4.setData("hi!");
    XmlElement xmlElement7 = xmlElement0.removeElement(xmlElement4);
    XmlElement xmlElement8 = new XmlElement();
    java.lang.Object obj9 = xmlElement8.clone();
    boolean b10 = xmlElement8.hasChanged();
    java.util.List list11 = xmlElement8.getElements();
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    boolean b14 = xmlElement12.hasChanged();
    XmlElement xmlElement15 = new XmlElement();
    java.lang.Object obj16 = xmlElement15.clone();
    boolean b17 = xmlElement15.hasChanged();
    boolean b18 = xmlElement12.addElement(xmlElement15);
    xmlElement15.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str20);
    xmlElement0.setAttributes(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    java.lang.String str7 = xmlElement2.getName();
    XmlElement xmlElement8 = new XmlElement();
    java.lang.Object obj9 = xmlElement8.clone();
    boolean b10 = xmlElement8.hasChanged();
    java.util.List list11 = xmlElement8.getElements();
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    boolean b14 = xmlElement12.hasChanged();
    XmlElement xmlElement15 = new XmlElement();
    java.lang.Object obj16 = xmlElement15.clone();
    boolean b17 = xmlElement15.hasChanged();
    boolean b18 = xmlElement12.addElement(xmlElement15);
    xmlElement15.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement15.getAttributes();
    xmlElement8.setAttributes(hashtable_str_str20);
    xmlElement2.setAttributes(hashtable_str_str20);
    xmlElement2.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    xmlElement0.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement4 = xmlElement0.addSubElement("", "hi!");
    java.util.Observer observer5 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.addObserver(observer5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement4);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    java.lang.String str7 = xmlElement2.getName();
    java.lang.String str10 = xmlElement2.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    java.lang.Object obj2 = xmlElement0.clone();
    java.util.Enumeration enumeration3 = xmlElement0.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj3 = xmlElement0.addAttribute("hi!", "hi!");
    java.lang.Object obj6 = xmlElement0.addAttribute("", "");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    java.lang.String str13 = xmlElement9.getAttribute("", "hi!");
    java.lang.String str14 = xmlElement9.getName();
    XmlElement xmlElement15 = xmlElement0.addSubElement(xmlElement9);
    xmlElement15.removeFromParent();
    boolean b17 = xmlElement15.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XmlElement xmlElement1 = new XmlElement("");
    XmlElement xmlElement2 = null;
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement1.addSubElement(xmlElement2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    xmlElement2.setName("hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.lang.Object obj15 = xmlElement14.clone();
    XmlElement xmlElement16 = new XmlElement();
    XmlElement xmlElement17 = xmlElement14.addSubElement(xmlElement16);
    xmlElement16.setName("hi!");
    xmlElement2.append(xmlElement16);
    XmlElement xmlElement21 = new XmlElement();
    java.lang.Object obj22 = xmlElement21.clone();
    XmlElement xmlElement23 = new XmlElement();
    XmlElement xmlElement24 = xmlElement21.addSubElement(xmlElement23);
    xmlElement24.notifyObservers();
    boolean b26 = xmlElement16.addElement(xmlElement24);
    XmlElement xmlElement27 = new XmlElement();
    java.lang.Object obj28 = xmlElement27.clone();
    boolean b29 = xmlElement27.hasChanged();
    java.util.List list30 = xmlElement27.getElements();
    XmlElement xmlElement31 = new XmlElement();
    java.lang.Object obj32 = xmlElement31.clone();
    boolean b33 = xmlElement31.hasChanged();
    XmlElement xmlElement34 = new XmlElement();
    java.lang.Object obj35 = xmlElement34.clone();
    boolean b36 = xmlElement34.hasChanged();
    boolean b37 = xmlElement31.addElement(xmlElement34);
    xmlElement34.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str39 = xmlElement34.getAttributes();
    xmlElement27.setAttributes(hashtable_str_str39);
    xmlElement27.notifyObservers();
    XmlElement xmlElement42 = new XmlElement();
    java.lang.Object obj43 = xmlElement42.clone();
    boolean b44 = xmlElement42.hasChanged();
    XmlElement xmlElement45 = xmlElement27.removeElement(xmlElement42);
    xmlElement16.notifyObservers((java.lang.Object)xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement45);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    java.lang.Object obj14 = xmlElement12.clone();
    xmlElement12.removeFromParent();
    XmlElement xmlElement16 = xmlElement10.removeElement(xmlElement12);
    XmlElement xmlElement17 = new XmlElement();
    java.lang.Object obj18 = xmlElement17.clone();
    XmlElement xmlElement19 = new XmlElement();
    XmlElement xmlElement20 = xmlElement17.addSubElement(xmlElement19);
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "hi!");
    java.util.Enumeration enumeration24 = xmlElement23.getAttributeNames();
    boolean b25 = xmlElement10.addElement(xmlElement23);
    XmlElement xmlElement26 = new XmlElement();
    java.lang.Object obj27 = xmlElement26.clone();
    XmlElement xmlElement28 = new XmlElement();
    XmlElement xmlElement29 = xmlElement26.addSubElement(xmlElement28);
    xmlElement28.setName("hi!");
    xmlElement23.notifyObservers((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    XmlElement xmlElement4 = new XmlElement();
    java.lang.Object obj5 = xmlElement4.clone();
    XmlElement xmlElement6 = new XmlElement();
    XmlElement xmlElement7 = xmlElement4.addSubElement(xmlElement6);
    java.lang.String str10 = xmlElement6.getAttribute("", "hi!");
    java.lang.String str11 = xmlElement6.getName();
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    boolean b14 = xmlElement12.hasChanged();
    java.util.List list15 = xmlElement12.getElements();
    XmlElement xmlElement16 = new XmlElement();
    java.lang.Object obj17 = xmlElement16.clone();
    boolean b18 = xmlElement16.hasChanged();
    XmlElement xmlElement19 = new XmlElement();
    java.lang.Object obj20 = xmlElement19.clone();
    boolean b21 = xmlElement19.hasChanged();
    boolean b22 = xmlElement16.addElement(xmlElement19);
    xmlElement19.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement19.getAttributes();
    xmlElement12.setAttributes(hashtable_str_str24);
    xmlElement6.setAttributes(hashtable_str_str24);
    boolean b27 = xmlElement0.equals((java.lang.Object)hashtable_str_str24);
    XmlElement xmlElement28 = new XmlElement();
    java.lang.Object obj29 = xmlElement28.clone();
    boolean b30 = xmlElement28.hasChanged();
    java.util.List list31 = xmlElement28.getElements();
    XmlElement xmlElement32 = new XmlElement();
    java.lang.Object obj33 = xmlElement32.clone();
    boolean b34 = xmlElement32.hasChanged();
    XmlElement xmlElement35 = new XmlElement();
    java.lang.Object obj36 = xmlElement35.clone();
    boolean b37 = xmlElement35.hasChanged();
    boolean b38 = xmlElement32.addElement(xmlElement35);
    xmlElement35.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str40 = xmlElement35.getAttributes();
    xmlElement28.setAttributes(hashtable_str_str40);
    xmlElement0.append(xmlElement28);
    XmlElement xmlElement43 = new XmlElement();
    java.lang.Object obj44 = xmlElement43.clone();
    java.util.List list45 = xmlElement43.getElements();
    xmlElement28.setParent(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj1 = xmlElement0.clone();
    XmlElement xmlElement2 = new XmlElement();
    XmlElement xmlElement3 = xmlElement0.addSubElement(xmlElement2);
    java.lang.String str6 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.lang.Object obj8 = xmlElement7.clone();
    XmlElement xmlElement9 = new XmlElement();
    XmlElement xmlElement10 = xmlElement7.addSubElement(xmlElement9);
    boolean b11 = xmlElement2.addElement(xmlElement10);
    XmlElement xmlElement12 = new XmlElement();
    java.lang.Object obj13 = xmlElement12.clone();
    java.lang.Object obj14 = xmlElement12.clone();
    xmlElement12.removeFromParent();
    XmlElement xmlElement16 = xmlElement10.removeElement(xmlElement12);
    XmlElement xmlElement17 = new XmlElement();
    java.lang.Object obj18 = xmlElement17.clone();
    XmlElement xmlElement19 = new XmlElement();
    XmlElement xmlElement20 = xmlElement17.addSubElement(xmlElement19);
    XmlElement xmlElement23 = xmlElement20.addSubElement("", "hi!");
    java.util.Enumeration enumeration24 = xmlElement23.getAttributeNames();
    boolean b25 = xmlElement10.addElement(xmlElement23);
    XmlElement xmlElement26 = null;
    xmlElement10.setParent(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

}

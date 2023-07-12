
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putShort((int)'a');
    ByteVector byteVector9 = byteVector7.putLong((long)10);
    ByteVector byteVector11 = byteVector7.putShort((int)(byte)0);
    ByteVector byteVector13 = byteVector7.putLong((-1L));
    ByteVector byteVector15 = byteVector13.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putShort((-1));
    ByteVector byteVector5 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector7 = byteVector5.putShort((int)'4');
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putShort((-1));
    ByteVector byteVector10 = byteVector8.putShort((int)'4');
    ByteVector byteVector11 = new ByteVector();
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)-1);
    ByteVector byteVector18 = new ByteVector();
    byte[] byte_array20 = new byte[] { (byte)0 };
    ByteVector byteVector23 = byteVector18.putByteArray(byte_array20, 0, (int)(short)1);
    ByteVector byteVector26 = byteVector15.putByteArray(byte_array20, 0, (int)(short)1);
    ByteVector byteVector29 = byteVector10.putByteArray(byte_array20, (int)(short)1, (int)(short)0);
    ByteVector byteVector31 = byteVector10.putLong((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)0);
    ByteVector byteVector12 = byteVector8.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putByte((int)(byte)0);
    ByteVector byteVector15 = byteVector7.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector19.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector4.putShort(1);
    ByteVector byteVector16 = byteVector14.putInt(1);
    ByteVector byteVector18 = byteVector14.putInt((int)'#');
    ByteVector byteVector20 = byteVector14.putShort(1);
    ByteVector byteVector22 = byteVector20.putShort((int)(short)100);
    ByteVector byteVector24 = byteVector20.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector19.putLong((long)(short)-1);
    ByteVector byteVector25 = byteVector19.putShort(0);
    ByteVector byteVector27 = byteVector19.putShort(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector19.putLong((long)(short)-1);
    ByteVector byteVector25 = byteVector19.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)0);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector6.putByte((int)(short)100);
    ByteVector byteVector10 = byteVector8.putShort((int)(byte)-1);
    ByteVector byteVector12 = byteVector8.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putShort((int)'a');
    ByteVector byteVector9 = new ByteVector(0);
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong((long)10);
    ByteVector byteVector15 = byteVector11.putUTF8("hi!");
    ByteVector byteVector17 = byteVector11.putByte(0);
    ByteVector byteVector19 = byteVector11.putInt((int)(short)0);
    ByteVector byteVector21 = byteVector19.putUTF8("hi!");
    ByteVector byteVector23 = byteVector19.putByte((int)'4');
    ByteVector byteVector24 = new ByteVector();
    ByteVector byteVector26 = byteVector24.putShort((int)(byte)10);
    ByteVector byteVector28 = byteVector26.putShort(1);
    ByteVector byteVector30 = byteVector28.putLong((long)(short)1);
    ByteVector byteVector32 = byteVector28.putInt((int)'#');
    ByteVector byteVector34 = byteVector28.putShort(0);
    ByteVector byteVector36 = new ByteVector((int)(short)100);
    ByteVector byteVector38 = byteVector36.putLong((long)'4');
    ByteVector byteVector40 = byteVector38.putLong((long)(byte)0);
    ByteVector byteVector41 = new ByteVector();
    byte[] byte_array43 = new byte[] { (byte)0 };
    ByteVector byteVector46 = byteVector41.putByteArray(byte_array43, 0, (int)(short)1);
    ByteVector byteVector49 = byteVector40.putByteArray(byte_array43, 0, 1);
    ByteVector byteVector52 = byteVector28.putByteArray(byte_array43, (int)(short)0, (int)(short)1);
    ByteVector byteVector55 = byteVector19.putByteArray(byte_array43, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector58 = byteVector7.putByteArray(byte_array43, (int)'#', (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putShort((int)'a');
    ByteVector byteVector9 = byteVector7.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putLong((long)(short)10);
    ByteVector byteVector9 = byteVector7.putByte((int)'4');
    ByteVector byteVector11 = byteVector9.putByte((int)(byte)0);
    ByteVector byteVector13 = byteVector9.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector8.putInt((int)(short)1);
    ByteVector byteVector12 = byteVector8.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putByte((int)(byte)0);
    ByteVector byteVector15 = byteVector7.putUTF8("");
    ByteVector byteVector17 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putUTF8("");
    ByteVector byteVector8 = new ByteVector((int)(byte)0);
    ByteVector byteVector10 = byteVector8.putInt((int)(byte)0);
    ByteVector byteVector12 = byteVector10.putInt(1);
    ByteVector byteVector13 = new ByteVector();
    ByteVector byteVector15 = byteVector13.putShort((int)(byte)10);
    ByteVector byteVector17 = byteVector15.putShort(1);
    ByteVector byteVector19 = byteVector17.putLong((long)(short)1);
    ByteVector byteVector21 = byteVector17.putInt((int)'#');
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector23.putInt((int)(byte)0);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putByte((int)(byte)0);
    ByteVector byteVector30 = byteVector28.putUTF8("");
    ByteVector byteVector32 = byteVector28.putByte((int)'#');
    ByteVector byteVector34 = byteVector32.putByte((int)'4');
    byte[] byte_array38 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector41 = byteVector32.putByteArray(byte_array38, 1, 0);
    ByteVector byteVector44 = byteVector25.putByteArray(byte_array38, (int)(byte)1, 0);
    ByteVector byteVector47 = byteVector10.putByteArray(byte_array38, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector6.putByteArray(byte_array38, (int)'#', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)1);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector21.putUTF8("");
    ByteVector byteVector27 = byteVector25.putLong((long)(short)1);
    ByteVector byteVector29 = byteVector27.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = byteVector5.putShort((int)(byte)100);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector11.putInt((-1));
    ByteVector byteVector21 = new ByteVector(0);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector23.putInt((int)'a');
    ByteVector byteVector27 = byteVector23.putShort((int)'a');
    ByteVector byteVector28 = new ByteVector();
    ByteVector byteVector30 = byteVector28.putShort((int)(byte)10);
    ByteVector byteVector32 = byteVector30.putShort((int)(byte)-1);
    byte[] byte_array39 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector42 = byteVector30.putByteArray(byte_array39, (int)(short)0, (int)(byte)0);
    ByteVector byteVector45 = byteVector27.putByteArray(byte_array39, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector48 = byteVector19.putByteArray(byte_array39, (int)(short)10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putShort(10);
    ByteVector byteVector13 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector15 = new ByteVector(0);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putLong((long)10);
    ByteVector byteVector21 = byteVector19.putLong((long)(byte)-1);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector21.putUTF8("");
    byte[] byte_array26 = null;
    ByteVector byteVector29 = byteVector21.putByteArray(byte_array26, (int)(byte)1, 0);
    ByteVector byteVector31 = byteVector21.putUTF8("hi!");
    ByteVector byteVector33 = byteVector21.putUTF8("hi!");
    byte[] byte_array40 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector43 = byteVector21.putByteArray(byte_array40, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector13.putByteArray(byte_array40, 100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector3.putInt((int)'4');
    ByteVector byteVector11 = byteVector3.putLong(100L);
    ByteVector byteVector13 = byteVector3.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector4.putLong((long)100);
    ByteVector byteVector10 = byteVector8.putLong((long)'4');
    ByteVector byteVector12 = byteVector10.putLong((long)0);
    ByteVector byteVector14 = byteVector10.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector3.putByte((int)(short)10);
    ByteVector byteVector13 = byteVector11.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)0);
    ByteVector byteVector13 = new ByteVector();
    ByteVector byteVector15 = byteVector13.putByte((int)(byte)0);
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector15.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putByte((int)'4');
    byte[] byte_array25 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector28 = byteVector19.putByteArray(byte_array25, 1, 0);
    ByteVector byteVector31 = byteVector12.putByteArray(byte_array25, (int)(byte)1, 0);
    ByteVector byteVector33 = byteVector31.putUTF8("");
    ByteVector byteVector35 = byteVector31.putShort((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)100);
    ByteVector byteVector3 = byteVector1.putInt(1);
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putShort((int)(short)-1);
    ByteVector byteVector19 = byteVector17.putLong((long)(-1));
    ByteVector byteVector21 = byteVector17.putLong((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)100);
    ByteVector byteVector8 = byteVector2.putShort((int)(short)1);
    ByteVector byteVector10 = byteVector2.putInt((int)(short)10);
    ByteVector byteVector12 = byteVector2.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt(0);
    ByteVector byteVector15 = byteVector7.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector6.putInt((int)(short)100);
    ByteVector byteVector10 = byteVector6.putInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putByte((int)(short)0);
    ByteVector byteVector13 = byteVector9.putLong((long)(short)1);
    ByteVector byteVector15 = byteVector9.putByte((int)(short)10);
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putByte(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)0);
    ByteVector byteVector12 = byteVector10.putByte((int)'a');
    ByteVector byteVector14 = byteVector10.putShort((int)(short)0);
    ByteVector byteVector16 = byteVector10.putInt((int)(byte)1);
    ByteVector byteVector18 = byteVector10.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    byte[] byte_array26 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array26, (int)(byte)0, 0);
    ByteVector byteVector31 = byteVector29.putUTF8("hi!");
    ByteVector byteVector33 = byteVector29.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putLong((long)1);
    ByteVector byteVector9 = byteVector3.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putShort((int)(short)-1);
    ByteVector byteVector19 = byteVector17.putLong((long)(-1));
    ByteVector byteVector21 = byteVector17.putByte((int)(short)10);
    ByteVector byteVector23 = byteVector21.putInt(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);
    ByteVector byteVector3 = byteVector1.putLong((long)'4');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putLong(10L);
    ByteVector byteVector11 = byteVector9.putLong((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putShort((int)(short)10);
    ByteVector byteVector11 = byteVector5.putShort((int)(short)100);
    ByteVector byteVector13 = byteVector11.putShort((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putLong((long)(short)10);
    ByteVector byteVector9 = byteVector7.putShort((int)'a');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)100);
    ByteVector byteVector13 = byteVector11.putLong((long)(byte)1);
    ByteVector byteVector15 = byteVector11.putLong((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putShort((int)'4');
    ByteVector byteVector11 = new ByteVector((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putInt(1);
    ByteVector byteVector16 = new ByteVector();
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)10);
    ByteVector byteVector20 = byteVector18.putShort(1);
    ByteVector byteVector22 = byteVector20.putLong((long)(short)1);
    ByteVector byteVector24 = byteVector20.putInt((int)'#');
    ByteVector byteVector26 = byteVector24.putUTF8("hi!");
    ByteVector byteVector28 = byteVector26.putInt((int)(byte)0);
    ByteVector byteVector29 = new ByteVector();
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)0);
    ByteVector byteVector33 = byteVector31.putUTF8("");
    ByteVector byteVector35 = byteVector31.putByte((int)'#');
    ByteVector byteVector37 = byteVector35.putByte((int)'4');
    byte[] byte_array41 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector44 = byteVector35.putByteArray(byte_array41, 1, 0);
    ByteVector byteVector47 = byteVector28.putByteArray(byte_array41, (int)(byte)1, 0);
    ByteVector byteVector50 = byteVector13.putByteArray(byte_array41, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector53 = byteVector9.putByteArray(byte_array41, (int)'#', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putLong((long)0);
    ByteVector byteVector9 = byteVector3.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt(100);
    ByteVector byteVector14 = byteVector12.putLong(10L);
    ByteVector byteVector16 = byteVector14.putShort((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putShort((int)'a');
    ByteVector byteVector9 = byteVector7.putLong((long)10);
    ByteVector byteVector11 = byteVector7.putShort((int)' ');
    ByteVector byteVector13 = byteVector7.putInt(10);
    ByteVector byteVector15 = byteVector13.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector15.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putByte((int)'4');
    ByteVector byteVector12 = new ByteVector();
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putShort(1);
    ByteVector byteVector18 = byteVector16.putLong((long)(short)1);
    ByteVector byteVector20 = byteVector16.putInt((int)'#');
    ByteVector byteVector22 = byteVector20.putUTF8("hi!");
    ByteVector byteVector24 = byteVector22.putInt((int)(byte)0);
    ByteVector byteVector25 = new ByteVector();
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)0);
    ByteVector byteVector29 = byteVector27.putUTF8("");
    ByteVector byteVector31 = byteVector27.putByte((int)'#');
    ByteVector byteVector33 = byteVector31.putByte((int)'4');
    byte[] byte_array37 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector40 = byteVector31.putByteArray(byte_array37, 1, 0);
    ByteVector byteVector43 = byteVector24.putByteArray(byte_array37, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector46 = byteVector3.putByteArray(byte_array37, (int)(short)0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)' ');
    ByteVector byteVector7 = byteVector5.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector15.putInt((int)'a');
    ByteVector byteVector19 = byteVector17.putInt((int)(byte)-1);
    ByteVector byteVector20 = new ByteVector();
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)10);
    ByteVector byteVector24 = byteVector22.putShort(1);
    ByteVector byteVector26 = byteVector24.putLong((long)(short)1);
    ByteVector byteVector28 = byteVector24.putShort((-1));
    ByteVector byteVector30 = byteVector28.putShort((int)'4');
    ByteVector byteVector31 = new ByteVector();
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)0);
    ByteVector byteVector35 = byteVector33.putUTF8("");
    ByteVector byteVector37 = byteVector35.putLong((long)(byte)-1);
    ByteVector byteVector38 = new ByteVector();
    byte[] byte_array40 = new byte[] { (byte)0 };
    ByteVector byteVector43 = byteVector38.putByteArray(byte_array40, 0, (int)(short)1);
    ByteVector byteVector46 = byteVector35.putByteArray(byte_array40, 0, (int)(short)1);
    ByteVector byteVector49 = byteVector30.putByteArray(byte_array40, (int)(short)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector19.putByteArray(byte_array40, (int)(short)-1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putLong(0L);
    ByteVector byteVector16 = byteVector14.putInt((int)' ');
    ByteVector byteVector18 = byteVector14.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putByte((int)(short)0);
    ByteVector byteVector13 = byteVector9.putLong((long)(short)1);
    ByteVector byteVector15 = byteVector9.putByte((int)' ');
    ByteVector byteVector17 = byteVector15.putByte((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putShort(10);
    ByteVector byteVector13 = byteVector9.putInt((int)(byte)0);
    ByteVector byteVector15 = byteVector9.putUTF8("");
    ByteVector byteVector17 = byteVector9.putInt((int)(byte)1);
    ByteVector byteVector19 = byteVector17.putLong(1L);
    ByteVector byteVector21 = byteVector17.putShort((int)(short)-1);
    ByteVector byteVector23 = byteVector21.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putUTF8("hi!");
    ByteVector byteVector8 = byteVector2.putUTF8("");
    ByteVector byteVector10 = byteVector8.putLong((long)'#');
    ByteVector byteVector12 = new ByteVector(0);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    ByteVector byteVector16 = byteVector14.putLong((long)10);
    ByteVector byteVector18 = byteVector16.putByte((int)'#');
    ByteVector byteVector20 = byteVector18.putByte(1);
    ByteVector byteVector21 = new ByteVector();
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)10);
    ByteVector byteVector25 = byteVector23.putShort((int)(byte)-1);
    byte[] byte_array32 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector35 = byteVector23.putByteArray(byte_array32, (int)(short)0, (int)(byte)0);
    ByteVector byteVector38 = byteVector20.putByteArray(byte_array32, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector10.putByteArray(byte_array32, (int)'a', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = new ByteVector((int)(short)100);
    ByteVector byteVector14 = byteVector12.putLong((long)'4');
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector17 = new ByteVector();
    byte[] byte_array19 = new byte[] { (byte)0 };
    ByteVector byteVector22 = byteVector17.putByteArray(byte_array19, 0, (int)(short)1);
    ByteVector byteVector25 = byteVector16.putByteArray(byte_array19, 0, 1);
    ByteVector byteVector28 = byteVector4.putByteArray(byte_array19, (int)(short)0, (int)(short)1);
    ByteVector byteVector30 = byteVector28.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putInt((int)(short)10);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)1);
    ByteVector byteVector25 = byteVector23.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)'#');
    ByteVector byteVector13 = byteVector11.putInt((int)'4');
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector6.putShort(0);
    ByteVector byteVector10 = byteVector6.putInt((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector9.putShort((-1));
    ByteVector byteVector12 = new ByteVector();
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putShort(1);
    ByteVector byteVector18 = byteVector16.putLong((long)(short)1);
    ByteVector byteVector20 = byteVector16.putInt((int)'#');
    ByteVector byteVector22 = byteVector16.putShort(0);
    ByteVector byteVector24 = new ByteVector((int)(short)100);
    ByteVector byteVector26 = byteVector24.putLong((long)'4');
    ByteVector byteVector28 = byteVector26.putLong((long)(byte)0);
    ByteVector byteVector29 = new ByteVector();
    byte[] byte_array31 = new byte[] { (byte)0 };
    ByteVector byteVector34 = byteVector29.putByteArray(byte_array31, 0, (int)(short)1);
    ByteVector byteVector37 = byteVector28.putByteArray(byte_array31, 0, 1);
    ByteVector byteVector40 = byteVector16.putByteArray(byte_array31, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector43 = byteVector9.putByteArray(byte_array31, 10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector17.putUTF8("hi!");
    ByteVector byteVector25 = byteVector17.putShort((int)(short)100);
    ByteVector byteVector27 = byteVector25.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)'#');
    ByteVector byteVector8 = byteVector6.putByte((int)'4');
    ByteVector byteVector10 = byteVector8.putInt((int)(byte)0);
    ByteVector byteVector12 = byteVector8.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector8.putByte((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putLong(10L);
    ByteVector byteVector13 = byteVector11.putLong((long)'4');
    ByteVector byteVector15 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putInt((int)(byte)-1);
    ByteVector byteVector19 = byteVector11.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)'#');
    ByteVector byteVector8 = byteVector6.putByte((int)'4');
    ByteVector byteVector10 = byteVector8.putLong((long)(byte)1);
    ByteVector byteVector12 = byteVector8.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)100);
    ByteVector byteVector7 = new ByteVector();
    ByteVector byteVector9 = byteVector7.putByte((int)(byte)0);
    ByteVector byteVector11 = byteVector9.putLong((long)(short)1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    ByteVector byteVector15 = byteVector9.putUTF8("");
    ByteVector byteVector17 = new ByteVector(0);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putLong((long)10);
    ByteVector byteVector23 = byteVector21.putLong((long)(byte)-1);
    ByteVector byteVector25 = byteVector23.putUTF8("hi!");
    ByteVector byteVector27 = byteVector23.putUTF8("");
    byte[] byte_array28 = null;
    ByteVector byteVector31 = byteVector23.putByteArray(byte_array28, (int)(byte)1, 0);
    ByteVector byteVector33 = byteVector23.putUTF8("hi!");
    ByteVector byteVector35 = byteVector23.putUTF8("hi!");
    byte[] byte_array42 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector45 = byteVector23.putByteArray(byte_array42, (int)(byte)0, 0);
    ByteVector byteVector48 = byteVector9.putByteArray(byte_array42, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector51 = byteVector4.putByteArray(byte_array42, (int)' ', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putUTF8("");
    ByteVector byteVector14 = byteVector12.putShort(0);
    ByteVector byteVector16 = byteVector14.putShort((int)(short)100);
    ByteVector byteVector18 = byteVector16.putByte((int)(short)1);
    ByteVector byteVector20 = byteVector16.putShort((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector3.putLong(100L);
    ByteVector byteVector9 = byteVector3.putUTF8("");
    ByteVector byteVector11 = byteVector3.putShort((int)(short)1);
    ByteVector byteVector13 = byteVector3.putShort((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putInt((int)(short)100);
    ByteVector byteVector21 = byteVector7.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putInt(0);
    ByteVector byteVector15 = byteVector13.putByte((int)(short)0);
    ByteVector byteVector17 = byteVector15.putShort((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    byte[] byte_array11 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector14 = byteVector2.putByteArray(byte_array11, (int)(short)0, (int)(byte)0);
    ByteVector byteVector16 = new ByteVector(0);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong((long)10);
    ByteVector byteVector22 = byteVector20.putByte((int)'#');
    ByteVector byteVector24 = byteVector22.putByte(1);
    ByteVector byteVector25 = new ByteVector();
    ByteVector byteVector27 = byteVector25.putShort((int)(byte)10);
    ByteVector byteVector29 = byteVector27.putShort((int)(byte)-1);
    byte[] byte_array36 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector39 = byteVector27.putByteArray(byte_array36, (int)(short)0, (int)(byte)0);
    ByteVector byteVector42 = byteVector24.putByteArray(byte_array36, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector45 = byteVector2.putByteArray(byte_array36, (int)(byte)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putLong((long)0);
    ByteVector byteVector9 = byteVector3.putInt(10);
    ByteVector byteVector11 = byteVector9.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    byte[] byte_array26 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array26, (int)(byte)0, 0);
    ByteVector byteVector31 = new ByteVector(0);
    ByteVector byteVector33 = byteVector31.putUTF8("hi!");
    ByteVector byteVector35 = byteVector33.putLong((long)10);
    ByteVector byteVector37 = byteVector35.putByte((int)'#');
    ByteVector byteVector39 = byteVector37.putByte(1);
    ByteVector byteVector40 = new ByteVector();
    ByteVector byteVector42 = byteVector40.putShort((int)(byte)10);
    ByteVector byteVector44 = byteVector42.putShort((int)(byte)-1);
    byte[] byte_array51 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector54 = byteVector42.putByteArray(byte_array51, (int)(short)0, (int)(byte)0);
    ByteVector byteVector57 = byteVector39.putByteArray(byte_array51, (int)(byte)0, 0);
    ByteVector byteVector59 = byteVector57.putUTF8("hi!");
    ByteVector byteVector61 = byteVector57.putInt(0);
    ByteVector byteVector62 = new ByteVector();
    ByteVector byteVector64 = byteVector62.putByte((int)(byte)0);
    ByteVector byteVector66 = byteVector64.putUTF8("");
    ByteVector byteVector68 = byteVector64.putByte((int)'#');
    ByteVector byteVector70 = byteVector68.putByte((int)'4');
    byte[] byte_array74 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector77 = byteVector68.putByteArray(byte_array74, 1, 0);
    ByteVector byteVector80 = byteVector57.putByteArray(byte_array74, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector83 = byteVector29.putByteArray(byte_array74, 1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector80);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector4.putByte((int)(byte)100);
    ByteVector byteVector12 = byteVector4.putInt(100);
    ByteVector byteVector14 = byteVector12.putInt((int)(byte)1);
    ByteVector byteVector16 = byteVector14.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector2.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector4.putShort(1);
    ByteVector byteVector16 = byteVector14.putInt(1);
    ByteVector byteVector18 = byteVector14.putInt((int)'#');
    ByteVector byteVector20 = byteVector14.putShort(1);
    ByteVector byteVector22 = byteVector20.putUTF8("hi!");
    ByteVector byteVector24 = byteVector22.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)100);
    ByteVector byteVector8 = byteVector6.putLong((long)(byte)1);
    ByteVector byteVector10 = byteVector8.putLong((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)0);
    ByteVector byteVector12 = byteVector8.putUTF8("hi!");
    ByteVector byteVector14 = byteVector8.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putUTF8("");
    ByteVector byteVector8 = byteVector4.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putLong(0L);
    ByteVector byteVector16 = byteVector12.putShort((int)(byte)0);
    ByteVector byteVector18 = byteVector12.putByte((int)(byte)0);
    ByteVector byteVector20 = byteVector18.putInt((int)'a');
    ByteVector byteVector22 = byteVector20.putByte(1);
    ByteVector byteVector24 = byteVector22.putShort((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)0);
    ByteVector byteVector12 = byteVector8.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putShort((int)'4');
    ByteVector byteVector11 = byteVector9.putUTF8("hi!");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector11.putByteArray(byte_array12, (int)'#', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector4.putLong((long)1);
    ByteVector byteVector12 = byteVector4.putByte(0);
    ByteVector byteVector14 = byteVector12.putShort(100);
    ByteVector byteVector16 = byteVector12.putShort(0);
    ByteVector byteVector18 = byteVector16.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putInt((int)(short)10);
    ByteVector byteVector23 = byteVector21.putByte((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector10.putByte((int)(short)1);
    ByteVector byteVector14 = byteVector10.putByte((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    ByteVector byteVector21 = byteVector7.putShort((int)(short)10);
    ByteVector byteVector23 = byteVector21.putShort((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong(100L);
    ByteVector byteVector15 = new ByteVector(0);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putInt((int)'a');
    ByteVector byteVector21 = byteVector17.putShort((int)'a');
    ByteVector byteVector22 = new ByteVector();
    ByteVector byteVector24 = byteVector22.putShort((int)(byte)10);
    ByteVector byteVector26 = byteVector24.putShort((int)(byte)-1);
    byte[] byte_array33 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector36 = byteVector24.putByteArray(byte_array33, (int)(short)0, (int)(byte)0);
    ByteVector byteVector39 = byteVector21.putByteArray(byte_array33, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector13.putByteArray(byte_array33, (int)'4', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector5.putByte((-1));
    ByteVector byteVector13 = byteVector11.putInt(10);
    ByteVector byteVector15 = byteVector11.putShort((int)'a');
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector5.putInt((int)' ');
    ByteVector byteVector9 = byteVector7.putLong((long)(short)100);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)1);
    ByteVector byteVector13 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector5.putLong((long)(byte)0);
    ByteVector byteVector11 = byteVector5.putByte((-1));
    ByteVector byteVector13 = byteVector11.putByte((-1));
    ByteVector byteVector14 = new ByteVector();
    ByteVector byteVector16 = byteVector14.putShort((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)-1);
    byte[] byte_array25 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector28 = byteVector16.putByteArray(byte_array25, (int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector31 = byteVector11.putByteArray(byte_array25, (int)(byte)-1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = new ByteVector(0);
    ByteVector byteVector11 = byteVector9.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector11.putShort((int)'4');
    ByteVector byteVector15 = byteVector11.putByte(1);
    ByteVector byteVector17 = byteVector15.putShort((int)'#');
    ByteVector byteVector19 = byteVector17.putShort(10);
    ByteVector byteVector21 = byteVector17.putInt((int)(byte)0);
    ByteVector byteVector23 = byteVector17.putUTF8("");
    ByteVector byteVector25 = new ByteVector(0);
    ByteVector byteVector27 = byteVector25.putLong((long)(short)-1);
    ByteVector byteVector29 = byteVector27.putShort((int)'4');
    ByteVector byteVector31 = byteVector27.putByte(1);
    ByteVector byteVector33 = byteVector31.putShort((int)'#');
    ByteVector byteVector35 = byteVector31.putLong((long)(byte)100);
    ByteVector byteVector37 = byteVector31.putInt(1);
    byte[] byte_array40 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector43 = byteVector31.putByteArray(byte_array40, 0, (int)(byte)0);
    ByteVector byteVector46 = byteVector17.putByteArray(byte_array40, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector49 = byteVector1.putByteArray(byte_array40, 10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector21.putShort((int)'4');
    ByteVector byteVector25 = byteVector21.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    ByteVector byteVector17 = byteVector13.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putByte(1);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector12 = new ByteVector();
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putShort(1);
    ByteVector byteVector18 = new ByteVector(0);
    ByteVector byteVector20 = byteVector18.putUTF8("hi!");
    ByteVector byteVector22 = byteVector20.putLong((long)10);
    ByteVector byteVector24 = byteVector22.putLong((long)(byte)-1);
    ByteVector byteVector26 = byteVector24.putUTF8("hi!");
    ByteVector byteVector28 = byteVector24.putUTF8("");
    byte[] byte_array29 = null;
    ByteVector byteVector32 = byteVector24.putByteArray(byte_array29, (int)(byte)1, 0);
    ByteVector byteVector34 = byteVector24.putUTF8("hi!");
    ByteVector byteVector36 = byteVector24.putUTF8("hi!");
    byte[] byte_array43 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector46 = byteVector24.putByteArray(byte_array43, (int)(byte)0, 0);
    ByteVector byteVector49 = byteVector16.putByteArray(byte_array43, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector9.putByteArray(byte_array43, (int)(byte)0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putInt((int)'a');
    ByteVector byteVector7 = byteVector3.putShort((int)'a');
    ByteVector byteVector8 = new ByteVector();
    ByteVector byteVector10 = byteVector8.putShort((int)(byte)10);
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)-1);
    byte[] byte_array19 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector22 = byteVector10.putByteArray(byte_array19, (int)(short)0, (int)(byte)0);
    ByteVector byteVector25 = byteVector7.putByteArray(byte_array19, (int)(short)0, (int)(byte)1);
    ByteVector byteVector27 = byteVector7.putLong((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putLong(10L);
    ByteVector byteVector13 = byteVector11.putLong((long)'4');
    ByteVector byteVector15 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)-1);
    ByteVector byteVector23 = byteVector19.putByte((int)(short)10);
    ByteVector byteVector25 = byteVector19.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putLong((long)(short)10);
    ByteVector byteVector9 = byteVector5.putInt((int)(short)1);
    ByteVector byteVector11 = new ByteVector(0);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)10);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putByte(1);
    ByteVector byteVector20 = new ByteVector();
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)10);
    ByteVector byteVector24 = byteVector22.putShort((int)(byte)-1);
    byte[] byte_array31 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector34 = byteVector22.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    ByteVector byteVector37 = byteVector19.putByteArray(byte_array31, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector40 = byteVector5.putByteArray(byte_array31, (int)(byte)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector7.putUTF8("");
    ByteVector byteVector17 = byteVector15.putByte((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector9.putInt(1);
    ByteVector byteVector13 = byteVector9.putInt(0);
    ByteVector byteVector15 = byteVector13.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector6.putInt(100);
    ByteVector byteVector12 = byteVector10.putByte((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector9.putShort((-1));
    ByteVector byteVector13 = byteVector9.putInt(0);
    ByteVector byteVector15 = byteVector9.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putByte(1);
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)-1);
    byte[] byte_array21 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector24 = byteVector12.putByteArray(byte_array21, (int)(short)0, (int)(byte)0);
    ByteVector byteVector27 = byteVector9.putByteArray(byte_array21, (int)(byte)0, 0);
    ByteVector byteVector29 = new ByteVector(0);
    ByteVector byteVector31 = byteVector29.putUTF8("hi!");
    ByteVector byteVector33 = byteVector31.putLong((long)10);
    ByteVector byteVector35 = byteVector31.putUTF8("hi!");
    ByteVector byteVector37 = byteVector35.putUTF8("");
    ByteVector byteVector38 = new ByteVector();
    ByteVector byteVector40 = byteVector38.putShort((int)(byte)10);
    ByteVector byteVector42 = byteVector40.putShort((int)(byte)-1);
    byte[] byte_array49 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector52 = byteVector40.putByteArray(byte_array49, (int)(short)0, (int)(byte)0);
    ByteVector byteVector55 = byteVector37.putByteArray(byte_array49, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector58 = byteVector9.putByteArray(byte_array49, (int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector6.putLong((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    ByteVector byteVector0 = new ByteVector();
    byte[] byte_array2 = new byte[] { (byte)0 };
    ByteVector byteVector5 = byteVector0.putByteArray(byte_array2, 0, (int)(short)1);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)10);
    ByteVector byteVector11 = byteVector9.putShort((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putByte(0);
    ByteVector byteVector10 = byteVector4.putInt((int)(byte)0);
    ByteVector byteVector12 = byteVector4.putLong(0L);
    ByteVector byteVector14 = byteVector4.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector9.putInt((int)(byte)1);
    ByteVector byteVector13 = byteVector11.putLong((long)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putByte((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = new ByteVector(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(short)-1);
    ByteVector byteVector17 = byteVector15.putShort((int)'4');
    ByteVector byteVector19 = byteVector15.putByte(1);
    ByteVector byteVector21 = byteVector19.putShort((int)'#');
    ByteVector byteVector23 = byteVector19.putLong((long)(byte)100);
    ByteVector byteVector25 = byteVector19.putInt((int)(short)0);
    ByteVector byteVector27 = byteVector25.putByte(1);
    ByteVector byteVector29 = byteVector25.putByte((int)'#');
    ByteVector byteVector31 = byteVector29.putShort((int)(short)0);
    ByteVector byteVector33 = byteVector31.putShort((int)(byte)-1);
    ByteVector byteVector35 = byteVector31.putInt((int)(short)1);
    ByteVector byteVector37 = byteVector31.putUTF8("");
    ByteVector byteVector39 = byteVector37.putUTF8("");
    ByteVector byteVector40 = new ByteVector();
    ByteVector byteVector42 = byteVector40.putByte((int)(byte)0);
    ByteVector byteVector44 = byteVector42.putLong((long)(short)1);
    ByteVector byteVector46 = byteVector42.putUTF8("hi!");
    ByteVector byteVector48 = byteVector42.putUTF8("");
    ByteVector byteVector50 = new ByteVector(0);
    ByteVector byteVector52 = byteVector50.putUTF8("hi!");
    ByteVector byteVector54 = byteVector52.putLong((long)10);
    ByteVector byteVector56 = byteVector54.putLong((long)(byte)-1);
    ByteVector byteVector58 = byteVector56.putUTF8("hi!");
    ByteVector byteVector60 = byteVector56.putUTF8("");
    byte[] byte_array61 = null;
    ByteVector byteVector64 = byteVector56.putByteArray(byte_array61, (int)(byte)1, 0);
    ByteVector byteVector66 = byteVector56.putUTF8("hi!");
    ByteVector byteVector68 = byteVector56.putUTF8("hi!");
    byte[] byte_array75 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector78 = byteVector56.putByteArray(byte_array75, (int)(byte)0, 0);
    ByteVector byteVector81 = byteVector42.putByteArray(byte_array75, 1, 0);
    ByteVector byteVector84 = byteVector39.putByteArray(byte_array75, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector87 = byteVector7.putByteArray(byte_array75, (int)(byte)-1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector84);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector6.putByte((int)(short)100);
    ByteVector byteVector10 = byteVector8.putByte((int)' ');
    ByteVector byteVector12 = byteVector10.putLong((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector13.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putShort((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector4.putLong((long)1);
    ByteVector byteVector12 = byteVector4.putByte(0);
    ByteVector byteVector14 = byteVector12.putShort(100);
    ByteVector byteVector16 = byteVector12.putShort(0);
    ByteVector byteVector18 = byteVector12.putShort((int)(byte)10);
    ByteVector byteVector20 = byteVector18.putShort(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);
    ByteVector byteVector3 = byteVector1.putLong((long)'4');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putShort((int)(short)0);
    ByteVector byteVector11 = byteVector7.putLong((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putLong(0L);
    ByteVector byteVector21 = byteVector19.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putByte((-1));
    ByteVector byteVector11 = byteVector9.putInt((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putByte((int)(short)0);
    ByteVector byteVector13 = byteVector9.putLong((long)(short)1);
    ByteVector byteVector15 = byteVector9.putByte((int)' ');
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector9.putShort((-1));
    ByteVector byteVector13 = byteVector9.putInt((int)(short)1);
    ByteVector byteVector15 = byteVector9.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector1.putShort(1);
    ByteVector byteVector13 = byteVector1.putInt((int)' ');
    ByteVector byteVector15 = byteVector13.putInt(1);
    ByteVector byteVector16 = new ByteVector();
    ByteVector byteVector18 = byteVector16.putShort((int)(byte)10);
    ByteVector byteVector20 = byteVector18.putShort(1);
    ByteVector byteVector22 = byteVector20.putLong((long)(short)1);
    ByteVector byteVector24 = byteVector20.putInt((int)'#');
    ByteVector byteVector26 = byteVector24.putUTF8("hi!");
    ByteVector byteVector28 = byteVector26.putInt((int)(byte)0);
    ByteVector byteVector29 = new ByteVector();
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)0);
    ByteVector byteVector33 = byteVector31.putUTF8("");
    ByteVector byteVector35 = byteVector31.putByte((int)'#');
    ByteVector byteVector37 = byteVector35.putByte((int)'4');
    byte[] byte_array41 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector44 = byteVector35.putByteArray(byte_array41, 1, 0);
    ByteVector byteVector47 = byteVector28.putByteArray(byte_array41, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector15.putByteArray(byte_array41, (int)(byte)10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector0.putInt(10);
    ByteVector byteVector6 = byteVector0.putLong((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putShort((int)(short)-1);
    ByteVector byteVector19 = byteVector17.putLong((long)(-1));
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)10);
    ByteVector byteVector7 = byteVector3.putByte(0);
    ByteVector byteVector9 = byteVector3.putUTF8("");
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putShort(1);
    ByteVector byteVector16 = new ByteVector(0);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong((long)10);
    ByteVector byteVector22 = byteVector20.putLong((long)(byte)-1);
    ByteVector byteVector24 = byteVector22.putUTF8("hi!");
    ByteVector byteVector26 = byteVector22.putUTF8("");
    byte[] byte_array27 = null;
    ByteVector byteVector30 = byteVector22.putByteArray(byte_array27, (int)(byte)1, 0);
    ByteVector byteVector32 = byteVector22.putUTF8("hi!");
    ByteVector byteVector34 = byteVector22.putUTF8("hi!");
    byte[] byte_array41 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector44 = byteVector22.putByteArray(byte_array41, (int)(byte)0, 0);
    ByteVector byteVector47 = byteVector14.putByteArray(byte_array41, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector3.putByteArray(byte_array41, 10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putUTF8("hi!");
    ByteVector byteVector8 = byteVector2.putLong((long)0);
    ByteVector byteVector10 = byteVector8.putByte((int)'4');
    ByteVector byteVector12 = byteVector8.putInt((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    byte[] byte_array26 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array26, (int)(byte)0, 0);
    ByteVector byteVector31 = byteVector29.putUTF8("hi!");
    ByteVector byteVector33 = byteVector29.putShort((int)'a');
    ByteVector byteVector35 = byteVector33.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putShort(10);
    ByteVector byteVector13 = byteVector9.putInt((int)(byte)0);
    ByteVector byteVector15 = byteVector9.putUTF8("");
    ByteVector byteVector17 = new ByteVector(0);
    ByteVector byteVector19 = byteVector17.putLong((long)(short)-1);
    ByteVector byteVector21 = byteVector19.putShort((int)'4');
    ByteVector byteVector23 = byteVector19.putByte(1);
    ByteVector byteVector25 = byteVector23.putShort((int)'#');
    ByteVector byteVector27 = byteVector23.putLong((long)(byte)100);
    ByteVector byteVector29 = byteVector23.putInt(1);
    byte[] byte_array32 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector35 = byteVector23.putByteArray(byte_array32, 0, (int)(byte)0);
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array32, (int)(short)0, 0);
    ByteVector byteVector40 = byteVector38.putByte(1);
    ByteVector byteVector42 = byteVector40.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)-1);
    byte[] byte_array21 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector24 = byteVector12.putByteArray(byte_array21, (int)(short)0, (int)(byte)0);
    ByteVector byteVector27 = byteVector9.putByteArray(byte_array21, (int)(byte)0, 1);
    ByteVector byteVector29 = byteVector9.putByte((int)(short)-1);
    ByteVector byteVector31 = byteVector9.putByte((int)(byte)10);
    ByteVector byteVector33 = byteVector31.putInt(0);
    ByteVector byteVector35 = byteVector33.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector9.putLong((long)(short)-1);
    ByteVector byteVector13 = byteVector11.putInt((int)(byte)-1);
    ByteVector byteVector15 = byteVector11.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector15.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putByte((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)0);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putShort((int)(byte)100);
    ByteVector byteVector13 = byteVector9.putShort((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putLong((long)10);
    ByteVector byteVector17 = byteVector11.putLong((long)10);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector19.putUTF8("");
    ByteVector byteVector25 = byteVector19.putByte(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putShort((int)(short)-1);
    ByteVector byteVector19 = byteVector17.putLong((long)(-1));
    ByteVector byteVector21 = byteVector17.putByte((int)(short)10);
    ByteVector byteVector23 = byteVector17.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector4.putLong((long)10);
    ByteVector byteVector12 = byteVector4.putInt((int)(short)10);
    ByteVector byteVector14 = byteVector4.putLong((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putLong(0L);
    ByteVector byteVector16 = byteVector14.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector7 = byteVector1.putShort((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putShort((int)(byte)100);
    ByteVector byteVector8 = byteVector4.putShort(10);
    ByteVector byteVector10 = byteVector4.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector7 = new ByteVector();
    byte[] byte_array9 = new byte[] { (byte)0 };
    ByteVector byteVector12 = byteVector7.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector4.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector17 = byteVector15.putLong((long)'4');
    ByteVector byteVector19 = byteVector17.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)-1);
    ByteVector byteVector23 = byteVector19.putByte((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector9.putLong((long)' ');
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putUTF8("");
    ByteVector byteVector15 = byteVector7.putUTF8("hi!");
    ByteVector byteVector17 = byteVector15.putLong((long)0);
    ByteVector byteVector18 = new ByteVector();
    ByteVector byteVector20 = byteVector18.putShort((int)(byte)10);
    ByteVector byteVector22 = byteVector20.putShort(1);
    ByteVector byteVector24 = byteVector22.putLong((long)(short)1);
    ByteVector byteVector26 = byteVector22.putInt((int)'#');
    ByteVector byteVector28 = byteVector26.putUTF8("hi!");
    ByteVector byteVector30 = byteVector28.putInt((int)(byte)0);
    ByteVector byteVector31 = new ByteVector();
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)0);
    ByteVector byteVector35 = byteVector33.putUTF8("");
    ByteVector byteVector37 = byteVector33.putByte((int)'#');
    ByteVector byteVector39 = byteVector37.putByte((int)'4');
    byte[] byte_array43 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector46 = byteVector37.putByteArray(byte_array43, 1, 0);
    ByteVector byteVector49 = byteVector30.putByteArray(byte_array43, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector17.putByteArray(byte_array43, (int)(byte)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector11.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector11.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector0.putLong((long)' ');
    ByteVector byteVector6 = byteVector4.putShort((int)(short)0);
    ByteVector byteVector8 = byteVector4.putInt(10);
    ByteVector byteVector10 = byteVector4.putInt(0);
    ByteVector byteVector12 = byteVector10.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)10);
    ByteVector byteVector7 = byteVector5.putByte(100);
    ByteVector byteVector9 = byteVector5.putLong((long)' ');
    ByteVector byteVector11 = byteVector5.putByte((int)(short)10);
    ByteVector byteVector13 = byteVector11.putShort((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt(1);
    byte[] byte_array16 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector19 = byteVector7.putByteArray(byte_array16, 0, (int)(byte)0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)10 };
    ByteVector byteVector25 = byteVector19.putByteArray(byte_array22, (int)(short)1, (int)(byte)0);
    ByteVector byteVector27 = byteVector19.putByte((int)(byte)1);
    ByteVector byteVector29 = byteVector27.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    ByteVector byteVector0 = new ByteVector();
    byte[] byte_array2 = new byte[] { (byte)0 };
    ByteVector byteVector5 = byteVector0.putByteArray(byte_array2, 0, (int)(short)1);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector7.putInt((int)'4');
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector14 = new ByteVector();
    byte[] byte_array16 = new byte[] { (byte)0 };
    ByteVector byteVector19 = byteVector14.putByteArray(byte_array16, 0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector22 = byteVector11.putByteArray(byte_array16, 100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector1.putShort(1);
    ByteVector byteVector13 = byteVector1.putByte((int)(byte)-1);
    ByteVector byteVector15 = byteVector13.putByte((int)(short)1);
    ByteVector byteVector17 = byteVector13.putShort((int)(short)1);
    ByteVector byteVector19 = byteVector17.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);
    ByteVector byteVector3 = byteVector1.putLong((long)'4');
    ByteVector byteVector5 = byteVector3.putLong((long)0);
    ByteVector byteVector7 = byteVector3.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putShort((int)(byte)100);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector9.putByteArray(byte_array12, (-1), (int)'a');
    ByteVector byteVector17 = byteVector9.putByte((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector5.putUTF8("hi!");
    ByteVector byteVector9 = byteVector5.putUTF8("hi!");
    ByteVector byteVector11 = new ByteVector(0);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putInt((int)'a');
    ByteVector byteVector17 = byteVector13.putShort((int)'a');
    ByteVector byteVector18 = new ByteVector();
    ByteVector byteVector20 = byteVector18.putShort((int)(byte)10);
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)-1);
    byte[] byte_array29 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector32 = byteVector20.putByteArray(byte_array29, (int)(short)0, (int)(byte)0);
    ByteVector byteVector35 = byteVector17.putByteArray(byte_array29, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array29, (int)(byte)-1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)' ');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector2.putInt((int)'a');
    ByteVector byteVector10 = byteVector8.putLong((long)(byte)-1);
    ByteVector byteVector12 = byteVector10.putByte((int)' ');
    ByteVector byteVector14 = byteVector12.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector4.putInt((int)'#');
    ByteVector byteVector12 = byteVector10.putByte((int)(short)100);
    ByteVector byteVector14 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector16 = byteVector10.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putInt((int)(short)0);
    ByteVector byteVector19 = byteVector11.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector19.putLong(10L);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector24 = new ByteVector();
    ByteVector byteVector26 = byteVector24.putByte((int)(byte)0);
    ByteVector byteVector28 = byteVector26.putUTF8("");
    ByteVector byteVector30 = byteVector26.putByte((int)'#');
    ByteVector byteVector32 = byteVector30.putInt((int)(byte)10);
    ByteVector byteVector34 = byteVector30.putInt((int)(short)0);
    byte[] byte_array35 = null;
    ByteVector byteVector38 = byteVector34.putByteArray(byte_array35, 0, (-1));
    byte[] byte_array41 = new byte[] { (byte)100, (byte)-1 };
    ByteVector byteVector44 = byteVector34.putByteArray(byte_array41, (int)(byte)0, 0);
    ByteVector byteVector47 = byteVector23.putByteArray(byte_array41, (int)(byte)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector2.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putByte((int)(byte)1);
    ByteVector byteVector10 = byteVector6.putInt((int)(byte)1);
    ByteVector byteVector12 = byteVector10.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector8.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector13.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    ByteVector byteVector1 = new ByteVector((int)'#');
    ByteVector byteVector3 = byteVector1.putInt((int)(short)0);
    ByteVector byteVector5 = byteVector1.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector7.putShort((int)(byte)1);
    ByteVector byteVector17 = byteVector7.putByte(1);
    byte[] byte_array18 = null;
    ByteVector byteVector21 = byteVector17.putByteArray(byte_array18, (int)(byte)10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector3.putByte((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector8 = new ByteVector();
    ByteVector byteVector10 = byteVector8.putShort((int)(byte)10);
    ByteVector byteVector12 = byteVector10.putShort(1);
    ByteVector byteVector14 = byteVector12.putLong((long)(short)1);
    ByteVector byteVector16 = byteVector12.putInt((int)'#');
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putInt((int)(byte)0);
    ByteVector byteVector21 = new ByteVector();
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)0);
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = byteVector23.putByte((int)'#');
    ByteVector byteVector29 = byteVector27.putByte((int)'4');
    byte[] byte_array33 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector36 = byteVector27.putByteArray(byte_array33, 1, 0);
    ByteVector byteVector39 = byteVector20.putByteArray(byte_array33, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector42 = byteVector7.putByteArray(byte_array33, (-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector4.putLong((long)10);
    ByteVector byteVector12 = byteVector4.putInt((int)(short)10);
    ByteVector byteVector14 = byteVector12.putInt((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)'#');
    ByteVector byteVector8 = byteVector6.putByte((int)'4');
    ByteVector byteVector10 = byteVector8.putInt((int)(byte)0);
    ByteVector byteVector12 = byteVector8.putUTF8("hi!");
    ByteVector byteVector14 = byteVector8.putLong((long)'#');
    ByteVector byteVector16 = byteVector14.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putShort((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector19.putLong((long)(short)-1);
    ByteVector byteVector25 = byteVector19.putShort(0);
    ByteVector byteVector27 = byteVector25.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putShort((-1));
    ByteVector byteVector10 = byteVector4.putByte(0);
    ByteVector byteVector12 = byteVector4.putInt((int)(short)0);
    ByteVector byteVector14 = byteVector4.putInt((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)'#');
    ByteVector byteVector8 = byteVector2.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt((int)(byte)0);
    ByteVector byteVector5 = byteVector3.putUTF8("");
    ByteVector byteVector7 = byteVector3.putInt((int)(short)0);
    ByteVector byteVector9 = byteVector3.putShort((int)(short)100);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putLong((long)(byte)-1);
    ByteVector byteVector21 = byteVector17.putLong((long)(short)0);
    ByteVector byteVector23 = byteVector21.putUTF8("hi!");
    ByteVector byteVector25 = byteVector21.putLong(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putByte(0);
    ByteVector byteVector10 = byteVector8.putShort((int)(byte)100);
    ByteVector byteVector12 = byteVector10.putShort((int)'4');
    ByteVector byteVector14 = byteVector10.putInt((int)(byte)100);
    ByteVector byteVector16 = byteVector14.putLong((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putByte(1);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putShort((int)(byte)0);
    ByteVector byteVector15 = byteVector13.putUTF8("");
    ByteVector byteVector17 = new ByteVector(0);
    ByteVector byteVector19 = byteVector17.putLong((long)(short)-1);
    ByteVector byteVector21 = byteVector19.putShort((int)'4');
    ByteVector byteVector23 = byteVector19.putByte(1);
    ByteVector byteVector25 = byteVector23.putShort((int)'#');
    ByteVector byteVector27 = byteVector23.putLong((long)(byte)100);
    ByteVector byteVector29 = byteVector23.putInt((int)(short)0);
    ByteVector byteVector31 = byteVector29.putByte(1);
    ByteVector byteVector33 = byteVector29.putByte((int)'#');
    ByteVector byteVector35 = byteVector33.putShort((int)(short)0);
    ByteVector byteVector37 = byteVector35.putShort((int)(byte)-1);
    ByteVector byteVector39 = byteVector35.putInt((int)(short)1);
    ByteVector byteVector41 = byteVector35.putUTF8("");
    ByteVector byteVector43 = byteVector41.putUTF8("");
    ByteVector byteVector44 = new ByteVector();
    ByteVector byteVector46 = byteVector44.putByte((int)(byte)0);
    ByteVector byteVector48 = byteVector46.putLong((long)(short)1);
    ByteVector byteVector50 = byteVector46.putUTF8("hi!");
    ByteVector byteVector52 = byteVector46.putUTF8("");
    ByteVector byteVector54 = new ByteVector(0);
    ByteVector byteVector56 = byteVector54.putUTF8("hi!");
    ByteVector byteVector58 = byteVector56.putLong((long)10);
    ByteVector byteVector60 = byteVector58.putLong((long)(byte)-1);
    ByteVector byteVector62 = byteVector60.putUTF8("hi!");
    ByteVector byteVector64 = byteVector60.putUTF8("");
    byte[] byte_array65 = null;
    ByteVector byteVector68 = byteVector60.putByteArray(byte_array65, (int)(byte)1, 0);
    ByteVector byteVector70 = byteVector60.putUTF8("hi!");
    ByteVector byteVector72 = byteVector60.putUTF8("hi!");
    byte[] byte_array79 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector82 = byteVector60.putByteArray(byte_array79, (int)(byte)0, 0);
    ByteVector byteVector85 = byteVector46.putByteArray(byte_array79, 1, 0);
    ByteVector byteVector88 = byteVector43.putByteArray(byte_array79, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector91 = byteVector13.putByteArray(byte_array79, 10, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector88);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putLong((long)'#');
    ByteVector byteVector17 = byteVector15.putUTF8("hi!");
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector5.putShort(10);
    ByteVector byteVector9 = byteVector5.putLong((long)(short)1);
    ByteVector byteVector11 = new ByteVector(0);
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector13.putLong((long)10);
    ByteVector byteVector17 = byteVector15.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putByte(1);
    ByteVector byteVector20 = new ByteVector();
    ByteVector byteVector22 = byteVector20.putShort((int)(byte)10);
    ByteVector byteVector24 = byteVector22.putShort((int)(byte)-1);
    byte[] byte_array31 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector34 = byteVector22.putByteArray(byte_array31, (int)(short)0, (int)(byte)0);
    ByteVector byteVector37 = byteVector19.putByteArray(byte_array31, (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector40 = byteVector5.putByteArray(byte_array31, (int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putInt(0);
    ByteVector byteVector19 = byteVector17.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector9.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putShort((int)'a');
    ByteVector byteVector17 = new ByteVector(0);
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putLong((long)10);
    ByteVector byteVector23 = byteVector21.putByte((int)'#');
    ByteVector byteVector25 = byteVector23.putByte(1);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putShort((int)(byte)10);
    ByteVector byteVector30 = byteVector28.putShort((int)(byte)-1);
    byte[] byte_array37 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector40 = byteVector28.putByteArray(byte_array37, (int)(short)0, (int)(byte)0);
    ByteVector byteVector43 = byteVector25.putByteArray(byte_array37, (int)(byte)0, 0);
    ByteVector byteVector45 = byteVector43.putUTF8("hi!");
    ByteVector byteVector47 = byteVector43.putInt(0);
    ByteVector byteVector48 = new ByteVector();
    ByteVector byteVector50 = byteVector48.putByte((int)(byte)0);
    ByteVector byteVector52 = byteVector50.putUTF8("");
    ByteVector byteVector54 = byteVector50.putByte((int)'#');
    ByteVector byteVector56 = byteVector54.putByte((int)'4');
    byte[] byte_array60 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector63 = byteVector54.putByteArray(byte_array60, 1, 0);
    ByteVector byteVector66 = byteVector43.putByteArray(byte_array60, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector69 = byteVector15.putByteArray(byte_array60, (int)(byte)-1, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector66);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector19.putLong((long)1);
    ByteVector byteVector23 = byteVector21.putInt(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector4.putLong((long)1);
    ByteVector byteVector12 = byteVector10.putShort((int)(short)100);
    ByteVector byteVector14 = byteVector10.putByte((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector17.putShort((int)'a');
    ByteVector byteVector23 = byteVector21.putLong((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putShort((-1));
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector8.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector7.putLong(100L);
    ByteVector byteVector17 = byteVector7.putInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putInt((int)(short)-1);
    ByteVector byteVector12 = byteVector8.putByte((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector9.putInt((int)(short)0);
    ByteVector byteVector13 = byteVector9.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)1);
    ByteVector byteVector17 = byteVector13.putLong((long)'#');
    ByteVector byteVector19 = byteVector13.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putUTF8("hi!");
    ByteVector byteVector8 = byteVector2.putLong((long)0);
    ByteVector byteVector10 = byteVector2.putInt((int)'a');
    ByteVector byteVector12 = byteVector10.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putByte((-1));
    ByteVector byteVector11 = byteVector9.putShort(1);
    ByteVector byteVector13 = byteVector9.putLong((long)1);
    ByteVector byteVector15 = byteVector9.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    byte[] byte_array26 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array26, (int)(byte)0, 0);
    ByteVector byteVector31 = byteVector29.putShort((int)'4');
    ByteVector byteVector33 = byteVector31.putInt((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putLong(10L);
    ByteVector byteVector13 = byteVector11.putLong((long)'4');
    ByteVector byteVector15 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putShort((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector7.putLong((long)(byte)-1);
    ByteVector byteVector17 = byteVector15.putByte((int)(short)100);
    ByteVector byteVector19 = byteVector17.putShort((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector1.putByte((int)(short)100);
    ByteVector byteVector13 = byteVector11.putByte(10);
    ByteVector byteVector15 = byteVector11.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)10);
    ByteVector byteVector8 = byteVector4.putShort((-1));
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector6.putInt((int)(short)100);
    ByteVector byteVector10 = byteVector8.putLong(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    ByteVector byteVector0 = new ByteVector();
    byte[] byte_array2 = new byte[] { (byte)0 };
    ByteVector byteVector5 = byteVector0.putByteArray(byte_array2, 0, (int)(short)1);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector7.putInt((int)'4');
    ByteVector byteVector11 = byteVector9.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    ByteVector byteVector7 = byteVector5.putLong((long)(short)10);
    ByteVector byteVector9 = byteVector7.putShort((int)'a');
    ByteVector byteVector11 = byteVector7.putByte((int)(short)100);
    ByteVector byteVector13 = byteVector11.putLong((long)(byte)1);
    ByteVector byteVector15 = byteVector13.putLong((long)(-1));
    ByteVector byteVector17 = byteVector13.putInt((int)(byte)1);
    ByteVector byteVector19 = byteVector13.putInt((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)1);
    ByteVector byteVector12 = byteVector8.putShort(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector4.putByte((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)1);
    ByteVector byteVector17 = byteVector13.putUTF8("");
    ByteVector byteVector19 = byteVector17.putByte((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    byte[] byte_array26 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector29 = byteVector7.putByteArray(byte_array26, (int)(byte)0, 0);
    ByteVector byteVector31 = byteVector29.putShort((int)'4');
    ByteVector byteVector33 = byteVector31.putByte(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putInt((int)(short)100);
    ByteVector byteVector11 = byteVector1.putShort(1);
    ByteVector byteVector13 = new ByteVector((int)(short)100);
    ByteVector byteVector15 = byteVector13.putLong((long)'4');
    ByteVector byteVector17 = byteVector15.putLong((long)(byte)0);
    ByteVector byteVector18 = new ByteVector();
    byte[] byte_array20 = new byte[] { (byte)0 };
    ByteVector byteVector23 = byteVector18.putByteArray(byte_array20, 0, (int)(short)1);
    ByteVector byteVector26 = byteVector17.putByteArray(byte_array20, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector29 = byteVector1.putByteArray(byte_array20, (int)' ', (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)'#');
    ByteVector byteVector8 = byteVector6.putInt((int)(byte)10);
    ByteVector byteVector10 = byteVector6.putInt((int)(short)0);
    byte[] byte_array11 = null;
    ByteVector byteVector14 = byteVector10.putByteArray(byte_array11, 0, (-1));
    ByteVector byteVector16 = byteVector14.putLong((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt(1);
    byte[] byte_array16 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector19 = byteVector7.putByteArray(byte_array16, 0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putInt((int)(short)1);
    ByteVector byteVector22 = new ByteVector();
    ByteVector byteVector24 = byteVector22.putByte((int)(byte)0);
    ByteVector byteVector26 = byteVector24.putUTF8("");
    ByteVector byteVector28 = byteVector24.putByte((int)'#');
    ByteVector byteVector30 = byteVector28.putByte((int)'4');
    ByteVector byteVector32 = new ByteVector(0);
    ByteVector byteVector34 = byteVector32.putUTF8("hi!");
    ByteVector byteVector36 = byteVector34.putLong((long)10);
    ByteVector byteVector38 = byteVector36.putByte((int)'#');
    ByteVector byteVector40 = byteVector38.putByte(1);
    ByteVector byteVector41 = new ByteVector();
    ByteVector byteVector43 = byteVector41.putShort((int)(byte)10);
    ByteVector byteVector45 = byteVector43.putShort((int)(byte)-1);
    byte[] byte_array52 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector55 = byteVector43.putByteArray(byte_array52, (int)(short)0, (int)(byte)0);
    ByteVector byteVector58 = byteVector40.putByteArray(byte_array52, (int)(byte)0, 0);
    ByteVector byteVector61 = byteVector28.putByteArray(byte_array52, (int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector64 = byteVector7.putByteArray(byte_array52, (int)(byte)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector3.putInt((int)'4');
    ByteVector byteVector11 = byteVector9.putUTF8("");
    ByteVector byteVector13 = byteVector11.putInt((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector7 = byteVector1.putUTF8("");
    ByteVector byteVector9 = byteVector1.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    ByteVector byteVector16 = byteVector14.putUTF8("");
    ByteVector byteVector18 = byteVector14.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    ByteVector byteVector1 = new ByteVector((int)(short)100);
    ByteVector byteVector3 = byteVector1.putLong((long)'4');
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)0);
    ByteVector byteVector6 = new ByteVector();
    byte[] byte_array8 = new byte[] { (byte)0 };
    ByteVector byteVector11 = byteVector6.putByteArray(byte_array8, 0, (int)(short)1);
    ByteVector byteVector14 = byteVector5.putByteArray(byte_array8, 0, 1);
    ByteVector byteVector16 = byteVector5.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector2.putInt((int)(short)0);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)100);
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector8.putLong((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector7 = new ByteVector();
    byte[] byte_array9 = new byte[] { (byte)0 };
    ByteVector byteVector12 = byteVector7.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector4.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)1);
    ByteVector byteVector19 = byteVector17.putInt((-1));
    ByteVector byteVector21 = byteVector19.putLong((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putLong(100L);
    byte[] byte_array11 = null;
    ByteVector byteVector14 = byteVector10.putByteArray(byte_array11, (int)(short)-1, (int)(byte)100);
    ByteVector byteVector16 = byteVector14.putInt((int)(byte)-1);
    byte[] byte_array21 = new byte[] { (byte)1, (byte)-1, (byte)-1, (byte)100 };
    ByteVector byteVector24 = byteVector14.putByteArray(byte_array21, 1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putShort(0);
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)1);
    ByteVector byteVector17 = byteVector13.putShort(0);
    ByteVector byteVector19 = byteVector13.putLong((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector7.putShort((int)(short)1);
    ByteVector byteVector11 = byteVector7.putLong((long)' ');
    ByteVector byteVector13 = byteVector11.putByte(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putInt(1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putLong((long)100);
    ByteVector byteVector13 = byteVector11.putLong((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort(0);
    ByteVector byteVector12 = byteVector4.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector4.putShort(1);
    ByteVector byteVector16 = byteVector14.putInt(1);
    ByteVector byteVector18 = byteVector14.putInt((int)'#');
    ByteVector byteVector20 = byteVector14.putShort(1);
    ByteVector byteVector22 = byteVector20.putShort((int)(short)100);
    ByteVector byteVector24 = byteVector20.putInt((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putUTF8("hi!");
    ByteVector byteVector10 = byteVector4.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt(1);
    byte[] byte_array16 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector19 = byteVector7.putByteArray(byte_array16, 0, (int)(byte)0);
    ByteVector byteVector21 = byteVector7.putLong((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putShort((int)(byte)100);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)10);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putLong(0L);
    ByteVector byteVector15 = byteVector11.putShort((int)(byte)100);
    ByteVector byteVector17 = byteVector11.putInt(0);
    ByteVector byteVector19 = byteVector17.putUTF8("");
    ByteVector byteVector21 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)1);
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector21.putUTF8("");
    ByteVector byteVector27 = byteVector25.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort((int)(byte)0);
    ByteVector byteVector8 = byteVector4.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector8.putInt((int)(short)1);
    ByteVector byteVector12 = byteVector8.putByte((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector7.putByte((int)(short)10);
    ByteVector byteVector11 = byteVector7.putUTF8("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)10);
    ByteVector byteVector7 = byteVector5.putByte(100);
    ByteVector byteVector9 = byteVector5.putLong((long)' ');
    ByteVector byteVector11 = byteVector5.putByte((int)(short)10);
    ByteVector byteVector13 = byteVector11.putShort((int)'a');
    ByteVector byteVector15 = byteVector13.putLong((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector10.putUTF8("");
    ByteVector byteVector14 = byteVector10.putInt((int)'4');
    ByteVector byteVector16 = byteVector10.putUTF8("hi!");
    ByteVector byteVector18 = byteVector10.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = byteVector17.putShort((int)(byte)1);
    ByteVector byteVector23 = byteVector17.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putInt(0);
    ByteVector byteVector15 = byteVector11.putInt(10);
    ByteVector byteVector17 = byteVector15.putShort(1);
    ByteVector byteVector19 = byteVector17.putLong(10L);
    ByteVector byteVector21 = byteVector17.putLong(1L);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)-1);
    ByteVector byteVector25 = byteVector21.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putByte((int)(byte)10);
    ByteVector byteVector5 = byteVector3.putLong(0L);
    byte[] byte_array6 = null;
    ByteVector byteVector9 = byteVector5.putByteArray(byte_array6, (int)' ', (int)(short)1);
    ByteVector byteVector11 = new ByteVector(0);
    ByteVector byteVector13 = byteVector11.putLong((long)(short)-1);
    ByteVector byteVector15 = byteVector13.putShort((int)'4');
    ByteVector byteVector17 = byteVector13.putByte(1);
    ByteVector byteVector19 = byteVector17.putShort((int)'#');
    ByteVector byteVector21 = byteVector17.putLong((long)(byte)100);
    ByteVector byteVector23 = byteVector17.putInt(1);
    byte[] byte_array26 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector29 = byteVector17.putByteArray(byte_array26, 0, (int)(byte)0);
    byte[] byte_array32 = new byte[] { (byte)100, (byte)10 };
    ByteVector byteVector35 = byteVector29.putByteArray(byte_array32, (int)(short)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array32, (int)'4', (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putShort((int)(byte)10);
    ByteVector byteVector4 = byteVector2.putShort(1);
    ByteVector byteVector6 = byteVector4.putLong((long)(short)1);
    ByteVector byteVector8 = byteVector4.putInt((int)'#');
    ByteVector byteVector10 = byteVector4.putShort((int)'#');
    ByteVector byteVector12 = byteVector4.putLong(100L);
    ByteVector byteVector14 = byteVector12.putByte((int)'#');
    ByteVector byteVector16 = byteVector12.putByte((int)(byte)10);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector16.putShort((int)(byte)1);
    ByteVector byteVector22 = byteVector20.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)1);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector1.putShort((int)' ');
    ByteVector byteVector7 = byteVector1.putShort((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector19.putInt((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putInt(0);
    ByteVector byteVector15 = byteVector11.putInt(10);
    ByteVector byteVector17 = byteVector15.putShort(1);
    ByteVector byteVector19 = byteVector17.putLong(10L);
    ByteVector byteVector21 = byteVector17.putLong(1L);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)-1);
    ByteVector byteVector24 = new ByteVector();
    byte[] byte_array26 = new byte[] { (byte)0 };
    ByteVector byteVector29 = byteVector24.putByteArray(byte_array26, 0, (int)(short)1);
    ByteVector byteVector31 = byteVector29.putByte(0);
    ByteVector byteVector33 = byteVector31.putUTF8("hi!");
    ByteVector byteVector35 = new ByteVector(0);
    ByteVector byteVector37 = byteVector35.putUTF8("hi!");
    ByteVector byteVector39 = byteVector37.putLong((long)10);
    ByteVector byteVector41 = byteVector37.putUTF8("hi!");
    ByteVector byteVector43 = byteVector41.putUTF8("");
    ByteVector byteVector44 = new ByteVector();
    ByteVector byteVector46 = byteVector44.putShort((int)(byte)10);
    ByteVector byteVector48 = byteVector46.putShort((int)(byte)-1);
    byte[] byte_array55 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector58 = byteVector46.putByteArray(byte_array55, (int)(short)0, (int)(byte)0);
    ByteVector byteVector61 = byteVector43.putByteArray(byte_array55, (int)(byte)0, 1);
    ByteVector byteVector64 = byteVector31.putByteArray(byte_array55, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector67 = byteVector21.putByteArray(byte_array55, (-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("hi!");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    byte[] byte_array12 = null;
    ByteVector byteVector15 = byteVector7.putByteArray(byte_array12, (int)(byte)1, 0);
    ByteVector byteVector17 = byteVector7.putUTF8("hi!");
    ByteVector byteVector19 = byteVector7.putUTF8("hi!");
    ByteVector byteVector21 = byteVector7.putShort((int)(short)10);
    ByteVector byteVector23 = byteVector7.putInt((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putUTF8("");
    ByteVector byteVector8 = byteVector6.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector3.putInt((int)'4');
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putShort(1);
    ByteVector byteVector16 = new ByteVector(0);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong((long)10);
    ByteVector byteVector22 = byteVector20.putLong((long)(byte)-1);
    ByteVector byteVector24 = byteVector22.putUTF8("hi!");
    ByteVector byteVector26 = byteVector22.putUTF8("");
    byte[] byte_array27 = null;
    ByteVector byteVector30 = byteVector22.putByteArray(byte_array27, (int)(byte)1, 0);
    ByteVector byteVector32 = byteVector22.putUTF8("hi!");
    ByteVector byteVector34 = byteVector22.putUTF8("hi!");
    byte[] byte_array41 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector44 = byteVector22.putByteArray(byte_array41, (int)(byte)0, 0);
    ByteVector byteVector47 = byteVector14.putByteArray(byte_array41, (int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector50 = byteVector9.putByteArray(byte_array41, (int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector7 = new ByteVector();
    byte[] byte_array9 = new byte[] { (byte)0 };
    ByteVector byteVector12 = byteVector7.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector4.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector17 = byteVector15.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    ByteVector byteVector0 = new ByteVector();
    byte[] byte_array2 = new byte[] { (byte)0 };
    ByteVector byteVector5 = byteVector0.putByteArray(byte_array2, 0, (int)(short)1);
    ByteVector byteVector7 = byteVector5.putByte(0);
    ByteVector byteVector9 = byteVector7.putInt((int)'4');
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector11.putLong((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(short)-1);
    ByteVector byteVector4 = byteVector2.putInt((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putByte((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putShort((int)(byte)1);
    ByteVector byteVector7 = new ByteVector((int)(byte)0);
    ByteVector byteVector9 = byteVector7.putInt((int)(byte)0);
    ByteVector byteVector11 = byteVector9.putInt(1);
    ByteVector byteVector12 = new ByteVector();
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)10);
    ByteVector byteVector16 = byteVector14.putShort(1);
    ByteVector byteVector18 = byteVector16.putLong((long)(short)1);
    ByteVector byteVector20 = byteVector16.putInt((int)'#');
    ByteVector byteVector22 = byteVector20.putUTF8("hi!");
    ByteVector byteVector24 = byteVector22.putInt((int)(byte)0);
    ByteVector byteVector25 = new ByteVector();
    ByteVector byteVector27 = byteVector25.putByte((int)(byte)0);
    ByteVector byteVector29 = byteVector27.putUTF8("");
    ByteVector byteVector31 = byteVector27.putByte((int)'#');
    ByteVector byteVector33 = byteVector31.putByte((int)'4');
    byte[] byte_array37 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector40 = byteVector31.putByteArray(byte_array37, 1, 0);
    ByteVector byteVector43 = byteVector24.putByteArray(byte_array37, (int)(byte)1, 0);
    ByteVector byteVector46 = byteVector9.putByteArray(byte_array37, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector49 = byteVector5.putByteArray(byte_array37, (int)(short)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putInt(100);
    ByteVector byteVector8 = byteVector4.putByte(0);
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector8.putInt(10);
    ByteVector byteVector14 = byteVector8.putByte(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector21.putShort((int)(short)1);
    ByteVector byteVector25 = byteVector21.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector9.putShort(10);
    ByteVector byteVector13 = byteVector9.putInt((int)(byte)0);
    ByteVector byteVector15 = byteVector9.putUTF8("");
    ByteVector byteVector17 = new ByteVector(0);
    ByteVector byteVector19 = byteVector17.putLong((long)(short)-1);
    ByteVector byteVector21 = byteVector19.putShort((int)'4');
    ByteVector byteVector23 = byteVector19.putByte(1);
    ByteVector byteVector25 = byteVector23.putShort((int)'#');
    ByteVector byteVector27 = byteVector23.putLong((long)(byte)100);
    ByteVector byteVector29 = byteVector23.putInt(1);
    byte[] byte_array32 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector35 = byteVector23.putByteArray(byte_array32, 0, (int)(byte)0);
    ByteVector byteVector38 = byteVector9.putByteArray(byte_array32, (int)(short)0, 0);
    ByteVector byteVector40 = byteVector38.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector8 = byteVector4.putShort(100);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putByte((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putShort((int)(short)0);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector22 = new ByteVector();
    ByteVector byteVector24 = byteVector22.putShort((int)(byte)10);
    ByteVector byteVector26 = byteVector24.putShort(1);
    ByteVector byteVector28 = byteVector26.putLong((long)(short)1);
    ByteVector byteVector30 = byteVector26.putInt((int)'#');
    ByteVector byteVector32 = byteVector30.putUTF8("hi!");
    ByteVector byteVector34 = byteVector32.putInt((int)(byte)0);
    ByteVector byteVector35 = new ByteVector();
    ByteVector byteVector37 = byteVector35.putByte((int)(byte)0);
    ByteVector byteVector39 = byteVector37.putUTF8("");
    ByteVector byteVector41 = byteVector37.putByte((int)'#');
    ByteVector byteVector43 = byteVector41.putByte((int)'4');
    byte[] byte_array47 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector50 = byteVector41.putByteArray(byte_array47, 1, 0);
    ByteVector byteVector53 = byteVector34.putByteArray(byte_array47, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector56 = byteVector17.putByteArray(byte_array47, (int)(short)100, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt(1);
    byte[] byte_array16 = new byte[] { (byte)100, (byte)100 };
    ByteVector byteVector19 = byteVector7.putByteArray(byte_array16, 0, (int)(byte)0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)10 };
    ByteVector byteVector25 = byteVector19.putByteArray(byte_array22, (int)(short)1, (int)(byte)0);
    ByteVector byteVector27 = byteVector19.putByte((int)(byte)1);
    ByteVector byteVector29 = byteVector19.putInt((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putUTF8("");
    ByteVector byteVector5 = byteVector3.putLong((long)(byte)-1);
    ByteVector byteVector7 = byteVector3.putShort((int)(byte)1);
    ByteVector byteVector9 = byteVector3.putInt((int)'4');
    ByteVector byteVector11 = byteVector3.putLong(100L);
    ByteVector byteVector13 = byteVector11.putUTF8("");
    ByteVector byteVector15 = byteVector11.putLong((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector7 = new ByteVector();
    byte[] byte_array9 = new byte[] { (byte)0 };
    ByteVector byteVector12 = byteVector7.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector4.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector17 = byteVector15.putShort((int)(byte)1);
    ByteVector byteVector19 = byteVector15.putByte(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putUTF8("hi!");
    ByteVector byteVector9 = byteVector3.putByte(0);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putUTF8("hi!");
    ByteVector byteVector15 = byteVector11.putByte(10);
    ByteVector byteVector17 = byteVector11.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector2.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    byte[] byte_array9 = null;
    ByteVector byteVector12 = byteVector6.putByteArray(byte_array9, (int)'#', (-1));
    ByteVector byteVector14 = byteVector12.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector3.putInt((int)(byte)100);
    ByteVector byteVector9 = byteVector3.putByte((int)(byte)-1);
    ByteVector byteVector11 = byteVector3.putUTF8("hi!");
    ByteVector byteVector13 = byteVector11.putShort((int)(short)-1);
    ByteVector byteVector15 = byteVector13.putLong((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector13.putShort((int)'#');
    ByteVector byteVector21 = byteVector13.putByte((int)(short)1);
    ByteVector byteVector23 = byteVector13.putUTF8("");
    ByteVector byteVector25 = byteVector13.putUTF8("hi!");
    ByteVector byteVector27 = byteVector25.putLong((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putUTF8("hi!");
    ByteVector byteVector8 = byteVector2.putUTF8("");
    ByteVector byteVector10 = byteVector2.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector11.putByte((int)(byte)10);
    ByteVector byteVector15 = byteVector11.putByte((int)(short)-1);
    ByteVector byteVector17 = byteVector11.putByte((int)(short)0);
    ByteVector byteVector19 = byteVector17.putByte((int)'#');
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)100);
    ByteVector byteVector23 = byteVector21.putInt(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putByte((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putByte(0);
    ByteVector byteVector6 = byteVector4.putShort(1);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(byte)1);
    ByteVector byteVector12 = byteVector8.putShort(100);
    ByteVector byteVector14 = new ByteVector(0);
    ByteVector byteVector16 = byteVector14.putUTF8("hi!");
    ByteVector byteVector18 = byteVector16.putLong((long)10);
    ByteVector byteVector20 = byteVector18.putByte((int)'#');
    ByteVector byteVector22 = byteVector20.putByte(1);
    ByteVector byteVector23 = new ByteVector();
    ByteVector byteVector25 = byteVector23.putShort((int)(byte)10);
    ByteVector byteVector27 = byteVector25.putShort((int)(byte)-1);
    byte[] byte_array34 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector37 = byteVector25.putByteArray(byte_array34, (int)(short)0, (int)(byte)0);
    ByteVector byteVector40 = byteVector22.putByteArray(byte_array34, (int)(byte)0, 0);
    ByteVector byteVector42 = byteVector40.putUTF8("hi!");
    ByteVector byteVector44 = byteVector40.putInt(0);
    ByteVector byteVector45 = new ByteVector();
    ByteVector byteVector47 = byteVector45.putByte((int)(byte)0);
    ByteVector byteVector49 = byteVector47.putUTF8("");
    ByteVector byteVector51 = byteVector47.putByte((int)'#');
    ByteVector byteVector53 = byteVector51.putByte((int)'4');
    byte[] byte_array57 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector60 = byteVector51.putByteArray(byte_array57, 1, 0);
    ByteVector byteVector63 = byteVector40.putByteArray(byte_array57, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector66 = byteVector8.putByteArray(byte_array57, (int)'4', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector63);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putUTF8("hi!");
    ByteVector byteVector21 = new ByteVector((int)(byte)0);
    ByteVector byteVector23 = byteVector21.putInt((int)(byte)0);
    ByteVector byteVector25 = byteVector23.putInt(1);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putShort((int)(byte)10);
    ByteVector byteVector30 = byteVector28.putShort(1);
    ByteVector byteVector32 = byteVector30.putLong((long)(short)1);
    ByteVector byteVector34 = byteVector30.putInt((int)'#');
    ByteVector byteVector36 = byteVector34.putUTF8("hi!");
    ByteVector byteVector38 = byteVector36.putInt((int)(byte)0);
    ByteVector byteVector39 = new ByteVector();
    ByteVector byteVector41 = byteVector39.putByte((int)(byte)0);
    ByteVector byteVector43 = byteVector41.putUTF8("");
    ByteVector byteVector45 = byteVector41.putByte((int)'#');
    ByteVector byteVector47 = byteVector45.putByte((int)'4');
    byte[] byte_array51 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector54 = byteVector45.putByteArray(byte_array51, 1, 0);
    ByteVector byteVector57 = byteVector38.putByteArray(byte_array51, (int)(byte)1, 0);
    ByteVector byteVector60 = byteVector23.putByteArray(byte_array51, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector63 = byteVector19.putByteArray(byte_array51, 1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector60);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    ByteVector byteVector1 = new ByteVector((int)(byte)0);
    ByteVector byteVector3 = byteVector1.putInt(10);
    ByteVector byteVector5 = byteVector1.putLong((long)(short)100);
    ByteVector byteVector7 = byteVector5.putShort(10);
    ByteVector byteVector9 = byteVector5.putLong((long)(short)1);
    ByteVector byteVector11 = byteVector5.putByte((int)(short)1);
    ByteVector byteVector13 = byteVector5.putLong((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putLong((long)(short)-1);
    ByteVector byteVector5 = byteVector3.putShort((int)'4');
    ByteVector byteVector7 = byteVector3.putByte(1);
    ByteVector byteVector9 = byteVector7.putShort((int)'#');
    ByteVector byteVector11 = byteVector7.putLong((long)(byte)100);
    ByteVector byteVector13 = byteVector7.putInt((int)(short)0);
    ByteVector byteVector15 = byteVector13.putByte(1);
    ByteVector byteVector17 = byteVector13.putByte((int)'#');
    ByteVector byteVector19 = byteVector17.putInt(100);
    ByteVector byteVector21 = byteVector19.putByte(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector21);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putUTF8("");
    ByteVector byteVector9 = byteVector7.putUTF8("");
    ByteVector byteVector11 = byteVector7.putUTF8("");
    ByteVector byteVector13 = byteVector7.putInt((int)'a');
    ByteVector byteVector15 = byteVector13.putLong((long)(short)10);
    ByteVector byteVector17 = byteVector15.putLong(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putLong((long)(short)1);
    ByteVector byteVector6 = byteVector2.putUTF8("hi!");
    ByteVector byteVector8 = byteVector2.putUTF8("");
    ByteVector byteVector10 = new ByteVector(0);
    ByteVector byteVector12 = byteVector10.putUTF8("hi!");
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)-1);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector16.putUTF8("");
    byte[] byte_array21 = null;
    ByteVector byteVector24 = byteVector16.putByteArray(byte_array21, (int)(byte)1, 0);
    ByteVector byteVector26 = byteVector16.putUTF8("hi!");
    ByteVector byteVector28 = byteVector16.putUTF8("hi!");
    byte[] byte_array35 = new byte[] { (byte)10, (byte)100, (byte)0, (byte)0, (byte)-1, (byte)1 };
    ByteVector byteVector38 = byteVector16.putByteArray(byte_array35, (int)(byte)0, 0);
    ByteVector byteVector41 = byteVector2.putByteArray(byte_array35, 1, 0);
    ByteVector byteVector43 = new ByteVector(0);
    ByteVector byteVector45 = byteVector43.putUTF8("hi!");
    ByteVector byteVector47 = byteVector45.putInt((int)'a');
    ByteVector byteVector49 = byteVector45.putShort((int)'a');
    ByteVector byteVector50 = new ByteVector();
    ByteVector byteVector52 = byteVector50.putShort((int)(byte)10);
    ByteVector byteVector54 = byteVector52.putShort((int)(byte)-1);
    byte[] byte_array61 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector64 = byteVector52.putByteArray(byte_array61, (int)(short)0, (int)(byte)0);
    ByteVector byteVector67 = byteVector49.putByteArray(byte_array61, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector70 = byteVector41.putByteArray(byte_array61, (int)' ', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putByte((int)'#');
    ByteVector byteVector9 = byteVector7.putByte(1);
    ByteVector byteVector10 = new ByteVector();
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)-1);
    byte[] byte_array21 = new byte[] { (byte)-1, (byte)1, (byte)-1, (byte)1, (byte)-1, (byte)0 };
    ByteVector byteVector24 = byteVector12.putByteArray(byte_array21, (int)(short)0, (int)(byte)0);
    ByteVector byteVector27 = byteVector9.putByteArray(byte_array21, (int)(byte)0, 0);
    ByteVector byteVector29 = byteVector27.putUTF8("hi!");
    ByteVector byteVector31 = byteVector27.putUTF8("hi!");
    ByteVector byteVector33 = byteVector27.putByte(100);
    ByteVector byteVector35 = byteVector33.putLong((long)(byte)100);
    ByteVector byteVector37 = byteVector33.putUTF8("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector4 = byteVector2.putUTF8("");
    ByteVector byteVector6 = byteVector4.putLong((long)(byte)-1);
    ByteVector byteVector7 = new ByteVector();
    byte[] byte_array9 = new byte[] { (byte)0 };
    ByteVector byteVector12 = byteVector7.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector15 = byteVector4.putByteArray(byte_array9, 0, (int)(short)1);
    ByteVector byteVector17 = byteVector15.putShort((int)'a');
    ByteVector byteVector18 = new ByteVector();
    ByteVector byteVector20 = byteVector18.putShort((int)(byte)10);
    ByteVector byteVector22 = byteVector20.putShort(1);
    ByteVector byteVector24 = byteVector22.putLong((long)(short)1);
    ByteVector byteVector26 = byteVector22.putInt((int)'#');
    ByteVector byteVector28 = byteVector26.putUTF8("hi!");
    ByteVector byteVector30 = byteVector28.putInt((int)(byte)0);
    ByteVector byteVector31 = new ByteVector();
    ByteVector byteVector33 = byteVector31.putByte((int)(byte)0);
    ByteVector byteVector35 = byteVector33.putUTF8("");
    ByteVector byteVector37 = byteVector33.putByte((int)'#');
    ByteVector byteVector39 = byteVector37.putByte((int)'4');
    byte[] byte_array43 = new byte[] { (byte)100, (byte)1, (byte)100 };
    ByteVector byteVector46 = byteVector37.putByteArray(byte_array43, 1, 0);
    ByteVector byteVector49 = byteVector30.putByteArray(byte_array43, (int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector17.putByteArray(byte_array43, (int)(short)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    ByteVector byteVector1 = new ByteVector(0);
    ByteVector byteVector3 = byteVector1.putUTF8("hi!");
    ByteVector byteVector5 = byteVector3.putLong((long)10);
    ByteVector byteVector7 = byteVector5.putLong((long)(byte)-1);
    ByteVector byteVector9 = byteVector5.putByte((int)(short)0);
    ByteVector byteVector11 = byteVector5.putInt((int)(byte)0);
    ByteVector byteVector13 = byteVector11.putInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector13);

  }

}

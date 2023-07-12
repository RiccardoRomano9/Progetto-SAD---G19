
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector6.putLong((long)1);
    ByteVector byteVector10 = byteVector8.putShort((int)'4');
    ByteVector byteVector12 = byteVector8.putByte((int)(byte)1);
    ByteVector byteVector14 = byteVector12.putShort((int)'a');
    ByteVector byteVector16 = byteVector14.putShort((int)(short)-1);
    
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)1);
    ByteVector byteVector12 = byteVector8.putLong((long)100);
    ByteVector byteVector14 = byteVector12.putLong((long)(short)10);
    
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector14 = byteVector12.putByte((int)(short)1);
    ByteVector byteVector16 = byteVector14.putByte((int)(short)10);
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector4.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector4.putInt((int)(short)100);
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector8.putByte(0);
    ByteVector byteVector14 = byteVector8.putInt((int)(byte)100);
    ByteVector byteVector16 = byteVector8.putShort((int)(byte)0);
    
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector4.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector4.putInt((int)(short)100);
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector8.putByte(0);
    ByteVector byteVector14 = byteVector12.putByte((int)' ');
    ByteVector byteVector16 = byteVector12.putByte((int)'a');
    
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putUTF8("hi!");
    ByteVector byteVector6 = byteVector4.putByte((int)'#');
    ByteVector byteVector8 = byteVector4.putLong((long)(-1));
    
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector12.putLong((long)(short)-1);
    ByteVector byteVector18 = byteVector12.putShort((int)(byte)100);
    ByteVector byteVector20 = byteVector18.putInt((int)'4');
    ByteVector byteVector22 = byteVector20.putLong((long)(byte)10);
    
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector12.putLong((long)(short)-1);
    ByteVector byteVector18 = byteVector16.putInt((int)' ');
    ByteVector byteVector20 = byteVector16.putInt((int)' ');
    ByteVector byteVector22 = byteVector20.putUTF8("");
    ByteVector byteVector24 = byteVector22.putUTF8("hi!");
    ByteVector byteVector26 = byteVector24.putUTF8("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector6.putByte(100);
    ByteVector byteVector10 = byteVector6.putByte((-1));
    ByteVector byteVector12 = byteVector10.putByte(100);
    ByteVector byteVector14 = byteVector12.putShort((-1));
    
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putByte(10);
    ByteVector byteVector6 = byteVector0.putByte((int)(short)-1);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector9 = new ByteVector();
    ByteVector byteVector11 = byteVector9.putByte(10);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putLong((long)' ');
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector17.putInt((int)' ');
    ByteVector byteVector21 = byteVector19.putInt(0);
    ByteVector byteVector23 = byteVector21.putByte((int)(short)100);
    ByteVector byteVector25 = byteVector21.putUTF8("");
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector26.putByte(0);
    ByteVector byteVector32 = byteVector26.putByte((int)(byte)0);
    ByteVector byteVector34 = byteVector32.putLong((long)'#');
    ByteVector byteVector36 = byteVector34.putInt(1);
    ByteVector byteVector38 = byteVector34.putShort((int)(short)1);
    byte[] byte_array44 = new byte[] { (byte)100, (byte)100, (byte)-1, (byte)100, (byte)0 };
    ByteVector byteVector47 = byteVector38.putByteArray(byte_array44, 0, (int)(byte)1);
    ByteVector byteVector50 = byteVector25.putByteArray(byte_array44, (int)(byte)0, (int)(byte)0);
    ByteVector byteVector53 = byteVector8.putByteArray(byte_array44, 1, (int)(byte)1);
    ByteVector byteVector55 = byteVector8.putInt((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
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
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector8.putInt((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putInt(0);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong((long)(short)1);
    ByteVector byteVector22 = byteVector18.putLong((long)(short)1);
    
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector6.putByte(100);
    ByteVector byteVector10 = byteVector6.putByte((-1));
    ByteVector byteVector12 = byteVector10.putByte(100);
    ByteVector byteVector14 = byteVector12.putInt(0);
    ByteVector byteVector16 = byteVector12.putLong(100L);
    ByteVector byteVector18 = byteVector12.putInt((int)' ');
    ByteVector byteVector20 = byteVector18.putByte((-1));
    
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector14 = byteVector10.putUTF8("hi!");
    ByteVector byteVector16 = byteVector14.putShort((int)(byte)-1);
    ByteVector byteVector18 = byteVector16.putLong((long)(byte)10);
    ByteVector byteVector20 = byteVector18.putShort((int)(short)1);
    
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector0.putUTF8("hi!");
    ByteVector byteVector8 = byteVector0.putLong((long)(byte)-1);
    ByteVector byteVector10 = byteVector0.putLong((long)'a');
    ByteVector byteVector12 = byteVector10.putInt(0);
    ByteVector byteVector14 = byteVector10.putInt((int)(short)10);
    ByteVector byteVector16 = byteVector10.putUTF8("hi!");
    
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putInt((int)' ');
    ByteVector byteVector12 = byteVector8.putByte((int)' ');
    ByteVector byteVector14 = byteVector8.putShort((int)(short)-1);
    
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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector2.putLong((long)0);
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector6.putByte((int)(byte)10);
    ByteVector byteVector12 = byteVector6.putInt((int)(short)1);
    
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putInt((int)' ');
    ByteVector byteVector12 = byteVector8.putUTF8("");
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putShort(10);
    ByteVector byteVector6 = byteVector0.putLong((long)'4');
    ByteVector byteVector8 = byteVector0.putByte(1);
    ByteVector byteVector10 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector12 = byteVector10.putInt(100);
    ByteVector byteVector14 = byteVector12.putInt((int)(short)1);
    ByteVector byteVector16 = byteVector14.putLong((long)10);
    
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector8.putInt(0);
    ByteVector byteVector12 = byteVector10.putByte(0);
    ByteVector byteVector14 = byteVector12.putLong((long)(short)0);
    ByteVector byteVector16 = byteVector14.putInt((int)(byte)0);
    
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
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test20"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector4.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector6.putByte((int)(byte)100);
    ByteVector byteVector10 = byteVector8.putShort((int)(short)0);
    
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(100);
    ByteVector byteVector10 = byteVector6.putInt(0);
    ByteVector byteVector12 = byteVector6.putUTF8("");
    ByteVector byteVector14 = byteVector6.putLong((long)'a');
    ByteVector byteVector16 = byteVector6.putLong((long)10);
    ByteVector byteVector18 = byteVector16.putShort(10);
    
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putShort((int)(short)-1);
    ByteVector byteVector12 = byteVector8.putShort((int)(byte)-1);
    
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putInt((int)(short)100);
    
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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector0.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector0.putUTF8("");
    ByteVector byteVector12 = byteVector10.putShort(0);
    ByteVector byteVector14 = byteVector10.putShort((int)(byte)1);
    ByteVector byteVector16 = byteVector10.putLong((long)(short)100);
    ByteVector byteVector18 = byteVector16.putByte((int)(short)1);
    ByteVector byteVector20 = byteVector16.putInt((int)(byte)100);
    ByteVector byteVector22 = byteVector20.putInt((int)(short)0);
    
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector0.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector0.putUTF8("");
    ByteVector byteVector12 = byteVector10.putInt((int)(short)-1);
    ByteVector byteVector14 = byteVector12.putByte((int)(byte)-1);
    
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
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector6.putByte(100);
    ByteVector byteVector10 = byteVector6.putByte((-1));
    ByteVector byteVector12 = byteVector10.putByte(100);
    ByteVector byteVector14 = byteVector12.putInt(0);
    ByteVector byteVector16 = byteVector12.putLong(100L);
    ByteVector byteVector18 = byteVector16.putByte((int)(short)100);
    ByteVector byteVector20 = byteVector18.putUTF8("");
    
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test27"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putInt((int)' ');
    ByteVector byteVector12 = byteVector10.putInt(0);
    ByteVector byteVector14 = byteVector10.putInt((int)'a');
    
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
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector10.putLong(0L);
    ByteVector byteVector14 = byteVector10.putLong((long)(byte)100);
    
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector8.putInt(0);
    ByteVector byteVector12 = byteVector10.putByte(0);
    ByteVector byteVector14 = byteVector10.putShort((-1));
    ByteVector byteVector16 = byteVector10.putByte(10);
    ByteVector byteVector18 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector20 = byteVector10.putLong((long)100);
    ByteVector byteVector22 = byteVector20.putByte((int)(byte)0);
    ByteVector byteVector24 = byteVector22.putInt((int)(byte)-1);
    ByteVector byteVector26 = byteVector22.putLong((long)0);
    ByteVector byteVector28 = byteVector22.putByte((int)'#');
    ByteVector byteVector30 = byteVector22.putShort((int)'4');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((-1));
    ByteVector byteVector16 = byteVector12.putUTF8("");
    ByteVector byteVector18 = byteVector16.putInt((-1));
    ByteVector byteVector20 = byteVector18.putUTF8("");
    ByteVector byteVector22 = byteVector18.putInt((int)(short)10);
    
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
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putShort(10);
    ByteVector byteVector6 = byteVector0.putByte((int)(byte)100);
    ByteVector byteVector8 = byteVector0.putInt((int)(short)1);
    
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(0);
    ByteVector byteVector10 = byteVector8.putByte(10);
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
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector0.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector0.putUTF8("");
    ByteVector byteVector12 = byteVector10.putShort(0);
    ByteVector byteVector14 = byteVector10.putShort((int)(byte)1);
    ByteVector byteVector16 = byteVector10.putLong((long)(short)100);
    ByteVector byteVector18 = byteVector16.putInt((int)(byte)-1);
    ByteVector byteVector20 = new ByteVector((int)'4');
    ByteVector byteVector22 = byteVector20.putLong((long)(byte)0);
    ByteVector byteVector24 = byteVector20.putUTF8("hi!");
    ByteVector byteVector26 = byteVector20.putByte((int)'#');
    ByteVector byteVector28 = byteVector20.putLong((long)(byte)10);
    byte[] byte_array35 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)1, (byte)0, (byte)0 };
    ByteVector byteVector38 = byteVector28.putByteArray(byte_array35, (int)(byte)0, 1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector41 = byteVector18.putByteArray(byte_array35, (int)'4', 100);
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
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

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector4.putUTF8("");
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector8.putLong((long)(short)100);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    
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
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test35"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector0.putUTF8("hi!");
    ByteVector byteVector8 = byteVector0.putLong((long)(byte)-1);
    ByteVector byteVector10 = byteVector0.putLong((long)'a');
    ByteVector byteVector12 = byteVector10.putInt(0);
    ByteVector byteVector14 = byteVector12.putShort((int)(byte)1);
    
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test36"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putByte(10);
    ByteVector byteVector6 = byteVector0.putInt((int)(byte)0);
    ByteVector byteVector8 = byteVector6.putByte(1);
    ByteVector byteVector10 = byteVector6.putUTF8("");
    ByteVector byteVector12 = byteVector6.putUTF8("");
    ByteVector byteVector14 = byteVector12.putShort((int)' ');
    
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
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test37"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector12.putLong((long)(short)-1);
    ByteVector byteVector18 = byteVector12.putShort((int)(byte)0);
    ByteVector byteVector20 = byteVector12.putInt((int)(byte)0);
    ByteVector byteVector22 = byteVector12.putLong((long)(byte)0);
    ByteVector byteVector24 = byteVector22.putByte((int)(byte)1);
    
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
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test38"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector12.putLong((long)(byte)10);
    ByteVector byteVector18 = byteVector12.putInt((-1));
    ByteVector byteVector20 = byteVector12.putByte((int)(byte)10);
    ByteVector byteVector22 = byteVector12.putShort((int)(short)10);
    ByteVector byteVector24 = byteVector22.putShort((int)(short)10);
    ByteVector byteVector26 = byteVector22.putUTF8("");
    ByteVector byteVector28 = byteVector26.putUTF8("hi!");
    ByteVector byteVector30 = byteVector28.putInt((int)(byte)10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test39"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector0.putUTF8("hi!");
    ByteVector byteVector8 = byteVector0.putLong((long)(byte)-1);
    ByteVector byteVector10 = byteVector8.putShort((-1));
    
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
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test40"); }


    ByteVector byteVector1 = new ByteVector((int)'4');
    ByteVector byteVector3 = byteVector1.putLong((long)(byte)0);
    ByteVector byteVector5 = byteVector1.putUTF8("");
    ByteVector byteVector7 = byteVector5.putShort(1);
    ByteVector byteVector9 = byteVector5.putUTF8("");
    ByteVector byteVector11 = byteVector9.putInt((-1));
    
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
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test41"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector14 = byteVector10.putUTF8("hi!");
    ByteVector byteVector16 = byteVector14.putUTF8("hi!");
    byte[] byte_array17 = null;
    ByteVector byteVector20 = byteVector14.putByteArray(byte_array17, (int)(byte)0, (int)(byte)100);
    ByteVector byteVector22 = byteVector14.putShort((int)(short)10);
    ByteVector byteVector24 = byteVector22.putShort((int)(short)1);
    
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
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test42"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putLong((long)1);
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector8.putShort((int)'#');
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
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test43"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector6.putByte(100);
    ByteVector byteVector9 = new ByteVector();
    ByteVector byteVector11 = byteVector9.putByte(10);
    ByteVector byteVector13 = byteVector9.putByte(0);
    ByteVector byteVector15 = byteVector13.putByte(0);
    ByteVector byteVector17 = byteVector15.putByte(100);
    ByteVector byteVector19 = byteVector15.putByte((-1));
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector19.putUTF8("");
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)0);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector26.putShort((int)(byte)-1);
    ByteVector byteVector32 = byteVector30.putInt((int)(short)1);
    ByteVector byteVector34 = byteVector32.putShort((int)(byte)-1);
    ByteVector byteVector36 = byteVector32.putInt((int)'a');
    byte[] byte_array39 = new byte[] { (byte)1, (byte)-1 };
    ByteVector byteVector42 = byteVector36.putByteArray(byte_array39, (int)(byte)0, 0);
    ByteVector byteVector45 = byteVector23.putByteArray(byte_array39, (int)(short)0, (int)(byte)1);
    ByteVector byteVector48 = byteVector8.putByteArray(byte_array39, (int)(short)1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector8);
    
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
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test44"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector6.putShort((int)'4');
    ByteVector byteVector10 = byteVector6.putUTF8("");
    ByteVector byteVector12 = byteVector10.putShort(0);
    ByteVector byteVector14 = byteVector12.putLong((long)'a');
    
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
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test45"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector8.putLong((long)(short)10);
    ByteVector byteVector14 = new ByteVector((int)'4');
    ByteVector byteVector16 = byteVector14.putLong((long)(byte)0);
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    ByteVector byteVector20 = byteVector14.putByte((int)'#');
    ByteVector byteVector22 = byteVector14.putLong((long)(byte)10);
    byte[] byte_array29 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)1, (byte)0, (byte)0 };
    ByteVector byteVector32 = byteVector22.putByteArray(byte_array29, (int)(byte)0, 1);
    ByteVector byteVector35 = byteVector12.putByteArray(byte_array29, 0, (int)(byte)1);
    ByteVector byteVector37 = byteVector35.putUTF8("hi!");
    ByteVector byteVector39 = byteVector37.putShort(1);
    ByteVector byteVector41 = byteVector39.putInt((int)(byte)0);
    
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
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test46"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector8 = byteVector6.putLong((long)'#');
    ByteVector byteVector10 = byteVector8.putInt(1);
    ByteVector byteVector12 = byteVector8.putInt((int)'#');
    ByteVector byteVector14 = byteVector8.putShort((int)(byte)100);
    
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
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test47"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector14 = byteVector10.putUTF8("hi!");
    ByteVector byteVector16 = byteVector10.putUTF8("");
    ByteVector byteVector17 = new ByteVector();
    ByteVector byteVector19 = byteVector17.putByte(10);
    ByteVector byteVector21 = byteVector19.putLong((long)100);
    ByteVector byteVector23 = byteVector21.putByte((int)(byte)-1);
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)100);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector28.putLong((long)100);
    ByteVector byteVector32 = byteVector30.putByte((int)(byte)-1);
    ByteVector byteVector34 = byteVector30.putUTF8("");
    ByteVector byteVector36 = byteVector30.putLong((long)1);
    ByteVector byteVector37 = new ByteVector();
    ByteVector byteVector39 = byteVector37.putByte(10);
    ByteVector byteVector41 = byteVector39.putShort((int)(byte)1);
    ByteVector byteVector43 = byteVector39.putLong((long)(byte)1);
    ByteVector byteVector45 = byteVector39.putInt((int)(byte)-1);
    ByteVector byteVector47 = byteVector45.putUTF8("");
    ByteVector byteVector49 = byteVector45.putLong((long)(short)10);
    ByteVector byteVector51 = new ByteVector((int)'4');
    ByteVector byteVector53 = byteVector51.putLong((long)(byte)0);
    ByteVector byteVector55 = byteVector51.putUTF8("hi!");
    ByteVector byteVector57 = byteVector51.putByte((int)'#');
    ByteVector byteVector59 = byteVector51.putLong((long)(byte)10);
    byte[] byte_array66 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)1, (byte)0, (byte)0 };
    ByteVector byteVector69 = byteVector59.putByteArray(byte_array66, (int)(byte)0, 1);
    ByteVector byteVector72 = byteVector49.putByteArray(byte_array66, 0, (int)(byte)1);
    ByteVector byteVector75 = byteVector30.putByteArray(byte_array66, 0, (int)(short)0);
    ByteVector byteVector78 = byteVector25.putByteArray(byte_array66, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector81 = byteVector10.putByteArray(byte_array66, 1, (int)(short)-1);
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
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
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector78);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test48"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putShort(10);
    ByteVector byteVector6 = byteVector0.putLong((long)'4');
    ByteVector byteVector8 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector10 = byteVector0.putByte((int)(byte)10);
    ByteVector byteVector12 = byteVector10.putShort((int)(byte)100);
    ByteVector byteVector13 = new ByteVector();
    ByteVector byteVector15 = byteVector13.putByte(10);
    ByteVector byteVector17 = byteVector13.putByte(0);
    ByteVector byteVector19 = byteVector17.putByte(0);
    ByteVector byteVector21 = byteVector19.putByte(100);
    ByteVector byteVector23 = byteVector19.putByte((-1));
    ByteVector byteVector25 = byteVector23.putUTF8("");
    ByteVector byteVector27 = byteVector23.putUTF8("");
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)0);
    ByteVector byteVector30 = new ByteVector();
    ByteVector byteVector32 = byteVector30.putByte(10);
    ByteVector byteVector34 = byteVector30.putShort((int)(byte)-1);
    ByteVector byteVector36 = byteVector34.putInt((int)(short)1);
    ByteVector byteVector38 = byteVector36.putShort((int)(byte)-1);
    ByteVector byteVector40 = byteVector36.putInt((int)'a');
    byte[] byte_array43 = new byte[] { (byte)1, (byte)-1 };
    ByteVector byteVector46 = byteVector40.putByteArray(byte_array43, (int)(byte)0, 0);
    ByteVector byteVector49 = byteVector27.putByteArray(byte_array43, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector10.putByteArray(byte_array43, (int)(short)1, 10);
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
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
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

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test49"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(0);
    ByteVector byteVector10 = byteVector6.putShort((int)(short)1);
    ByteVector byteVector12 = byteVector6.putLong((long)'a');
    ByteVector byteVector14 = byteVector6.putShort((int)(byte)0);
    ByteVector byteVector16 = byteVector6.putShort(100);
    ByteVector byteVector18 = byteVector16.putLong(0L);
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
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test50"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(100);
    ByteVector byteVector10 = byteVector6.putInt(0);
    ByteVector byteVector12 = byteVector6.putLong((long)10);
    ByteVector byteVector14 = byteVector6.putShort((int)(short)0);
    ByteVector byteVector16 = byteVector14.putShort((int)(byte)0);
    ByteVector byteVector18 = byteVector16.putShort((int)'4');
    ByteVector byteVector20 = byteVector16.putByte((int)'#');
    ByteVector byteVector22 = byteVector20.putUTF8("hi!");
    ByteVector byteVector24 = byteVector22.putShort(100);
    
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
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test51"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(0);
    ByteVector byteVector10 = byteVector6.putInt(100);
    ByteVector byteVector12 = byteVector6.putByte((int)(short)100);
    ByteVector byteVector14 = byteVector6.putShort((int)'4');
    ByteVector byteVector15 = new ByteVector();
    ByteVector byteVector17 = byteVector15.putByte(10);
    ByteVector byteVector19 = byteVector15.putShort(0);
    ByteVector byteVector21 = byteVector15.putShort((int)(short)100);
    ByteVector byteVector23 = byteVector15.putShort((int)(short)-1);
    ByteVector byteVector25 = byteVector15.putUTF8("");
    ByteVector byteVector27 = byteVector25.putShort(0);
    ByteVector byteVector29 = byteVector27.putLong((long)'#');
    ByteVector byteVector30 = new ByteVector();
    ByteVector byteVector32 = byteVector30.putByte(10);
    ByteVector byteVector34 = byteVector30.putShort((int)(byte)-1);
    ByteVector byteVector36 = byteVector34.putInt((int)(short)1);
    ByteVector byteVector38 = byteVector36.putShort((int)(byte)-1);
    ByteVector byteVector40 = byteVector36.putInt((int)'a');
    byte[] byte_array43 = new byte[] { (byte)1, (byte)-1 };
    ByteVector byteVector46 = byteVector40.putByteArray(byte_array43, (int)(byte)0, 0);
    ByteVector byteVector49 = byteVector27.putByteArray(byte_array43, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector52 = byteVector14.putByteArray(byte_array43, (int)(byte)100, (int)(byte)-1);
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
    org.junit.Assert.assertNotNull(byteVector14);
    
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
    org.junit.Assert.assertNotNull(byteVector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
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

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test52"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector0.putShort((int)(short)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("hi!");
    ByteVector byteVector12 = byteVector10.putShort((-1));
    ByteVector byteVector14 = byteVector12.putInt((int)(byte)0);
    
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
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test53"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector8.putInt(0);
    ByteVector byteVector12 = byteVector10.putByte(0);
    ByteVector byteVector14 = byteVector10.putLong((long)(byte)0);
    ByteVector byteVector16 = byteVector10.putInt((int)(short)1);
    ByteVector byteVector18 = byteVector16.putByte(1);
    ByteVector byteVector20 = byteVector18.putUTF8("");
    
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
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test54"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector2.putByte(100);
    ByteVector byteVector10 = byteVector2.putShort(0);
    ByteVector byteVector12 = byteVector10.putLong((long)(short)-1);
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
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test55"); }


    ByteVector byteVector1 = new ByteVector((int)' ');
    ByteVector byteVector3 = byteVector1.putLong((long)10);
    ByteVector byteVector5 = byteVector3.putInt((int)(byte)10);
    ByteVector byteVector7 = byteVector5.putShort((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector7);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test56"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)0);
    ByteVector byteVector12 = byteVector8.putUTF8("hi!");
    ByteVector byteVector14 = byteVector8.putUTF8("hi!");
    
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
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test57"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putInt((int)' ');
    ByteVector byteVector12 = byteVector10.putInt(0);
    ByteVector byteVector14 = byteVector10.putUTF8("hi!");
    byte[] byte_array15 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector18 = byteVector14.putByteArray(byte_array15, (int)' ', (int)'4');
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test58"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector8.putInt((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putInt((int)'#');
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putInt((int)(short)10);
    ByteVector byteVector22 = byteVector18.putLong((long)10);
    ByteVector byteVector24 = byteVector18.putByte(1);
    ByteVector byteVector26 = byteVector18.putLong((long)'#');
    ByteVector byteVector28 = byteVector18.putByte(0);
    ByteVector byteVector30 = byteVector28.putLong((long)(short)10);
    ByteVector byteVector32 = byteVector30.putShort((int)(byte)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector32);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test59"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector8.putInt((int)' ');
    ByteVector byteVector12 = byteVector8.putInt(10);
    ByteVector byteVector14 = byteVector12.putByte((int)(short)100);
    ByteVector byteVector15 = new ByteVector();
    ByteVector byteVector17 = byteVector15.putByte(10);
    ByteVector byteVector19 = byteVector17.putShort((int)(byte)1);
    ByteVector byteVector21 = byteVector19.putLong((long)' ');
    ByteVector byteVector23 = byteVector21.putUTF8("");
    ByteVector byteVector25 = byteVector23.putByte((int)(short)10);
    ByteVector byteVector27 = byteVector23.putInt((int)'a');
    ByteVector byteVector29 = byteVector23.putInt((int)(byte)-1);
    ByteVector byteVector31 = byteVector23.putInt(0);
    ByteVector byteVector32 = new ByteVector();
    ByteVector byteVector34 = byteVector32.putByte(10);
    ByteVector byteVector36 = byteVector32.putByte(0);
    ByteVector byteVector38 = byteVector36.putByte(0);
    ByteVector byteVector40 = byteVector38.putByte(100);
    ByteVector byteVector42 = byteVector38.putByte((-1));
    ByteVector byteVector44 = byteVector42.putUTF8("");
    ByteVector byteVector46 = byteVector42.putUTF8("");
    ByteVector byteVector48 = byteVector46.putByte((int)(byte)0);
    ByteVector byteVector49 = new ByteVector();
    ByteVector byteVector51 = byteVector49.putByte(10);
    ByteVector byteVector53 = byteVector49.putShort((int)(byte)-1);
    ByteVector byteVector55 = byteVector53.putInt((int)(short)1);
    ByteVector byteVector57 = byteVector55.putShort((int)(byte)-1);
    ByteVector byteVector59 = byteVector55.putInt((int)'a');
    byte[] byte_array62 = new byte[] { (byte)1, (byte)-1 };
    ByteVector byteVector65 = byteVector59.putByteArray(byte_array62, (int)(byte)0, 0);
    ByteVector byteVector68 = byteVector46.putByteArray(byte_array62, (int)(short)0, (int)(byte)1);
    ByteVector byteVector71 = byteVector31.putByteArray(byte_array62, (int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector74 = byteVector14.putByteArray(byte_array62, (int)(byte)100, (int)(short)1);
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
    org.junit.Assert.assertNotNull(byteVector14);
    
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
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector71);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test60"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putInt(0);
    ByteVector byteVector10 = byteVector8.putShort(10);
    ByteVector byteVector12 = byteVector10.putLong(0L);
    ByteVector byteVector14 = byteVector12.putByte((int)'a');
    ByteVector byteVector16 = byteVector14.putInt((int)(short)1);
    
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
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test61"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector6.putShort((int)(byte)1);
    ByteVector byteVector12 = byteVector6.putInt((int)(byte)0);
    ByteVector byteVector13 = new ByteVector();
    ByteVector byteVector15 = byteVector13.putByte(10);
    ByteVector byteVector17 = byteVector13.putByte(0);
    ByteVector byteVector19 = byteVector17.putByte(0);
    ByteVector byteVector21 = byteVector17.putUTF8("");
    ByteVector byteVector23 = byteVector21.putByte((int)(short)1);
    ByteVector byteVector25 = byteVector21.putLong((long)100);
    byte[] byte_array31 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)1, (byte)-1 };
    ByteVector byteVector34 = byteVector25.putByteArray(byte_array31, (int)(byte)0, (int)(byte)1);
    ByteVector byteVector37 = byteVector12.putByteArray(byte_array31, 0, (int)(byte)1);
    ByteVector byteVector39 = byteVector12.putLong((-1L));
    ByteVector byteVector40 = new ByteVector();
    ByteVector byteVector42 = byteVector40.putByte(10);
    ByteVector byteVector44 = byteVector40.putByte(0);
    ByteVector byteVector46 = byteVector44.putShort((int)(byte)10);
    ByteVector byteVector48 = byteVector46.putInt(0);
    ByteVector byteVector49 = new ByteVector();
    ByteVector byteVector51 = byteVector49.putByte(10);
    ByteVector byteVector53 = byteVector49.putShort(0);
    ByteVector byteVector55 = byteVector49.putLong((long)' ');
    ByteVector byteVector57 = byteVector49.putLong((long)100);
    ByteVector byteVector59 = byteVector57.putShort((int)'4');
    byte[] byte_array64 = new byte[] { (byte)10, (byte)100, (byte)100, (byte)1 };
    ByteVector byteVector67 = byteVector59.putByteArray(byte_array64, (int)(byte)1, (int)(short)0);
    ByteVector byteVector70 = byteVector48.putByteArray(byte_array64, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector73 = byteVector12.putByteArray(byte_array64, 0, 10);
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
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
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
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test62"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector4.putShort((int)(byte)1);
    ByteVector byteVector9 = new ByteVector();
    ByteVector byteVector11 = byteVector9.putByte(10);
    ByteVector byteVector13 = byteVector11.putShort((int)(byte)1);
    ByteVector byteVector15 = byteVector13.putLong((long)' ');
    ByteVector byteVector17 = byteVector15.putUTF8("");
    ByteVector byteVector19 = byteVector17.putByte((int)(short)10);
    ByteVector byteVector21 = byteVector17.putInt((int)'a');
    ByteVector byteVector23 = byteVector21.putLong((long)10);
    ByteVector byteVector24 = new ByteVector();
    ByteVector byteVector26 = byteVector24.putByte(10);
    ByteVector byteVector28 = byteVector24.putShort(0);
    ByteVector byteVector30 = byteVector24.putLong((long)' ');
    ByteVector byteVector32 = byteVector24.putLong((long)100);
    ByteVector byteVector34 = byteVector32.putShort((int)'4');
    byte[] byte_array39 = new byte[] { (byte)10, (byte)100, (byte)100, (byte)1 };
    ByteVector byteVector42 = byteVector34.putByteArray(byte_array39, (int)(byte)1, (int)(short)0);
    ByteVector byteVector45 = byteVector21.putByteArray(byte_array39, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector48 = byteVector8.putByteArray(byte_array39, 10, (int)(short)10);
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
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test63"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putLong((long)1);
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector0.putByte((int)' ');
    ByteVector byteVector12 = byteVector10.putUTF8("");
    
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
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test64"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(100);
    ByteVector byteVector10 = byteVector8.putByte(0);
    ByteVector byteVector12 = byteVector10.putInt((-1));
    
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
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test65"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putShort(10);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)-1);
    ByteVector byteVector8 = byteVector6.putInt((int)(byte)0);
    ByteVector byteVector10 = byteVector8.putShort((int)'4');
    ByteVector byteVector12 = byteVector10.putUTF8("");
    ByteVector byteVector14 = byteVector10.putInt((int)(byte)0);
    ByteVector byteVector16 = byteVector10.putUTF8("");
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putByte((int)(short)0);
    ByteVector byteVector22 = byteVector18.putByte((int)(byte)10);
    
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
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test66"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putInt((int)(byte)10);
    ByteVector byteVector14 = byteVector12.putByte((-1));
    ByteVector byteVector16 = byteVector12.putUTF8("");
    ByteVector byteVector18 = byteVector16.putByte((int)(short)100);
    ByteVector byteVector20 = byteVector16.putUTF8("hi!");
    ByteVector byteVector22 = byteVector16.putLong((long)(short)1);
    ByteVector byteVector24 = byteVector22.putLong((long)'#');
    ByteVector byteVector25 = new ByteVector();
    ByteVector byteVector27 = byteVector25.putByte(10);
    ByteVector byteVector29 = byteVector25.putShort(0);
    ByteVector byteVector31 = byteVector25.putShort((int)(short)100);
    ByteVector byteVector33 = byteVector31.putUTF8("hi!");
    ByteVector byteVector35 = byteVector33.putInt((int)' ');
    ByteVector byteVector36 = new ByteVector();
    ByteVector byteVector38 = byteVector36.putByte(10);
    ByteVector byteVector40 = byteVector36.putShort(0);
    ByteVector byteVector42 = byteVector36.putShort((int)(short)100);
    ByteVector byteVector44 = byteVector42.putUTF8("hi!");
    ByteVector byteVector46 = byteVector42.putShort((int)(byte)1);
    ByteVector byteVector48 = byteVector42.putInt((int)(byte)0);
    ByteVector byteVector49 = new ByteVector();
    ByteVector byteVector51 = byteVector49.putByte(10);
    ByteVector byteVector53 = byteVector49.putByte(0);
    ByteVector byteVector55 = byteVector53.putByte(0);
    ByteVector byteVector57 = byteVector53.putUTF8("");
    ByteVector byteVector59 = byteVector57.putByte((int)(short)1);
    ByteVector byteVector61 = byteVector57.putLong((long)100);
    byte[] byte_array67 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)1, (byte)-1 };
    ByteVector byteVector70 = byteVector61.putByteArray(byte_array67, (int)(byte)0, (int)(byte)1);
    ByteVector byteVector73 = byteVector48.putByteArray(byte_array67, 0, (int)(byte)1);
    ByteVector byteVector76 = byteVector35.putByteArray(byte_array67, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector79 = byteVector24.putByteArray(byte_array67, (int)(short)10, 100);
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
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector76);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test67"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putInt((int)(byte)100);
    ByteVector byteVector4 = byteVector0.putShort(10);
    ByteVector byteVector6 = byteVector0.putInt((int)(short)-1);
    ByteVector byteVector8 = byteVector0.putByte((int)(short)-1);
    ByteVector byteVector9 = new ByteVector();
    ByteVector byteVector11 = byteVector9.putByte(10);
    ByteVector byteVector13 = byteVector9.putByte(0);
    ByteVector byteVector15 = byteVector13.putByte(0);
    ByteVector byteVector17 = byteVector15.putByte(100);
    ByteVector byteVector19 = byteVector15.putByte((-1));
    ByteVector byteVector21 = byteVector19.putUTF8("");
    ByteVector byteVector23 = byteVector19.putUTF8("");
    ByteVector byteVector25 = byteVector23.putByte((int)(byte)0);
    ByteVector byteVector26 = new ByteVector();
    ByteVector byteVector28 = byteVector26.putByte(10);
    ByteVector byteVector30 = byteVector26.putShort((int)(byte)-1);
    ByteVector byteVector32 = byteVector30.putInt((int)(short)1);
    ByteVector byteVector34 = byteVector32.putShort((int)(byte)-1);
    ByteVector byteVector36 = byteVector32.putInt((int)'a');
    byte[] byte_array39 = new byte[] { (byte)1, (byte)-1 };
    ByteVector byteVector42 = byteVector36.putByteArray(byte_array39, (int)(byte)0, 0);
    ByteVector byteVector45 = byteVector23.putByteArray(byte_array39, (int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector48 = byteVector0.putByteArray(byte_array39, (-1), (int)'#');
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
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test68"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector8.putInt((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putInt((int)'#');
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    ByteVector byteVector20 = byteVector14.putInt((int)'#');
    ByteVector byteVector22 = byteVector14.putShort((int)'a');
    ByteVector byteVector24 = byteVector22.putInt((int)(short)10);
    ByteVector byteVector26 = byteVector24.putShort((int)(byte)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test69"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector6.putInt((int)(short)10);
    ByteVector byteVector12 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector14 = byteVector6.putLong((long)(short)-1);
    ByteVector byteVector16 = byteVector6.putByte((int)(short)1);
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putShort((int)(short)10);
    
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
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test70"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)100);
    ByteVector byteVector10 = byteVector8.putShort((int)'4');
    ByteVector byteVector12 = byteVector10.putShort((int)'4');
    ByteVector byteVector14 = byteVector10.putLong((long)(byte)-1);
    ByteVector byteVector16 = byteVector10.putShort(10);
    ByteVector byteVector17 = new ByteVector();
    ByteVector byteVector19 = byteVector17.putByte(10);
    ByteVector byteVector21 = byteVector19.putShort((int)(byte)1);
    ByteVector byteVector23 = byteVector19.putLong((long)(byte)1);
    ByteVector byteVector25 = byteVector19.putInt((int)(byte)-1);
    ByteVector byteVector27 = byteVector25.putUTF8("");
    ByteVector byteVector29 = byteVector25.putLong((long)(short)10);
    ByteVector byteVector31 = new ByteVector((int)'4');
    ByteVector byteVector33 = byteVector31.putLong((long)(byte)0);
    ByteVector byteVector35 = byteVector31.putUTF8("hi!");
    ByteVector byteVector37 = byteVector31.putByte((int)'#');
    ByteVector byteVector39 = byteVector31.putLong((long)(byte)10);
    byte[] byte_array46 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)1, (byte)0, (byte)0 };
    ByteVector byteVector49 = byteVector39.putByteArray(byte_array46, (int)(byte)0, 1);
    ByteVector byteVector52 = byteVector29.putByteArray(byte_array46, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector55 = byteVector10.putByteArray(byte_array46, (int)(byte)1, (int)(byte)100);
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
    org.junit.Assert.assertNotNull(byteVector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector16);
    
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
    org.junit.Assert.assertNotNull(byteVector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector52);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test71"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector4.putByte((int)(byte)-1);
    ByteVector byteVector8 = byteVector4.putInt((int)(short)100);
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector8.putByte(0);
    ByteVector byteVector14 = byteVector12.putByte((int)' ');
    ByteVector byteVector16 = byteVector12.putInt(10);
    ByteVector byteVector18 = byteVector16.putLong((long)(short)1);
    
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
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test72"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)100);
    ByteVector byteVector10 = byteVector8.putShort((int)'4');
    ByteVector byteVector12 = byteVector10.putShort((int)'4');
    ByteVector byteVector14 = byteVector10.putLong((long)(byte)-1);
    ByteVector byteVector16 = byteVector10.putShort((int)(byte)-1);
    
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
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test73"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector4.putUTF8("hi!");
    ByteVector byteVector10 = byteVector4.putUTF8("");
    ByteVector byteVector12 = byteVector4.putInt(1);
    
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
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test74"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector4.putByte(0);
    ByteVector byteVector8 = byteVector6.putByte(100);
    ByteVector byteVector10 = byteVector6.putByte((-1));
    ByteVector byteVector12 = byteVector10.putByte(100);
    ByteVector byteVector14 = byteVector12.putUTF8("hi!");
    ByteVector byteVector16 = byteVector12.putInt(0);
    ByteVector byteVector18 = byteVector16.putLong((-1L));
    
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
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test75"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector10 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector12 = byteVector6.putUTF8("hi!");
    ByteVector byteVector14 = byteVector6.putLong((long)'a');
    byte[] byte_array15 = null;
    ByteVector byteVector18 = byteVector14.putByteArray(byte_array15, (int)(short)100, (int)(byte)1);
    ByteVector byteVector20 = byteVector14.putUTF8("");
    ByteVector byteVector22 = byteVector20.putLong((long)(short)100);
    
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
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test76"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort((int)(byte)-1);
    ByteVector byteVector6 = byteVector4.putInt((int)(short)1);
    ByteVector byteVector8 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector10 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector12 = byteVector6.putUTF8("hi!");
    ByteVector byteVector14 = byteVector6.putLong((long)'a');
    byte[] byte_array15 = null;
    ByteVector byteVector18 = byteVector14.putByteArray(byte_array15, (int)(short)100, (int)(byte)1);
    ByteVector byteVector20 = byteVector14.putUTF8("");
    ByteVector byteVector22 = byteVector14.putInt((int)(short)10);
    ByteVector byteVector24 = byteVector14.putUTF8("");
    
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
    org.junit.Assert.assertNotNull(byteVector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector24);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test77"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putByte((int)(byte)0);
    ByteVector byteVector8 = byteVector6.putLong((long)'#');
    ByteVector byteVector10 = byteVector8.putInt(1);
    ByteVector byteVector12 = byteVector8.putInt((int)'#');
    ByteVector byteVector14 = byteVector8.putLong((long)(byte)-1);
    
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
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test78"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putLong((long)1);
    ByteVector byteVector8 = byteVector6.putShort((int)'4');
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector8.putByte((int)(byte)-1);
    
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
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test79"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putLong((long)1);
    ByteVector byteVector8 = byteVector6.putShort((int)'4');
    ByteVector byteVector10 = byteVector8.putByte(1);
    ByteVector byteVector12 = byteVector10.putInt(10);
    ByteVector byteVector14 = byteVector12.putShort(1);
    ByteVector byteVector16 = byteVector14.putByte((int)'#');
    ByteVector byteVector18 = byteVector16.putByte((int)(byte)-1);
    
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
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test80"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putLong((long)100);
    ByteVector byteVector6 = byteVector4.putLong(0L);
    ByteVector byteVector8 = byteVector6.putShort((int)(short)100);
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
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test81"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putByte(0);
    ByteVector byteVector6 = byteVector0.putLong((long)1);
    ByteVector byteVector8 = byteVector6.putByte((int)'#');
    ByteVector byteVector10 = byteVector6.putLong((-1L));
    ByteVector byteVector12 = byteVector10.putInt((int)(short)1);
    ByteVector byteVector14 = byteVector10.putUTF8("");
    ByteVector byteVector16 = byteVector14.putLong((long)1);
    ByteVector byteVector18 = byteVector16.putByte(0);
    
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
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test82"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector12.putLong((long)10);
    ByteVector byteVector16 = byteVector12.putLong((long)(short)-1);
    ByteVector byteVector18 = byteVector12.putShort((int)(byte)0);
    ByteVector byteVector20 = byteVector12.putInt((int)(byte)0);
    ByteVector byteVector22 = byteVector12.putUTF8("hi!");
    
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
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test83"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putShort((int)(short)100);
    ByteVector byteVector8 = byteVector6.putUTF8("hi!");
    ByteVector byteVector10 = byteVector6.putInt((int)(short)10);
    ByteVector byteVector12 = byteVector6.putShort((int)(byte)-1);
    ByteVector byteVector14 = byteVector12.putShort(10);
    ByteVector byteVector16 = byteVector12.putShort((-1));
    ByteVector byteVector18 = byteVector16.putUTF8("hi!");
    
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
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test84"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putLong((long)(byte)1);
    ByteVector byteVector8 = byteVector2.putInt((int)(byte)-1);
    ByteVector byteVector10 = byteVector8.putUTF8("");
    ByteVector byteVector12 = byteVector10.putLong((long)(short)1);
    ByteVector byteVector14 = byteVector10.putUTF8("hi!");
    ByteVector byteVector16 = byteVector10.putLong((long)'4');
    ByteVector byteVector18 = byteVector10.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putLong((long)(byte)-1);
    ByteVector byteVector22 = byteVector18.putUTF8("");
    ByteVector byteVector24 = byteVector18.putShort((int)(byte)0);
    ByteVector byteVector26 = byteVector18.putByte((int)(short)-1);
    ByteVector byteVector28 = byteVector18.putUTF8("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector28);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test85"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector4.putLong((long)' ');
    ByteVector byteVector8 = byteVector6.putUTF8("");
    ByteVector byteVector10 = byteVector8.putByte((int)(short)10);
    ByteVector byteVector12 = byteVector8.putInt((int)'a');
    ByteVector byteVector14 = byteVector8.putInt((int)(byte)-1);
    ByteVector byteVector16 = byteVector14.putInt((int)'#');
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putInt((int)(short)10);
    ByteVector byteVector22 = byteVector18.putLong((long)10);
    ByteVector byteVector24 = byteVector18.putShort((int)(short)100);
    ByteVector byteVector26 = byteVector24.putByte((int)'a');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector26);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test86"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector2.putShort((int)(byte)1);
    ByteVector byteVector6 = byteVector2.putInt((int)'a');
    ByteVector byteVector8 = byteVector6.putShort(100);
    ByteVector byteVector10 = byteVector6.putInt(0);
    ByteVector byteVector12 = byteVector6.putUTF8("");
    ByteVector byteVector14 = byteVector6.putLong((long)'a');
    ByteVector byteVector16 = byteVector14.putUTF8("");
    ByteVector byteVector18 = byteVector14.putLong((long)'a');
    ByteVector byteVector20 = byteVector14.putInt((int)(short)1);
    ByteVector byteVector22 = byteVector14.putLong((long)'a');
    ByteVector byteVector24 = byteVector14.putShort(1);
    
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
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test87"); }


    ByteVector byteVector0 = new ByteVector();
    ByteVector byteVector2 = byteVector0.putByte(10);
    ByteVector byteVector4 = byteVector0.putShort(0);
    ByteVector byteVector6 = byteVector0.putLong((long)' ');
    ByteVector byteVector8 = byteVector0.putLong((long)(short)1);
    ByteVector byteVector10 = byteVector8.putInt(0);
    ByteVector byteVector12 = byteVector10.putByte(0);
    ByteVector byteVector14 = byteVector12.putLong((long)(short)0);
    ByteVector byteVector16 = byteVector14.putUTF8("");
    ByteVector byteVector18 = byteVector14.putUTF8("hi!");
    ByteVector byteVector20 = byteVector18.putByte(1);
    ByteVector byteVector22 = byteVector20.putShort((int)(short)-1);
    ByteVector byteVector23 = new ByteVector();
    ByteVector byteVector25 = byteVector23.putByte(10);
    ByteVector byteVector27 = byteVector25.putLong((long)100);
    ByteVector byteVector29 = byteVector27.putByte((int)(byte)-1);
    ByteVector byteVector31 = byteVector29.putByte((int)(byte)100);
    ByteVector byteVector32 = new ByteVector();
    ByteVector byteVector34 = byteVector32.putByte(10);
    ByteVector byteVector36 = byteVector34.putLong((long)100);
    ByteVector byteVector38 = byteVector36.putByte((int)(byte)-1);
    ByteVector byteVector40 = byteVector36.putUTF8("");
    ByteVector byteVector42 = byteVector36.putLong((long)1);
    ByteVector byteVector43 = new ByteVector();
    ByteVector byteVector45 = byteVector43.putByte(10);
    ByteVector byteVector47 = byteVector45.putShort((int)(byte)1);
    ByteVector byteVector49 = byteVector45.putLong((long)(byte)1);
    ByteVector byteVector51 = byteVector45.putInt((int)(byte)-1);
    ByteVector byteVector53 = byteVector51.putUTF8("");
    ByteVector byteVector55 = byteVector51.putLong((long)(short)10);
    ByteVector byteVector57 = new ByteVector((int)'4');
    ByteVector byteVector59 = byteVector57.putLong((long)(byte)0);
    ByteVector byteVector61 = byteVector57.putUTF8("hi!");
    ByteVector byteVector63 = byteVector57.putByte((int)'#');
    ByteVector byteVector65 = byteVector57.putLong((long)(byte)10);
    byte[] byte_array72 = new byte[] { (byte)-1, (byte)-1, (byte)0, (byte)1, (byte)0, (byte)0 };
    ByteVector byteVector75 = byteVector65.putByteArray(byte_array72, (int)(byte)0, 1);
    ByteVector byteVector78 = byteVector55.putByteArray(byte_array72, 0, (int)(byte)1);
    ByteVector byteVector81 = byteVector36.putByteArray(byte_array72, 0, (int)(short)0);
    ByteVector byteVector84 = byteVector31.putByteArray(byte_array72, (int)(short)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    ByteVector byteVector87 = byteVector22.putByteArray(byte_array72, (int)(short)1, (int)(byte)-1);
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
    org.junit.Assert.assertNotNull(byteVector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byteVector84);

  }

}

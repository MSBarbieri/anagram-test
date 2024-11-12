package com.colmeia.anagram;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase {
  /**
   * Create the test case
   *
   * @param testName name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Rigourous Test :-)
   */
  public void teste1() {
    assert (Anagram.isAnagram("", ""));
  }

  public void teste2() {
    assert (Anagram.isAnagram("word", "drow"));
  }

  public void teste3() {
    assert (!Anagram.isAnagram("wocd", "drow"));
  }

  public void teste4() {
    assert (!Anagram.isAnagram("word", "drowd"));
  }

  public void teste5() {
    assert (Anagram.isAnagram("word", "drow"));
  }

  public void teste6() {
    assert (Anagram.isAnagram("conversation", "voicesranton"));
  }

  public void teste7() {
    assert (!Anagram.isAnagram("conversation", "voicesrantons"));
  }

  public void teste8() {
    assert (Anagram.isAnagram("listen", "silent"));
  }

  public void teste9() {
    assert (!Anagram.isAnagram("listen", "silents"));
  }

  public void teste10() {
    assert (Anagram.isAnagram("the eyes", "they see"));
  }

  public void teste11() {
    assert (!Anagram.isAnagram("the eyes", "they sees"));
  }

  public void teste12() {
    assert (Anagram.isAnagram("a gentleman", "elegant man"));
  }

  public void teste13() {
    assert (!Anagram.isAnagram("a gentleman", "elegant mans"));
  }
}

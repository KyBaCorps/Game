import java.util.Random;

public class Jar {
  private String mName;
  private final int mMax;
  private int rand;
  
  public Jar(String name, int max) {
	  mName = name;
	  mMax = max;
  }
  
  public String getName() {
	  return mName;
  }
  
  public int getMax() {
	  return mMax;
  }
  
  public int fill() {
	  Random number = new Random();
	  rand = number.nextInt(mMax) + 1;
	  return rand;
  }
}
public class pieces {
  private int xCor;
  private int yCor;
  private boolean king;
  private String type;
  
  public pieces() {
    xCor = 0;
    yCor = 0;
    king = false;
  }
  
  public pieces(int x, int y, boolean b, String s) {
    xCor = x;
    yCor = y;
    king = b;
    type = s;
  }
  
  public int getX() {
    return xCor;
  }
  
  public int getY() {
    return yCor;
  }
  
  public boolean kingStatus() {
    return king;
  }
  
  public void setX(int x) {
    xCor = x;
  }
  
  public void setY(int y) {
    yCor = y;
  }

  public void setType(String s) {
    type = s;
  }
  
  public void makeKing(boolean k) {
    king = k;
  }

  public String toString() {
    return type;
  }

  public boolean canMove() {
    if (xCor >= 8 || yCor >= 8 || xCor <= 0 || yCor <= 0)
      return false;
    return true;

  }
}
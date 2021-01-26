public class Graphics {
  java.awt.Graphics g;
  Graphics(java.awt.Graphics g) {
    this.g = g;
  }
  public void drawString(String s, int x, int y) {
    g.drawString(s, x, y);
  }
  public void drawLine(int x1, int y1, int x2, int y2) {
    g.drawLine(x1, y1, x2, y2);
  }
}

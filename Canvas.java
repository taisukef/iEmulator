public class Canvas extends java.awt.Canvas {
  public void paint(Graphics g) {
  }
  public static int KEY_PRESSED_EVENT = 1;
  public static int KEY_RELEASED_EVENT = 2;
  public void processEvent(int type, int param) {
  }
  public void paint(java.awt.Graphics ag) {
    Graphics g = new Graphics(ag);
    paint(g);
  }
  public Canvas() {
    setSize(new java.awt.Dimension(128 * 2, 128 * 2));
    addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent e) {
        processEvent(KEY_PRESSED_EVENT, e.getKeyCode());
      }
      public void keyReleased(java.awt.event.KeyEvent e) {
        processEvent(KEY_RELEASED_EVENT, e.getKeyCode());
      }
    });
  }
}

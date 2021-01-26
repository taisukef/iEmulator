

public class A extends IApplication {
  public void start() {
    Display.setCurrent(new Canvas() {
      int key = 0;
      public void paint(Graphics g) {
        g.drawString("祝! モバイルアプリ 20th!", 10, 20);
        g.drawString("Hi! iアプリ", 10, 40);
        g.drawString("key: " + key, 10, 60);
        g.drawLine(60, 60, 120, 120);
      }
      public void processEvent(int type, int param) {
        if (type == KEY_RELEASED_EVENT) {
          key = param;
          repaint();
        }
      }
    });
  }
}

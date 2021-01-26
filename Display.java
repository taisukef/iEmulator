public class Display {
  public static void setCurrent(Canvas c) {
    java.awt.Frame f = new java.awt.Frame();
    f.setTitle("iEmulator");
    f.setVisible(true);
    f.setLayout(new java.awt.BorderLayout());
    f.add(c, java.awt.BorderLayout.CENTER);
    java.awt.Rectangle bounds = f.getBounds();
    f.setSize(new java.awt.Dimension(bounds.width + 120, bounds.height + 120));
    f.addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

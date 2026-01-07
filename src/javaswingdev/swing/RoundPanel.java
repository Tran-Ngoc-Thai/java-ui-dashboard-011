package javaswingdev.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RoundPanel extends JPanel {

    // 1. Thêm biến màu sắc để tùy chỉnh
    private Color color1 = new Color(51, 153, 255); // Màu xanh dương nhạt
    private Color color2 = new Color(0, 102, 204);  // Màu xanh dương đậm
    private int round = 15; // Độ bo tròn mặc định

    public RoundPanel() {
        setOpaque(false);
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }
    
    // Hàm set màu nếu muốn đổi từ bên ngoài
    public void setGradientColors(Color c1, Color c2) {
        this.color1 = c1;
        this.color2 = c2;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Vẽ khung bo tròn
        Area area = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), round, round));
        g2.setColor(getBackground());
        g2.fill(area);
        
        // Vẽ phần Gradient ở dưới đáy (trang trí)
        area.subtract(new Area(new Rectangle2D.Double(0, 0, getWidth(), getHeight() - 5))); // Trừ đi phần trên, giữ lại 5px đáy
        g2.setPaint(new GradientPaint(0, 0, color1, getWidth(), 0, color2));
        g2.fill(area);
        
        g2.dispose();
        super.paintComponent(g);
    }
}

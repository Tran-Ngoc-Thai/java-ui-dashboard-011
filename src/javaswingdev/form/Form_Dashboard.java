package javaswingdev.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Form_Dashboard extends javax.swing.JPanel {

    public Form_Dashboard() {
        initComponents();
        init();
    }

    private void init() {
        // 1. Phá bỏ kích thước cố định
        this.setPreferredSize(null);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        
        // 2. Layout chính
        this.setLayout(new BorderLayout());

        // --- TIÊU ĐỀ ---
        AutoFitLabel lbTitle = new AutoFitLabel("PHẦN MỀM HUẤN LUYỆN MÁY THÔNG TIN VÔ TUYẾN ĐIỆN");
        lbTitle.setForeground(new Color(0, 102, 153));
        
        // Chiều cao cố định cho vùng tiêu đề
        lbTitle.setPreferredSize(new Dimension(0, 100)); 
        lbTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.add(lbTitle, BorderLayout.NORTH);

        // --- HÌNH ẢNH ---
        String imagePath = "/javaswingdev/images/ANHNEN.png";
        ImagePanel panelImage = new ImagePanel(imagePath);
        this.add(panelImage, BorderLayout.CENTER);
    }

    // =========================================================================
    // CLASS 1: LABEL TỰ ĐỘNG PHÓNG TO THU NHỎ CHỮ (SỬA LẠI ĐÚNG LOGIC TEXT)
    // =========================================================================
    class AutoFitLabel extends JLabel {

        public AutoFitLabel(String text) {
            super(text);
            setHorizontalAlignment(CENTER);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            // Khử răng cưa cho CHỮ
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            String text = getText();
            if (text == null || text.isEmpty()) {
                super.paintComponent(g);
                return;
            }

            // Lấy kích thước khả dụng
            int availableWidth = getWidth() - getInsets().left - getInsets().right;
            int availableHeight = getHeight() - getInsets().top - getInsets().bottom;

            if (availableWidth <= 0 || availableHeight <= 0) return;

            // --- TÍNH TOÁN FONT SIZE ---
            Font originalFont = new Font("Arial", Font.BOLD, 100);
            FontMetrics fm = g2.getFontMetrics(originalFont);
            Rectangle2D r = fm.getStringBounds(text, g2);

            double scale = Math.min((double) availableWidth / r.getWidth(), (double) availableHeight / r.getHeight());
            
            // Tạo font mới
            Font newFont = originalFont.deriveFont((float) (100 * scale * 0.9)); 
            g2.setFont(newFont);
            g2.setColor(getForeground());

            // Vẽ chữ vào giữa
            FontMetrics newFm = g2.getFontMetrics(newFont);
            int x = (getWidth() - newFm.stringWidth(text)) / 2;
            int y = ((getHeight() - newFm.getHeight()) / 2) + newFm.getAscent();

            g2.drawString(text, x, y);
        }
    }

    // =========================================================================
    // CLASS 2: PANEL HÌNH ẢNH (LOGIC VẼ ẢNH Ở ĐÂY)
    // =========================================================================
    class ImagePanel extends JPanel {
        private Image img;

        public ImagePanel(String imagePath) {
            this.setBackground(Color.WHITE);
            try {
                java.net.URL imgURL = getClass().getResource(imagePath);
                if (imgURL != null) {
                    this.img = new ImageIcon(imgURL).getImage();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (img != null) {
                Graphics2D g2 = (Graphics2D) g;

                // Khử răng cưa cho ẢNH (Bicubic)
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int panelW = getWidth();
                int panelH = getHeight();
                int imgW = img.getWidth(this);
                int imgH = img.getHeight(this);

                double r1 = (double) panelW / imgW;
                double r2 = (double) panelH / imgH;

                // Dùng Math.min để hiển thị toàn bộ ảnh (không bị vỡ)
                double ratio = Math.min(r1, r2); 

                int newW = (int) (imgW * ratio);
                int newH = (int) (imgH * ratio);

                // Căn giữa
                int x = (panelW - newW) / 2;
                int y = (panelH - newH) / 2;

                g2.drawImage(img, x, y, newW, newH, this);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

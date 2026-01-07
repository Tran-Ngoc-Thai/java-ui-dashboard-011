package javaswingdev.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Form_Dashboard extends javax.swing.JPanel {

    public Form_Dashboard() {
        initComponents();
        init();
    }

    private void init() {
        // Sử dụng BorderLayout để chia bố cục đơn giản:
        // - NORTH (Trên): Tiêu đề
        // - CENTER (Giữa): Hình ảnh
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        // 1. TIÊU ĐỀ (HEADER)
        JLabel lbTitle = new JLabel("PHẦN MỀM HUẤN LUYỆN MÁY THÔNG TIN VÔ TUYẾN ĐIỆN");
        lbTitle.setFont(new Font("Arial", Font.BOLD, 32)); // Chữ to rõ
        lbTitle.setForeground(new Color(0, 102, 153));     // Màu xanh dương đậm
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        // Tạo khoảng cách trên dưới cho tiêu đề (Top: 40px, Bottom: 40px)
        lbTitle.setBorder(BorderFactory.createEmptyBorder(40, 0, 40, 0));
        this.add(lbTitle, BorderLayout.NORTH);

        // 2. KHUNG HÌNH ẢNH (CENTER)
        JPanel panelImage = new JPanel(new BorderLayout());
        panelImage.setBackground(new Color(245, 245, 245)); // Nền xám nhạt
   
        // --- BẮT ĐẦU PHẦN SỬA ĐỔI HIỂN THỊ ẢNH ---
        JLabel lbImage = new JLabel();
        lbImage.setHorizontalAlignment(SwingConstants.CENTER);

        try {
            String imagePath = "/javaswingdev/images/mayttvotuyen.jpg"; 
            
            // Lấy ảnh từ source
            java.net.URL imgURL = getClass().getResource(imagePath);
            
            if (imgURL != null) {
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
                
                // --- Xử lý Resize ảnh cho vừa khung (Ví dụ: Rộng 800, Cao 500) ---
                // Bạn có thể chỉnh số 800, 500 tùy ý muốn
                java.awt.Image img = icon.getImage();
                java.awt.Image newImg = img.getScaledInstance(934, 520, java.awt.Image.SCALE_SMOOTH);
                icon = new javax.swing.ImageIcon(newImg);
                
                // Gán icon vào label
                lbImage.setIcon(icon);
            } else {
                // Nếu không tìm thấy ảnh thì hiện chữ báo lỗi
                lbImage.setText("Không tìm thấy file ảnh!");
                lbImage.setForeground(Color.RED);
            }
        } catch (Exception e) {
            lbImage.setText("Lỗi khi tải ảnh");
        }
        // --- KẾT THÚC PHẦN SỬA ĐỔI ---

        // Thêm label vào panelImage
        panelImage.add(lbImage, BorderLayout.CENTER);

        // Thêm panelImage vào giữa màn hình
        this.add(panelImage, BorderLayout.CENTER);
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

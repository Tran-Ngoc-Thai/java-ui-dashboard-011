package javaswingdev.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javaswingdev.swing.RoundPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Form_Empty extends javax.swing.JPanel {

    // SỬA ĐỔI: Constructor nhận vào 2 tham số: Tiêu đề và Nội dung HTML
    public Form_Empty(String title, String htmlContent) {
        initComponents(); 
        // Gọi hàm layout tùy chỉnh và truyền dữ liệu vào
        initCustomLayout(title, htmlContent); 
    }
    
    // SỬA ĐỔI: Hàm initCustomLayout nhận tham số đầu vào
    private void initCustomLayout(String title, String htmlContent) {
        setOpaque(false);
        // Reset layout của Form chính sang BorderLayout để chứa RoundPanel full màn hình
        setLayout(new BorderLayout()); 
        setBorder(new EmptyBorder(20, 20, 20, 20));
        
        // Xóa các component mặc định do initComponents tạo ra (ví dụ chữ "Form" to đùng)
        removeAll();

        // 2. Tạo khung RoundPanel
        RoundPanel panelContent = new RoundPanel();
        panelContent.setBackground(Color.WHITE);
        panelContent.setRound(20);
        panelContent.setLayout(new BorderLayout());

        // 3. TIÊU ĐỀ
        // Sử dụng biến 'title' được truyền vào hàm
        JLabel lbTitle = new JLabel(title); 
        lbTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitle.setForeground(new Color(0, 102, 153));
        lbTitle.setHorizontalAlignment(JLabel.CENTER);
        lbTitle.setBorder(new EmptyBorder(20, 0, 10, 0));

        // 4. NỘI DUNG
        // Sử dụng biến 'htmlContent' được truyền vào hàm
        JLabel lbContent = new JLabel(htmlContent);
        // Căn chỉnh label nội dung lên trên cùng
        lbContent.setVerticalAlignment(JLabel.TOP);
        lbContent.setBorder(new EmptyBorder(10, 20, 20, 20));

        // Add title và content vào panelContent
        panelContent.add(lbTitle, BorderLayout.NORTH);
        panelContent.add(lbContent, BorderLayout.CENTER);

        // Add panelContent vào Form chính
        add(panelContent, BorderLayout.CENTER);
        
        // Cập nhật lại giao diện
        revalidate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();

        setOpaque(false);

        lb.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        lb.setForeground(new java.awt.Color(125, 125, 125));
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}

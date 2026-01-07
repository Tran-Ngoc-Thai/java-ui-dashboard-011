/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.form;

/**
 *
 * @author DELL
 */
public class Form_GioiThieu extends javax.swing.JPanel{
    public Form_GioiThieu() {
        initComponents();
        setOpaque(false); // Để trong suốt để thấy nền của Main nếu cần
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JPanel panel = new javax.swing.JPanel();
        javax.swing.JLabel lbTitle = new javax.swing.JLabel();
        javax.swing.JTextArea txtContent = new javax.swing.JTextArea();

        // 1. Cấu hình Panel nền trắng
        panel.setBackground(new java.awt.Color(255, 255, 255));

        // 2. Cấu hình Tiêu đề
        lbTitle.setFont(new java.awt.Font("sansserif", 1, 24)); 
        lbTitle.setForeground(new java.awt.Color(0, 102, 204)); // Xanh dương đậm
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("GIỚI THIỆU PHẦN MỀM");

        // 3. Cấu hình Nội dung văn bản
        txtContent.setEditable(false);
        txtContent.setBackground(new java.awt.Color(255, 255, 255));
        txtContent.setColumns(20);
        txtContent.setFont(new java.awt.Font("sansserif", 0, 14)); 
        // Hai dòng này giúp văn bản tự xuống dòng giống Word
        txtContent.setLineWrap(true);
        txtContent.setWrapStyleWord(true);
        
        // CẬP NHẬT NỘI DUNG CHUẨN THEO FILE WORD
        txtContent.setText("\n\"Phần mềm mô phỏng phục vụ huấn luyện một số máy vô tuyến điện có trong biên chế\" được tác giả biên soạn dựa trên nhu cầu thực tế huấn luyện và khai thác sử dụng trang bị Thông tin liên lạc tại các đơn vị.\n\n"
                + "Phần mềm sử dụng tài liệu huấn luyện các chuyên ngành thông tin do Binh chủng Thông tin liên lạc và Tập đoàn Viễn thông Quân đội ban hành.\n\n"
                + "Nội dung của phần mềm gồm có:\n"
                + "     •  Giới thiệu Tính năng, kỹ chiến thuật;\n"
                + "     •  Hướng dẫn khai thác, sử dụng;\n"
                + "     •  Mô phỏng quá trình liên lạc;\n"
                + "     •  Củng cố kiến thức;\n\n"
                + "Phần mềm giúp cho cán bộ, nhân viên kỹ thuật thông tin và cán bộ chỉ huy có thể tra cứu kiến thức một cách dễ dàng, biết cách khai thác sử dụng các máy vô tuyến điện có trong biên chế và hiểu được quá trình liên lạc.\n\n"
                + "Phần mềm phục vụ công tác huấn luyện chuyên môn kỹ thuật tại các đơn vị, bảo đảm cho người chỉ huy trong công tác chỉ huy, chỉ đạo điều hành luôn thông suốt.");
        
        txtContent.setBorder(null);

        // 4. Sắp xếp Layout
        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContent, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitle)
                .addGap(30, 30, 30)
                .addComponent(txtContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE)) // Tự động đẩy xuống
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}

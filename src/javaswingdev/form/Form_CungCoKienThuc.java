package javaswingdev.form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Form_CungCoKienThuc extends javax.swing.JPanel {

    private javax.swing.JTable table;

    public Form_CungCoKienThuc() {
        initComponents();
        setOpaque(false);
        initTableData();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JPanel panel = new javax.swing.JPanel();
        javax.swing.JLabel lbTitle = new javax.swing.JLabel();
        javax.swing.JLabel lbSubTitle = new javax.swing.JLabel();
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        // 1. Cấu hình Panel nền trắng
        panel.setBackground(new java.awt.Color(255, 255, 255));

        // 2. Cấu hình Tiêu đề chính
        lbTitle.setFont(new java.awt.Font("sansserif", 1, 24)); 
        lbTitle.setForeground(new java.awt.Color(0, 102, 204));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("CỦNG CỐ KIẾN THỨC");

        // 3. Cấu hình Tiêu đề phụ
        lbSubTitle.setFont(new java.awt.Font("sansserif", 1, 16)); 
        lbSubTitle.setForeground(new java.awt.Color(102, 102, 102));
        lbSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubTitle.setText("MỘT SỐ LỖI THƯỜNG GẶP TRONG QUÁ TRÌNH SỬ DỤNG VÀ CÁCH KHẮC PHỤC");

        // 4. Cấu hình Bảng
        table.setFont(new java.awt.Font("sansserif", 0, 14));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "TT", "Hiện tượng", "Nguyên nhân", "Biện pháp khắc phục"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        // --- SỬA ĐỔI GIAO DIỆN ĐỂ KẺ KHUNG RÕ RÀNG ---
        
        // Tăng chiều cao hàng
        table.setRowHeight(80); 
        
        // Header (Tiêu đề cột)
        table.getTableHeader().setFont(new Font("sansserif", Font.BOLD, 14));
        table.getTableHeader().setBackground(new Color(230, 240, 255)); // Màu nền xanh nhạt cho tiêu đề cột
        table.getTableHeader().setForeground(Color.BLACK);
        
        // Kẻ khung (Grid)
        table.setShowGrid(true); // Bật hiển thị lưới
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setGridColor(new Color(100, 100, 100)); // Màu xám đậm cho đường kẻ bảng (Rõ hơn)
        
        // Áp dụng renderer tự động xuống dòng
        table.setDefaultRenderer(Object.class, new LineWrapCellRenderer());
        
        // Chỉnh độ rộng cột
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(250);
        table.getColumnModel().getColumn(3).setPreferredWidth(300);

        scrollPane.setViewportView(table);
        
        // Tạo viền bao quanh bảng (Scroll Pane)
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204), 1)); // Viền xanh bao quanh toàn bảng

        // 5. Layout
        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(scrollPane))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSubTitle)
                .addGap(30, 30, 30)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
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

    private void initTableData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        Object[][] data = {
            {"1", "Mở nguồn cho điện đài nhưng màn hình hiển thị không sáng", 
                  "- Ắc quy không được lắp đặt đúng cách.\n- Khối thu phát lắp trên giá chưa đúng cách.\n- Khối điều khiển của máy bị hỏng", 
                  "- Kiểm tra tiếp xúc của máy với Ắc qui, nếu tiếp xúc kém thì dùng rẻ lau sạch\n- Kiểm tra kết nối giữa giá và khối thu phát, vệ sinh lại các connector.\n- Chuyển cho bộ phận kỹ thuật kiểm tra khối điều khiển."},
            {"2", "Đèn “FAULT” trên khối nguồn chuyển đổi báo sáng", 
                  "- Nguồn cấp từ Ắc qui quá thấp (≤20V)\n- Một trong ba thành phần: khối nguồn chuyển đổi, khối thu phát chính, khối KĐCS bị hỏng", 
                  "- Dùng đồng hồ đa năng kiểm tra nguồn Ắc qui, nạp bổ sung nếu yếu.\n- Kiểm tra các khối nguồn, KĐCS, thu phát bằng cách thay thế khối mẫu, báo kỹ thuật nếu hỏng."},
            {"3", "Điện đài đã khởi động xong nhưng không có rào trên tai nghe", 
                  "- Máy đang đặt ở chế độ triệt ồn\n- Máy đang hoạt động ở các chế độ số\n- Tổ hợp cầm tay bị hỏng\n- Khối thu hoặc khối âm tần trong máy bị hỏng", 
                  "- Kiểm tra lại chế độ hoạt động, đưa về FIX/C, tắt triệt ồn.\n- Thay thế tổ hợp chuẩn để kiểm tra.\n- Kiểm tra khối âm tần và khối xử lý trung tâm."},
            {"4", "Chất lượng thu của đài thấp", 
                  "- Các tham số nhảy tần đặt chưa đúng\n- Kênh làm việc có nhiễu.\n- Rơ-le thu phát trong khối KĐCS bị lỗi.\n- Ăng ten hoặc khối điều hưởng hỏng.", 
                  "- Kiểm tra lại các tham số nhảy tần.\n- Kiểm tra khớp nối dây cao tần.\n- Cắm trực tiếp ăng ten vào khối thu phát chính để thử.\n- Thay thế ăng ten mới."},
            {"5", "Đèn “BÁO LỖI” trên khối KĐCS 50 W báo sáng", 
                  "- Khối KĐSC 50W bị lỗi.\n- Cáp cao tần nối khối thu phát đến KĐCS hoặc ra ăng ten lỗi.\n- Ăng ten lỗi.", 
                  "- Kiểm tra, lắp lại các cáp chắc chắn.\n- Thay thế ăng ten mới.\n- Thay thế khối KĐCS 50W mới.\n- Thay thế khối thu phát chính mới."},
            {"6", "Chất lượng thu của đài đối thấp", 
                  "- Kênh truyền nhiễu lớn.\n- Ăng ten hoặc cáp cao tần lỗi.\n- Máy đang ở chế độ công suất thấp.\n- Khối lọc phát/công suất bị lỗi.", 
                  "- Đưa máy về chế độ công suất cao.\n- Đổi tần số công tác.\n- Thay đổi vị trí đặt máy.\n- Kiểm tra cáp cao tần bằng đồng hồ đa năng.\n- Kiểm tra khối KĐCS 50W."},
            {"7", "Liên lạc ở chế độ số đèn đồng bộ không sáng", 
                  "- Kênh truyền có nhiễu lớn\n- Các tham số nhảy tần không đúng\n- Khối xử lý trung tâm lỗi", 
                  "- Kiểm tra lại tham số nhảy tần, đưa về giống đài đối.\n- Thay đổi vị trí công tác.\n- Kiểm tra thay thế khối xử lý trung tâm."}
        };

        for (Object[] row : data) {
            model.addRow(row);
        }
    }
    
    // Class hỗ trợ tự động xuống dòng trong ô (Renderer)
    private static class LineWrapCellRenderer extends JTextArea implements TableCellRenderer {
        LineWrapCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value != null ? value.toString() : "");
            
            if (isSelected) {
                setBackground(new Color(184, 207, 229)); // Màu khi chọn dòng (Xanh nhạt)
                setForeground(Color.BLACK);
            } else {
                setBackground(Color.WHITE); // Màu nền trắng
                setForeground(Color.BLACK); // Màu chữ đen
            }
            
            setFont(table.getFont());
            // Thêm viền nhẹ cho từng ô nếu muốn siêu rõ (Optional)
             setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(200, 200, 200)), // Viền dưới và phải nhẹ
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Padding nội dung
            
            return this;
        }
    }
}
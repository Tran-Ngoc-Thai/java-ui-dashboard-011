package javaswingdev.form;

import java.awt.Color;
import java.net.URL;
import javax.swing.GroupLayout;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_TinhNangKyChienThuat extends JPanel {

    public Form_TinhNangKyChienThuat() {
        initComponents();
        setOpaque(false);
    }

    // Hàm lấy đường dẫn ảnh an toàn
    private String getImgSrc(String imageName) {
        URL url = getClass().getResource("/javaswingdev/images/" + imageName);
        if (url != null) {
            return url.toExternalForm();
        } else {
            return ""; // Trả về rỗng nếu chưa có ảnh
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        JEditorPane txtContent = new JEditorPane();

        panel.setBackground(new Color(255, 255, 255));

        txtContent.setEditable(false);
        txtContent.setContentType("text/html");
        txtContent.setBackground(new Color(255, 255, 255));
        
        // --- NỘI DUNG TỪ FILE: TÍNH NĂNG KỸ CHIẾN THUẬT.docx ---
        StringBuilder html = new StringBuilder();
        html.append("<html><head><style>");
        html.append("body { font-family: Arial, Sans-serif; font-size: 14px; margin: 20px; color: #333; }");
        html.append("h1 { color: #0066cc; text-align: center; font-size: 24px; margin-bottom: 20px; font-weight: bold; }");
        html.append("h2 { color: #0066cc; font-size: 18px; margin-top: 25px; border-bottom: 2px solid #ddd; padding-bottom: 5px; font-weight: bold; }");
        html.append("h3 { color: #cc0000; font-size: 16px; font-weight: bold; margin-top: 20px; }");
        html.append("h4 { color: #333; font-size: 15px; font-weight: bold; margin-top: 15px; font-style: italic; }");
        html.append("p { line-height: 1.6; margin-bottom: 10px; text-align: justify; }");
        html.append("ul { margin-bottom: 10px; }");
        html.append("li { margin-bottom: 5px; line-height: 1.5; }");
        // Style cho bảng
        html.append("table { border-collapse: collapse; width: 100%; margin-top: 10px; margin-bottom: 20px; font-size: 13px; }");
        html.append("th, td { border: 1px solid #000; padding: 8px; text-align: center; vertical-align: middle; }");
        html.append("th { background-color: #f0f0f0; font-weight: bold; }");
        html.append(".td-left { text-align: left; }"); // Căn trái cho cột Tên danh mục
        html.append("</style></head><body>");

        // === BẮT ĐẦU NỘI DUNG ===
        html.append("<h1>TÍNH NĂNG KỸ - CHIẾN THUẬT, THÀNH PHẦN</h1>");

        // 1. GIỚI THIỆU CHUNG
        html.append("<h2>I. GIỚI THIỆU CHUNG</h2>");
        html.append("<p>Máy thu phát VRU812/S là máy VTĐ sóng cực ngắn nhảy tần công suất trung bình do Tập đoàn Viễn thông Quân đội sản xuất, máy có các chế độ công tác thoại rõ, thoại mật, nhảy tần, truyền số liệu, sử dụng trên xe cơ động hoặc tĩnh tại với ăng ten cần 3 m, mang vác với ăng ten 2,4 m.</p>");
        html.append("<p>Máy sử dụng công nghệ SDR, thuật toán nhảy tần và thuật toán mã hóa tối ưu, nén thoại, mã phát hiện lỗi và sửa lỗi, tốc độ nhảy tần 500 lần/s, mã mật của máy theo chuẩn AES-128 và AES-256, khả năng quét kênh nhớ, có chức năng xóa các tham số nhảy tần trong trường hợp khẩn cấp.</p>");
        html.append("<p>Khi sử dụng thêm bộ khuếch đại 50 W, máy có thể lắp được trên xe tăng, thiết giáp, xe thông tin chỉ huy.</p>");

        // 2. TÍNH NĂNG KỸ, CHIẾN THUẬT
        html.append("<h2>II. TÍNH NĂNG KỸ, CHIẾN THUẬT</h2>");
        
        html.append("<h3>1. TÍNH NĂNG CHIẾN THUẬT</h3>");
        html.append("<ul>");
        html.append("<li>- Máy thu phát VTĐ sóng cực ngắn nhảy tần VRU812/S chủ yếu được sử dụng thực hiện liên lạc giữa các đơn vị làm nhiệm vụ cơ động như các lực lượng xe mặt đất, xe tăng thiết giáp, xe thông tin cơ động, tàu biển hoặc tại các trạm thông tin cố định;</li>");
        html.append("<li>- Điện đài có thể thiết lập liên lạc hướng, liên lạc mạng có hiệu quả ở các chế độ công tác như thoại rõ tần số cố định, thoại mật tần số cố định, thoại rõ nhảy tần, thoại mật nhảy tần và truyền số liệu, truyền ảnh thông qua đường truyền VTĐ sóng cực ngắn;</li>");
        html.append("<li>- Cự ly liên lạc của điện đài khi phát công suất 50 W có thể đạt tới 20km.</li>");
        html.append("<li>- Vỏ máy làm bằng hợp kim nhôm có kích thước nhỏ gọn, có khả năng chịu rung xóc, đảm bảo độ kín khí thuận tiện cho việc mang sách cơ động; ngoài ra, còn có thể lắp đặt ở các trạm cố định; làm trung gian chuyển tiếp; lắp trên xe cơ động, vừa hành tiến vừa liên lạc với tốc độ xe lên tới 60 km/h.</li>");
        html.append("</ul>");

        html.append("<h3>2. TÍNH NĂNG KỸ THUẬT</h3>");
        
        html.append("<h4>a) Tính năng kỹ thuật chung</h4>");
        html.append("<ul>");
        html.append("<li>- Dải tần công tác: 30MHz ÷ 87,975MHz, dãn cách kênh 25kHz.</li>");
        html.append("<li>- Số kênh: 2320 kênh, số kênh nhớ: 10 kênh nhớ.</li>");
        html.append("<li>- Chế độ công tác:</li>");
        html.append("<ul>");
        html.append("<li>+ Thoại rõ tần số cố định FIX/C.</li>");
        html.append("<li>+ Thoại mật tần số cố định FIX/S, VF1S.</li>");
        html.append("<li>+ Thoại rõ nhảy tần ECC/C.</li>");
        html.append("<li>+ Thoại mật nhảy tần ECC/S, VH1/S.</li>");
        html.append("</ul>");
        html.append("<li>- Chất lượng thoại (Theo chuẩn ITU P.862): MELP: ≥ 2.0; CVSD: ≥ 2.2</li>");
        html.append("<li>- Nhảy tần trên toàn dải từ 30 MHz đến 87,975 MHz với tốc độ nhảy tần 500 lần/giây.</li>");
        html.append("<li>- Sai số tần số lớn nhất: ≤ 220 Hz.</li>");
        html.append("<li>- Tương thích ăng ten có trở kháng: 50 Ω</li>");
        html.append("<li>- Nguồn cung cấp:</li>");
        html.append("<ul>");
        html.append("<li>+ VRU812/S 10 W độc lập(VDC): Từ 12,96 đến 15,84.</li>");
        html.append("<li>+ Khi có KĐCS 50 W và tổ hợp giá máy(VDC): Từ 20 đến 33.</li>");
        html.append("</ul>");
        html.append("<li>- Cự ly liên lạc trong điều kiện môi trường bình thường và không có vật che khuất:</li>");
        html.append("<ul>");
        html.append("<li>+ Ăng ten cần 2,4 m (công suất 1 W): Đến 3 km.</li>");
        html.append("<li>+ Ăng ten cần 2,4 m (công suất 10 W): Đến 10 km.</li>");
        html.append("<li>+ Ăng ten cần 3,0 m (công suất 50 W): Đến 20 km.</li>");
        html.append("</ul>");
        html.append("<li>- Kích thước thân máy 10 W (Dài x Rộng x Cao): ≤ 235 mm x 215 mm x 80 mm (không có pin).</li>");
        html.append("<li>- Trọng lượng thân máy 10 W: ≤ 4 kg (không có ắc quy).</li>");
        html.append("<li>- Kích thước khi sử dụng với bộ khuếch đại công suất 50 W (Dài x Rộng x Cao): ≤ 310 mm x 270 mm x 240 mm.</li>");
        html.append("<li>- Trọng lượng khi sử dụng với bộ khuếch đại công suất 50 W: ≤ 17 kg (tính cả bộ khuếch đại 50 W).</li>");
        html.append("</ul>");

        html.append("<h4>b) Tính năng kỹ thuật máy thu</h4>");
        html.append("<ul>");
        html.append("<li>- Độ nhạy máy thu: ≤ 0,35 µV (SINAD = 10 dB)</li>");
        html.append("<li>- Độ nhạy triệt ồn: ≤ 0,35 µV;</li>");
        html.append("<li>- Độ hồi trễ triệt ồn: Từ 2 ÷ 6 dB;</li>");
        html.append("<li>- Điện áp âm tần ra lớn nhất: ≥ 11 V, trên tải 600 Ω;</li>");
        html.append("<li>- Méo thu: ≤ 5 %;</li>");
        html.append("<li>- Độ chọn lọc tần số ảnh: ≥ 70 dB;</li>");
        html.append("<li>- Độ chọn lọc tần số trung tần: ≥ 90 dB;</li>");
        html.append("<li>- Đáp ứng chống thu giả: ≥ 55 dB;</li>");
        html.append("<li>- Đáp tuyến tần số âm tần thu so với 1 kHz:</li>");
        html.append("<ul>");
        html.append("<li>+ Ở dải tần số 300 ÷ 3000 Hz: Âm 5 đến 1 dB;</li>");
        html.append("<li>+ Ở tần số 150 Hz: Không lớn hơn âm 35 dB;</li>");
        html.append("</ul>");
        html.append("<li>- Dòng tiêu thụ khi thu, VRU812/S 10 W độc lập: ≤ 0,4 A</li>");
        html.append("<li>- Dòng tiêu thụ khi thu, có KĐCS 50 W và tổ hợp giá máy: ≤ 0,55 A.</li>");
        html.append("</ul>");

        html.append("<h4>c) Tính năng kỹ thuật máy phát</h4>");
        html.append("<ul>");
        html.append("<li>- Công suất phát:</li>");
        html.append("<ul>");
        html.append("<li>+ Chế độ công suất cao: 40 W ÷ 60 W;</li>");
        html.append("<li>+ Chế độ công suất thấp: Từ 1 W đến 3 W;</li>");
        html.append("<li>+ Chế độ công suất cao máy VRU812/S 10 W độc lập: 7 W ÷ 13 W;</li>");
        html.append("</ul>");
        html.append("<li>- Nén sóng hài: ≥ 40 dB;</li>");
        html.append("<li>- Nén sóng tạp: ≥ 60 dB.</li>");
        html.append("<li>- Độ dịch tần điều chế thoại tương tự: 5,6kHz ± 1kHz;</li>");
        html.append("<li>- Méo phát: ≤ 5 %</li>");
        html.append("<li>- Độ dịch tần điều chế thoại số: 7 kHz ± 1 kHz;</li>");
        html.append("<li>- Độ dịch tần điều chế đạo tần (Điều chế tần số đạo tần): 3 kHz ± 0,5 kHz;</li>");
        html.append("<li>- Đáp tuyến dải thông âm tần phát từ 300 đến 3000 Hz so với 1 kHz: ±3 dB;</li>");
        html.append("<li>- Tần số đạo tần: 150 Hz ± 2 Hz</li>");
        html.append("</ul>");

        html.append("<h4>d) Tính năng kỹ thuật nhảy tần, thoại mật, truyền số liệu</h4>");
        html.append("<ul>");
        html.append("<li>- Độ rộng băng tần: 30MHz đến 87,975MHz;</li>");
        html.append("<li>- Số tần số trong bảng nhảy tần: 256 tần số;</li>");
        html.append("<li>- Thời gian đồng bộ lần đầu: ≤ 0,5 giây;</li>");
        html.append("<li>- Thời gian đồng bộ cho nhập mạng muộn: ≤ 6 giây.</li>");
        html.append("<li>- Số mạng tối đa được thiết lập: 128 mạng;</li>");
        html.append("<li>- Máy có chức năng nhập mạng muộn.</li>");
        html.append("<li>- Chế độ mã hoá ngôn ngữ: CVSD, VOCODER;</li>");
        html.append("<li>- Tốc độ xử lý dữ liệu thoại: CVSD 16 kbit/s; VOCODER 2400 bit/s.</li>");
        html.append("<li>- Tốc độ truyền số liệu: 600, 1200, 2400, 4800, 9600, 19200 bps;</li>");
        html.append("<li>- Loại dữ liệu truyền: Tệp văn bản, ảnh.</li>");
        html.append("</ul>");

        // 3. THÀNH PHẦN ĐỒNG BỘ
        html.append("<h2>III. THÀNH PHẦN ĐỒNG BỘ</h2>");
        
        html.append("<h3>1. CẤU TẠO</h3>");
        html.append("<p>Máy và các trang bị đồng bộ được bao gói trong các hộp cát tông và được đặt chung trong một hòm gỗ có túi hút ẩm, hòm được khóa chắc chắn bảo đảm chịu rung xóc va đập trong quá trình vận chuyển.</p>");

        html.append("<h3>2. CÁC THÀNH PHẦN ĐỒNG BỘ</h3>");
        
        // Bảng 1.1
        html.append("<p><strong>Bảng 1-1. Danh mục đồng bộ máy VRU812/S 50 W</strong></p>");
        html.append("<table>");
        html.append("<tr><th width='10%'>STT</th><th width='50%'>Tên danh mục</th><th width='20%'>ĐVT</th><th width='20%'>Số lượng</th></tr>");
        html.append("<tr><td>1</td><td class='td-left'>Máy thu phát VRU812/S</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>2</td><td class='td-left'>Bộ khuếch đại công suất 50 W</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>3</td><td class='td-left'>Nguồn PS812</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>4</td><td class='td-left'>Giá máy</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>5</td><td class='td-left'>Ăng ten cần VRU812S-WA01</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>6</td><td class='td-left'>Dây cao tần ra ăng ten</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>7</td><td class='td-left'>Dây cao tần nối máy VRU812/S với khuếch đại công suất</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>8</td><td class='td-left'>Dây cấp nguồn</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>9</td><td class='td-left'>Hòm hộp bao gói và phụ kiện</td><td>Bộ</td><td>01</td></tr>");
        html.append("</table>");

        // Bảng 1.2
        html.append("<p><strong>Bảng 1-2. Danh mục đồng bộ máy VRU812/S 10 W độc lập</strong></p>");
        html.append("<table>");
        html.append("<tr><th width='10%'>STT</th><th width='50%'>Tên danh mục</th><th width='20%'>ĐVT</th><th width='20%'>Số lượng</th></tr>");
        html.append("<tr><td>1</td><td class='td-left'>Máy thu phát VRU812/S</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>2</td><td class='td-left'>Ăng ten cần 2,4 m</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>3</td><td class='td-left'>Tổ hợp cầm tay</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>4</td><td class='td-left'>Ắc quy khô</td><td>Cái</td><td>01</td></tr>");
        html.append("<tr><td>5</td><td class='td-left'>Nguồn nạp cho ắc quy</td><td>Bộ</td><td>01</td></tr>");
        html.append("<tr><td>6</td><td class='td-left'>Hòm hộp bao gói và phụ kiện</td><td>Bộ</td><td>01</td></tr>");
        html.append("</table>");

        // Bảng 1.3 - Có hình ảnh
        // Lưu ý: Bạn cần copy ảnh vào thư mục images và đổi tên tương ứng:
        // thietbi_1.png (Máy chính), thietbi_2.png (KĐCS), thietbi_3.png (Nguồn PS812), v.v.
        html.append("<h3>3. HÌNH ẢNH CÁC THÀNH PHẦN ĐỒNG BỘ</h3>");
        
        html.append("<p><strong>Bảng 1-3. Thành phần đồng bộ đi kèm máy VRU812/S 50 W</strong></p>");
        html.append("<table>");
        html.append("<tr><th width='10%'>TT</th><th width='30%'>Thành phần</th><th width='40%'>Hình ảnh</th><th width='20%'>Số lượng</th></tr>");
        
        html.append("<tr><td>1</td><td class='td-left'>Khối thu phát chính VRU812/S</td><td><img src='" + getImgSrc("thietbi_1.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>2</td><td class='td-left'>Khối KĐCS 50 W</td><td><img src='" + getImgSrc("thietbi_2.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>3</td><td class='td-left'>Khối nguồn chuyển đổi PS812</td><td><img src='" + getImgSrc("thietbi_3.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>4</td><td class='td-left'>Giá máy</td><td><img src='" + getImgSrc("thietbi_4.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>5</td><td class='td-left'>Cáp nguồn</td><td><img src='" + getImgSrc("thietbi_5.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>6</td><td class='td-left'>Cáp cao tần ngắn</td><td><img src='" + getImgSrc("thietbi_6.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>7</td><td class='td-left'>Cáp cao tần ra ăng ten</td><td><img src='" + getImgSrc("thietbi_7.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>8</td><td class='td-left'>Ăng ten cần 3 m</td><td><img src='" + getImgSrc("thietbi_8.png") + "' width='150'></td><td>01</td></tr>");
        html.append("</table>");

        // Bảng 1.4 - Có hình ảnh
        html.append("<p><strong>Bảng 1-4. Thành phần đồng bộ đi kèm máy VRU812/S 10 W</strong></p>");
        html.append("<table>");
        html.append("<tr><th width='10%'>TT</th><th width='30%'>Thành phần</th><th width='40%'>Hình ảnh</th><th width='20%'>Số lượng</th></tr>");
        
        html.append("<tr><td>1</td><td class='td-left'>Tổ hợp cầm tay</td><td><img src='" + getImgSrc("thietbi_9.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>2</td><td class='td-left'>Ắc quy</td><td><img src='" + getImgSrc("thietbi_10.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>3</td><td class='td-left'>Ăng ten 2,4 m</td><td><img src='" + getImgSrc("thietbi_11.png") + "' width='150'></td><td>01</td></tr>");
        html.append("<tr><td>4</td><td class='td-left'>Bộ sạc ắc quy</td><td><img src='" + getImgSrc("thietbi_12.png") + "' width='150'></td><td>01</td></tr>");
        html.append("</table>");

        html.append("</body></html>");

        txtContent.setText(html.toString());
        txtContent.setCaretPosition(0);

        scrollPane.setViewportView(txtContent);

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}
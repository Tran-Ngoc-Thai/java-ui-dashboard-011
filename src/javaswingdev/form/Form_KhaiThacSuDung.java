package javaswingdev.form;

import java.awt.Color;
import java.net.URL;
import javax.swing.GroupLayout;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Form_KhaiThacSuDung extends JPanel {

    public Form_KhaiThacSuDung() {
        initComponents();
        setOpaque(false);
    }

    // --- ĐOẠN MỚI THÊM VÀO: HÀM LẤY ẢNH CHUẨN ---
    private String getImgSrc(String imageName) {
        // Tìm ảnh trong package javaswingdev.images
        URL url = getClass().getResource("/javaswingdev/images/" + imageName);
        if (url != null) {
            return url.toExternalForm(); // Trả về đường dẫn chuẩn mà HTML hiểu được
        } else {
            System.err.println("Cảnh báo: Không tìm thấy ảnh " + imageName);
            return ""; 
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        JEditorPane txtContent = new JEditorPane();

        // 1. Cấu hình Panel
        panel.setBackground(new Color(255, 255, 255));

        // 2. Cấu hình nội dung
        txtContent.setEditable(false);
        txtContent.setContentType("text/html");
        txtContent.setBackground(new Color(255, 255, 255));
        
        // --- NỘI DUNG HTML ---
        StringBuilder html = new StringBuilder();
        html.append("<html><head><style>");
        html.append("body { font-family: Sans-serif; font-size: 14px; margin: 20px; color: #333; }");
        html.append("h1 { color: #0066cc; text-align: center; font-size: 24px; margin-bottom: 20px; }");
        html.append("h2 { color: #0066cc; font-size: 18px; margin-top: 20px; border-bottom: 1px solid #ddd; padding-bottom: 5px; }");
        html.append("h3 { color: #444; font-size: 16px; font-weight: bold; margin-top: 15px; }");
        html.append("p { line-height: 1.5; margin-bottom: 10px; }");
        html.append("ul { margin-bottom: 10px; }");
        html.append("li { margin-bottom: 5px; }");
        html.append(".img-container { text-align: center; margin: 20px 0; }");
        html.append(".caption { font-style: italic; font-size: 13px; color: #666; text-align: center; margin-top: 5px; }");
        html.append("table { border-collapse: collapse; width: 100%; margin-top: 10px; }");
        html.append("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
        html.append("th { background-color: #f2f2f2; }");
        html.append(".note { font-weight: bold; font-style: italic; color: red; }");
        html.append("</style></head><body>");

        // --- BẮT ĐẦU NỘI DUNG ---
        html.append("<h1>HƯỚNG DẪN KHAI THÁC SỬ DỤNG</h1>");

        html.append("<h2>I. GIỚI THIỆU MẶT MÁY</h2>");

        // MÁY VRU812/S 10W
        html.append("<h3>A. MÁY THU PHÁT VRU812/S 10 W</h3>");
        html.append("<p><strong>1. Mặt trước</strong></p>");
        
        // --- SỬA ĐOẠN NÀY: Dùng hàm getImgSrc và tên file hinh2_1.png ---
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_1.png") + "' width='600'><br><div class='caption'>Hình 2-1. Mặt trước máy VRU812/S 10 W</div></div>");

        html.append("<p><strong>Ý nghĩa các phím chức năng trên mặt máy:</strong></p>");
        html.append("<ul>");
        html.append("<li>① Trụ nối Ăng ten.</li>");
        html.append("<li>② Cửa sổ màn hình LCD.</li>");
        html.append("<li>③ Đèn chỉ thị báo đồng bộ (màu vàng).</li>");
        html.append("<li>④ Đèn chỉ thị báo gọi tần số cố định gọi nhảy tần (màu xanh).</li>");
        html.append("<li>⑤ Đèn chỉ thị báo cảnh lỗi hư hỏng khi thực hiện chức năng kiểm tra tự động hoặc ở chế độ phát (màu đỏ).</li>");
        html.append("<li>⑥ Chuyển mạch CHẾ ĐỘ lựa chọn chế độ hoạt động:</li>");
        html.append("<ul>");
        html.append("<li><strong>FIX/C:</strong> Thoại rõ tần số cố định.</li>");
        html.append("<li><strong>FIX/S:</strong> Thoại mật tần số cố định.<br>- Khi CMPT mode = 0: hiển thị FIX/S, mã mật AES128.<br>- Khi CMPT mode = 1: hiển thị VF1/S, mã mật AES256.</li>");
        html.append("<li><strong>ECC/C:</strong><br>- Khi CMPT = 0: hiển thị ECC/C Thoại rõ nhảy tần.<br>- Khi CMPT = 1: hiển thị VH1/S, thoại mật nhảy tần mã mật AES256.</li>");
        html.append("<li><strong>ECC/S:</strong><br>- Khi CMPT = 0: hiển thị ECC/S Thoại mật nhảy tần, AES128.<br>- Khi CMPT = 1: hiển thị VH1/S, thoại mật nhảy tần mã mật AES256.</li>");
        html.append("<li><strong>INJECT:</strong> Nhập tham số.</li>");
        html.append("<li><strong>ERASE:</strong> Xoá tham số.</li>");
        html.append("</ul>");
        
        // --- MỤC 7 (ĐÃ SỬA LỖI LẶP) ---

        html.append("<li>⑦ Cổng kết nối cáp truyền số liệu, nạp tham số (DỮ LIỆU/NẠP).</li>");

        html.append("</ul>"); // Đóng danh sách chính (list to) để chèn bảng ra ngoài

        // --- BẮT ĐẦU BẢNG LAYOUT MỤC 7 ---

        html.append("<table border='0' width='100%' style='margin-top:10px; margin-bottom:20px;'>");

        html.append("<tr>");

        

        // Cột Trái: Ảnh sơ đồ chân (Lưu ý: Bạn cần có file hinh_connector.png trong thư mục images)

        html.append("<td width='40%' align='center' valign='middle'>");

        html.append("<img src='" + getImgSrc("hinh2_1_1.png") + "' width='200'>"); 

        html.append("</td>");

        

        // Cột Phải: Bảng dữ liệu

        html.append("<td width='60%' valign='top'>");

        html.append("<table class='data-table'>");

        html.append("<tr><td>A</td><td>GND</td></tr>");

        html.append("<tr><td>B, L, N, P, T, V</td><td>NC</td></tr>");

        html.append("<tr><td>C</td><td>Fix audio output</td></tr>");

        html.append("<tr><td>D</td><td>+5V output</td></tr>");

        html.append("<tr><td>E</td><td>RS232-CTS</td></tr>");

        html.append("<tr><td>F</td><td>RS232-TXD</td></tr>");

        html.append("<tr><td>G</td><td>MIC</td></tr>");

        html.append("<tr><td>H</td><td>+14.4V output</td></tr>");

        html.append("<tr><td>K</td><td>PTT</td></tr>");

        html.append("<tr><td>M</td><td>RXMT</td></tr>");

        html.append("<tr><td>J</td><td>TXBB</td></tr>");

        html.append("<tr><td>R</td><td>RS232-RTS</td></tr>");

        html.append("<tr><td>S</td><td>RS232-RXD</td></tr>");

        html.append("</table>");

        html.append("</td>");

        

        html.append("</tr>");

        html.append("</table>");

        

        // Mở lại danh sách để tiếp tục các mục sau (8, 9...)

        html.append("<ul>");
        

        html.append("<li>⑧ Cổng kết nối Audio (TỔ HỢP/CHUYỂN TIẾP)</li>");
        html.append("</ul>"); // Đóng list để chèn bảng

        html.append("<table border='0' width='100%' style='margin-top:10px; margin-bottom:20px;'>");
        html.append("<tr>");
        
        // Cột Trái: Ảnh connector Audio (Cần file hinh_audio_pinout.png)
        html.append("<td width='40%' align='center' valign='middle'>");
        // Bạn nhớ copy ảnh sơ đồ chân audio vào và đặt tên là hinh_audio_pinout.png nhé
        html.append("<img src='" + getImgSrc("hinh2_1_2.png") + "' width='150'>"); 
        html.append("</td>");
        
        // Cột Phải: Bảng dữ liệu Audio
        html.append("<td width='60%' valign='top'>");
        html.append("<table class='data-table'>");
        html.append("<tr><td>1</td><td>GND</td></tr>");
        html.append("<tr><td>2</td><td>MIC</td></tr>");
        html.append("<tr><td>3</td><td>SPK</td></tr>");
        html.append("<tr><td>4</td><td>NC</td></tr>");
        html.append("<tr><td>5</td><td>FIXAU</td></tr>");
        html.append("<tr><td>6</td><td>RXMT</td></tr>");
        html.append("<tr><td>7</td><td>PTT</td></tr>");
        html.append("</table>");
        html.append("</td>");
        
        html.append("</tr>");
        html.append("</table>");

        html.append("<ul>"); // Mở lại list

        html.append("<li>⑨ Công tắc nguồn và điều chỉnh âm lượng (ÂM LƯỢNG).</li>");
        html.append("<li>⑩ Bàn phím:</li>");
        html.append("<ul>");
        html.append("<li>0 đến 9: Các phím chữ số/chức năng.</li>");
        html.append("<li>OPT: Phím tùy chọn.</li>");
        html.append("<li>MENU: Phím chọn vào màn hình menu.</li>");
        html.append("<li>FRQ: Phím cấu hình tần số làm việc.</li>");
        html.append("<li>*/ENT: Phím bật/tắt đèn nền/ phím enter.</li>");
        html.append("<li>⬜: Phím thay đổi chức năng.</li>");
        html.append("<li>TEST: Bật chế độ kiểm tra tự động.</li>");
        html.append("<li>BATT: Kiểm tra điện áp ắc quy.</li>");
        html.append("<li>WHISP: Bật/tắt chế độ nói thầm.</li>");
        html.append("<li>RCV: Bật/tắt chế độ thu canh.</li>");
        html.append("<li>PM: Chọn công suất phát.</li>");
        html.append("<li>RXMT: Bật/Tắt chế độ chuyển tiếp.</li>");
        html.append("<li>DATA: Lựa chọn chế độ mã hóa thoại.</li>");
        html.append("<li>SQ: Lựa chọn chế độ triệt ồn.</li>");
        html.append("</ul>");
        html.append("<li>⑪ Chuyển mạch chọn kênh (KÊNH) 0 - 9.</li>");
        html.append("</ul>");

        html.append("<p><strong>2. Mặt sau</strong></p>");
        // Đảm bảo bạn có file hinh22.png trong thư mục javaswingdev.images
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_2.png") + "' width='500'><br><div class='caption'>Hình 2-2. Mặt sau máy VRU812/S 10 W</div></div>");
        html.append("<ul>");
        html.append("<li>① Đầu nối 25 chân: nối với giá lắp đặt trên xe.</li>");
        html.append("<li>② Trụ nối nguồn cung cấp: Cực dương (+).</li>");
        html.append("<li>③ Trụ nối nguồn cung cấp: Cực âm (-).</li>");
        html.append("</ul>");

        // MÁY VRU812/S 50W
        html.append("<h3>B. MÁY THU PHÁT VRU812/S 50 W</h3>");
        html.append("<p><strong>1. Mặt trước</strong></p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_3.ifjf") + "' width='600'><br><div class='caption'>Hình 2-3. Mặt trước máy VRU812/S 50 W</div></div>");
        html.append("<ul>");
        html.append("<li>① Nguồn chuyển đổi PS812.</li>");
        html.append("<li>② Giắc cấp nguồn cho toàn bộ máy.</li>");
        html.append("<li>③ Giắc kết nối với Intercom.</li>");
        html.append("<li>④ Giắc cắm loa ngoài.</li>");
        html.append("<li>⑤ Công tắc cấp nguồn.</li>");
        html.append("<li>⑥ Đèn báo cảnh tín hiệu thu.</li>");
        html.append("<li>⑦ Đèn cảnh báo lỗi nguồn cung cấp.</li>");
        html.append("<li>⑧ Giắc cắm cao tần đầu vào khối khuếch đại công suất.</li>");
        html.append("<li>⑨ Đèn chỉ thị tín hiệu phát của khuếch đại công suất.</li>");
        html.append("<li>⑩ Đèn cảnh báo lỗi khuếch đại công suất.</li>");
        html.append("<li>⑪ Giắc đầu ra khuếch đại công suất.</li>");
        html.append("<li>⑫ Khối khuếch đại công suất.</li>");
        html.append("<li>⑬ Khung giá lắp đặt trên xe.</li>");
        html.append("<li>⑭ Khối máy thu phát chính.</li>");
        html.append("</ul>");

        html.append("<p><strong>2. Mặt sau</strong></p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_4.png") + "' width='500'><br><div class='caption'>Hình 2-4. Mặt sau máy VRU812/S 50 W</div></div>");
        html.append("<ul>");
        html.append("<li>① Giắc DB25 kết nối giữa máy khuếch đại công suất với khung máy.</li>");
        html.append("<li>② Giắc DB25 cắm đầu ra khối nguồn máy thu phát với khung máy.</li>");
        html.append("<li>③ Giắc DB25 kết nối giữa máy thu phát VRU812/S với khung máy.</li>");
        html.append("</ul>");

        // MÀN HÌNH HIỂN THỊ
        html.append("<h2>C. MÀN HÌNH HIỂN THỊ</h2>");
        html.append("<p>Sau khi cấp nguồn cho máy, bật công tắc nguồn, đợi một lúc khoảng 6s thì màn hình sẽ hiển thị logo VIETTEL.</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_5.png") + "' width='500'><br><div class='caption'>Hình 2-5. Giao diện màn hình</div></div>");
        html.append("<ul>");
        html.append("<li>① Hiển thị kênh công tác.</li>");
        html.append("<li>② Hiển thị chế độ hoạt động: Tần số cố định (FIX/VF1) hay Nhảy tần (ECCM/VH1).</li>");
        html.append("<li>③ Hiển thị Thoại rõ (CLEAR) hay Thoại mật (SECURE).</li>");
        html.append("<li>④ Hiển thị tần số làm việc.</li>");
        html.append("<li>⑤ Hiển thị thiết bị kết nối.</li>");
        html.append("<li>⑥ Hiển thị chế độ mã hóa thoại.</li>");
        html.append("<li>⑦ Chế độ công suất phát: LP / MP / HP.</li>");
        html.append("<li>⑧ Trạng thái Thu (RX) / Phát (TX).</li>");
        html.append("<li>⑨ Các chức năng đặc biệt: R (Thu canh), W (Nói thầm), X (Chuyển tiếp).</li>");
        html.append("<li>⑩ Chế độ triệt ồn: O (Mở), T (Đạo tần), Q (Ngưỡng), S (Số).</li>");
        html.append("</ul>");

        // LẮP NỐI CÁC BỘ PHẬN
        html.append("<h2>II. LẮP NỐI CÁC BỘ PHẬN</h2>");
        html.append("<h3>A. BỐ TRÍ AN TOÀN</h3>");
        html.append("<ul>");
        html.append("<li>Kiểm tra niêm phong, số lượng và chất lượng đồng bộ trước khi mở bao gói.</li>");
        html.append("<li><strong>Không bật nguồn</strong> khi lắp đặt. Công tắc nguồn PS812 và máy VRU812/S phải ở vị trí TẮT.</li>");
        html.append("</ul>");

        html.append("<h3>Lắp nối máy VRU812/S 10 W</h3>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh26.png") + "' width='600'><br><div class='caption'>Hình 26. Lắp ráp các thành phần máy VRU812/S 10 W</div></div>");
        html.append("<ul>");
        html.append("<li>Đấu nối ăng ten cần 2,4m vào bộ phối hợp ăng ten BU02.</li>");
        html.append("<li>Đấu nối tổ hợp cầm tay vào vị trí như Hình.</li>");
        html.append("<li>Lắp ắc quy vào máy.</li>");
        html.append("<li>Sau khi đấu nối xong mới tiến hành cài đặt tần số.</li>");
        html.append("</ul>");

        html.append("<h3>Lắp nối máy VRU812/S 50 W</h3>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh27.png") + "' width='600'><br><div class='caption'>Hình 27. Lắp ráp các thành phần máy VRU812/S 50 W</div></div>");
        html.append("<ul>");
        html.append("<li>Lắp giá máy vào thành xe (4 đai ốc).</li>");
        html.append("<li>Khối thu phát chính: Lắp dưới, chú ý khớp các chốt phía sau.</li>");
        html.append("<li>Khối khuếch đại công suất 50W: Lắp trên.</li>");
        html.append("<li>Nguồn cấp: Đấu đúng cực nguồn thân xe và máy.</li>");
        html.append("<li>Đấu nối cáp cao tần: Từ trụ ăng ten của khối thu phát chính -> RF in của bộ khuếch đại công suất.</li>");
        html.append("<li>Lắp đặt ăng ten cần: Giá đỡ cố định trên xe, đảm bảo tiếp đất tốt.</li>");
        html.append("<li>Dây đất ăng ten liên kết với thành xe hoặc bãi đất.</li>");
        html.append("<li>Đấu cáp cao tần từ RF out của khối KĐCS tới Ăng ten.</li>");
        html.append("</ul>");

        html.append("<h3>Thu hồi</h3>");
        html.append("<p class='note'>Khi tháo dỡ bắt buộc phải ngắt nguồn điện!</p>");
        html.append("<ul>");
        html.append("<li>Tắt máy: Vặn chiết áp âm lượng về TẮT -> Tắt công tắc nguồn khối nguồn chuyển đổi.</li>");
        html.append("<li>Tháo dỡ: Tháo cáp (nguồn, cao tần) -> Vặn lỏng khóa -> Nhấc các khối ra khỏi giá (Rút theo phương ngang, tránh cong chân connector).</li>");
        html.append("<li>Vệ sinh, đóng gói vào hòm gỗ.</li>");
        html.append("</ul>");

        // HƯỚNG DẪN CÀI ĐẶT
        html.append("<h2>HƯỚNG DẪN CÀI ĐẶT CÁC THAM SỐ</h2>");
        
        html.append("<h3>1. HƯỚNG DẪN BẬT/TẮT MÁY</h3>");
        html.append("<p>- <strong>Bật máy:</strong> Vặn núm “ÂM LƯỢNG” sang phải khỏi vị trí TẮT.<br>- <strong>Tắt máy:</strong> Vặn núm “ÂM LƯỢNG” sang trái về vị trí TẮT.</p>");

        html.append("<h3>2. ĐẶT KÊNH VÀ TẦN SỐ LIÊN LẠC</h3>");
        html.append("<p>Máy lưu trữ 10 kênh. Sửa tần số chỉ thực hiện ở chế độ FIX/C, FIX/S, VF1/S.</p>");
        html.append("<p><strong>Thao tác:</strong></p>");
        html.append("<ul>");
        html.append("<li>Xoay chuyển mạch KÊNH đến vị trí mong muốn.</li>");
        html.append("<li>Để đổi tần số (Ví dụ 45.5 MHz ở kênh 4):</li>");
        html.append("<ul><li>Xoay chuyển mạch KÊNH về 4.</li><li>Ấn <strong>FRQ</strong> -> nhập <strong>4 5 5 0</strong> -> ấn <strong>ENT</strong>.</li></ul>");
        html.append("</ul>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh28.png") + "' width='400'><br><div class='caption'>Hình 28. Màn hình sau khi thiết lập</div></div>");

        html.append("<h3>3. ĐẶT CHẾ ĐỘ CÔNG TÁC</h3>");
        html.append("<ul>");
        html.append("<li>Chế độ FIX/C, FIX/S, ECC/C, ECC/S: Vặn chuyển mạch CHẾ ĐỘ trên mặt máy.</li>");
        html.append("<li>Chế độ VF1/S (Thoại mật mã AES256): Vào MENU chỉnh CMPT mode = 1 -> Xoay về FIX/S.</li>");
        html.append("<li>Chế độ VH1/S: Vào MENU chỉnh CMPT mode = 1 -> Xoay về ECC/C hoặc ECC/S.</li>");
        html.append("</ul>");

        html.append("<h3>4. CÀI ĐẶT CHỨC NĂNG TRÊN BÀN PHÍM</h3>");
        
        html.append("<p><strong>Tự kiểm tra (TEST):</strong> Ấn ⬜ -> ấn TEST. Màn hình báo 'ECCM OK' là tốt.</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh29.png") + "' width='400'><br><div class='caption'>Hình 29. Màn hình tự kiểm tra</div></div>");

        html.append("<p><strong>Kiểm tra điện áp (BATT):</strong> Ấn ⬜ -> ấn BATT. (Ví dụ: 16.13V).</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh210.png") + "' width='400'><br><div class='caption'>Hình 210. Màn hình kiểm tra điện áp</div></div>");

        html.append("<p><strong>Quét kênh (SCAN):</strong> Dùng khi mất liên lạc. Vặn về FIX/C -> Ấn ⬜ -> ấn SCAN. Để dừng ấn lại tương tự.</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh211.png") + "' width='400'><br><div class='caption'>Hình 211. Màn hình quét kênh</div></div>");

        html.append("<p><strong>Nói thầm (WHISP):</strong> Ấn ⬜ -> ấn WHISP. Hiện chữ 'W'.</p>");
        html.append("<p><strong>Thu canh (RCV):</strong> Ấn ⬜ -> ấn RCV. Hiện chữ 'R' (Chỉ thu, không phát được).</p>");
        html.append("<p><strong>Công suất phát (PM):</strong> Ấn ⬜ -> ấn PM để đổi LP -> MP -> HP.</p>");
        html.append("<p><strong>Liên lạc chuyển tiếp (RXMT):</strong> Ấn ⬜ -> ấn RXMT. Hiện chữ 'X'.</p>");
        html.append("<p><strong>Chế độ mã hóa (DATA):</strong> Chọn CVSD hoặc VOCODER (Chỉ ở chế độ VF1/S, VH1/S).</p>");
        html.append("<p><strong>Chế độ triệt ồn (SQ):</strong> Tại chế độ FIX/C -> Ấn ⬜ -> ấn SQ (T: Đạo tần, Q: Ngưỡng, O: Mở).</p>");
        html.append("<p><strong>Đèn nền:</strong> Ấn ⬜ -> ấn */ENT.</p>");

        html.append("<h3>5. THIẾT LẬP THAM SỐ HỆ THỐNG</h3>");
        html.append("<p>Ấn MENU (Password mặc định: 1234) -> Dùng OPT để chọn tham số -> Nhập giá trị -> ENT.</p>");
        html.append("<table><tr><th>Tham số</th><th>Ý nghĩa</th></tr>");
        html.append("<tr><td>ATTR</td><td>1: Trưởng mạng, 0: Thành viên</td></tr>");
        html.append("<tr><td>KEY</td><td>Bảng mã bảo mật (0-9)</td></tr>");
        html.append("<tr><td>CA</td><td>Địa chỉ gọi (00-99). 00 là quảng bá.</td></tr>");
        html.append("<tr><td>NET</td><td>Địa chỉ mạng (000-127)</td></tr>");
        html.append("<tr><td>FRQ</td><td>Bảng nhảy tần (0-9)</td></tr>");
        html.append("<tr><td>CMPT Mode</td><td>1: AES256, 0: AES128 (Tương thích cũ)</td></tr>");
        html.append("<tr><td>MYID</td><td>Địa chỉ máy mình (00-99)</td></tr>");
        html.append("</table>");

        html.append("<br><p><i>Lưu ý: Bảng tần số mặc định và bảng mã mật đã được nạp sẵn từ nhà máy (Bảng 0-9).</i></p>");
        html.append("</body></html>");

        txtContent.setText(html.toString());
        // Cuộn lên đầu trang
        txtContent.setCaretPosition(0);

        scrollPane.setViewportView(txtContent);

        // 4. Layout
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
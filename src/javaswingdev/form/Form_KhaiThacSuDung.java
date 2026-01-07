package javaswingdev.form;

import java.awt.Color;
import java.awt.Font;
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
        // Đồng bộ font cho toàn bộ form
        panel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        // 2. Cấu hình nội dung
        txtContent.setEditable(false);
        txtContent.setContentType("text/html");
        txtContent.setBackground(new Color(255, 255, 255));
        // Đặt font mặc định cho JTextPane (dành cho nội dung không phải HTML),
        // đồng thời sử dụng CSS trong HTML để điều khiển font hiển thị.
        txtContent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        // --- NỘI DUNG HTML ---
        StringBuilder html = new StringBuilder();
        html.append("<html><head><style>");
        html.append("body { font-family: 'Segoe UI', Tahoma, Arial, sans-serif; font-size: 14px; margin: 20px; color: #333; }");
        html.append("h1 { color: #0066cc; text-align: center; font-size: 22px; margin-bottom: 18px; font-weight: 700; }");
        html.append("h2 { color: #0066cc; font-size: 20px; margin-top: 20px; border-bottom: 1px solid #ddd; padding-bottom: 6px; font-weight: 600; }");
        html.append("h3 { color: #444; font-size: 16px; font-weight: 600; margin-top: 14px; }");
        html.append("p { line-height: 1.6; margin-bottom: 10px; font-size: 14px; }");
        html.append("h4 { font-size: 15px; margin-top: 10px; }");
        html.append("h5 { font-size: 14px; margin-top: 8px; }");
        html.append("ul { margin-bottom: 10px; padding-left: 20px; }");
        html.append("li { margin-bottom: 6px; }");
        html.append(".img-container { text-align: center; margin: 20px 0; }");
        html.append(".caption { font-style: italic; font-size: 13px; color: #666; text-align: center; margin-top: 5px; }");
        html.append("table { border-collapse: collapse; width: 100%; margin-top: 10px; font-size: 14px; }");
        html.append("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; vertical-align: top; }");
        html.append("th { background-color: #f2f2f2; }");
        html.append(".note { font-weight: bold; font-style: italic; color: red; }");
        html.append(".data-table td { border: 1px solid #ddd; padding: 6px; }");
        html.append("</style></head><body>");

        // --- BẮT ĐẦU NỘI DUNG ---
        html.append("<h1>HƯỚNG DẪN KHAI THÁC SỬ DỤNG</h1>");

        html.append("<h2>I. GIỚI THIỆU MẶT MÁY</h2>");

        // A. MÁY VRU812/S 10W
        html.append("<h3>A. MÁY THU PHÁT VRU812/S 10 W</h3>");
        html.append("<p><strong>1. Mặt trước</strong></p>");
        
        // Chèn ảnh Hình 2-1
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_1.png") + "' width='600'><br><div class='caption'>Hình 2-1. Mặt trước máy VRU812/S 10 W</div></div>");

        html.append("<p><strong>Ý nghĩa các phím chức năng trên mặt máy:</strong></p>");
        html.append("<ul>");
        html.append("<li>① Trụ nối Ăng ten.</li>");
        html.append("<li>② Cửa sổ màn hình LCD.</li>");
        html.append("<li>③ Đèn chỉ thị báo đồng bộ (màu vàng).</li>");
        html.append("<li>④ Đèn chỉ thị báo gọi tần số cố định gọi nhảy tần (màu xanh).</li>");
        html.append("<li>⑤ Đèn chỉ thị báo cảnh lỗi hư hỏng khi thực hiện chức năng kiểm tra tự động hoặc ở chế độ phát (màu đỏ).</li>");
        
        // Mục 6: Chuyển mạch chế độ và các mục con
        html.append("<li>⑥ Chuyển mạch CHẾ ĐỘ lựa chọn chế độ hoạt động.</li>");
        html.append("<ul>");
        html.append("<li><strong>FIX/C:</strong> Thoại rõ tần số cố định.</li>");
        html.append("<li><strong>FIX/S:</strong> Thoại mật tần số cố định.<br>"
                + "- Khi CMPT mode = 0 chế độ hiển thị trên màn hình là FIX/S, mã mật AES128.<br>"
                + "- Khi CMPT mode = 1 chế độ hiển thị trên màn hình là VF1/S, mã mật AES256.</li>");
        html.append("<li><strong>ECC/C:</strong><br>"
                + "- Khi CMPT = 0 chế độ hiển thị trên màn hình là ECC/C Thoại rõ nhảy tần.<br>"
                + "- Khi CMPT = 1 chế độ hiển thị trên màn hình là VH1/S, thoại mật nhảy tần mã mật AES256.</li>");
        html.append("<li><strong>ECC/S:</strong><br>"
                + "- Khi CMPT = 0 chế độ hiển thị trên màn hình là ECC/S Thoại mật nhảy tần, AES128.<br>"
                + "- Khi CMPT = 1 chế độ hiển thị trên màn hình là VH1/S, thoại mật nhảy tần mã mật AES256.</li>");
        html.append("<li><strong>INJECT:</strong> Nhập tham số.</li>");
        html.append("<li><strong>ERASE:</strong> Xoá tham số.</li>");
        html.append("</ul>"); // Kết thúc danh sách con của mục 6

        html.append("<li>⑦ Cổng kết nối cáp truyền số liệu, nạp tham số (DỮ LIỆU/NẠP).</li>");
        html.append("</ul>"); // Kết thúc danh sách chính

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
        html.append("<li>① Đầu nối 25 chân. Khi máy thu phát được đặt trên xe, đầu nối 25 chân được sử dụng để nối với giá lắp đặt trên xe.</li>");
        html.append("<li>② Trụ nối nguồn cung cấp: Cực dương (+).</li>");
        html.append("<li>③ Trụ nối nguồn cung cấp: Cực âm (-).</li>");
        html.append("</ul>");

        // MÁY VRU812/S 50W
        html.append("<h3>B. MÁY THU PHÁT VRU812/S 50 W</h3>");
        html.append("<p><strong>1. Mặt trước</strong></p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_3.jpg") + "' width='600'><br><div class='caption'>Hình 2-3. Mặt trước máy VRU812/S 50 W</div></div>");
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
        html.append("<li>⑪ Giắc đầu ra khuếch đại công suất, hiện tại máy VRU812/S có hai phiên bản, phiên bản đầu tiên sơn màu xanh và đầu giắc này là chuẩn BNC, phiên bản thứ hai sơn màu cánh gián và đầu giắc này chuẩn N.</li>");
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
        html.append("<h3>C. MÀN HÌNH HIỂN THỊ</h3>");
        html.append("<p>Sau khi cấp nguồn cho máy, bật công tắc nguồn, đợi một lúc khoảng 6s thì màn hình sẽ hiển thị logo VIETTEL. Sau đó, màn hình sẽ hiển thị các tham số như sau:</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_5.png") + "' width='500'><br><div class='caption'>Hình 2-5. Giao diện màn hình</div></div>");
        html.append("<p>Ý nghĩa:</p>");
        html.append("<ul>");
        html.append("<li>① Hiển thị kênh công tác</li>");
        html.append("<li>② Hiển thị máy đang hoạt động ở chế độ tần số cố định (FIX/VF1) hay nhảy tần (ECCM/VH1)</li>");
        html.append("<li>③ Hiển thị máy hoạt động ở chế độ thoại rõ (CLEAR) hay thoại mật (SECURE)</li>");
        html.append("<li>④ Hiển thị tần số làm việc của máy ở các chế độ FIX/C, FIX/S và VF1/S. Hiển thị bảng nhảy tần và dải tần số của bảng tần đó ở các chế độ ECC/C, ECC/S và VH1/S</li>");
        html.append("<li>⑤ Hiển thị thiết bị đang kết nối với máy VRU812/S (ví dụ: I là hệ thống máy nói trên xe tăng VIS)</li>");
        html.append("<li>⑥ Hiển thị chế độ mã hóa thoại<ul><li> VOICE: Chế độ thoại không mã hóa</li><li> CVSD: Tín hiệu thoại được mã hóa với tốc độ 16 kbps</li><li> VOCODER: Mã hóa tín hiệu thoại với tốc độ 2400 bps</li></ul></li>");
        html.append("<li>⑦ Chế độ công suất phát LP/MP/HP.<ul><li> LP: 2 W</li><li> MP: 10 W</li><li> HP: 10 W với máy mang vác, 50 W khi kết hợp KĐCS 50 W</li></ul></li>");
        html.append("<li>⑧ Hiển thị trạng thái Thu/Phát.<ul><li> RX: Chế độ thu</li><li> TX: Chế độ phát</li></ul></li>");
        html.append("<li>⑨ Báo các chức năng đặc biệt<ul><li> R: Chế độ thu canh</li><li> W: Chế độ nói thầm</li><li> X: Chế đô liên lạc chuyển tiếp</li></ul></li>");
        html.append("<li>⑩ Chế độ triệt ồn và không triệt ồn:<ul><li> O: Chế độ không triệt ồn (hiển thị ở chế độ FIX/C)</li><li> T: Chế độ tương thích triệt ồn bằng đạo tần (hiển thị ở chế độ FIX/C)</li><li> Q: Chế độ triệt ồn bằng ngưỡng (hiển thị ở chế độ FIX/C)</li><li> S: Hiển thị ở chế độ số (FIX/S, VF1/S, ECC/C, ECC/S, VH1/S)</li></ul></li>");
        html.append("</ul>");

        // LẮP NỐI CÁC BỘ PHẬN
        html.append("<h2>II. LẮP NỐI CÁC BỘ PHẬN</h2>");
        html.append("<h3>A. BỐ TRÍ AN TOÀN</h3>");
        html.append("<ul>");
        html.append("<li>Kiểm tra sản phẩm trước khi mở bao gói: Điện đài VRU812/S được đồng bộ, bao gói trong hòm gỗ. Trước khi mở hòm cần kiểm tra niêm phong.</li>");
        html.append("<li>Mở bao gói: mỗi thành phần của sản phẩm được đóng gói trong hộp giấy, có bọc túi chống rung xóc.</li>");
        html.append("<li>Khi mở bao gói cần kiểm tra số lượng và chất lượng đồng bộ theo danh mục đồng bộ tại Chương 1, phần III, mục B.1.</li>");
        html.append("<li>Yêu cầu về bố trí lắp đặt:<ul><li>Không bật nguồn cấp cho máy VRU812/S.</li><li>Công tắc nguồn PS812 về vị trí TẮT.</li><li>Công tắc nguồn máy VRU812/S về vị trí TẮT.</li></ul></li>");
        html.append("</ul>");

        html.append("<h3>Lắp nối máy VRU812/S 10 W</h3>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_6.jpg") + "' width='600'><br><div class='caption'>Hình 2-6. Lắp ráp các thành phần máy VRU812/S 10 W</div></div>");
        html.append("<ul>");
        html.append("<li>Đấu nối ăng ten cần 2,4m vào bộ phối hợp ăng ten BU02.</li>");
        html.append("<li>Đấu nối tổ hợp cầm tay vào vị trí như Hình.</li>");
        html.append("<li>Lắp ắc quy vào máy.</li>");
        html.append("<li>Sau khi đấu nối xong mới tiến hành cài đặt tần số.</li>");
        html.append("</ul>");

        html.append("<h3>Lắp nối máy VRU812/S 50 W</h3>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_7.jpg") + "' width='600'><br><div class='caption'>Hình 2-7. Lắp ráp các thành phần máy VRU812/S 50 W</div></div>");
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
        html.append("<h2>III. HƯỚNG DẪN CÀI ĐẶT CÁC THAM SỐ</h2>");
        
        html.append("<h3>A. HƯỚNG DẪN BẬT/TẮT MÁY</h3>");
        html.append("<ul>");
        html.append("<li>Để bật máy: Vặn núm \"ÂM LƯỢNG\" trên mặt máy theo chiều bên phải từ vị trí \"TẮT\" lên trên.</li>");
        html.append("<li>Để tắt máy: Vặn núm \"ÂM LƯỢNG\" trên mặt máy theo chiều bên trái về vị trí \"TẮT\".</li>");
        html.append("</ul>");
        html.append("<h3>B. HƯỚNG DẪN ĐẶT KÊNH VÀ TẦN SỐ LIÊN LẠC CHO MÁY</h3>");
        html.append("<h4>1. Ý nghĩa</h4>");
        html.append("<p>Máy có thể lưu trữ tham số 10 kênh khác nhau giúp người dùng có thể chuyển nhanh các kênh mà không phải cấu hình lại các tham số. Việc sửa tần số kênh chỉ thực hiện được ở chế độ tần số cố định FIX/C, FIX/S và VF1/S.</p>");
        html.append("<h4>2. Thao tác thực hiện</h4>");
        html.append("<h5>a) Chuyển kênh</h5>");
        html.append("<p>Xoay chuyển mạch KÊNH đến vi trí kênh cần chuyển. Tham số kênh tương ứng được lựa chọn sẽ hiển thị trên màn hình LCD</p>");
        html.append("<h5>b) Thay đổi tần số kênh</h5>");
        html.append("<p>Ví dụ: Để đặt tần số 45,5 MHz ở kênh CH4, ta cần theo các bước sau:</p>");
        html.append("<ul>");
        html.append("<li>Xoay chuyển mạch KÊNH về vị trí 4 (tương ứng với kênh 4)</li>");
        html.append("<li>Đặt tần số cho kênh</li>");
        html.append("<li>Ấn FRQ nhập giá trị tần số mới cho kênh  ấn ENT:</li>");
        html.append("</ul>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_8.jpg") + "' width='400'><br><div class='caption'>Hình 2-8. Màn hình hiển thị tần số sau khi thiết lập</div></div>");
        html.append("<h3>C. HƯỚNG DẪN ĐẶT CHẾ ĐỘ CÔNG TÁC</h3>");
        html.append("<ul>");
        html.append("<li>Khi tham số CMPT mode trong cửa sổ MENU 2 đặt ở 0 (cách thiết lập xem ở mục hướng dẫn thiết lập các tham số hệ thống): để đặt chế độ công tác của máy ở các chế độ FIX/C, FIX/S, ECC/C, ECC/S chỉ cần thực hiện vặn chuyển mạch CHẾ ĐỘ trên mặt máy về các chế độ cần liên lạc.</li>");
        html.append("<li>Để đưa máy hoạt động ở chế độ VF1/S thực hiện: vào cửa sổ Menu chỉnh tham số CMPT mode, nhập 1 cho tham số này. Xoay chuyển mạch CHẾ ĐỘ trên mặt máy về vị trí FIX/S. Màn hình sẽ hiển thị \"VF1  SECURE\".</li>");
        html.append("<li>Để đưa máy hoạt động ở chế độ VH1/S thực hiện: vào cửa sổ Menu chỉnh tham số CMPT mode, nhập 1 cho tham số này.Xoay chuyển mạch CHẾ ĐỘ trên mặt máy về vị trí ECC/C hoặc ECC/S. Màn hình sẽ hiển thị \"VH1  SECURE\".</li>");
        html.append("</ul>");
        html.append("<h3>D. HƯỚNG DẪN CÀI ĐẶT CHỨC NĂNG TRÊN BÀN PHÍM</h3>");
        html.append("<h4>1. Chế độ tự kiểm tra hệ thống (TEST)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<ul>");
        html.append("<li>Chế độ tự động kiểm tra hệ thống</li>");
        html.append("<li>Phát hiện lỗi hệ thống mà không cần tháo mạch, chế độ này sử dụng trước khi đưa máy vào hoạt động</li>");
        html.append("<li>Các lỗi hệ thống có thể tự kiểm tra được:</li>");
        html.append("<ul>");
        html.append("<li>Kiểm tra bảng mạch AECCM</li>");
        html.append("<li>Kiểm tra bảng mạch PA (LPF)</li>");
        html.append("<li>Kiểm tra đường phát tín hiệu cao tần</li>");
        html.append("</ul>");
        html.append("</ul>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> ấn TEST để thực hiện các bài kiểm tra. Trong quá trình kiểm tra, kết quả kiểm tra các mạch trong máy sẽ được hiển thị ở góc dưới màn hình như sau:</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_9.jpg") + "' width='400'><br><div class='caption'>Hình 2-9. Màn hình chức năng tự kiểm tra</div></div>");
        html.append("<h4>2. Kiểm tra điện áp cung cấp (BATT)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Kiểm tra điện áp nguồn cung cấp (từ pin, nguồn cấp) cho máy.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> ấn BATT, điện áp của pin sẽ được hiển thị như sau:</p>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_10.jpg") + "' width='400'><br><div class='caption'>Hình 2-10. Màn hình chức năng kiểm tra điện áp cung cấp</div></div>");
        html.append("<h4>3. Quét kênh (SCAN)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Cung cấp chế độ quét thứ tự từ kênh 0 -> kênh 9 khi máy làm việc ở chế độ thoại rõ tần số cố định (FIX/C). Khi nhận được tín hiệu, máy thu sẽ dừng lại ở kênh tương ứng. Chức năng này được sử dụng khi mất liên lạc khi truyền tin.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<ul>");
        html.append("<li>Vặn chuyển mạch CHẾ ĐỘ về vị trí FIX/C.</li>");
        html.append("<li>Ấn phím ⬜ -> ấn SCAN để thực hiện quét kênh, màn hình sẽ hiển thị như sau:</li>");
        html.append("</ul>");
        html.append("<div class='img-container'><img src='" + getImgSrc("hinh2_11.jpg") + "' width='400'><br><div class='caption'>Hình 2-11. Màn hình khi bật chế độ quét kênh</div></div>");
        html.append("<ul>");
        html.append("<li>Để dừng tính năng quét kênh ta nhấn: Ấn phím ⬜ ->  ấn SCAN.</li>");
        html.append("</ul>");
        html.append("<h4>4. Nói thầm (WHISP)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Khi máy phát thiết lập ở chế độ nói thầm, máy sẽ tăng hệ số khuếch đại tín hiệu vào từ MIC do đó phía phát chỉ cần nói với âm lượng nhỏ nhưng phía thu vẫn nghe và hiểu được.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> Ấn phím WHISP. Khi đó trên màn hình sẽ hiển thị sẽ hiển thị chữ \"W\" ở góc dưới bên trái, tương ứng vị trí số 9 trong Hình 2-5.</p>");
        html.append("<h4>5. Thu canh (RCV)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Đưa máy thu phát hoạt động ở trạng thái chỉ thu, trong chế độ này máy sẽ không thể phát hay truyền số liệu được.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> ấn RCV. Khi đó trên màn hình sẽ hiển thị sẽ hiển thị chữ  \"R\" ở góc dưới bên trái, tương ứng vị trí số 9 trong Hình 2-5.</p>");
        html.append("<h4>6. Đặt mức công suất phát (PM)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<ul>");
        html.append("<li>Thay đổi công suất phát của máy</li>");
        html.append("<li>Khi máy được kèm bộ khuếch đại công suất, máy có 3 chế độ: công suất cao (HP), công suất trung bình (MP) và công suất thấp (LP).</li>");
        html.append("<li>Khi không dùng bộ KĐCS 50 W, máy chỉ có hai vị trí công suất thấp (2W) và công suất trung bình, chế độ MP và HP đều ra cùng mức công suất 10 W.</li>");
        html.append("</ul>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> ấn PM để thay đổi chế độ công suất. Khi đó trên màn hình sẽ hiển thị sẽ hiển thị tại góc phía dưới bên phải tương ứng với vị trí số 7 trong Hình 2-5 dòng chữ:</p>");
        html.append("<ul>");
        html.append("<li>LP: Công suất thấp.</li>");
        html.append("<li>MP: Công suất trung bình.</li>");
        html.append("<li>HP: Công suất cao.</li>");
        html.append("</ul>");
        html.append("<h4>7. Liên lạc chuyển tiếp (RXMT)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Khi khoảng cách giữa hai điện đài vượt quá cự ly liên lạc cho phép, hoặc bị địa hình che khuất, việc liên lạc trực tiếp không thể thực hiện được. Khi đó cần thực hiện chức năng chuyển tiếp liên lạc.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<p>Ấn phím ⬜ -> ấn RXMT. Khi đó trên màn hình sẽ hiển thị sẽ hiển thị chữ \"X\"  ở góc dưới bên trái, tương ứng vị trí số 9 trong Hình 2-5.</p>");
        html.append("<h4>8. Lựa chọn chế độ mã hóa CVSD/VOCODER (DATA)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<ul>");
        html.append("<li>Lựa chọn chế độ mã hóa tín hiệu thoại trong chế độ thoại số: VF1/S, VH1/S.</li>");
        html.append("<li>Có hai chế độ mã hóa thoại:</li>");
        html.append("<ul>");
        html.append("<li>CVSD: Mã hóa thoại với tốc độ 16kbps.</li>");
        html.append("<li>VOCODER: Mã hóa thoại với tốc độ 2400bps.</li>");
        html.append("</ul>");
        html.append("</ul>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<ul>");
        html.append("<li>Chuyển máy về chế độ số VF1/S, VH1/S bằng cách xoay chuyển mạch CHẾ ĐỘ về vị trí FIX/S, ECC/C, ECC/S và nhấn MENU cấu hình CMPT Mode là 1.</li>");
        html.append("<li>Ấn phím ⬜ -> ấn DATA để thay đổi chế độ chế độ mã thoại CVSD hoặc VOCODER. Khi đó trên màn hình sẽ hiển thị sẽ hiển thị tương ứng vị trí số 6 trong Hình 2-5 dòng chữ \"CVSD\" hoặc \"VOCODER\" tương ứng với các chế độ mã hóa.</li>");
        html.append("</ul>");
        html.append("<h4>9. Chọn chế độ triệt ồn (SQ)</h4>");
        html.append("<h5>a) Ý nghĩa</h5>");
        html.append("<p>Chọn chế độ triệt ồn trong chế độ thoại rõ tần số cố định.</p>");
        html.append("<h5>b) Thao tác thực hiện</h5>");
        html.append("<ul>");
        html.append("<li>Xoay chuyển mạch CHẾ ĐỘ sang vị trí FIX/C.</li>");
        html.append("<li>Ấn phím ⬜ -> ấn SQ để thay đổi chế độ chế độ SQ. Khi đó trên màn hình sẽ hiển thị tại góc dưới bên trái tương ứng vị trí số 10 trong Hình 2-5 dòng chữ:</li>");
        html.append("<ul>");
        html.append("<li>T: Triệt ồn bằng ngưỡng tín hiệu (noise squelch state), trong chế độ phát thì phát kèm theo tín hiệu đạo tần 150Hz để tương thích với các máy thế hệ cũ.</li>");
        html.append("<li>Q: Triệt ồn bằng ngưỡng tín hiệu (noise squelch state)</li>");
        html.append("<li>O: không triệt ồn (opened noise state).</li>");
        html.append("</ul>");
        html.append("</ul>");
        html.append("<h4>10. Bật/tắt đèn chiếu sáng màn hình LCD</h4>");
        html.append("<ul>");
        html.append("<li>Đèn chiếu sáng màn hình LCD đang không sáng: bấm phím ⬜ -> ấn */ENT đèn chiếu sáng màn hình LCD được bật và màn hình sáng lên.</li>");
        html.append("<li>Đèn chiếu sáng màn hình LCD đang sáng: bấm phím ⬜ -> ấn */ENT đèn chiếu sáng màn hình LCD được tắt và màn hình không sáng.</li>");
        html.append("</ul>");
        html.append("<h3>E. HƯỚNG DẪN THIẾT LẬP CÁC THAM SỐ HỆ THỐNG</h3>");
        html.append("<h4>1. Ý nghĩa các tham số hiển thị trên màn hình</h4>");
        html.append("<p>Để thực hiện kiểm tra các tham số ta thực hiện từng bước như sau:</p>");
        html.append("<ul>");
        html.append("<li>Ấn phím MENU lần thứ nhất, bảng tham số ECCM1 được hiển thị.</li>");
        html.append("<li>Ấn phím MENU lần thứ hai, bảng tham số ECCM2 được hiển thị.</li>");
        html.append("</ul>");
        html.append("<p>Ý nghĩa các tham số hệ thống:</p>");
        html.append("<table>");
        html.append("<tr><th>Thuộc tính</th><th>Ý nghĩa</th></tr>");
        html.append("<tr><td>Thuộc tính máy thu phát (ATTR)</td><td>- 1 nghĩa là máy thu phát làm trưởng mạng;<br>- 0 nghĩa là máy thu phát thành viên.</td></tr>");
        html.append("<tr><td>Bảng mã bảo mật (KEY)</td><td>10 bảng, từ 0  9.</td></tr>");
        html.append("<tr><td>Địa chỉ máy cần gọi (CA)</td><td>Được đánh số từ 00  99. Khi CA là 00 máy sẽ phát ở chế độ quảng bá.</td></tr>");
        html.append("<tr><td>Địa chỉ mạng (NET)</td><td>128 mạng, được đánh số từ 000  127</td></tr>");
        html.append("<tr><td>Bảng nhảy số (FRQ)</td><td>Số bảng nhảy tần (FRQ): 10 bảng, được đánh số từ 0  9.</td></tr>");
        html.append("<tr><td>Thời gian: Năm – tháng – ngày</td><td>Hiển thị giá thời gian thực của máy (năm, tháng, ngày). Ví dụ 2015 – 06 – 11</td></tr>");
        html.append("<tr><td>Thời gian: Giờ :phút :giây</td><td>Hiển thị giá thời gian thực của máy (giờ, phút, giây). Ví dụ 17:47:20</td></tr>");
        html.append("<tr><td>CMPT Mode</td><td>1: Tương thích mã mật AES256.<br>0: Tương thích mã mật AES128, tương thích các điện đài VRU812, VRU812/B của Viettel</td></tr>");
        html.append("<tr><td>Số của tôi (MYID)</td><td>Đặt địa chỉ cho máy mình đang sử dụng, giá trị từ 00  99.</td></tr>");
        html.append("<tr><td>Thông tin phiên bản phần mềm (FW)</td><td>Thông tin phiên bản phần mềm hiện đang sử dụng trong máy. Tham số này người sử dụng không thể thay đổi được.</td></tr>");
        html.append("</table>");
        html.append("<p>Khi muốn hiển thị tham số của kênh nào đó, chuyển mạch chọn kênh đến vị trí kênh tương ứng sau đó ấn phím MENU, khi đó màn hình hiển thị tất cả các tham số của kênh hiện thời. Ấn phím ENT để thoát khỏi chế độ này.</p>");
        html.append("<p>Cách sử dụng các tham số ATTR, CA, NET, MYID giữa các máy trong một mạng và giữa các mạng với nhau được mô tả trong ví dụ ở Phụ lục.</p>");
        html.append("<h4>2. Hướng dẫn thiết lập các tham số</h4>");
        html.append("<ul>");
        html.append("<li>Chọn bảng ECCM1 hoặc ECCM2 chứa tham số cần thay đổi bằng cách nhấn MENU.</li>");
        html.append("<li>Nhập Password bằng các phím số trên mặt máy, khi xuất xưởng password mặc định là \"1234\".</li>");
        html.append("<li>Chọn tham số cần thay thay đổi bằng cách nhấn phím OPT.</li>");
        html.append("<li>Nhập giá trị mới vào.</li>");
        html.append("<li>Nhấn OPT để tiếp tục chọn tham số khác.</li>");
        html.append("<li>Nhấn ENT để xác nhận và trở lại màn hình hoạt động bình thường</li>");
        html.append("</ul>");
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
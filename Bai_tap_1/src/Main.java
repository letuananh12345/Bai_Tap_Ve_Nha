import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB ql = new QLCB();
        System.out.println("1.Thêm mới cán bộ");
        System.out.println("2.Tìm kiếm theo tên");
        System.out.println("3.Hiển thị thông tin về danh sách cán bộ");
        System.out.println("0.Thoát khỏi chương trình");
        System.out.println("Nhập lựa chọn : ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Đối tượng bạn cần thêm là:");
                    System.out.println("`1.Nhân viên");
                    System.out.println("2.Công nhân");
                    System.out.println("3.Kỹ Sư");
                    System.out.println("Nhập lựa chọn:");
                    int kieuThem = sc.nextInt();
                    sc.nextLine();
                    switch (kieuThem) {
                        case 1: {
                            System.out.println("nhập tên :");
                            String ten = sc.nextLine();
                            System.out.println("nhập tuổi :");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("nhập giới tính :");
                            String gt = sc.nextLine();
                            System.out.println("nhập địa chỉ :");
                            String dc = sc.nextLine();
                            System.out.println("nhập công việc :");
                            String cv = sc.nextLine();
                            NhanVien nhanVien = new NhanVien(ten, tuoi, gt, dc, cv);
                            ql.them(nhanVien);

                            break;
                        }
                        case 2: {
                            System.out.println("nhập tên :");
                            String ten = sc.nextLine();
                            System.out.println("nhập tuổi :");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("nhập giới tính :");
                            String gt = sc.nextLine();
                            System.out.println("nhập địa chỉ :");
                            String dc = sc.nextLine();
                            System.out.println("nhập bậc :");
                            int bac = sc.nextInt();
                            CongNhan cv = new CongNhan(ten, tuoi, gt, dc, bac);
                            ql.them(cv);
                            ql.hienThiTT();

                            break;
                        }
                        case 3: {
                            System.out.println("nhập tên :");
                            String ten = sc.nextLine();
                            System.out.println("nhập tuổi :");
                            int tuoi = sc.nextInt();
                            System.out.println("nhập giới tính :");
                            String gt = sc.nextLine();
                            System.out.println("nhập địa chỉ :");
                            String dc = sc.nextLine();
                            System.out.println("nhập ngành dào tạo:");
                            String nganhDT = sc.nextLine();
                            KySu ks = new KySu(ten, tuoi, gt, dc, nganhDT);
                            ql.them(ks);

                            break;
                        }
                        default:
                            System.out.println("không hiển thị");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("nhập tên cần tìm: ");
                    String tenCanTim = sc.nextLine();
                    System.out.println(ql.timKiem(tenCanTim));
                    break;
                case 3 :
                    ql.hienThiTT();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn không phù hợp");

            }

        }
    }
}

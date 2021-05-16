package QLX;

import java.util.Arrays;

public class QLyXeMay implements QuanLy<XeMay>{ /// <xeMay> : trả về các phương thức lquan đến xe máy
    private XeMay[] danhSach = new XeMay[10];
    private int size = 0;
    @Override
    public void them(XeMay xeMay) {
        danhSach[size]=xeMay;
        size++;

    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)]=xeMay;
    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int  timKiem(String ten) {
        for(int i=0;i<size;i++){
            if(ten  == danhSach[i].getTen()){
                return i;
            }

        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach); // tạm thời để 10, nhưng mới tạo đc 3 nên k đủ dữ liệu chạy hết 10

    }

    @Override
    public void print() {
        for (int i=0;i<size;i++){
            System.out.println(danhSach[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QLyXeMay ql = new QLyXeMay();
        XeMay xm1 = new XeMay("yamaha","xanh","R3",120,300);
        XeMay xm2 = new XeMay("yamaha","xanh trắng","R2",220,200);
        XeMay xm3 = new XeMay("yamaha","trắng","R1",720,150);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.print();
//        System.out.println(ql.timKiem("R1"));
        XeMay xm4 = new XeMay("yamaha","trắng","R15",320,170);
        ql.sua("R1",xm4);
        ql.print();
        ql.sapXep();
        ql.print();
    }
}

public class QLCB {
    CanBo[] dscb = new CanBo[50];
    int size = 0;

    void them(CanBo name) {
        dscb[size]= name;
        size++;
    }
    int timKiem(String name){
        for (int i=0;i<size;i++){
            if(dscb[i].getTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    void hienThiTT(){
        for (int i=0;i<size;i++){
            System.out.println(dscb[i]);
        }
        System.out.println();
    }
}



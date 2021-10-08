package SixthWeek.prac;

class TV{
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

class ColorTV extends TV{
    private int color;
    public ColorTV(int x, int color){
        super(x);
        this.color = color;
    }
    protected int getColor() { return color; }

    public void printProperty(){
        System.out.println(getSize() + "인치 " + getColor() + "컬러");
    }
}

class IPTV extends ColorTV{
    private String Ip;
    public IPTV(String Ip, int a, int b){
        super(a, b);
        this.Ip = Ip;
    }
    protected String getIp() { return Ip; }

    public void printProperty(){
        System.out.println("나의 IPTV는 "+ getIp()+ " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }
}

public class Prac02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

        iptv.printProperty();
    }
}

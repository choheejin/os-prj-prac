package SixthWeek.ex;

public class Weapon {
    protected int fire(){
        return 1;
    }
}

class Cannon extends Weapon{
    @Override
    protected int fire(){ // 오버라이딩
        return 10;
    }
}

package SixthWeek.prac;

abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    private int x;
    protected Dictionary(int num){
        keyArray = new String[num];
        valueArray = new String[num];
        this.x = 0;
    }
    protected String get(String key){
        for(int i =0; i<key.length(); i++)
            if(key.equals(keyArray[i]))
                return valueArray[i];
        return null;
    }
    protected void put(String key, String value){
        for(int i =0; i<key.length(); i++)
            if(key.equals(keyArray[i])){
                keyArray[i] = key;
                valueArray[i] = value;
                return;
            }
        keyArray[x]=key;
        valueArray[x] = value;
        x++;
    }
    protected String delete(String key){
        for(int i =0; i<key.length(); i++)
            if(key.equals(keyArray[i])){
                String s = valueArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                return s;
            }
        return null;
    }
    protected int length(){
        return x;
    }
}

public class Prac10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}

package EighthWeek.Prac;

import java.util.*;

class Location{
    String name;
    int latitude;
    int longitude;
    public Location(String name, int latitude, int longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public String getName(){
        return name;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void findLocation(String name) {
        if(name.equals(this.name)) {
            System.out.println(this.name+", "+this.latitude+", "+this.longitude);
        }
    }
}

public class Prac06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요.");
        Location[] location = new Location[4];
        HashMap<String, Location> manage = new HashMap<String, Location>();
        for(int i=0; i<location.length; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());
            location[i] = new Location(city, longitude, latitude);
            manage.put(city, location[i]); // ArrayList에 저장
        }
        Set<String> key = manage.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("----------------------------------");
        while(it.hasNext()) {
            String city = it.next();
            Location s = manage.get(city);
            System.out.println(s.getName() +" "+s.getLatitude()+" "+s.getLongitude());
        }
        System.out.println("----------------------------------");
        while(true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.next();
            if(city.equals("그만"))
                break;
            Location s = manage.get(city);
            if( s == null)
                System.out.println(city+"는 없습니다.");
            else
                s.findLocation(city);
        }
        scanner.close();
    }
}

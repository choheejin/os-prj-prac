package EighthWeek.Prac;

import java.util.*;

class Word {
    private String eng, kor;

    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    String Eng() {
        return eng;
    }

    String Kor() {
        return kor;
    }
}

public class Prac12 {
    public static void main(String[] args) {
        Vector<Word> v = new Vector<Word>();
        v.add(new Word("eye", "눈"));
        v.add(new Word("human", "인간"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("culture", "문화"));
        v.add(new Word("education", "교육"));
        v.add(new Word("symbol", "상징"));
        v.add(new Word("tradition", "전통"));
        v.add(new Word("effort", "노력"));
        v.add(new Word("solution", "해결"));
        v.add(new Word("hand", "손"));
        v.add(new Word("interest", "흥미"));
        v.add(new Word("lock", "자물쇠"));
        v.add(new Word("nurse", "간호사"));
        v.add(new Word("corn", "곡물"));
        v.add(new Word("route", "길"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");

        while (true) {
            System.out.print("\n단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int b = scanner.nextInt();

            if (b == 3){
                System.out.println("\"명품영어\"를 종료합니다. ");
                break;
            }
            switch (b) {
                case 1:
                    System.out.print("현재 " + v.size() + "개의 단어가 들어 있습니다.");
                    System.out.println("-1을 입력하면 테스트를 종료합니다.\n");

                    int[] example = new int[4];

                    while (true) {

                        for (int i = 0; i < 4; i++) {
                            int r = (int) (Math.random() * v.size());
                            example[i] = r;
                            if (i > 0 && example[i - 1] == example[i])
                                i--;
                        }

                        int r2 = (int) (Math.random() * 4);
                        System.out.println(v.get(example[r2]).Eng() + "?");

                        for (int i = 0; i < 4; i++) {
                            System.out.print("(" + (i + 1) + ")" + v.get(example[i]).Kor() + " ");
                        }

                        int answer = 0;
                        System.out.print(":>");

                        String tmp = scanner.next();

                        if (tmp.equals("1") || tmp.equals("2") || tmp.equals("3") || tmp.equals("4") || tmp.equals("-1"))
                            answer = Integer.parseInt(tmp);
                        else {
                            System.out.println("숫자를 입력하세요 !!");
                            System.out.println();
                        }

                        if (answer == -1)
                            break;

                        if (answer >= 1 && answer <= 4) {
                            if (v.get(example[answer - 1]).Eng().equals(v.get(example[r2]).Eng())) {
                                System.out.println("Excellent  !!");
                                System.out.println();
                            } else {
                                System.out.println("No.  !!");
                                System.out.println();
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while (true) {
                        System.out.print("영어 한글 입력 >> ");
                        String eng = scanner.next();
                        if (eng.equals("그만"))
                            break;
                        String kor = scanner.next();
                        v.add(new Word(eng, kor));
                    }
                    break;

                default:
                    System.out.println("1, 2, 3중 하나를 입력하세요");
                    break;

            }
        }
        scanner.close();
    }
}




import java.util.*;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String c = scanner.next();
        char c1 = c.charAt(0);
        String b = scanner.next();
        int d1 = 0;
        int d2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();

        arrayList.add("");
        arrayList2.add("");
        for (CalculatorEnum calculatorEnum : CalculatorEnum.values()) {
            arrayList.add((calculatorEnum.name()));
        }
        for (int p = 1; p <= 10; p++) {
            arrayList2.add(arrayList.get(p));
        }
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, arrayList.get(i));
            map.put(-i, "-" + arrayList.get(i));
        }
        int p = 9;
        for (int i = 10; i <= 18; i++) {
            for (int j = 0; j <= 9; j++) {
                p = p + 1;
                map.put(p, (arrayList.get(i) + arrayList.get(j)));
                map.put(-p, ("-" + arrayList.get(i) + arrayList.get(j)));
            }
        }
        map.put(100, "C");
        map.put(-100, "-C");
        for (int i = 1; i <= 11; i++) {
            try {
                if (Integer.valueOf(a) < 0 || Integer.valueOf(b) < 0 || Integer.valueOf(a) > 10 || Integer.valueOf(b) > 10) {
                    System.out.println("ERROR");
                    return;
                }
                if (list.contains(Integer.parseInt(a)) == true && list.contains(Integer.parseInt(b)) == true) {
                    d1 = Integer.parseInt(a);
                    d2 = Integer.parseInt(b);
                }
            } catch (Exception m) {
                try {
                    if (arrayList2.contains(a) == false || arrayList2.contains(b) == false) {
                        System.out.println("ERROR");
                        return;
                    }

                    for (CalculatorEnum e : CalculatorEnum.values()) {
                        if (e == CalculatorEnum.valueOf(a)) {
                            d1 = Integer.parseInt(e.getI());
                        }
                        if (e == CalculatorEnum.valueOf(b)) {
                            d2 = Integer.parseInt(e.getI());
                        }
                    }
                } catch (Exception s) {
                    System.err.println("ERROR!!!");
                    return;
                }
            }
            list.add(i);
        }
        CalculatorMetod calculator = new CalculatorMetod(d1, d2);
        switch (c1) {
            case '+':
                if (map.containsValue(a) == true && map.containsValue(b) == true) {
                    System.out.println(map.get((calculator.add())));
                } else {
                    System.out.println(calculator.add());
                }
                break;
            case '-':
                if (map.containsValue(a) == true) {
                    System.out.println(map.get(calculator.subs()));
                } else {
                    System.out.println(calculator.subs());
                }
                break;
            case '*':
                if (map.containsValue(a) == true) {
                    System.out.println(map.get(calculator.multi()));
                } else {
                    System.out.println(calculator.multi());
                }
                break;
            case '/':
                if (map.containsValue(a) == true) {
                    System.out.println(map.get(calculator.div()));
                } else {
                    System.out.println(calculator.div());
                }
                break;
        }
    }
}

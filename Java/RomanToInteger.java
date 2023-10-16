package Java;

import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s)
    {
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        //Adding elements to map
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('M',1000);
        map.put('D',500);

        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");

        int number = 0;
        for (int i = 0; i < s.length(); i++)
        {
            number = number + (map.get(s.charAt(i)));
        }

        return number;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();

        //romanToInt(s);
        System.out.println(romanToInt(s));
    }
}

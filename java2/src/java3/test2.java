package java3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        int count = 0;
	        while (count < 7) {
	            System.out.print("숫자를 하나 입력해 주시길 바랍니다.: ");
	            try {
	                int input = sc.nextInt();
	                numbers.add(input);
	                count++;
	            } 
	            catch (Exception e) {
	                System.out.println("숫자를 입력해 주세요.");
	                sc.nextLine();
	            }
	        }
	        Collections.sort(numbers);
	        System.out.println(numbers);
	    }
	}


package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		String [] monsterNames = {"고블린","오크","트롤","골렘"};
		int [] monsterHps = {5,7,10,15};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몬스터 수를 입력해 주세요 : ");
		int num = sc.nextInt();
		String [] monsterParty = new String[num];
		int [] monsterPartyHp = new int[num];
		
		
		
		for(int i = 0 ; i < num ; i ++ ) {
			
			int index = random.nextInt(4);
			int hp =  monsterHps[index] -random.nextInt(monsterHps[index])/2;
					
			monsterParty[i] = monsterNames[index];
			monsterPartyHp[i] = hp;
			
			System.out.print("몬스터 출현 : " + monsterParty[i] );
			System.out.println("\tHP : " + monsterPartyHp[i] );
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String [] monsterNames = {"고블린","오크","트롤","골렘"};
		int [] monsterHps = {5,7,10,15};
		
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		System.out.println("몬스터 수를 입력해 주세요 : ");
		int num = sc.nextInt();
		String [] monsterParty = new String[num];
		int [] monsterPartyHp = new int[num];
		
		
		System.out.println("\t ! ! ! 몬스터 등장 ! ! !\n" );
		for(int i = 0 ; i < num ; i ++ ) {
			
			int index = random.nextInt(4);
			int hp =  monsterHps[index] -random.nextInt(monsterHps[index])/2;
					
			monsterParty[i] = monsterNames[index];
			monsterPartyHp[i] = hp;
			
			System.out.print("몬스터 : " + monsterParty[i] );
			System.out.println("\tHP : " + monsterPartyHp[i] );
		}
		
		
		
		//1회성
		//0-6 미만 랜덤한 데미지로 몬스터를 공격
		
		
		int magicpower = 6;
		System.out.println("\n\t ! ! ! 파이어 볼 ! ! !  " );
		
		System.out.println("\n\t ! ! ! 효과는 굉장했다 ! ! !\n" );
		for(int i = 0 ; i < num ; i ++ ) {
			
			monsterPartyHp[i] -= random.nextInt(magicpower);
			
			System.out.print("몬스터 : " + monsterParty[i] );
			System.out.println("\tHP : " + monsterPartyHp[i] );
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

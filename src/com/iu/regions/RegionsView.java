package com.iu.regions;

import java.util.ArrayList;

public class RegionsView {

	//view
	
	public void view(RegionsDTO regionsDTO) {
		System.out.println("ReGion_ID\t Region_name" );
		System.out.println("-----------------------");
		System.out.print(regionsDTO.getRegion_id() +"\t\t ");
		System.out.println(regionsDTO.getRegion_name());
		System.out.println("-----------------------");
		
	}
	
	public void view(ArrayList<RegionsDTO> ar) {
		for(int i = 0; i<ar.size();i++) {
			
			RegionsDTO regionsDTO = ar.get(i);
			this.view(regionsDTO);;
		}
		
	}
}

package com.satish.lombok.Examples;

public class GetterSetterMain extends GetterSetter{

	public static void main(String[] args) {

		GetterSetter gs = new GetterSetter();
		
		
		gs.setName("satish");
		System.out.println(gs.getName());
		
	gs.setFlag(false);
	System.out.println(gs.isFlag());
	}

}

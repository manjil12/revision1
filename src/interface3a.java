
public interface interface3a {
	void getmethoda1 (String method);
	void getmethoda2 (String method2);
	void getmethoda3 (String method3);

}

interface a {
	void getmethodb1 (String method1);
	void getmethodb2 (String method2);
	void getmethodb3 (String method3);
}

class C implements interface3a, a {

	@Override
	public void getmethodb1(String method1) {
		// TODO Auto-generated method stub
		System.out.println("bmethod1:"+method1);
		
	}

	@Override
	public void getmethodb2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("bmethod2:"+method2);
	}

	@Override
	public void getmethodb3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("bmethod3:"+method3);
	}

	@Override
	public void getmethoda1(String method) {
		// TODO Auto-generated method stub
		System.out.println("amethod1:"+method);
	}

	@Override
	public void getmethoda2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("amethod1:"+method2);
	}

	@Override
	public void getmethoda3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("amethod1:"+method3);
	}
	
}
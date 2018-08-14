package example.demoException;

public class exp2 {
	public static void main(String[] args) {
		try{
			for(String s : args) {
				if(Integer.parseInt(s) < 15)
					throw new UserDefinedException();
				else
					System.out.println(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

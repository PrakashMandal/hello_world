/**
 * 
 */
package example.demoException;

/**
 * @author Prakash
 *
 */
public class UserDefinedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public UserDefinedException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public UserDefinedException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		System.out.println(arg0.toLowerCase());
	}

	/**
	 * @param arg0
	 */
	public UserDefinedException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public UserDefinedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public UserDefinedException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

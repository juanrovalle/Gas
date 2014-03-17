public class Two {
	public static void main(String[] args) {
		System.out.println(args == null ? new String[] { "helo" } : args);
	}
}

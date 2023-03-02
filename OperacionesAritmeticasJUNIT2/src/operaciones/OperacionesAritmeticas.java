package operaciones;


public class OperacionesAritmeticas {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public OperacionesAritmeticas(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int suma () {
		return a+b;
	}
	
	public int resta () {
		return a-b;
	}
	
	public int producto () {
		return a*b;
	}

	public double division () throws Exception {
		if (b==0) {
			throw new Exception("Division por 0");
		}else {
		return (double) (a/b);
		}
	}	
}

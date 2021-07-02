
public class Complex {
	
	private double Re;
	private double Im;
	private double Abs;
	
	Complex(double Re, double Im){
		this.Re = Re;
		this.Im = Im;
		}
	
	public double getRe() {
		return Re;
	}
	
	public double getIm() {
		return Im;
	}
	
	public double getAbs2() {
		return Re * Re + Im * Im;
	}
	
	public void add(Complex c) {
		Re += c.getRe();
		Im += c.getIm();
	}
	
	public void mul(Complex c) {
		double tempRe = getRe() * c.getRe() - getIm() * c.getIm();
		Im = getRe() * c.getIm() + getIm() * c.getRe();
		Re = tempRe;
	}
	
}

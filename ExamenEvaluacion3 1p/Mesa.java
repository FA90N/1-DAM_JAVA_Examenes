package zEvaluacion3;

public class Mesa extends Producto{
	private String color;
	
	public Mesa() {
		super();
	}
	

	public Mesa(int codigo, double precio, String color) {
		super(codigo, precio);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mesa [color=" + color + "]" + super.toString();
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}

package chapters10;

// 파우더
// 플라스틱

public class ThreeDPrinter<T> {
	private T material; 
	private Powder p;
	private Plastic pt;
	
	
	public void setMaterial(T material) {
		this.material = material;
		//Powder material = new Powder();
	}
	
	public T getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}

}

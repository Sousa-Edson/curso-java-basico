package _08Wrappers;

public class AutoboxingUnboxing {
public static void main(String[] args) {
	// Autoboxing
	int valorPrimitivo = 42;
	Integer valorWrapper = valorPrimitivo; // Autoboxing

	// Unboxing
	Integer outroWrapper = 100;
	int outroPrimitivo = outroWrapper; // Unboxing

	
	System.out.println("A:: "+valorWrapper);
	System.out.println("B:: "+outroPrimitivo);
}
}

public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1(); 
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do metodo2");
	}

}
//1 Aula - Pilha de execução - Call Stack
//Call Stack para saber qual método está sendo executado

/*A JVM usa um Stack para saber qual método está sendo executado
e para organizar a execução dos métodos
*/
package _14_Override._01;

public class Animal {
	public void beslenme() {//overriden m
		System.out.println("Hayvanlar beslenir.");
	}
	protected String  tatli() {//acmo sırasıyla degis 4 madde yaz
		return "trileçe";
	}
	//public int topla()-->cat'a short long yaz
	public Integer topla() {//return type calis 5. madde yaz wrapparden int-short sonra 7 yaz
		return 3+4;   //void void eslesmesi goster 6. madee yaz
	}
	
	public Animal create() {// method return type class wrapper de oldg gibi  olabilir
							// 7. maddeden sonra yaz
		return new Animal();
	}

	//8. madeden sonra yaz catte manuel yaz sonra ovwerride yaz
	// public static void hareket(){
	// sout(zıplarlar)}
	//9. madde final calış
	//besle metodu private yap calış

}

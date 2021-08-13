package _14_Override._01;

public class Cat extends Animal{
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.beslenme();
		System.out.println(c1.tatli());

		System.out.println(c1.topla());

	}

	@Override  //Annotation childe yazilir... parentteki mrthod iel ilski kurara
	 
	public void beslenme() {//overriding m
		System.out.println("Kediler sut icer");
	}

	@Override//source den eclipse ile yap
	public String  tatli() {
		return "gullac";
	}

	@Override
	public Integer topla() {
		return 1+2;
	}

	@Override
	public Animal create() {//return type cat da olabilir  int-->short olamdı
							// ama arada inherit olg icin kabul edildi sonrasında 8. madde yaz
		
		return new Cat();

}
}

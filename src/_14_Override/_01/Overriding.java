package _14_Override._01;

public class Overriding {
    /*  Overriding.....
    1) Overridding : Parent Class'daki bir METHOD'u Child Class a gore ozellestirerek kullanmanın adıdır.

    2) OVERRIDING KURALLARI...
        a)Overriding creat edilirken "method signature (name+parametre)"
	      kesinlikle asla degistirilmez...!!!
	    b)Overriding creat edilirken "acces modifier" lar belli kurallara
	      gore degistirlebilir.
	    c)Overriding creat edilirken "return type" lar belli kurallara gore
	      degistirilebilir.
	    d)Overriding creat edilirken "method body" %99 degistirilir. "Overriding"
	      in amaci genel bir methodu parentten childe özel hale getirmektir.
	      method body yi degistirmeden kullanilirsa Java CTE vermez.
	    e)Overriding  creat edilirken "parent-child" relationship sarttir.
	      Ahan da TRICKY : inheritance olmadan overriding olmaz OLAMAZZZZ..
	    f)"Overridden Method" :Parent Claas'daki Override edilen  methoda denir.
	      ""Overriding Method" :  Child class daki method Override edilmiş methoda denir.

	      ****buraya kadar eclips olmadan yaz

	 3)Overriding methodun basina "@Override" annotation koyulursa method
	     overriding kontrolune girer ve hata durumunda  CTE verir.

         ******acmoo çalış...

    4)"Overriding Method" (child) un access modifier , ya "Overridden Method"(parent) ile ayni olur
	       ya da daha genis olur.Evlat babayi sinirlemeyez..!!!

	 5)Return type’lar primitive ise “Overriding Method” un return type’i
	 	  “Overridden Method” ile ayni olmalidir.

	 6)Overridden Method”un return type’i void ise “Overriding Method” un da
	  	  return type’i void olmalidir. kendinden olmayanı kabul etmiyor.

	 7)Return Type Wrapper Class ise “Overriding Method” un return type’i
	  	  “Overridden Method” ile ayni olmalidir.

	8)Return Type’lar arasinda parent-child relationship varsa
	 	  “Overriding Method” un return type’i ya “Overridden Method” ile ayni olmali
	 	  veya “Overridden Method” un child class’i olmali.

	9)static methodlar override edilemezler. gökteki ayi yere indirip özelleştirme olmaz

	 	10)final methodlar override edilemezler.
	 	11)private methodlar override edilemezler.
	 	12)"Polymorphism" nedir?"--->BUZZZ gibi...interview sorusu
	        ==> : Polymorphism "Overloading" ve "Overriding" den olusur.
	            Overloading==> public void add(){}
	                           public void add(int i){}
	                           public void add(int i,String s){}
	            Overriding==> public void multiply(){syso("3*4)}
	                          public void multiply(){syso("1*2*3)}
	                          public void multiply(){syso("5*3*4)}
	       "Overloading" ve "Overriding"   arasindaki farklar nelerdir.
	       1)"Overloading" de method signature(name+parametre) degistirilir.(parametre degisir)
	          "Overriding" de   method signature'a dokunulmaz.
	       2) "Overloading" de method body genellikle degistirilmez.
	          "Overriding" de  method body hemen hemen her zaman degistirilir.
	       3) "Overloading" de inheritance gerekmez.
	          "Overriding" de inheritance sarttir.Inheritance yoksa overriding yoktur.
	       4)"Overloading" Compile Time Polymorphism'dir. "Overriding" Run Time  Polymorphism'dir.
	       5)"private" methodlar overload edilebilirler ama "override" edilemezler.
	         "static" methodlar overload edilebilirler ama "override" edilemezler.



     */
}

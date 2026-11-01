package main;
import model.ekipman;
import model.rezervasyon;
public class main {

	public static void main(String[] args) {
		ekipman b1=new ekipman("4588445","bilgisayar1","pc labaratuari");
		rezervasyon r1=new rezervasyon("274  ","4879455","pazartesi","12.30");
        System.out.println(b1);
        System.out.println(r1);  // burada dogrudan tostring() cagirir
	}

}

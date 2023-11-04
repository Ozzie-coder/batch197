package suleymanhoca_34;

public class WrapperClass01 {
    public static void main(String[] args) {

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        int k1 =15;
        Integer wrapperK = k1;
        System.out.println(k1);

        Integer num = 22;
        int primitiveNum = num;
        System.out.println(num);

        int a = 2;
        int b = 7;
        String c = "Ali Can";
        System.out.println(a+b+c);

        System.out.println(c+(a+b));

        System.out.println(c+a+b);

        double kisiSayisi = 10;
        double paraMiktari = 25;
        System.out.println(kisiSayisi/paraMiktari);
        System.out.println(paraMiktari/kisiSayisi);

        int kisiSayisi1 = 10;
        int paraMiktari1 = 25;
        System.out.println(kisiSayisi1/paraMiktari1);
        System.out.println(paraMiktari1/kisiSayisi1);

        boolean first =3<5;
        boolean second=2+3 !=5;
        boolean third =2+3*5>=19;

        System.out.println(first&&second);
        System.out.println(first||second);



    }
}

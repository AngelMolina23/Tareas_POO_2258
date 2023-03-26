public class DriverCafe {
    public static void main(String[] args) {
        MaquinaCafe delhogar = new MaquinaCafe( (short)200, (short) 1200, (short) 300, (byte) 4);
        System.out.println(delhogar);
        System.out.println("----------------------SERVI UN AMERICANO-----------------------------------");
      delhogar.Americano();
        System.out.println("----------------------RELLENO CAFETERA-----------------------------------");
       delhogar.setAgua((short) 4000);
        System.out.println(delhogar);
        System.out.println("----------------------SERVI CAPUCHINO Y  2 EXPRESOS -----------------------------------");
        delhogar.Capuchino();
        delhogar.Expreso();
        delhogar.Expreso();


    }
}

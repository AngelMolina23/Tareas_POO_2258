public class MaquinaCafe {
     private short agua;
     private short crema;
     private short cafe;
     private byte vasos;

     public MaquinaCafe(short agua, short crema, short cafe, byte vasos) {
          this.agua = agua;
          this.crema = crema;
          this.cafe = cafe;
          this.vasos = vasos;
     }

     public short getAgua() {
          return agua;
     }

     public void setAgua(short agua) {
          if (agua <= 5000 && agua > -1)
          this.agua = agua;
          else
               System.out.println(" los militros de agua son invalidos");
     }

     public short getCrema() {
          return crema;
     }

     public void setCrema(short crema) {
          if (crema <= 1500 && crema > -1)
               this.crema = crema;
          else
               System.out.println(" los militros de crema son invalidos");
     }

     public short getCafe() {
          return cafe;
     }

     public void setCafe(short cafe) {
          if (cafe <= 1000 && cafe > -1)
               this.cafe = cafe;
          else
               System.out.println(" los gramos de cafe son invalidos");
     }

     public byte getVasos() {
          return vasos;
     }

     public void setVasos(byte vasos) {
          this.vasos = vasos;
     }

     @Override
     public String toString() {
          return "MaquinaCafe{" +
                  "agua=" + agua +
                  ", crema=" + crema +
                  ", cafe=" + cafe +
                  ", vasos=" + vasos +
                  '}';
     }

     public void Americano(){
          if (agua>= 180 && cafe >= 15 && vasos >0){
               System.out.println(" se sirvio un americano");
               agua -= 180;
               cafe -= 15;
               vasos -= 1;
               if (agua>= 180 && cafe >= 15 && vasos >0){
                    System.out.println("aun podriamos servir un vaso mas de americano");
               }
               else {
                    System.out.println("faltan materiales para servir otro cafe");
               }
          }else
               System.out.println("faltan materiales para servir el cafe");
          System.out.println("Tenemos actualmente: ");
          System.out.println( "Agua = "+ agua+ "ml Cafe = "+ cafe +"g Crema = "+crema+"ml Vasos = "+vasos);
     }
     public void Expreso(){
          if (agua>= 120 && cafe >= 20 && vasos >0){
               System.out.println(" se sirvio un expreso");
               agua -= 120;
               cafe -= 20;
               vasos -= 1;
               if (agua>= 120 && cafe >= 20 && vasos >0){
                    System.out.println("aun podriamos servir un vaso mas de Expreso");
               }
               else {
                    System.out.println("faltan materiales para servir otro cafe");
               }
          }else
               System.out.println("faltan materiales para servir el cafe");
          System.out.println("Tenemos actualmente: ");
          System.out.println( "Agua = "+ agua+ "ml Cafe = "+ cafe +"g Crema = "+crema+"ml Vasos = "+vasos);
     }
     public void Capuchino(){
          if (agua>= 100 && cafe >= 14 && crema>= 70 && vasos >0){
               System.out.println(" se sirvio un capuchino");
               agua -= 100;
               cafe -= 14;
               crema -=70;
               vasos -= 1;
               if (agua>= 100 && cafe >= 14 && crema >= 70 && vasos >0){
                    System.out.println("aun podriamos servir un vaso mas de Capuchino");
               }
               else {
                    System.out.println("faltan materiales para servir otro cafe");
               }
          }else
               System.out.println("faltan materiales para servir el cafe");
          System.out.println("Tenemos actualmente: ");
          System.out.println( "Agua = "+ agua+ "ml Cafe = "+ cafe +"g Crema = "+crema+"ml Vasos = "+vasos);
     }




}

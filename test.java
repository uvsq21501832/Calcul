public class Carre{
//attributs
public Carre(Builder builder ){
this.cote=builder.cote;
this.coin=builder.coin;
this.couleur=builder.couleur;
}
//Mise en oeuvre du pattern builder
public static class Builder{
//non obligatoire
private Point coin=new Point(50,50);
private int cote=100;
private Couleur couleur=new Couleur(TypeCou
leur.RGB, 0 , 0, 0);
public Builder(){
}
public Builder point(int x, int y){
coin=new Point(x, y);
return this;
}
public Builder cote(int c ){
this.cote=c;
return this;
}
public Builder couleur(TypeCouleur tc, int p
aram1, int param2, int param3){
couleur=new Couleur(tc, param1, param2,
param3);
return this;
}
public Carre build(){
return new Carre(this);
}
}
} 

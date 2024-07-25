package encapsulamento;

public class Pet {
private String Nome;
private String Tipo;
private String Tamanho;
private String Padrinho;
private String Signo;
private String Cor;
private double Peso;

public void ajustarNome(String Nome) {
	this.Nome=Nome;
}
public String lerNome() {
	return this.Nome;
}
public void ajustarCor(String Cor) {
	this.Cor=Cor;
}
public String lerCor() {
	return this.Cor;
}
public void ajustarTipo(String Tipo) {
	this.Tipo=Tipo;
}
public String lerTipo() {
	return this.Tipo;
}
public void ajustarTamanho(String Tamanho) {
	this.Tamanho=Tamanho;
}
public String lerTamanho() {
	return this.Tamanho;
}
public void ajustarPadrinho(String Padrinho) {
	this.Padrinho=Padrinho;
}
public String lerPadrinho() {
	return this.Padrinho;
}
public void ajustarSigno(String Signo) {
	this.Signo=Signo;
}
public String lerSigno() {
	return this.Signo;
}
public void ajustarPeso(double Peso) {
	this.Peso=Peso;
}
public double lerPeso() {
	return this.Peso;
}
}

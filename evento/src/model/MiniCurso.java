package model;

import java.util.Date;

public final class MiniCurso extends Submissao{
private int horas;
private Date data;
private Date horaInicio;
private Date horaFim;
private static int numeroMiniCurso;
public MiniCurso() {
	
	super();
	this.implementarMiniCurso();
	
}

public MiniCurso(String titulo,int situacao,Autor autor,Area area,int horas,Date data,Date horaInicio,Date horaFim) {
	super(titulo,situacao,autor,area);
	this.horas=horas;
	this.data=data;
	this.horaInicio=horaInicio;
	this.horaFim=horaFim;
	this.implementarMiniCurso();
}

public int getHoras() {
	return horas;
}

public void setHoras(int horas) {
	this.horas = horas;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}

public Date getHoraInicio() {
	return horaInicio;
}

public void setHoraInicio(Date horaInicio) {
	this.horaInicio = horaInicio;
}

public Date getHoraFim() {
	return horaFim;
}

public void setHoraFim(Date horaFim) {
	this.horaFim = horaFim;
}
private static void implementarMiniCurso() {
	numeroMiniCurso++;
}
}

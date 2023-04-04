package cinema;

public class Sessoes {
	private String horarios[] = { "14:30", "18:00", "21:30" }, horarioEsc; // horários e a var horario escolhido
	private String tipo[] = { "Dublado", "Legendado" }, tipoEsc; // tipo dublado ou legendado e a vr de tipo escolhido

	public Sessoes(String horarioEsc, String tipoEsc) { // construtor
		this.horarioEsc = (escHorario(horarioEsc));
		this.tipoEsc = (escTipo(tipoEsc));
	}

	public String escHorario(String horarioEsc) { // método de escolher o horário
		for (int i = 0; i < horarios.length; i++) {
			if (horarios[i].equals(horarioEsc)) {
				System.out.println("Horário: " + horarios[i]);
			}
		}
		return this.getHorarioEsc();
	}

	public String escTipo(String tipoEsc) { // método de escolher o tipo
		for (int i = 0; i < tipo.length; i++) {
			if (tipo[i].equals(tipoEsc)) {
				System.out.println("Tipo: " + tipo[i]);
			}
		}
		System.out.println("--------------------------------------------------------------");
		return this.getTipoEsc();
	}

	public String[] getHorarios() {
		return horarios;
	}

	public void setHorarios(String[] horarios) {
		this.horarios = horarios;
	}

	public String getHorarioEsc() {
		return horarioEsc;
	}

	public void setHorarioEsc(String horarioEsc) {
		this.horarioEsc = horarioEsc;
	}

	public String[] getTipo() {
		return tipo;
	}

	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

	public String getTipoEsc() {
		return tipoEsc;
	}

	public void setTipoEsc(String tipoEsc) {
		this.tipoEsc = tipoEsc;
	}

}
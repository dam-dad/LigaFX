package dad.javafx.liga;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Partido {
	private ObjectProperty<LocalDate> fecha;
	private ObjectProperty<Equipo> visitante;
	private ObjectProperty<Equipo> local;
	private ObjectProperty<Resultado> resultado;

	public Partido() {
		fecha = new SimpleObjectProperty<>(this, "fecha");
		visitante = new SimpleObjectProperty<>(this, "visitante");
		local = new SimpleObjectProperty<>(this, "local");
		resultado = new SimpleObjectProperty<>(this, "resultado");
	}

	public ObjectProperty<LocalDate> fechaProperty() {
		return this.fecha;
	}

	public LocalDate getFecha() {
		return this.fechaProperty().get();
	}

	public void setFecha(final LocalDate fecha) {
		this.fechaProperty().set(fecha);
	}

	public ObjectProperty<Equipo> visitanteProperty() {
		return this.visitante;
	}

	public Equipo getVisitante() {
		return this.visitanteProperty().get();
	}

	public void setVisitante(final Equipo visitante) {
		this.visitanteProperty().set(visitante);
	}

	public ObjectProperty<Equipo> localProperty() {
		return this.local;
	}

	public Equipo getLocal() {
		return this.localProperty().get();
	}

	public void setLocal(final Equipo local) {
		this.localProperty().set(local);
	}

	public ObjectProperty<Resultado> resultadoProperty() {
		return this.resultado;
	}

	public Resultado getResultado() {
		return this.resultadoProperty().get();
	}

	public void setResultado(final Resultado resultado) {
		this.resultadoProperty().set(resultado);
	}

}

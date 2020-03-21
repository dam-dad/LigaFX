package dad.javafx.liga;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class Resultado {
	private DoubleProperty puntosLocal;
	private DoubleProperty puntosVisitante;
	private ReadOnlyDoubleWrapper diferencia;

	public Resultado() {
		puntosLocal = new SimpleDoubleProperty(this, "puntosLocal");
		puntosVisitante = new SimpleDoubleProperty(this, "puntosVisitante");
		diferencia = new ReadOnlyDoubleWrapper(this, "diferencia");
		diferencia.bind(puntosLocal.subtract(puntosVisitante));
	}

	public DoubleProperty puntosLocalProperty() {
		return this.puntosLocal;
	}

	public double getPuntosLocal() {
		return this.puntosLocalProperty().get();
	}

	public void setPuntosLocal(final double puntosLocal) {
		this.puntosLocalProperty().set(puntosLocal);
	}

	public DoubleProperty puntosVisitanteProperty() {
		return this.puntosVisitante;
	}

	public double getPuntosVisitante() {
		return this.puntosVisitanteProperty().get();
	}

	public void setPuntosVisitante(final double puntosVisitante) {
		this.puntosVisitanteProperty().set(puntosVisitante);
	}

	public javafx.beans.property.ReadOnlyDoubleProperty diferenciaProperty() {
		return this.diferencia.getReadOnlyProperty();
	}

	public double getDiferencia() {
		return this.diferenciaProperty().get();
	}

}

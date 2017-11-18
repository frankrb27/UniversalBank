package co.edu.javeriana.posa.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.PieChartModel;

public class GraficarBean implements Serializable {

	private BarChartModel barModel;
	private PieChartModel pieModel2;

	private void createPieModels() {
		
	}

	public GraficarBean() {
		System.out.println("GraficarBean Ini");
		createBarModels();
		createPieModel2();
	}

	public PieChartModel getPieModel2() {
		return pieModel2;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries boys = new ChartSeries();
		boys.setLabel("Estados");
		boys.set("Ingresadas", 120);
		boys.set("Cotizadas", 100);
		boys.set("Expirada", 44);

		model.addSeries(boys);

		return model;
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {
		barModel = initBarModel();

		barModel.setTitle("Grafica Barras");
		barModel.setLegendPosition("ne");

		Axis xAxis = barModel.getAxis(AxisType.X);
		xAxis.setLabel("Estado");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("Cantidad");
		yAxis.setMin(0);
		yAxis.setMax(200);
	}
	 private void createPieModel2() {
	        pieModel2 = new PieChartModel();
	         
	        pieModel2.set("Ingresadas", 540);
	        pieModel2.set("Cotizadas", 325);
	        pieModel2.set("Expiradas", 702);
	         
	        pieModel2.setTitle("Torta");
	        pieModel2.setLegendPosition("e");
	    }

}

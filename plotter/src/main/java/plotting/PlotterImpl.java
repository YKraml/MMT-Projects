package plotting;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import model.Graph;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PlotterImpl implements Plotter {

  public void plotGraphs(String xAxisLabel, String yAxisLabel, List<Graph> tables) {
    JFrame frame = new JFrame();
    frame.setTitle("Chart");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    String title = "Plot";
    XYDataset dataset = createDataset(tables);
    PlotOrientation orientation = PlotOrientation.VERTICAL;
    boolean legend = true;
    boolean tooltips = true;
    boolean urls = true;
    JFreeChart chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel, dataset,
        orientation, legend, tooltips, urls);

    ChartPanel chartPanel = new ChartPanel(chart);

    frame.setContentPane(chartPanel);

    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private XYDataset createDataset(List<Graph> tables) {

    XYSeriesCollection dataset = new XYSeriesCollection();

    tables.forEach(graph -> {
      XYSeries series = new XYSeries(graph.getName());
      graph.getValueTable().forEach(series::add);
      dataset.addSeries(series);
    });

    return dataset;
  }
}

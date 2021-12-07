package cards;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Statistics extends JPanel implements ActionListener{
	JPanel panel = new JPanel(new BorderLayout());
	JButton Go = new JButton("Go Back");
	private double[] value = {1,2,12,7,0,12,1,4,6,8};
	private String[] languages = {"Birth \nRate","Death \nRate","Male","Female","Others","Employed","Unemployed","Educated","Uneducated","Indian","Others"};
	String title;
	JLabel title1 = new JLabel("Census Statistics View");
	Statistics(){
		  
		  add(Go);
		  //add(Box.createRigidArea(new Dimension(25,25)));
		  title1.setFont(new Font("Arial", Font.PLAIN, 32));
	      title1.setSize(700, 30);
		  panel.add(title1);
		  add(panel);
		  title = "                       ";
		  Go.addActionListener(this);
		  }
		  public void paintComponent(Graphics graphics) {
		  super.paintComponent(graphics);
		  if (value == null || value.length == 0)
		  return;
		  double minValue = 0;
		  double maxValue = 50;
		  for (int i = 0; i < value.length; i++) {
		  if (minValue > value[i])
		  minValue = value[i];
		  }
		  Dimension dim = new Dimension(850,400);
		  int clientWidth = dim.width;
		  int clientHeight = dim.height;
		  int barWidth = clientWidth / value.length;
		  Font titleFont = new Font("Book Antiqua", Font.PLAIN, 33);
		  FontMetrics titleFontMetrics = graphics.getFontMetrics(titleFont);
		  Font labelFont = new Font("Times New Roman", Font.PLAIN, 17);
		  FontMetrics labelFontMetrics = graphics.getFontMetrics(labelFont);
		  int titleWidth = titleFontMetrics.stringWidth(title);
		  int q = titleFontMetrics.getAscent();
		  int p = (clientWidth - titleWidth) / 2;
		  graphics.setFont(titleFont);
		  graphics.drawString(title, p, q);
		  int top = titleFontMetrics.getHeight();
		  int bottom = labelFontMetrics.getHeight();
		  if (maxValue == minValue)
		  return;
		  double scale = (clientHeight - top - bottom) / (maxValue - minValue);
		  q = clientHeight - labelFontMetrics.getDescent();
		  graphics.setFont(labelFont);
		  for (int j = 0; j < value.length; j++) {
		  int valueP = j * barWidth + 1;
		  int valueQ = top;
		  int height = (int) (value[j] * scale);
		  if (value[j] >= 0)
		  valueQ += (int) ((maxValue - value[j]) * scale);
		  else {
		  valueQ += (int) (maxValue * scale);
		  height = -height;
	}
		  graphics.setColor(Color.blue);
		  graphics.fillRect(valueP, valueQ, barWidth - 2, height);
		  graphics.setColor(Color.black);
		  graphics.drawRect(valueP, valueQ, barWidth - 2, height);
		  int labelWidth = labelFontMetrics.stringWidth(languages[j]);
		  p = j * barWidth + (barWidth - labelWidth) / 2;
		  graphics.drawString(languages[j], p, q);
}
}
		  public void actionPerformed(ActionEvent e) {
			  Object source = e.getSource();
			  if(source == Go) {
				  Master.goTo("Login");
			  }
		  }
}
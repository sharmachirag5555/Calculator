package calculator;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc
{
	 TextField f=new TextField("");
	 int c,n;
	 String s1,s2,s3,s4,s5; 
  void cal()
  {
	  Frame r=new Frame();
	  r.setSize(700, 700);
	  f.setBounds(200, 50, 170, 40);
	  r.add(f);
	  
	  Button b1=new  Button("1");
	  b1.setBounds(200, 90, 30, 20);
	  b1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
        	  s3 = f.getText();
              s4 = "1";
              s5 = s3+s4;
              f.setText(s5);
           

          }
      });
	 
	  r.add(b1);
	  Button b2=new  Button("2");
	  b2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
        	  s3 = f.getText();
              s4 = "2";
              s5 = s3+s4;
              f.setText(s5);
           

          }
      });
	  b2.setBounds(250, 90, 30, 20);
	  r.add(b2);
	  Button b3=new  Button("3");
	  b3.setBounds(300, 90, 30, 20);
	  r.add(b3);
	  Button b4=new  Button("4");
	  b4.setBounds(200, 120, 30, 20);
	  r.add(b4);
	  Button b5=new  Button("5");
	  b5.setBounds(250, 120, 30, 20);
	  r.add(b5);
	  Button b6=new  Button("6");
	  b6.setBounds(300, 120, 30, 20);
	  r.add(b6);
	  Button b7=new  Button("7");
	  b7.setBounds(200, 150, 30, 20);
	  r.add(b7);
	  Button b8=new  Button("8");
	  b8.setBounds(250, 150, 30, 20);
	  r.add(b8);
	  Button b9=new  Button("9");
	  b9.setBounds(300, 150, 30, 20);
	  r.add(b9);
	  Button b10=new  Button("00");
	  b10.setBounds(200, 180, 30, 20);
	  r.add(b10);
  	  Button b11=new  Button("0");
	  b11.setBounds(250, 180, 30, 20);
	  r.add(b11);
	  Button b12=new Button("=");
	  b12.setBounds(300, 180, 30, 20);
	  r.add(b12);
	  b12.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {

        	  s2= f.getText();
        	  if(c==1)
        	  {
        		  String s6= String.valueOf(Integer.parseInt(s1)+Integer.parseInt(s2));
        		  f.setText(s6);
        		  
        	  }
        	          }
      });
	  
	  Button ad=new Button("+");
	  ad.setBounds(350,90,30,20);
	  r.add(ad);
	  ad.addActionListener(new ActionListener() {
		  
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			  s1=f.getText();
			  f.setText(s1+"+");
			  c=1;
              
              
              
              
		}
	});
	  

	  b3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
        	  s3 = f.getText();
              s4 = "3";
              s5 = s3+s4;
              f.setText(s5);
           

          }
      });
	  b4.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("4");
        	  s3 = f.getText();
              s4 = "4";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b5.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
          // f.setText("5");
        	  s3 = f.getText();
              s4 = "5";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b6.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("6");
        	  s3 = f.getText();
              s4 = "6";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b7.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("7");
        	  s3 = f.getText();
              s4 = "7";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b8.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("8");
        	  s3 = f.getText();
              s4 = "8";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b9.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("9");
        	  s3 = f.getText();
              s4 = "9";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b10.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
           //f.setText("00");
        	  s3 = f.getText();
              s4 = "00";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  b11.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) 
          {
          // f.setText("0");
        	  s3 = f.getText();
              s4 = "0";
              s5 = s3+s4;
              f.setText(s5);

          }
      });
	  
	  
	  r.setLayout(null);
	  
	  r.setVisible(true);
  }
  
  public static void main(String args[])
  {
	  calc cb=new calc();
	  cb.cal();
  }


  
}

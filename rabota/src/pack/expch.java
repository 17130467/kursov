package pack;                 
import java.awt.*;            
import java.awt.event.*;      

import javax.swing.*;         
import javax.swing.border.*;  
	public class expch extends JFrame{
	private static final long serialVersionUID = 1L;
	public static expch frame = new expch(); 
	public static void main(String[] args) { 
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	frame.setVisible(true); 
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}
	private JPanel panel1;
	private JButton calc,calc2;
	private JLabel label_1;
	public static double int_rad;
	static double a=13,a1=13,a2=15,a3=30,a4=35;
	protected Window panel;
	public expch() { 
	setTitle("����");
	setSize(225, 175); // ��������� ������ � ������.
	setLocationRelativeTo(null);//���������� ���������� ������
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	setLayout (new BorderLayout()); 
	panel1 = new JPanel();//������ �� ������� ������������� ������
	add(panel1, BorderLayout.CENTER);//���������� ������ panel1 �����
	panel1.setBorder(new EmptyBorder(10,10,10,10));//��������� ���������� ��������(������,�����,�����,������)
	panel1.setLayout(new GridLayout(3,1,5,5));//�� ������ 1 ������,1�������, ����� ����������� ������
	calc = new JButton("������������");
	calc2 = new JButton("�����");
	label_1 = new JLabel("����� ���:", JLabel.CENTER);
	panel1.add(label_1);
	panel1.add(calc);//���������� ������ �� ������ panel1
	panel1.add(calc2);//���������� ����������� JLabel, JTextField �� ������ panel,panel1,panel2
	   
	calc.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent e) {
        	   expch.main2(null);
        	   }
        
       });
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	PasswordDemo.main(null);
     		}
		
 });
	}   
	
	
	
	
	
	
	
    public static void main2(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

            	
            	JFrame form2 = new JFrame("form2");
         	   JPanel panel, panel1;
         	   JButton calc,calc2;
         	   JLabel label_1,label_2,label_3, label_4,label_n,sum_n,sum,label_n1,label_n2,label_n3,label_n4;
         	   JTextField sum_ok;
         	   JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35;
         	   int q=13,q1=15,q2=30,q3=35;
         	   form2.setTitle("����������� ����"); 
         	   form2.setSize(475, 290); 
         	   form2.setLocationRelativeTo(null);
         	   form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         	   form2.setLayout (new BorderLayout()); 
         	   form2.setVisible(true);
         	   panel = new JPanel();
         	   panel1 = new JPanel();
         	   form2.add(panel, BorderLayout.CENTER);
         	   form2.add(panel1, BorderLayout.SOUTH);
         	   panel.setBorder(new EmptyBorder(10,0,10,10));
         	   panel1.setBorder(new EmptyBorder(10,10,10,10));
         	   panel.setLayout(new GridLayout(9,2,5,0));
         	   panel1.setLayout(new GridLayout(1,2));
         	   label_1 = new JLabel("�������� ����� ���:", JLabel.LEFT);
         	   label_2 = new JLabel("��������", JLabel.LEFT);
         	   label_3 = new JLabel("����� ������, ���.", JLabel.LEFT);
         	   label_4 = new JLabel("����� �� ����, ���.", JLabel.LEFT);
         	   label_n = new JLabel("");
         	   label_n1 = new JLabel("����������");
         	   label_n2 = new JLabel("�����", JLabel.RIGHT);
         	   label_n3 = new JLabel("���:", JLabel.LEFT);
         	   label_n4 = new JLabel("");
         	   sum_n = new JLabel("", JLabel.CENTER);
         	   sum = new JLabel("", JLabel.CENTER);
         	   calc = new JButton("����������");
         	   calc2 = new JButton("� ����");
         	   sum_ok = new JTextField();
         	   sum_ok.setHorizontalAlignment(JTextField.CENTER);
         	   sum_ok.setMargin(new Insets(2, 5, 2, 5));
         	   ButtonGroup group = new ButtonGroup();
         	   rad_13 = new JRadioButton("����",false);
         	   group.add(rad_13);
         	   rad_13.setHorizontalAlignment(JRadioButton.LEFT);
         	   rad_13_1 = new JRadioButton("����� ����� ���������� ����",false);
         	   group.add(rad_13_1);
         	   rad_13_1.setHorizontalAlignment(JRadioButton.LEFT);
         	   rad_15 = new JRadioButton("���������", false);
         	   group.add(rad_15);
         	   rad_15.setHorizontalAlignment(JRadioButton.LEFT);
         	   rad_30 = new JRadioButton("����", false);
         	   group.add(rad_30);
         	   rad_30.setHorizontalAlignment(JRadioButton.LEFT);
         	   rad_35 = new JRadioButton("�������,����"
         	   		+ " ��� ����", false);
         	   group.add(rad_35);
         	   rad_35.setHorizontalAlignment(JRadioButton.LEFT);
         	   panel.add(label_1);
         	   panel.add(label_n);
         	   panel.add(label_2);
         	   panel.add(label_n1);
         	   panel.add(label_n2);
         	   panel.add(label_n3);
         	   panel.add(rad_35);
         	   panel.add(rad_13_1);
         	   panel.add(rad_13);
         	   panel.add(rad_15);
         	   panel.add(label_n4);
         	   panel.add(rad_30);
         	   panel.add(label_3);
         	   panel.add(sum_n);//����� ������
         	   panel.add(label_4);
         	   panel.add(sum);//����� �� ����
         	   panel.add(sum_ok);
         	   panel1.add(calc);
         	   panel1.add(calc2);
         	   
         	   rad_13.addActionListener(new ActionListener()
         	   {
         	   public void actionPerformed(ActionEvent e)
         	   {
         	   int_rad=a;
         	   sum_n.setText("");
         	   sum.setText("");
         	   }
         	   });
         	   rad_13_1.addActionListener(new ActionListener()
         	   {
         	   public void actionPerformed(ActionEvent e)
         	   {
         	   int_rad=a1;
         	   sum_n.setText("");
         	   sum.setText("");
         	   }
         	   });
         	  
         	   rad_15.addActionListener(new ActionListener()
         	   { public void actionPerformed(ActionEvent e)
         	   {
         	   int_rad=a2;
         	   sum_n.setText("");
         	   sum.setText("");
         	   }
         	   });
         	   rad_30.addActionListener(new ActionListener()
         	   { public void actionPerformed(ActionEvent e)
         	   {
         	   int_rad=a3;
         	   sum_n.setText("");
         	   sum.setText("");
         	   }
         	   });
         	   rad_35.addActionListener(new ActionListener()
         	   { public void actionPerformed(ActionEvent e)
         	   {
         	   int_rad=a4;
         	   sum_n.setText("");
         	   sum.setText("");
         	   }
         	   });
         	   
         	  calc2.addActionListener(new ActionListener()
          	   {
          	   public void actionPerformed(ActionEvent e)
          	   {form2.dispose();}});
         	   calc.addActionListener(new ActionListener()
         	   {
         	   public void actionPerformed(ActionEvent e)
         	   {
         	   if (isValidInput(sum_ok, "����� ������")) {
         	   double d_sum_ok= Double.parseDouble(sum_ok.getText().replace(',','.'));
         	   double d_sum_n = d_sum_ok/100*int_rad;
         	   double d_sum = d_sum_ok-d_sum_n;
         	   String s_sum_n = String.format("%.2f", d_sum_n);
         	   sum_n.setText(s_sum_n); 
         	   String s_sum = String.format("%.2f", d_sum);
         	   sum.setText(s_sum); 
         	   }
         	   }
         	   });    	
            	
            	
            	
            	
            }       
            public boolean isValidInput(JTextField jtxt, String description) {
         	   JDialog D = new JDialog();
         	   if (jtxt.getText().trim().length() > 0) {
         	   try { 
         	   double num = Double.parseDouble(jtxt.getText().replace(',','.')); //������� ������������� ����� � ����� �����
         	   return true; //���� ��� ��������� - ���������� true
         	   } catch (NumberFormatException e) {
         	   jtxt.requestFocus();
         	   jtxt.setText("");
         	   JOptionPane.showMessageDialog(D, "�� ������ ������ �����!", "������", JOptionPane.WARNING_MESSAGE);
         	   return false;
         	   }
         	   } else {
         	   JOptionPane.showMessageDialog(D, "������� " + description, "������", JOptionPane.WARNING_MESSAGE);
         	   jtxt.requestFocus();
         	   jtxt.selectAll();
         	   return false;
         	   }
         	   } 
        });
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main1(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
 

              	   JFrame form3 = new JFrame("form2");
              	   form3.setTitle("��������� ��������� ������");
              	   form3.setSize(475, 290); 
              	   form3.setLocationRelativeTo(null);
              	   form3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
              	   form3.setLayout (new BorderLayout()); 
              	   form3.setVisible(true); 
              	   
              	  JButton calc3,calc4;
              	  
              		 JPanel panel2,panel3;

              		 JLabel label_1,label_n1,label_n2,label_n3,label_n4,
              		label_n5,label_n6,label_n7,label_n8,label_n9,label_n10,
              		label_n11,label_n12,label_n13,label_n14,label_n15,label_n16,
              		label_n17,label_n18,label_n121,label_n131,label_2,label_3;
              		 
              		JTextField sum_ok,sum_ok1,sum_ok2,sum_ok3,sum_ok4;
              		form3.setLayout (new BorderLayout()); 
              		panel2 = new JPanel();//������ �� ������� ������������� ��������� ���� � ���� ��� ����� ������
              		panel3 = new JPanel();//������ �� ������� ������������� ������
              		form3.add(panel2, BorderLayout.CENTER);//���������� ������ panel �� ������
              		form3.add(panel3, BorderLayout.SOUTH);//���������� ������ panel1 �����
              		panel2.setBorder(new EmptyBorder(10,10,10,10));//��������� ���������� ��������(������,�����,�����,������)
              		panel3.setBorder(new EmptyBorder(10,10,10,10));//��������� ���������� ��������(������,�����,�����,������)
              		panel2.setLayout(new GridLayout(7,4,5,0));/* �� ������ 6 �����,2�������,15 - ���������� ����� ���������, 0- ����� �������� */
              		panel3.setLayout(new GridLayout(1,2));
              		label_1 = new JLabel("�������� �������", JLabel.LEFT);
              		label_n1 = new JLabel("��������� ������", JLabel.LEFT);
              		label_n2 = new JLabel("���:", JLabel.LEFT);
              		label_n3 = new JLabel("", JLabel.LEFT);
              		label_n4 = new JLabel("��������", JLabel.LEFT);
              		label_n5 = new JLabel("", JLabel.LEFT);
              		label_n6 = new JLabel("����������", JLabel.LEFT);
              		label_n7 = new JLabel("", JLabel.LEFT);
              		label_n8 = new JLabel("", JLabel.LEFT);
              		label_n9 = new JLabel("�����", JLabel.RIGHT);
              		label_n10 = new JLabel("���:", JLabel.LEFT);
              		label_n11 = new JLabel("", JLabel.LEFT);
              		label_n12 = new JLabel("������� ���", JLabel.LEFT);
              		label_n121 = new JLabel("����", JLabel.LEFT);
              		label_n13 = new JLabel("����� �����", JLabel.LEFT);
              		label_n131 = new JLabel("���������� ����", JLabel.LEFT);
              		label_2 = new JLabel("", JLabel.LEFT);
              		label_3 = new JLabel("", JLabel.LEFT);
              		label_n14 = new JLabel("����", JLabel.LEFT);
              		label_n15 = new JLabel("���������", JLabel.LEFT);
              		label_n16 = new JLabel("", JLabel.LEFT);
              		label_n17 = new JLabel("", JLabel.LEFT);
              		label_n18 = new JLabel("����", JLabel.LEFT);
              		calc3 = new JButton("� ����");
              		calc4 = new JButton("��������");
              		sum_ok = new JTextField();
              		sum_ok.setHorizontalAlignment(JTextField.CENTER);
              		sum_ok.setMargin(new Insets(2, 5, 2, 5));//��������� ���������� �������� ��� ���������� ���� (2-������� ������, 5-�����, 2-������, 5-������)
              		sum_ok1 = new JTextField();
              		sum_ok1.setHorizontalAlignment(JTextField.CENTER);
              		sum_ok1.setMargin(new Insets(2, 5, 2, 5));
              		sum_ok2 = new JTextField("");
              		sum_ok2.setHorizontalAlignment(JTextField.CENTER);
              		sum_ok2.setMargin(new Insets(2, 5, 2, 5));
              		sum_ok3 = new JTextField();
              		sum_ok3.setHorizontalAlignment(JTextField.CENTER);
              		sum_ok3.setMargin(new Insets(2, 5, 2, 5));
              		sum_ok4 = new JTextField();
              		sum_ok4.setHorizontalAlignment(JTextField.CENTER);
              		sum_ok4.setMargin(new Insets(2, 5, 2, 5));
              		panel2.add(label_1);
              		panel2.add(label_n1);
              		panel2.add(label_n2);
              		panel2.add(label_n3);
              		panel2.add(label_n4);
              		panel2.add(label_n5);
              		panel2.add(label_n6);
              		panel2.add(label_n7);
              		panel2.add(label_n8);
              		panel2.add(label_n9);
              		panel2.add(label_n10);
              		panel2.add(label_n11);
              		panel2.add(label_n12);
              		panel2.add(sum_ok);
              		panel2.add(label_n13);
              		panel2.add(sum_ok1);//����������� ���
              		panel2.add(label_n121);
              		panel2.add(label_2);
              		panel2.add(label_n131);
              		panel2.add(label_3);
              		panel2.add(label_n14);
              		panel2.add(sum_ok2);
              		panel2.add(label_n15);
              		panel2.add(sum_ok3);
              		panel2.add(label_n16);
              		panel2.add(label_n17);
              		panel2.add(label_n18);
              		panel2.add(sum_ok4);
              		panel3.add(calc3);
              		panel3.add(calc4);
              		calc3.addActionListener(new ActionListener()
              	   {
              	   public void actionPerformed(ActionEvent e)
              	   {form3.dispose();}});
              		calc4.addActionListener(new ActionListener() {
              	        public void actionPerformed(ActionEvent e) {
              	        if (isValidInput(sum_ok,"")) {  
              	        	 a4= Double.parseDouble(sum_ok.getText().replace(',','.'));
              	        	int_rad=(int) a4;
              	     	   }
              	        if (isValidInput(sum_ok1,"")) {  
              	        	a1= Double.parseDouble(sum_ok1.getText().replace(',','.'));
              	        	int_rad=(int) a1;
              	     	   }
              	        if (isValidInput(sum_ok2,"")) {  
              	        	a= Double.parseDouble(sum_ok2.getText().replace(',','.'));
              	        	int_rad=(int) a;
              	     	   }
              	        if (isValidInput(sum_ok3,"")) {  
              	        	a2= Double.parseDouble(sum_ok3.getText().replace(',','.'));
              	        	int_rad=(int) a2;
              	     	   }
              	        if (isValidInput(sum_ok4,"")) {  
              	        	a3= Double.parseDouble(sum_ok4.getText().replace(',','.'));;
              	        	int_rad=(int) a3;
              	     	   }
              	        }
                 		public boolean isValidInput(JTextField jtxt, String description) {
                     		JDialog D = new JDialog();
                     		if (jtxt.getText().trim().length() > 0) {
                     		try { 
                     		double num = Double.parseDouble(jtxt.getText().replace(',','.')); //������� ������������� ����� � ����� �����
                     		return true; //���� ��� ��������� - ���������� true
                     		} catch (NumberFormatException e) {
                     		jtxt.requestFocus();
                     		jtxt.setText("");
                     		JOptionPane.showMessageDialog(D, "�� ������ ������ �����!", "������", JOptionPane.WARNING_MESSAGE);
                     		return false;
                     		}
                     		} else {
                     		JOptionPane.showMessageDialog(D, "������� " + description, "������", JOptionPane.WARNING_MESSAGE);
                     		jtxt.requestFocus();
                     		jtxt.selectAll();
                     		return false;
                     		}
                     		}
              	        
              	    });	
              		
            	
            	
            }
        });
    }}
	
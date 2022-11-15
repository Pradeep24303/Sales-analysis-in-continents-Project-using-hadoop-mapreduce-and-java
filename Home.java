import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * hadoop jar Test.jar testHadoop input_data o1

 * @author hadoop
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Analysis");
        setBackground(new java.awt.Color(111, 189, 125));

        jLabel1.setFont(new java.awt.Font("Ani", 1, 48)); // NOI18N
        jLabel1.setText("Sales Analysis");

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton5.setText("Cost");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(0, 255, 0));
        jRadioButton6.setText("Profit");

        buttonGroup3.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Noto Sans CJK JP Regular", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton4.setText("Units");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton4))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addGap(116, 116, 116))
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Noto Sans CJK SC Regular", 1, 18)); // NOI18N
        jRadioButton1.setText("Region");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 1, 18)); // NOI18N
        jRadioButton2.setText("Country");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 18)); // NOI18N
        jRadioButton3.setText("Items");
        

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 24)); // NOI18N
        jButton1.setText("Analyse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (NumberFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jTextField1.setFont(new java.awt.Font("Noto Sans CJK JP Regular", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(112, 104, 175));
        jTextField1.setText("Key               ");

        jTextField2.setFont(new java.awt.Font("Noto Sans CJK JP Bold", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(91, 192, 83));
        jTextField2.setText("Value                    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("SalesAnalysis");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws NumberFormatException, IOException {                                         
        // TODO add your handling code here:

    	
    	if (jRadioButton1.isSelected()) {//Region
    		
    		if(jRadioButton6.isSelected()) {//Profit
    			File file = new File("/home/neeraj/Desktop/project/output/part-r-00000");
    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
    			 
    			BufferedReader br = new BufferedReader(new FileReader(file));		 
    			String st;
    			while ((st = br.readLine()) != null) {
    				String[] tokens = st.split("\\t+");
    				int temp=Integer.parseInt(tokens[1]);
    				hm.put(tokens[0],temp);
    			}
    			Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        
    	        
    		}
    		else if(jRadioButton4.isSelected()) {//Units
    			File file = new File("/home/neeraj/Desktop/project/output1/part-r-00000");
    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
    			 
    			BufferedReader br = new BufferedReader(new FileReader(file));		 
    			String st;
    			while ((st = br.readLine()) != null) {
    				String[] tokens = st.split("\\t+");
    				int temp=Integer.parseInt(tokens[1]);
    				hm.put(tokens[0],temp);
    			}
    			Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        
    	        

    		}
    		else if(jRadioButton5.isSelected()) {//Cost
    			File file = new File("/home/neeraj/Desktop/project/output2/part-r-00000");
    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
    			 
    			BufferedReader br = new BufferedReader(new FileReader(file));		 
    			String st;
    			while ((st = br.readLine()) != null) {
    				String[] tokens = st.split("\\t+");
    				int temp=Integer.parseInt(tokens[1]);
    				hm.put(tokens[0],temp);
    			}
    			Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        

    		}
				
    	}else if(jRadioButton2.isSelected()) {//Country
    		
    		if(jRadioButton6.isSelected()) {//Profit
    			File file = new File("/home/neeraj/Desktop/project/output3/part-r-00000");
    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
    			 
    			BufferedReader br = new BufferedReader(new FileReader(file));		 
    			String st;
    			while ((st = br.readLine()) != null) {
    				String[] tokens = st.split("\\t+");
    				int temp=Integer.parseInt(tokens[1]);
    				hm.put(tokens[0],temp);
    			}
    			Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        
    	
    		}
    		else if(jRadioButton4.isSelected()) {//Units
    	
    			File file = new File("/home/neeraj/Desktop/project/output4/part-r-00000");
    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
    			 
    			BufferedReader br = new BufferedReader(new FileReader(file));		 
    			String st;
    			while ((st = br.readLine()) != null) {
    				String[] tokens = st.split("\\t+");
    				int temp=Integer.parseInt(tokens[1]);
    				hm.put(tokens[0],temp);
    			}
    			Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        

    		}
    		else if(jRadioButton5.isSelected()) {//Cost
				File file = new File("/home/neeraj/Desktop/project/output5/part-r-00000");
				HashMap<String,Integer> hm=new HashMap<String,Integer>();  
				 
				BufferedReader br = new BufferedReader(new FileReader(file));		 
				String st;
				while ((st = br.readLine()) != null) {
					String[] tokens = st.split("\\t+");
					int temp=Integer.parseInt(tokens[1]);
					hm.put(tokens[0],temp);
				}
				Set keys = hm.keySet();
    	        Iterator itr = keys.iterator();
    	        DefaultPieDataset dataset = new DefaultPieDataset( );
    	        String key;
    	        int value;
    	        int maxvalue=0;
    	        int total=0;
    	        double val=0.0;
    	        int data[]=new int[10000];
    	        String[] name1=new String[10000];
    	        int cnt=0;
    	        String maxkey="";
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            total+=value;
    	            data[cnt]=value;
    	            //System.out.println(value);
    	            System.out.println(data[cnt]);
    	            name1[cnt]=key;
    	            if(value>maxvalue) {
    	            	maxvalue=value;
    	            	maxkey=key;
    	            }
    	            cnt++;
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println("Main"+data[i]);
    	        }
    	        int centroid[][]=new int[][]{
    				{0,0,0},
    				{3,6,8}
    			};
    	        KMeans k=new KMeans();
    			k.process(data);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[i]);
    	        }
    	        

    	        jTextField1.setText(maxkey);
    	        String maxvalue1= Integer.toString(maxvalue);
    	        jTextField2.setText(maxvalue1);
    	        itr = keys.iterator();
    	        while(itr.hasNext())
    	        {
    	            key = (String)itr.next();
    	            value = hm.get(key);
    	            val=(value/total)+100;
    	            dataset.setValue(key, val);
    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
    	        }
    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
    	        demo.setSize( 560 , 367 );    
    	        //RefineryUtilities.centerFrameOnScreen( demo );    
    	        demo.setVisible( true );
    	        /*KMeans k=new KMeans(data,cnt);
    	        for (int i=0;i<cnt;i++) {
    	        	System.out.println(data[cnt]);
    	        }*/
    	        
    		}
    		
    	}
    		else if(jRadioButton3.isSelected()) {//Items
    		
	    		if(jRadioButton6.isSelected()) {//Profit
	    			File file = new File("/home/neeraj/Desktop/project/output6/part-r-00000");
	    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	    			 
	    			BufferedReader br = new BufferedReader(new FileReader(file));		 
	    			String st;
	    			while ((st = br.readLine()) != null) {
	    				String[] tokens = st.split("\\t+");
	    				int temp=Integer.parseInt(tokens[1]);
	    				hm.put(tokens[0],temp);
	    			}
	    			Set keys = hm.keySet();
	    	        Iterator itr = keys.iterator();
	    	        DefaultPieDataset dataset = new DefaultPieDataset( );
	    	        String key;
	    	        int value;
	    	        int maxvalue=0;
	    	        int total=0;
	    	        double val=0.0;
	    	        int data[]=new int[10000];
	    	        String[] name1=new String[10000];
	    	        int cnt=0;
	    	        String maxkey="";
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            total+=value;
	    	            data[cnt]=value;
	    	            //System.out.println(value);
	    	            System.out.println(data[cnt]);
	    	            name1[cnt]=key;
	    	            if(value>maxvalue) {
	    	            	maxvalue=value;
	    	            	maxkey=key;
	    	            }
	    	            cnt++;
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println("Main"+data[i]);
	    	        }
	    	        int centroid[][]=new int[][]{
	    				{0,0,0},
	    				{3,6,8}
	    			};
	    	        KMeans k=new KMeans();
	    			k.process(data);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[i]);
	    	        }
	    	        

	    	        jTextField1.setText(maxkey);
	    	        String maxvalue1= Integer.toString(maxvalue);
	    	        jTextField2.setText(maxvalue1);
	    	        itr = keys.iterator();
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            val=(value/total)+100;
	    	            dataset.setValue(key, val);
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
	    	        demo.setSize( 560 , 367 );    
	    	        //RefineryUtilities.centerFrameOnScreen( demo );    
	    	        demo.setVisible( true );
	    	        /*KMeans k=new KMeans(data,cnt);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[cnt]);
	    	        }*/
	    	        
	    	
	    		}
	    		else if(jRadioButton4.isSelected()) {//Units
	    			File file = new File("/home/neeraj/Desktop/project/output7/part-r-00000");
	    			HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	    			 
	    			BufferedReader br = new BufferedReader(new FileReader(file));		 
	    			String st;
	    			while ((st = br.readLine()) != null) {
	    				String[] tokens = st.split("\\t+");
	    				int temp=Integer.parseInt(tokens[1]);
	    				hm.put(tokens[0],temp);
	    			}
	    			Set keys = hm.keySet();
	    	        Iterator itr = keys.iterator();
	    	        DefaultPieDataset dataset = new DefaultPieDataset( );
	    	        String key;
	    	        int value;
	    	        int maxvalue=0;
	    	        int total=0;
	    	        double val=0.0;
	    	        int data[]=new int[10000];
	    	        String[] name1=new String[10000];
	    	        int cnt=0;
	    	        String maxkey="";
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            total+=value;
	    	            data[cnt]=value;
	    	            //System.out.println(value);
	    	            System.out.println(data[cnt]);
	    	            name1[cnt]=key;
	    	            if(value>maxvalue) {
	    	            	maxvalue=value;
	    	            	maxkey=key;
	    	            }
	    	            cnt++;
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println("Main"+data[i]);
	    	        }
	    	        int centroid[][]=new int[][]{
	    				{0,0,0},
	    				{3,6,8}
	    			};
	    	        KMeans k=new KMeans();
	    			k.process(data);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[i]);
	    	        }
	    	        

	    	        jTextField1.setText(maxkey);
	    	        String maxvalue1= Integer.toString(maxvalue);
	    	        jTextField2.setText(maxvalue1);
	    	        itr = keys.iterator();
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            val=(value/total)+100;
	    	            dataset.setValue(key, val);
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
	    	        demo.setSize( 560 , 367 );    
	    	        //RefineryUtilities.centerFrameOnScreen( demo );    
	    	        demo.setVisible( true );
	    	        /*KMeans k=new KMeans(data,cnt);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[cnt]);
	    	        }*/
	    	        
	    	
	    		}
	    		else if(jRadioButton5.isSelected()) {//Cost
	    			File file = new File("/home/neeraj/Desktop/project/output8/part-r-00000");
					HashMap<String,Integer> hm=new HashMap<String,Integer>();  
					 
					BufferedReader br = new BufferedReader(new FileReader(file));		 
					String st;
					while ((st = br.readLine()) != null) {
						String[] tokens = st.split("\\t+");
						int temp=Integer.parseInt(tokens[1]);
						hm.put(tokens[0],temp);
					}
					Set keys = hm.keySet();
	    	        Iterator itr = keys.iterator();
	    	        DefaultPieDataset dataset = new DefaultPieDataset( );
	    	        String key;
	    	        int value;
	    	        int maxvalue=0;
	    	        int total=0;
	    	        double val=0.0;
	    	        int data[]=new int[10000];
	    	        String[] name1=new String[10000];
	    	        int cnt=0;
	    	        String maxkey="";
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            total+=value;
	    	            data[cnt]=value;
	    	            //System.out.println(value);
	    	            System.out.println(data[cnt]);
	    	            name1[cnt]=key;
	    	            if(value>maxvalue) {
	    	            	maxvalue=value;
	    	            	maxkey=key;
	    	            }
	    	            cnt++;
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println("Main"+data[i]);
	    	        }
	    	        int centroid[][]=new int[][]{
	    				{0,0,0},
	    				{3,6,8}
	    			};
	    	        KMeans k=new KMeans();
	    			k.process(data);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[i]);
	    	        }
	    	        

	    	        jTextField1.setText(maxkey);
	    	        String maxvalue1= Integer.toString(maxvalue);
	    	        jTextField2.setText(maxvalue1);
	    	        itr = keys.iterator();
	    	        while(itr.hasNext())
	    	        {
	    	            key = (String)itr.next();
	    	            value = hm.get(key);
	    	            val=(value/total)+100;
	    	            dataset.setValue(key, val);
	    	            System.out.println(key + " - "+ value);//here you initiate piechart and bargraph.
	    	        }
	    	        PieChart_AWT demo = new PieChart_AWT( "Sales",dataset,"Region-Profit Sales" );  
	    	        demo.setSize( 560 , 367 );    
	    	        //RefineryUtilities.centerFrameOnScreen( demo );    
	    	        demo.setVisible( true );
	    	        /*KMeans k=new KMeans(data,cnt);
	    	        for (int i=0;i<cnt;i++) {
	    	        	System.out.println(data[cnt]);
	    	        }*/
	    	        
	    		}
    		
    	}
    }                                        


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}

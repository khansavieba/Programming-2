package com.OOPFruit;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class FruitCollector 
   extends JFrame 
   implements ActionListener
{
    private Container c; 
    
    private JLabel title; 
    private JLabel name;  
    private JLabel fruit;  
    private JLabel weight;
    private JLabel expired;
    private JLabel fruitColor;
    private JLabel res;
    private JLabel resultTitle;

    private JTextField tname;
    private JTextField tweight;

    private JTextArea resultField;

    private JComboBox fruitType;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;

    private JRadioButton green; 
    private JRadioButton yellow; 
    private JRadioButton red;
    private JRadioButton others;

    private ButtonGroup color; 

    private JButton sub;
    private JButton reset;

    private String fruitTypes[]= {
        "Fruit", "Banana", "Apple","Watermelon", "Melon", "Kiwi", "Plum", 
        "Strawberry", "Pinapple", "Grape", "Coconut", "Lychee",
        "Tomato", "Orange", "Mango", "Others" };
       
    private String dates[] 
      = {  "1", "2", "3", "4", "5", 
         "6", "7", "8", "9", "10", 
         "11", "12", "13", "14", "15", 
         "16", "17", "18", "19", "20", 
         "21", "22", "23", "24", "25", 
         "26", "27", "28", "29", "30", 
         "31" }; 
   private String months[] 
      = { "Jan", "feb", "Mar", "Apr", 
         "May", "Jun", "July", "Aug", 
         "Sup", "Oct", "Nov", "Dec" }; 
   private String years[] 
      = { "2020", "2021", "2022", 
         "2023", "2024", "2025", "2026"
          , "Above"}; 


    public FruitCollector() 
    { 
        setTitle("Fruit Collector Form"); 
        setBounds(400, 500, 700, 500); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        


        c = getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null); 

        
      title = new JLabel("Fruit Collector"); 
      title.setFont(new Font("Montserrat", Font.PLAIN, 30)); 
      title.setSize(300, 30); 
      title.setLocation(250, 30); 
      c.add(title); 

      name = new JLabel("Collector Name"); 
      name.setFont(new Font("Arial", Font.PLAIN, 20)); 
      name.setSize(150, 20); 
      name.setLocation(50, 100); 
      c.add(name); 

      tname = new JTextField(); 
      tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
      tname.setSize(190, 20); 
      tname.setLocation(200, 100); 
      c.add(tname); 
    
      fruit = new JLabel("Fruit Type"); 
      fruit.setFont(new Font("Arial", Font.PLAIN, 20)); 
      fruit.setSize(100, 20); 
      fruit.setLocation(50, 150); 
      c.add(fruit); 

      fruitType = new JComboBox(fruitTypes); 
      fruitType.setFont(new Font("Arial", Font.PLAIN, 15)); 
      fruitType.setSize(100, 20); 
      fruitType.setLocation(200, 150); 
      c.add(fruitType);

      weight = new JLabel("Weight"); 
      weight.setFont(new Font("Arial", Font.PLAIN, 20)); 
      weight.setSize(100, 20); 
      weight.setLocation(50, 200); 
      c.add(weight); 

      tweight = new JTextField(); 
      tweight.setFont(new Font("Arial", Font.PLAIN, 15)); 
      tweight.setSize(190, 20); 
      tweight.setLocation(200, 200); 
      c.add(tweight); 
      setVisible(true);

     expired = new JLabel("Expired Date"); 
     expired.setFont(new Font("Arial", Font.PLAIN, 20)); 
     expired.setSize(150, 20); 
     expired.setLocation(50, 250); 
     c.add(expired); 

     date = new JComboBox(dates); 
     date.setFont(new Font("Arial", Font.PLAIN, 15)); 
     date.setSize(50, 20); 
     date.setLocation(200, 250); 
     c.add(date);

     month = new JComboBox(months); 
     month.setFont(new Font("Arial", Font.PLAIN, 15)); 
     month.setSize(50, 20); 
     month.setLocation(260, 250); 
     c.add(month);

     year = new JComboBox(years); 
     year.setFont(new Font("Arial", Font.PLAIN, 15)); 
     year.setSize(60, 20); 
     year.setLocation(320, 250); 
     c.add(year); 

     fruitColor = new JLabel("Fruit Color");
     fruitColor.setFont(new Font("Arial", Font.PLAIN, 20)); 
     fruitColor.setSize(150, 20); 
     fruitColor.setLocation(50, 300); 
     c.add(fruitColor); 

     color = new ButtonGroup(); 
     color.add(green); 
     color.add(yellow); 
     color.add(red);
     color.add(others);
     

     green = new JRadioButton("Green"); 
     green.setFont(new Font("Arial", Font.PLAIN, 15)); 
     green.setSelected(true); 
     green.setSize(75, 20); 
     green.setLocation(200, 300); 
     green.setBackground(Color.CYAN);
     c.add(green); 
     setBackground(Color.CYAN);

     yellow = new JRadioButton("Yellow"); 
     yellow.setFont(new Font("Arial", Font.PLAIN, 15)); 
     yellow.setSelected(false); 
     yellow.setSize(80, 20); 
     yellow.setLocation(275, 300);
     yellow.setBackground(Color.CYAN); 
     c.add(yellow); 

     red = new JRadioButton("Red"); 
     red.setFont(new Font("Arial", Font.PLAIN, 15)); 
     red.setSelected(false); 
     red.setSize(80, 20); 
     red.setLocation(200, 320); 
     red.setBackground(Color.CYAN);
     c.add(red); 

     others = new JRadioButton("Others"); 
     others.setFont(new Font("Arial", Font.PLAIN, 15)); 
     others.setSelected(false); 
     others.setSize(80, 20); 
     others.setLocation(275, 320); 
     others.setBackground(Color.CYAN);
     c.add(others); 

     resultField= new JTextArea(); 
     resultField.setFont(new Font("Montserrat", Font.PLAIN, 17)); 
     resultField.setSize(240, 300); 
     resultField.setLocation(425, 150); 
     resultField.setLineWrap(true); 
     resultField.setEditable(false); 
     resultField.setBackground(Color.ORANGE);
      c.add(resultField); 

     sub = new JButton("Submit"); 
     sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
     sub.setSize(100, 20); 
     sub.setLocation(200, 375); 
     sub.addActionListener(this); 
      c.add(sub); 

      resultTitle = new JLabel("Registration Data"); 
      resultTitle.setFont(new Font("Montserrat", Font.PLAIN, 25)); 
      resultTitle.setSize(300, 30); 
      resultTitle.setLocation(425, 100); 
      c.add(resultTitle); 

      res = new JLabel(""); 
      res.setFont(new Font("Arial", Font.PLAIN, 20)); 
      res.setSize(400, 25); 
      res.setLocation(150, 410); 
      c.add(res);

      reset = new JButton("Reset"); 
      reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
      reset.setSize(100, 20); 
      reset.setLocation(310, 375); 
      reset.addActionListener(this); 
      c.add(reset); 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) { 
            
               String data1 = ""; 
               String data2
                  = "Name : "
                  + tname.getText() + "\n" + "\n"
                  + "Fruit : "
                  + (String)fruitType.getSelectedItem() + "\n" + "\n"
                  + "Weight : " 
                  + tweight.getText() + "\n" + "\n"
                  + "Fruit Expired date : " + "\n" 
                  + (String)date.getSelectedItem() 
                  + "/" + (String)month.getSelectedItem() 
                  + "/" + (String)year.getSelectedItem() + "\n" + "\n";

               if (yellow.isSelected()) 
                  data1 = "Fruit Colour : Yellow"
                        + "\n"; 
               else if (green.isSelected())
                   data1 = "Fruit Colour : Green"  + "\n";
               
               else if (red.isSelected())
                   data1 = "Fruit Colour : Red"  + "\n";
               
               else
                  data1 = "Fruit Colour : Others"  + "\n";
               
    
               resultField.setText(data2 + data1 ); 
               resultField.setEditable(false); 
               res.setText("Registration Successful!"); 
            } 
            
        else if (e.getSource() == reset) { 

            String def = ""; 
            tname.setText(def); 
            tweight.setText(def); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            fruitType.setSelectedItem(0);
            resultField.setText(def);
            res.setText(def);
            } 
         } 

    }


public class GUI{

    public static void main(String[] args) {
        FruitCollector a = new FruitCollector();
      
    }
}

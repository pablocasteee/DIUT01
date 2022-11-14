package calculadora;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.KEY_PRESSED;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent.KeyBinding;

/*
Tengo código escrito en las operaciones de suma, resta, dividir y multiplicar, que sería
para que funcionase para hac er las cuentas sin el igual, pero me da un pequeño error, 
y no me funciona, por lo tanto he dejado mi código base
*/
public class Calculadora extends javax.swing.JFrame  {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
   
    JPanel pane = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    Boolean operar=false;
    Double num1;
    Double num2;
    String operando;
    
    public Calculadora() {
        
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(true);
        
          this.btn_4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("4"), "4");
        this.btn_4.getActionMap().put("4", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_4.doClick();
        }
        });
          this.btn_1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("1"), "1");
        this.btn_1.getActionMap().put("1", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_1.doClick();
        }
        });
         this.btn_2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("2"), "2");
        this.btn_2.getActionMap().put("2", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_2.doClick();
        }
        });
       this.btn_3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("3"), "3");
        this.btn_3.getActionMap().put("3", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_3.doClick();
        }
        });
         this.btn_0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("0"), "0");
        this.btn_0.getActionMap().put("0", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_0.doClick();
        }
        });
         this.btn_5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("5"), "5");
        this.btn_5.getActionMap().put("5", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_5.doClick();
        }
        });
         this.btn_6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("6"), "6");
        this.btn_6.getActionMap().put("6", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_6.doClick();
        }
        });
         this.btn_7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("7"), "7");
        this.btn_7.getActionMap().put("7", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_7.doClick();
        }
        });
         this.btn_8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("8"), "8");
        this.btn_8.getActionMap().put("8", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_8.doClick();
        }
        });
         this.btn_9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("9"), "9");
        this.btn_9.getActionMap().put("9", new AbstractAction() {
        @Override 
        public void actionPerformed(ActionEvent ae) {
        btn_9.doClick();
        }
        });
}
       
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_00 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(340, 410));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 410));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        btn_9.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        btn_exp.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 20)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(55, 62, 71));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp.setText("<-");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btn_division.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_division.setForeground(new java.awt.Color(55, 62, 71));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division.setText("/");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btn_multi.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(55, 62, 71));
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi.setText("X");
        btn_multi.setFocusPainted(false);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        btn_resta.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 32)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        btn_suma.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        btn_c.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 62, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_7.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btn_8.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        btn_6.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btn_5.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        btn_4.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btn_3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btn_2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btn_1.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btn_dot.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(55, 62, 71));
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        btn_00.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        btn_00.setForeground(new java.awt.Color(55, 62, 71));
        btn_00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_00.setText("00");
        btn_00.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_00.setFocusPainted(false);
        btn_00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_00.setInheritsPopupMenu(true);
        btn_00.setName(""); // NOI18N
        btn_00.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_00.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_00.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_00ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_00, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, -1));

        btn_0.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(55, 62, 71));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton1.setText("Error");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(80, 57));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 57));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Montserrat Alternates Light", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 40));

        txtResultado.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 40));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 20));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("•");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

                                               
    
    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }

    private void btn_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_00ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+ 0 + 0);     
    }

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+7);
       
    }

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);
        
    }

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
              addNumber("/");
               
            /* Operacion op1=new Operacion();
              if (operar){
                 num1=Double.valueOf(txtOperacion.getText());
                 txtOperacion.setText("");
                 operando="/";
                  
              }else{
                   num2=Double.valueOf(txtOperacion.getText());
                   operando="/";
                   operar=true;
                   txtOperacion.setText("");
                   txtResultado.setText(op1.resultado);
                   
              }*/
    }

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
           addNumber("*");  
              
    }   
        /* Operacion op1=new Operacion();
              if (operar){
                 num1=Double.valueOf(txtOperacion.getText());
                 txtOperacion.setText("");
                 operando="*";
                  
              }else{
                   num2=Double.valueOf(txtOperacion.getText());
                   operando="*";
                   operar=true;
                   txtOperacion.setText("");
                   txtResultado.setText(op1.resultado);
                   
              }*/
          

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+9);
       
    }
               
    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+8);
       
    }

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
       this.txtOperacion.setText(this.txtOperacion.getText()+4);
      
    }

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+5);
       
    }

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+6);
        
    }

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+1);
        
    }

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+2);
      
    }

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        this.txtOperacion.setText(this.txtOperacion.getText()+3);
       
    }

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
        
    }

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
          
    try {
        String resultado;
        resultado = se.eval(txtOperacion.getText()).toString();
        txtResultado.setText(resultado);
        txtOperacion.setText(txtResultado.getText());
    } catch (ScriptException ex) { 
    }
    }

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");         
       
    }
         /* Operacion op1=new Operacion();
              if (operar){
                 num1=Double.valueOf(txtOperacion.getText());
                 txtOperacion.setText("");
                 operando="+";
                  
              }else{
                   num2=Double.valueOf(txtOperacion.getText());
                   operando="+";
                   operar=true;
                   txtOperacion.setText("");
                   txtResultado.setText(op1.resultado);
                   
              }*/
    
    
    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
             addNumber("-");
             
    }
              /*if (operar){
                 num1=Double.valueOf(txtOperacion.getText());
                 txtOperacion.setText("");
              }else{
                   num2=Double.valueOf(txtOperacion.getText());
                   operando="-";
                   operar=true;
                   txtOperacion.setText("");
                   op1.restar();
                   txtResultado.setText(op1.resultado.toString());
                   
              }*/
    

    boolean modoOscuro = false;

    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));
            cambiarColorBtn1(btn_multi);
            cambiarColorBtn1(btn_suma);
            cambiarColorBtn1(btn_resta);
            cambiarColorBtn1(btn_exp);
            cambiarColorBtn1(btn_division);
            cambiarColorBtn1(btn_c);
            cambiarColorBtn1(btn_0);
            cambiarColorBtn2(btn_1);
            cambiarColorBtn2(btn_2);
            cambiarColorBtn2(btn_3);
            cambiarColorBtn2(btn_4);
            cambiarColorBtn2(btn_5);
            cambiarColorBtn2(btn_6);
            cambiarColorBtn2(btn_7);
            cambiarColorBtn2(btn_8);
            cambiarColorBtn2(btn_9);
            cambiarColorBtn2(btn_00);
            cambiarColorBtn2(btn_dot);
            
            btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
            btn_igual.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png")));
            btn_igual.setForeground(Color.decode("#2e3951"));
            modoOscuro = true;
        } else {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }


    }

    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
    
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.txtOperacion.setText("");
      this.txtResultado.setText("");
      this.txtOperacion.setText("Ha habido un error");
      
    }

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
                
            
                
            }
        });
    }

    public void cambiarColorBtn1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#0db387"));
    }

    public void cambiarColorBtn2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }

    public void addNumber(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_00;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}

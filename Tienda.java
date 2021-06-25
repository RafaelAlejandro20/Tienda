//setLocation(400,60);//Ubicacion de la ventana.
//setBounds(400,60,600,600);//Ubicacion y tamaño.

package Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Tienda extends JFrame{
    public JPanel panel;
    public Tienda (){
        setSize(920,570);//Tamaño de la ventana.
        setLocationRelativeTo(null);//Establecer ventana en el centro.
        setTitle("NOVO Technologies Administration Store.");//Titulo.
        //this.getContentPane().setBackground(new Color(35,35,35));//Determinar el color de la ventana.
        this.setResizable(false);//Evitar que se redimensione la ventana.
        componentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cerrar ventana.
    }
    
    private void componentes(){
        paneles();
        etiquetas();
        imagenes();
        botones();
        cajasDeTexto();
        notas();
    }
    
    private void paneles(){
        panel = new JPanel();//Creacion de panel.
        panel.setLayout(null);
        panel.setBackground(new Color(35,35,35));//Establecer color del panel.
        this.getContentPane().add(panel);//Agregar panel a la ventana.
    }
    
    private void etiquetas(){
        
        String nombreUsuario;
        nombreUsuario=JOptionPane.showInputDialog("¿Cual es su nombre?");
        
        JLabel titulo = new JLabel("Administrador de tienda",SwingConstants.CENTER);//Crear una etiqueta.
        titulo.setBounds(20,20,340,80);
        titulo.setForeground(new Color(255,255,255));
        titulo.setOpaque(true);
        titulo.setBackground(new Color(50,50,50));
        titulo.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,20));
        panel.add(titulo);
        
        JLabel nombre = new JLabel("Bienvenido " + nombreUsuario + ".",SwingConstants.CENTER);//Crear una etiqueta.
        nombre.setBounds(20,120,380,40);
        nombre.setForeground(new Color(255,255,255));
        nombre.setOpaque(true);
        nombre.setBackground(new Color(50,50,50));
        nombre.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(nombre);
        
        JLabel etiqueta1 = new JLabel("Notas",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta1.setBounds(480,20,400,80);
        etiqueta1.setForeground(new Color(255,255,255));
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(new Color(50,50,50));
        etiqueta1.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,20));
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("Nombre del producto",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta2.setBounds(20,180,200,40);
        etiqueta2.setForeground(new Color(255,255,255));
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(new Color(50,50,50));
        etiqueta2.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel("Coste del producto",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta3.setBounds(20,240,200,40);
        etiqueta3.setForeground(new Color(255,255,255));
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(new Color(50,50,50));
        etiqueta3.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta3);
        
        JLabel etiqueta4 = new JLabel("Cantidad de productos",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta4.setBounds(20,300,200,40);
        etiqueta4.setForeground(new Color(255,255,255));
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(new Color(50,50,50));
        etiqueta4.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta4);
        
        JLabel etiqueta5 = new JLabel("Total e IVA del producto",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta5.setBounds(20,360,200,40);
        etiqueta5.setForeground(new Color(255,255,255));
        etiqueta5.setOpaque(true);
        etiqueta5.setBackground(new Color(50,50,50));
        etiqueta5.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta5);
        
        JLabel etiqueta6 = new JLabel("Agregar producto",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta6.setBounds(20,420,200,40);
        etiqueta6.setForeground(new Color(255,255,255));
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(new Color(50,50,50));
        etiqueta6.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta6);
        
        JLabel etiqueta7 = new JLabel("Imprimir ticket del producto",SwingConstants.CENTER);//Crear una etiqueta.
        etiqueta7.setBounds(20,480,200,40);
        etiqueta7.setForeground(new Color(255,255,255));
        etiqueta7.setOpaque(true);
        etiqueta7.setBackground(new Color(50,50,50));
        etiqueta7.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(etiqueta7);
    }
    
    private void imagenes(){
        JLabel fondo = new JLabel(new ImageIcon("fondo.jpg"));
        fondo.setBounds(460,0,1920,1000);
        panel.add(fondo);
        
        JLabel iconoUsuario = new JLabel(new ImageIcon("iconoUsuario.jpg"));
        iconoUsuario.setBounds(400,120,40,40);
        panel.add(iconoUsuario);
        
        JLabel logo = new JLabel(new ImageIcon("logo.jpg"));
        logo.setBounds(360,20,80,80);
        panel.add(logo);
    }
    
    private void botones(){
        JButton boton1 = new JButton("Agregar");
        boton1.setBounds(240,420,200,40);
        boton1.setMnemonic('p');
        boton1.setForeground(new Color(255,255,255));
        boton1.setBackground(new Color(50,50,50));
        boton1.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(boton1);
        
        JButton boton2 = new JButton("Imprimir");
        boton2.setBounds(240,480,200,40);
        boton2.setMnemonic('p');
        boton2.setForeground(new Color(255,255,255));
        boton2.setBackground(new Color(50,50,50));
        boton2.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(boton2);
    }
    
    private void cajasDeTexto (){
        //Variables.
        long caj1, caj2, acum, total;
        String producto;
        
        JTextField caja1 = new JTextField();
        caja1.setBounds(240,180,200,40);
        caja1.setForeground(new Color(255,255,255));
        caja1.setBackground(new Color(50,50,50));
        caja1.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(caja1);
        
        JTextField caja2 = new JTextField();
        caja2.setBounds(240,240,200,40);
        caja2.setForeground(new Color(255,255,255));
        caja2.setBackground(new Color(50,50,50));
        caja2.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(caja2);
        
        JTextField caja3 = new JTextField();
        caja3.setBounds(240,300,200,40);
        caja3.setForeground(new Color(255,255,255));
        caja3.setBackground(new Color(50,50,50));
        caja3.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(caja3);
        
        JTextField caja4 = new JTextField();
        caja4.setBounds(240,360,200,40);
        caja4.setForeground(new Color(255,255,255));
        caja4.setBackground(new Color(50,50,50));
        caja4.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(caja4);
    }
    
    private void notas(){
        JTextArea notas = new JTextArea();
        notas.setBounds(480,120,400,400);
        notas.setForeground(new Color(255,255,255));
        notas.setBackground(new Color(50,50,50));
        notas.setFont(new Font("Microsoft JhengHei Light",Font.PLAIN,15));
        panel.add(notas);
    }
}
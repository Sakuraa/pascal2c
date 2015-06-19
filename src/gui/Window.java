package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;







import model.ParserCup;
import model.Scanner;
import model.Writer;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

import javax.swing.JEditorPane;



public class Window {

	private JFrame frame;
	 public String file_name;
	 public File file;
	 public boolean toSave=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane);
		
		JLabel lblPascal = new JLabel("Pascal");
		lblPascal.setBounds(34, 53, 46, 14);
		layeredPane.add(lblPascal);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(348, 53, 46, 14);
		layeredPane.add(lblC);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 11, 588, 31);
		layeredPane.add(panel_2);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 65, 268, 249);
		layeredPane.add(scrollPane);
		
		final RSyntaxTextArea a = new RSyntaxTextArea();
		scrollPane.setViewportView(a);
		JButton btnBrowse = new JButton("Browse");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(348, 65, 268, 249);
		layeredPane.add(scrollPane_1);
		btnBrowse.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(btnBrowse);
		
		final RSyntaxTextArea b= new RSyntaxTextArea();
		scrollPane_1.setViewportView(b);
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileReader fr = null;
				try {
					fr = new FileReader(file);
					Writer writer = new Writer();
					Scanner scanner = new Scanner(fr);
					ParserCup p = new ParserCup(scanner, writer);
					p.parse();
					b.setText(writer.getCode().toString());
					toSave=true;
				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null,  "Plik nie istnieje","ERROR", JOptionPane.ERROR_MESSAGE);
				}
				catch(NullPointerException e2){
					JOptionPane.showMessageDialog(null,  "Nie podano pliku.","ERROR", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,  "Blad.","ERROR", JOptionPane.ERROR_MESSAGE);
				}



			}
		});
		panel_2.add(btnConvert);
		 a.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_DELPHI);
    	 b.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		          File selectedFile = fileChooser.getSelectedFile();
		          //System.out.println(selectedFile.getName());
		          if(!selectedFile.getAbsolutePath().contains(".pas")){
		        	  JOptionPane.showMessageDialog(null,  "Nie podano pliku z koñcówk¹ .pas","ERROR", JOptionPane.ERROR_MESSAGE);
		          }
		          else {
		        	//  DefaultSyntaxKit.initKit();
		        	  file_name=selectedFile.getAbsolutePath();
		        	  file = selectedFile.getAbsoluteFile();
		        	  BufferedReader reader = null;
			        	  try {
							 reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),Charset.forName("UTF-8")));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        	  String tresc = "";
		        	  String line;
					try {
						while((line = reader.readLine())!=null){
							  tresc = tresc.concat(line+"\n");
						  }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		        	 a.setText(tresc);

		        	 
		        	 // txtPlik.setText(selectedFile.getName());
		        	 // input = new Input(file_name);
	        	  }
		        }
		      }
		    });

		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton btnSaveOutput = new JButton("Save Output");
		btnSaveOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileWriter out = null;		
					if(toSave==true){
				
					    try {
							out = new FileWriter("output.c");
							out.write(b.getText());
							System.out.print(b.getText());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null,  "Zapisanie pliku nie powiodlo sie.","ERROR", JOptionPane.ERROR_MESSAGE);
						}
					    JOptionPane.showMessageDialog(null,  "Plik został zapisany w pliku output.c","", JOptionPane.INFORMATION_MESSAGE);
					    try {
							out.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
					else if(toSave==false)
						JOptionPane.showMessageDialog(null,  "Puste pole.","ERROR", JOptionPane.ERROR_MESSAGE);
					
					
					//out.close();

				

			}
		});
		panel_2.add(btnSaveOutput);
		panel_2.add(btnQuit);
		


	}
}
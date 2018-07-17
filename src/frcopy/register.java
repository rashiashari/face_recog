/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frcopy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

/**
 *
 * @author Kush
 */
public class register extends javax.swing.JFrame {
static ImageIcon icon;
static connection conn; 
    
    private static BufferedImage ConvertMat2Image(Mat frame) {
	
		
		MatOfByte mem = new MatOfByte();
		
		Imgcodecs.imencode(".jpg", frame, mem);
		
		byte[] byteArray = mem.toArray();
		BufferedImage buff = null;
		try {
			InputStream in = new ByteArrayInputStream(byteArray);
			buff = ImageIO.read(in);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return buff;
	}
    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        new Thread(new Runnable() {
    public void run() {
       dothis();
    }
}).start(); 
    }
public void dothis()
    {
        //System.out.println(System.getProperty("java.library.path"));
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
				CascadeClassifier cascadeFaceClassifier = new CascadeClassifier(
				"C:\\Users\\Rashini Ashari\\Desktop\\Face-Recognition-master\\haarcascade_frontalface_default.xml");
		
		VideoCapture videoDevice = new VideoCapture();
		videoDevice.open(0);
		if (videoDevice.isOpened()) {
                                  	do {		
				Mat frameCapture = new Mat();
                                
                               
				videoDevice.read(frameCapture);
				Graphics g = jPanel1.getGraphics();
				MatOfRect faces = new MatOfRect();
				cascadeFaceClassifier.detectMultiScale(frameCapture, faces);								
				Rect rectCrop=null;
				for (Rect rect : faces.toArray()) {
					
					Imgproc.putText(frameCapture, "Face", new Point(rect.x,rect.y-5), 1, 2, new Scalar(0,0,255));								
					Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
							new Scalar(0, 100, 0),3);
                                        rectCrop = new Rect(rect.x, rect.y, rect.width, rect.height);
                                        
                                        Mat faceImage = frameCapture.submat(rect);
                                        Imgcodecs.imwrite("face.jpg", faceImage);
				}
				
				Image img2=ConvertMat2Image(frameCapture);
                                
                                icon = new ImageIcon(img2); 
                                jLabel1.setIcon(icon);
                               

		
				//System.out.println(String.format("%s (FACES)detected.", faces.toArray().length));
      }while(true);
			}
		 else {
			System.out.println("Camera not working properly");
			return;
		}
       
      
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setLabel("Click");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Finish process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Note: Click subject's photo when face is detected in varying conditions and press ''Finish process'' to end.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(165, 165, 165)
                        .addComponent(jButton2)
                        .addGap(170, 170, 170)
                        .addComponent(jButton3)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        imageacquire();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         File index = new File("temp");
        boolean a=conn.deleteDirectory(index);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          String name= JOptionPane.showInputDialog("Enter the face name ");
    try {
        insert pics=new insert(name);        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    new Thread(new Runnable() {
    public void run() {
       showMessageDialog(null,"Please wait for a moment");
    }
}).start(); 
    
    
    
    
    
    
     new Thread(new Runnable() {
    public void run() {
        
       
     
        try {
        train imageset=new train();
    } catch (SQLException ex) {
        Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
    }
          
           File index = new File("temp");
        boolean a=conn.deleteDirectory(index);
     
    }
}).start(); 
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //reading the previously saved face
  public void imageacquire() {
    int width = 280;    //width of the image
    int height = 280;   //height of the image
    BufferedImage image = null;
    File f = null;
    File fw = null;
   

// if the directory does not exist, create it
    File theDir = new File("temp");
if (!theDir.exists()) {
        boolean result = false;

    try{
        theDir.mkdir();
        result = true;
    } 
    catch(SecurityException se){
        //handle it
    }        
}
String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    //read image
    try{
      f = new File("face.jpg"); //image file path
      
      fw = new File("temp\\"+timeStamp+".jpg"); 
      
      //image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      image = ImageIO.read(f);
      while(image==null)
      {image = ImageIO.read(f);}
       BufferedImage outputImage = new BufferedImage(280, 280, image.getType());
 
        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(image.getScaledInstance(280, 280, Image.SCALE_SMOOTH), 0, 0, 280, 280, null);
        g2d.dispose();
      image=outputImage;
      image=makeGray(image);
     // image=equalize(image);
      //System.out.println("Reading complete.");
      ImageIO.write(image, "jpg", fw);
    }catch(IOException e){
      System.out.println("Error: "+e);
    }
  }
  
  public static BufferedImage makeGray(BufferedImage img)
{  int a=0, ba=255, c=0,d=180;
    for (int x = 0; x < img.getWidth(); ++x)
    {
    for (int y = 0; y < img.getHeight(); ++y)
    {
        int rgb = img.getRGB(x, y);
        int r = (rgb >> 16) & 0xFF;
        //r=(r-c)*(ba-a)/(c-d)+a;
        //r=(int) (2.2*r+50);
       // if(r>=255)
         //   r=255;
        int g = (rgb >> 8) & 0xFF;
        //g=(g-c)*(ba-a)/(c-d)+a;
        //g=(int) (2.2*g+50);
        //if(g>=255)
          //  g=255;
        int b = (rgb & 0xFF);
      //  b=(b-c)*(ba-a)/(c-d)+a;
        //b=(int) (2.2*b+50);
        //if(b>=255)
          //  b=255;
        int grayLevel = (int) (0.2126*r + 0.7152*g + 0.0722*b);
        // grayLevel=(grayLevel-c)*(ba-a)/(c-d)+a;
        int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
        img.setRGB(x, y, gray);
    }
    }
    /*ColorConvertOp colorConvert = 
        new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
    colorConvert.filter(img,img);*/
        return img;
      //  return new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY) ;
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private BufferedImage equalize(BufferedImage bufImg) {
/*       int width =bi.getWidth();
            int height =bi.getHeight();
            int anzpixel= width*height;
            int[] histogram = new int[255];
            int[] iarray = new int[1];
           

            //read pixel intensities into histogram
            for (int x = 1; x < width; x++) {
                for (int y = 1; y < height; y++) {
                    int valueBefore=bi.getRaster().getPixel(x, y,iarray)[0];
                    histogram[valueBefore]++;
                }
            }

            int sum =0;
         // build a Lookup table LUT containing scale factor
            float[] lut = new float[anzpixel];
            for (int i=0; i < 255; ++i )
            {
                sum += histogram[i];
                lut[i] = sum * 255 / anzpixel;
            }

            // transform image using sum histogram as a Lookup table
            for (int x = 1; x < width; x++) {
                for (int y = 1; y < height; y++) {
                    int valueBefore=bi.getRaster().getPixel(x, y,iarray)[0];
                    int valueAfter= (int) lut[valueBefore];
                    iarray[0]=valueAfter;
                     bi.getRaster().setPixel(x, y, iarray); 
                }
            }  




*/

    //Getting information of each pixel;
    int[][] intensity = new int[bufImg.getWidth()][ bufImg.getHeight()];
    int[] counter = new int[256];
    for(int j=0; j < bufImg.getHeight();j++)
        for(int i=0; i < bufImg.getWidth();i++)
        {
            int values=bufImg.getRGB(i,j);              
            Color oldColor = new Color(values);
            intensity[i][j] = oldColor.getBlue();
            counter[intensity[i][j]]++;
        }

    //BEGIN OF Histogram Equalization

    //find out how many rows the table have
    int row=0;

    for(int i=0;i<256;i++)
        if(counter[i]!=0)
            row++;

    //Find out the v column of the table
    //table[row][0] = v column
    //table[row][1] = c column
    int temp=0;
    int[][] table = new int[row][2];


    for(int i=0;i<256;i++)
        if(counter[i]!=0)
        {
            table[temp][0] = i;
            temp++;
        }

    //Find out the c column of the table
    for(int i=0;i<row;i++)
        table[i][1] = counter[table[i][0]];

    //C-> CS

    int sum = 0;

    for(int i=0;i<row;i++)
    {
        sum += table[i][1];
        table[i][1] = sum;
    }

    //CS->NCS
    int min = table[0][1], max = table[row-1][1];

    for(int i=0;i<row;i++)
        table[i][1] = Math.round((table[i][1]-min)/(max-min));

    //Mapping
    for(int j=0;j<bufImg.getHeight();j++)
        for(int i=0;i<bufImg.getWidth();i++)
        {
            for(int k=0;k<row;k++)
                if(intensity[i][j]==table[k][0])
                    intensity[i][j] = table[k][1];

            Color newColor = new Color(intensity[i][j], intensity[i][j], intensity[i][j]);

            bufImg.setRGB(i, j, newColor.getRGB());
        }


    return bufImg;

//return bi;


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
